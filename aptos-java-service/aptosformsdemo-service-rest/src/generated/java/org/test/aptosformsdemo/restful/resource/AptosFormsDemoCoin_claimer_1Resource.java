// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.restful.resource;

import java.util.*;
import java.util.stream.*;
import javax.servlet.http.*;
import javax.validation.constraints.*;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.transaction.annotation.Transactional;
import org.dddml.support.criterion.*;
import org.test.aptosformsdemo.domain.*;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.specialization.*;
import org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1.*;
import static org.test.aptosformsdemo.domain.meta.M.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.dddml.support.criterion.TypeConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequestMapping(path = "AptosFormsDemoCoin_claimer_1s", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class AptosFormsDemoCoin_claimer_1Resource {
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private AptosFormsDemoCoin_claimer_1ApplicationService aptosFormsDemoCoin_claimer_1ApplicationService;


    /**
     * Retrieve.
     * Retrieve AptosFormsDemoCoin_claimer_1s
     */
    @GetMapping
    @Transactional(readOnly = true)
    public AptosFormsDemoCoin_claimer_1StateDto[] getAll( HttpServletRequest request,
                    @RequestParam(value = "sort", required = false) String sort,
                    @RequestParam(value = "fields", required = false) String fields,
                    @RequestParam(value = "firstResult", defaultValue = "0") Integer firstResult,
                    @RequestParam(value = "maxResults", defaultValue = "2147483647") Integer maxResults,
                    @RequestParam(value = "filter", required = false) String filter) {
        try {
        if (firstResult < 0) { firstResult = 0; }
        if (maxResults == null || maxResults < 1) { maxResults = Integer.MAX_VALUE; }

            Iterable<AptosFormsDemoCoin_claimer_1State> states = null; 
            CriterionDto criterion = null;
            if (!StringHelper.isNullOrEmpty(filter)) {
                criterion = new ObjectMapper().readValue(filter, CriterionDto.class);
            } else {
                criterion = QueryParamUtils.getQueryCriterionDto(request.getParameterMap().entrySet().stream()
                    .filter(kv -> AptosFormsDemoCoin_claimer_1ResourceUtils.getFilterPropertyName(kv.getKey()) != null)
                    .collect(Collectors.toMap(kv -> kv.getKey(), kv -> kv.getValue())));
            }
            Criterion c = CriterionDto.toSubclass(criterion, getCriterionTypeConverter(), getPropertyTypeResolver(), 
                n -> (AptosFormsDemoCoin_claimer_1Metadata.aliasMap.containsKey(n) ? AptosFormsDemoCoin_claimer_1Metadata.aliasMap.get(n) : n));
            states = aptosFormsDemoCoin_claimer_1ApplicationService.get(
                c,
                AptosFormsDemoCoin_claimer_1ResourceUtils.getQuerySorts(request.getParameterMap()),
                firstResult, maxResults);

            AptosFormsDemoCoin_claimer_1StateDto.DtoConverter dtoConverter = new AptosFormsDemoCoin_claimer_1StateDto.DtoConverter();
            if (StringHelper.isNullOrEmpty(fields)) {
                dtoConverter.setAllFieldsReturned(true);
            } else {
                dtoConverter.setReturnedFieldsString(fields);
            }
            return dtoConverter.toAptosFormsDemoCoin_claimer_1StateDtoArray(states);

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    /**
     * Retrieve in pages.
     * Retrieve AptosFormsDemoCoin_claimer_1s in pages.
     */
    @GetMapping("_page")
    @Transactional(readOnly = true)
    public Page<AptosFormsDemoCoin_claimer_1StateDto> getPage( HttpServletRequest request,
                    @RequestParam(value = "fields", required = false) String fields,
                    @RequestParam(value = "page", defaultValue = "0") Integer page,
                    @RequestParam(value = "size", defaultValue = "20") Integer size,
                    @RequestParam(value = "filter", required = false) String filter) {
        try {
            Integer firstResult = (page == null ? 0 : page) * (size == null ? 20 : size);
            Integer maxResults = (size == null ? 20 : size);
            Iterable<AptosFormsDemoCoin_claimer_1State> states = null; 
            CriterionDto criterion = null;
            if (!StringHelper.isNullOrEmpty(filter)) {
                criterion = new ObjectMapper().readValue(filter, CriterionDto.class);
            } else {
                criterion = QueryParamUtils.getQueryCriterionDto(request.getParameterMap().entrySet().stream()
                    .filter(kv -> AptosFormsDemoCoin_claimer_1ResourceUtils.getFilterPropertyName(kv.getKey()) != null)
                    .collect(Collectors.toMap(kv -> kv.getKey(), kv -> kv.getValue())));
            }
            Criterion c = CriterionDto.toSubclass(criterion, getCriterionTypeConverter(), getPropertyTypeResolver(), 
                n -> (AptosFormsDemoCoin_claimer_1Metadata.aliasMap.containsKey(n) ? AptosFormsDemoCoin_claimer_1Metadata.aliasMap.get(n) : n));
            states = aptosFormsDemoCoin_claimer_1ApplicationService.get(
                c,
                AptosFormsDemoCoin_claimer_1ResourceUtils.getQuerySorts(request.getParameterMap()),
                firstResult, maxResults);
            long count = aptosFormsDemoCoin_claimer_1ApplicationService.getCount(c);

            AptosFormsDemoCoin_claimer_1StateDto.DtoConverter dtoConverter = new AptosFormsDemoCoin_claimer_1StateDto.DtoConverter();
            if (StringHelper.isNullOrEmpty(fields)) {
                dtoConverter.setAllFieldsReturned(true);
            } else {
                dtoConverter.setReturnedFieldsString(fields);
            }
            Page.PageImpl<AptosFormsDemoCoin_claimer_1StateDto> statePage =  new Page.PageImpl<>(dtoConverter.toAptosFormsDemoCoin_claimer_1StateDtoList(states), count);
            statePage.setSize(size);
            statePage.setNumber(page);
            return statePage;

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    /**
     * Retrieve.
     * Retrieves AptosFormsDemoCoin_claimer_1 with the specified ID.
     */
    @GetMapping("{formPageAndSignerAddress}")
    @Transactional(readOnly = true)
    public AptosFormsDemoCoin_claimer_1StateDto get(@PathVariable("formPageAndSignerAddress") String formPageAndSignerAddress, @RequestParam(value = "fields", required = false) String fields) {
        try {
            FormPageAndAddress idObj = AptosFormsDemoCoin_claimer_1ResourceUtils.parseIdString(formPageAndSignerAddress);
            AptosFormsDemoCoin_claimer_1State state = aptosFormsDemoCoin_claimer_1ApplicationService.get(idObj);
            if (state == null) { return null; }

            AptosFormsDemoCoin_claimer_1StateDto.DtoConverter dtoConverter = new AptosFormsDemoCoin_claimer_1StateDto.DtoConverter();
            if (StringHelper.isNullOrEmpty(fields)) {
                dtoConverter.setAllFieldsReturned(true);
            } else {
                dtoConverter.setReturnedFieldsString(fields);
            }
            return dtoConverter.toAptosFormsDemoCoin_claimer_1StateDto(state);

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    @GetMapping("_count")
    @Transactional(readOnly = true)
    public long getCount( HttpServletRequest request,
                         @RequestParam(value = "filter", required = false) String filter) {
        try {
            long count = 0;
            CriterionDto criterion = null;
            if (!StringHelper.isNullOrEmpty(filter)) {
                criterion = new ObjectMapper().readValue(filter, CriterionDto.class);
            } else {
                criterion = QueryParamUtils.getQueryCriterionDto(request.getParameterMap());
            }
            Criterion c = CriterionDto.toSubclass(criterion,
                getCriterionTypeConverter(), 
                getPropertyTypeResolver(), 
                n -> (AptosFormsDemoCoin_claimer_1Metadata.aliasMap.containsKey(n) ? AptosFormsDemoCoin_claimer_1Metadata.aliasMap.get(n) : n));
            count = aptosFormsDemoCoin_claimer_1ApplicationService.getCount(c);
            return count;

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }


    @PutMapping("{formPageAndSignerAddress}/_commands/Claim")
    public void claim(@PathVariable("formPageAndSignerAddress") String formPageAndSignerAddress, @RequestBody AptosFormsDemoCoin_claimer_1Commands.Claim content) {
        try {

            AptosFormsDemoCoin_claimer_1Commands.Claim cmd = content;//.toClaim();
            FormPageAndAddress idObj = AptosFormsDemoCoin_claimer_1ResourceUtils.parseIdString(formPageAndSignerAddress);
            if (cmd.getFormPageAndSignerAddress() == null) {
                cmd.setFormPageAndSignerAddress(idObj);
            } else if (!cmd.getFormPageAndSignerAddress().equals(idObj)) {
                throw DomainError.named("inconsistentId", "Argument Id %1$s NOT equals body Id %2$s", formPageAndSignerAddress, cmd.getFormPageAndSignerAddress());
            }
            cmd.setRequesterId(SecurityContextUtil.getRequesterId());
            aptosFormsDemoCoin_claimer_1ApplicationService.when(cmd);

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    @GetMapping("_metadata/filteringFields")
    public List<PropertyMetadataDto> getMetadataFilteringFields() {
        try {

            List<PropertyMetadataDto> filtering = new ArrayList<>();
            AptosFormsDemoCoin_claimer_1Metadata.propertyTypeMap.forEach((key, value) -> {
                filtering.add(new PropertyMetadataDto(key, value, true));
            });
            return filtering;

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    @GetMapping("{formPageAndSignerAddress}/_events/{version}")
    @Transactional(readOnly = true)
    public AptosFormsDemoCoin_claimer_1Event getEvent(@PathVariable("formPageAndSignerAddress") String formPageAndSignerAddress, @PathVariable("version") long version) {
        try {

            FormPageAndAddress idObj = AptosFormsDemoCoin_claimer_1ResourceUtils.parseIdString(formPageAndSignerAddress);
            //AptosFormsDemoCoin_claimer_1StateEventDtoConverter dtoConverter = getAptosFormsDemoCoin_claimer_1StateEventDtoConverter();
            return aptosFormsDemoCoin_claimer_1ApplicationService.getEvent(idObj, version);

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    @GetMapping("{formPageAndSignerAddress}/_historyStates/{version}")
    @Transactional(readOnly = true)
    public AptosFormsDemoCoin_claimer_1StateDto getHistoryState(@PathVariable("formPageAndSignerAddress") String formPageAndSignerAddress, @PathVariable("version") long version, @RequestParam(value = "fields", required = false) String fields) {
        try {

            FormPageAndAddress idObj = AptosFormsDemoCoin_claimer_1ResourceUtils.parseIdString(formPageAndSignerAddress);
            AptosFormsDemoCoin_claimer_1StateDto.DtoConverter dtoConverter = new AptosFormsDemoCoin_claimer_1StateDto.DtoConverter();
            if (StringHelper.isNullOrEmpty(fields)) {
                dtoConverter.setAllFieldsReturned(true);
            } else {
                dtoConverter.setReturnedFieldsString(fields);
            }
            return dtoConverter.toAptosFormsDemoCoin_claimer_1StateDto(aptosFormsDemoCoin_claimer_1ApplicationService.getHistoryState(idObj, version));

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }



    //protected  AptosFormsDemoCoin_claimer_1StateEventDtoConverter getAptosFormsDemoCoin_claimer_1StateEventDtoConverter() {
    //    return new AptosFormsDemoCoin_claimer_1StateEventDtoConverter();
    //}

    protected TypeConverter getCriterionTypeConverter() {
        return new DefaultTypeConverter();
    }

    protected PropertyTypeResolver getPropertyTypeResolver() {
        return new PropertyTypeResolver() {
            @Override
            public Class resolveTypeByPropertyName(String propertyName) {
                return AptosFormsDemoCoin_claimer_1ResourceUtils.getFilterPropertyType(propertyName);
            }
        };
    }

    // ////////////////////////////////
 
    public static class AptosFormsDemoCoin_claimer_1ResourceUtils {

        public static FormPageAndAddress parseIdString(String idString) {
            TextFormatter<FormPageAndAddress> formatter = AptosFormsDemoCoin_claimer_1Metadata.URL_ID_TEXT_FORMATTER;
            return formatter.parse(idString);
        }

        public static void setNullIdOrThrowOnInconsistentIds(String formPageAndSignerAddress, AptosFormsDemoCoin_claimer_1Command value) {
            FormPageAndAddress idObj = parseIdString(formPageAndSignerAddress);
            if (value.getFormPageAndSignerAddress() == null) {
                value.setFormPageAndSignerAddress(idObj);
            } else if (!value.getFormPageAndSignerAddress().equals(idObj)) {
                throw DomainError.named("inconsistentId", "Argument Id %1$s NOT equals body Id %2$s", formPageAndSignerAddress, value.getFormPageAndSignerAddress());
            }
        }
    
        public static List<String> getQueryOrders(String str, String separator) {
            return QueryParamUtils.getQueryOrders(str, separator, AptosFormsDemoCoin_claimer_1Metadata.aliasMap);
        }

        public static List<String> getQuerySorts(Map<String, String[]> queryNameValuePairs) {
            String[] values = queryNameValuePairs.get("sort");
            return QueryParamUtils.getQuerySorts(values, AptosFormsDemoCoin_claimer_1Metadata.aliasMap);
        }

        public static String getFilterPropertyName(String fieldName) {
            if ("sort".equalsIgnoreCase(fieldName)
                    || "firstResult".equalsIgnoreCase(fieldName)
                    || "maxResults".equalsIgnoreCase(fieldName)
                    || "fields".equalsIgnoreCase(fieldName)) {
                return null;
            }
            if (AptosFormsDemoCoin_claimer_1Metadata.aliasMap.containsKey(fieldName)) {
                return AptosFormsDemoCoin_claimer_1Metadata.aliasMap.get(fieldName);
            }
            return null;
        }

        public static Class getFilterPropertyType(String propertyName) {
            if (AptosFormsDemoCoin_claimer_1Metadata.propertyTypeMap.containsKey(propertyName)) {
                String propertyType = AptosFormsDemoCoin_claimer_1Metadata.propertyTypeMap.get(propertyName);
                if (!StringHelper.isNullOrEmpty(propertyType)) {
                    if (BoundedContextMetadata.CLASS_MAP.containsKey(propertyType)) {
                        return BoundedContextMetadata.CLASS_MAP.get(propertyType);
                    }
                }
            }
            return String.class;
        }

        public static Iterable<Map.Entry<String, Object>> getQueryFilterMap(Map<String, String[]> queryNameValuePairs) {
            Map<String, Object> filter = new HashMap<>();
            queryNameValuePairs.forEach((key, values) -> {
                if (values.length > 0) {
                    String pName = getFilterPropertyName(key);
                    if (!StringHelper.isNullOrEmpty(pName)) {
                        Class pClass = getFilterPropertyType(pName);
                        filter.put(pName, ApplicationContext.current.getTypeConverter().convertFromString(pClass, values[0]));
                    }
                }
            });
            return filter.entrySet();
        }

        public static AptosFormsDemoCoin_claimer_1StateDto[] toAptosFormsDemoCoin_claimer_1StateDtoArray(Iterable<FormPageAndAddress> ids) {
            List<AptosFormsDemoCoin_claimer_1StateDto> states = new ArrayList<>();
            ids.forEach(i -> {
                AptosFormsDemoCoin_claimer_1StateDto dto = new AptosFormsDemoCoin_claimer_1StateDto();
                dto.setFormPageAndSignerAddress(i);
                states.add(dto);
            });
            return states.toArray(new AptosFormsDemoCoin_claimer_1StateDto[0]);
        }

    }

}
