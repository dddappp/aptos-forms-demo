FROM ghcr.io/wubuku/aptos-java:main as build
WORKDIR /opt/aptos-forms-java

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
# COPY src src
COPY aptosformsdemo-common aptosformsdemo-common
COPY aptosformsdemo-service aptosformsdemo-service
COPY aptosformsdemo-service-cli aptosformsdemo-service-cli
COPY aptosformsdemo-service-rest aptosformsdemo-service-rest
COPY settings.xml .

RUN --mount=type=cache,target=/root/.m2 ./mvnw install -DskipTests

FROM ghcr.io/wubuku/aptos-java:main

#RUN addgroup -S aptosforms && adduser -S aptosforms -G aptosforms
RUN addgroup aptosforms && adduser --ingroup aptosforms aptosforms
VOLUME /tmp
# Is "VOLUME /tmp" needed for now???
USER aptosforms
ENV APTOS_CLI_PATH=/opt/aptos/aptos
ENV DDDAPPP_PROJECT_CREATION_SERVICE_URL=http://host.docker.internal:5000/ProjectTools/CreateProject
# ENV SPRING_DATASOURCE_URL=jdbc:postgresql://postgresql:5432/test2
# ENV SPRING_DATASOURCE_USERNAME=postgres
# ENV SPRING_DATASOURCE_PASSWORD=123456
ARG DEPENDENCY=/opt/aptos-forms-java/aptosformsdemo-service-rest/target
COPY --from=build ${DEPENDENCY}/aptosformsdemo-service-rest-0.0.1-SNAPSHOT.jar /app/lib/app.jar
ENTRYPOINT ["java","-XX:TieredStopAtLevel=1","-jar","/app/lib/app.jar","-Dspring.main.lazy-initialization=true"]

