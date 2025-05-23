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
import org.test.aptosformsdemo.domain.aptosformsdemomainform.*;
import static org.test.aptosformsdemo.domain.meta.M.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.*;
import org.dddml.support.criterion.TypeConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequestMapping(path = "AptosFormsDemoMainForms", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class AptosFormsDemoMainFormResource {
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private AptosFormsDemoMainFormApplicationService aptosFormsDemoMainFormApplicationService;


    /**
     * Retrieve.
     * Retrieve AptosFormsDemoMainForms
     */
    @GetMapping
    @Transactional(readOnly = true)
    public AptosFormsDemoMainFormStateDto[] getAll( HttpServletRequest request,
                    @RequestParam(value = "sort", required = false) String sort,
                    @RequestParam(value = "fields", required = false) String fields,
                    @RequestParam(value = "firstResult", defaultValue = "0") Integer firstResult,
                    @RequestParam(value = "maxResults", defaultValue = "2147483647") Integer maxResults,
                    @RequestParam(value = "filter", required = false) String filter) {
        try {
        if (firstResult < 0) { firstResult = 0; }
        if (maxResults == null || maxResults < 1) { maxResults = Integer.MAX_VALUE; }

            Iterable<AptosFormsDemoMainFormState> states = null; 
            CriterionDto criterion = null;
            if (!StringHelper.isNullOrEmpty(filter)) {
                criterion = new ObjectMapper().readValue(filter, CriterionDto.class);
            } else {
                criterion = QueryParamUtils.getQueryCriterionDto(request.getParameterMap().entrySet().stream()
                    .filter(kv -> AptosFormsDemoMainFormResourceUtils.getFilterPropertyName(kv.getKey()) != null)
                    .collect(Collectors.toMap(kv -> kv.getKey(), kv -> kv.getValue())));
            }
            Criterion c = CriterionDto.toSubclass(criterion, getCriterionTypeConverter(), getPropertyTypeResolver(), 
                n -> (AptosFormsDemoMainFormMetadata.aliasMap.containsKey(n) ? AptosFormsDemoMainFormMetadata.aliasMap.get(n) : n));
            states = aptosFormsDemoMainFormApplicationService.get(
                c,
                AptosFormsDemoMainFormResourceUtils.getQuerySorts(request.getParameterMap()),
                firstResult, maxResults);

            AptosFormsDemoMainFormStateDto.DtoConverter dtoConverter = new AptosFormsDemoMainFormStateDto.DtoConverter();
            if (StringHelper.isNullOrEmpty(fields)) {
                dtoConverter.setAllFieldsReturned(true);
            } else {
                dtoConverter.setReturnedFieldsString(fields);
            }
            return dtoConverter.toAptosFormsDemoMainFormStateDtoArray(states);

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    /**
     * Retrieve in pages.
     * Retrieve AptosFormsDemoMainForms in pages.
     */
    @GetMapping("_page")
    @Transactional(readOnly = true)
    public Page<AptosFormsDemoMainFormStateDto> getPage( HttpServletRequest request,
                    @RequestParam(value = "fields", required = false) String fields,
                    @RequestParam(value = "page", defaultValue = "0") Integer page,
                    @RequestParam(value = "size", defaultValue = "20") Integer size,
                    @RequestParam(value = "filter", required = false) String filter) {
        try {
            Integer firstResult = (page == null ? 0 : page) * (size == null ? 20 : size);
            Integer maxResults = (size == null ? 20 : size);
            Iterable<AptosFormsDemoMainFormState> states = null; 
            CriterionDto criterion = null;
            if (!StringHelper.isNullOrEmpty(filter)) {
                criterion = new ObjectMapper().readValue(filter, CriterionDto.class);
            } else {
                criterion = QueryParamUtils.getQueryCriterionDto(request.getParameterMap().entrySet().stream()
                    .filter(kv -> AptosFormsDemoMainFormResourceUtils.getFilterPropertyName(kv.getKey()) != null)
                    .collect(Collectors.toMap(kv -> kv.getKey(), kv -> kv.getValue())));
            }
            Criterion c = CriterionDto.toSubclass(criterion, getCriterionTypeConverter(), getPropertyTypeResolver(), 
                n -> (AptosFormsDemoMainFormMetadata.aliasMap.containsKey(n) ? AptosFormsDemoMainFormMetadata.aliasMap.get(n) : n));
            states = aptosFormsDemoMainFormApplicationService.get(
                c,
                AptosFormsDemoMainFormResourceUtils.getQuerySorts(request.getParameterMap()),
                firstResult, maxResults);
            long count = aptosFormsDemoMainFormApplicationService.getCount(c);

            AptosFormsDemoMainFormStateDto.DtoConverter dtoConverter = new AptosFormsDemoMainFormStateDto.DtoConverter();
            if (StringHelper.isNullOrEmpty(fields)) {
                dtoConverter.setAllFieldsReturned(true);
            } else {
                dtoConverter.setReturnedFieldsString(fields);
            }
            Page.PageImpl<AptosFormsDemoMainFormStateDto> statePage =  new Page.PageImpl<>(dtoConverter.toAptosFormsDemoMainFormStateDtoList(states), count);
            statePage.setSize(size);
            statePage.setNumber(page);
            return statePage;

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    /**
     * Retrieve.
     * Retrieves AptosFormsDemoMainForm with the specified ID.
     */
    @GetMapping("{formPageAndSignerAddress}")
    @Transactional(readOnly = true)
    public AptosFormsDemoMainFormStateDto get(@PathVariable("formPageAndSignerAddress") String formPageAndSignerAddress, @RequestParam(value = "fields", required = false) String fields) {
        try {
            FormPageAndAddress idObj = AptosFormsDemoMainFormResourceUtils.parseIdString(formPageAndSignerAddress);
            AptosFormsDemoMainFormState state = aptosFormsDemoMainFormApplicationService.get(idObj);
            if (state == null) { return null; }

            AptosFormsDemoMainFormStateDto.DtoConverter dtoConverter = new AptosFormsDemoMainFormStateDto.DtoConverter();
            if (StringHelper.isNullOrEmpty(fields)) {
                dtoConverter.setAllFieldsReturned(true);
            } else {
                dtoConverter.setReturnedFieldsString(fields);
            }
            return dtoConverter.toAptosFormsDemoMainFormStateDto(state);

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
                n -> (AptosFormsDemoMainFormMetadata.aliasMap.containsKey(n) ? AptosFormsDemoMainFormMetadata.aliasMap.get(n) : n));
            count = aptosFormsDemoMainFormApplicationService.getCount(c);
            return count;

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }


    @PutMapping("{formPageAndSignerAddress}/_commands/Submit")
    public void submit(@PathVariable("formPageAndSignerAddress") String formPageAndSignerAddress, @RequestBody AptosFormsDemoMainFormCommands.Submit content) {
        try {

            AptosFormsDemoMainFormCommands.Submit cmd = content;//.toSubmit();
            FormPageAndAddress idObj = AptosFormsDemoMainFormResourceUtils.parseIdString(formPageAndSignerAddress);
            if (cmd.getFormPageAndSignerAddress() == null) {
                cmd.setFormPageAndSignerAddress(idObj);
            } else if (!cmd.getFormPageAndSignerAddress().equals(idObj)) {
                throw DomainError.named("inconsistentId", "Argument Id %1$s NOT equals body Id %2$s", formPageAndSignerAddress, cmd.getFormPageAndSignerAddress());
            }
            cmd.setRequesterId(SecurityContextUtil.getRequesterId());
            aptosFormsDemoMainFormApplicationService.when(cmd);

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }


    @PutMapping("{formPageAndSignerAddress}/_commands/Update")
    public void update(@PathVariable("formPageAndSignerAddress") String formPageAndSignerAddress, @RequestBody AptosFormsDemoMainFormCommands.Update content) {
        try {

            AptosFormsDemoMainFormCommands.Update cmd = content;//.toUpdate();
            FormPageAndAddress idObj = AptosFormsDemoMainFormResourceUtils.parseIdString(formPageAndSignerAddress);
            if (cmd.getFormPageAndSignerAddress() == null) {
                cmd.setFormPageAndSignerAddress(idObj);
            } else if (!cmd.getFormPageAndSignerAddress().equals(idObj)) {
                throw DomainError.named("inconsistentId", "Argument Id %1$s NOT equals body Id %2$s", formPageAndSignerAddress, cmd.getFormPageAndSignerAddress());
            }
            cmd.setRequesterId(SecurityContextUtil.getRequesterId());
            aptosFormsDemoMainFormApplicationService.when(cmd);

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    @GetMapping("_metadata/filteringFields")
    public List<PropertyMetadataDto> getMetadataFilteringFields() {
        try {

            List<PropertyMetadataDto> filtering = new ArrayList<>();
            AptosFormsDemoMainFormMetadata.propertyTypeMap.forEach((key, value) -> {
                filtering.add(new PropertyMetadataDto(key, value, true));
            });
            return filtering;

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    @GetMapping("{formPageAndSignerAddress}/_events/{version}")
    @Transactional(readOnly = true)
    public AptosFormsDemoMainFormEvent getEvent(@PathVariable("formPageAndSignerAddress") String formPageAndSignerAddress, @PathVariable("version") long version) {
        try {

            FormPageAndAddress idObj = AptosFormsDemoMainFormResourceUtils.parseIdString(formPageAndSignerAddress);
            //AptosFormsDemoMainFormStateEventDtoConverter dtoConverter = getAptosFormsDemoMainFormStateEventDtoConverter();
            return aptosFormsDemoMainFormApplicationService.getEvent(idObj, version);

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    @GetMapping("{formPageAndSignerAddress}/_historyStates/{version}")
    @Transactional(readOnly = true)
    public AptosFormsDemoMainFormStateDto getHistoryState(@PathVariable("formPageAndSignerAddress") String formPageAndSignerAddress, @PathVariable("version") long version, @RequestParam(value = "fields", required = false) String fields) {
        try {

            FormPageAndAddress idObj = AptosFormsDemoMainFormResourceUtils.parseIdString(formPageAndSignerAddress);
            AptosFormsDemoMainFormStateDto.DtoConverter dtoConverter = new AptosFormsDemoMainFormStateDto.DtoConverter();
            if (StringHelper.isNullOrEmpty(fields)) {
                dtoConverter.setAllFieldsReturned(true);
            } else {
                dtoConverter.setReturnedFieldsString(fields);
            }
            return dtoConverter.toAptosFormsDemoMainFormStateDto(aptosFormsDemoMainFormApplicationService.getHistoryState(idObj, version));

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }



    //protected  AptosFormsDemoMainFormStateEventDtoConverter getAptosFormsDemoMainFormStateEventDtoConverter() {
    //    return new AptosFormsDemoMainFormStateEventDtoConverter();
    //}

    protected TypeConverter getCriterionTypeConverter() {
        return new DefaultTypeConverter();
    }

    protected PropertyTypeResolver getPropertyTypeResolver() {
        return new PropertyTypeResolver() {
            @Override
            public Class resolveTypeByPropertyName(String propertyName) {
                return AptosFormsDemoMainFormResourceUtils.getFilterPropertyType(propertyName);
            }
        };
    }

 
    public static class AptosFormsDemoMainFormResourceUtils {

        public static FormPageAndAddress parseIdString(String idString) {
            TextFormatter<FormPageAndAddress> formatter = AptosFormsDemoMainFormMetadata.URL_ID_TEXT_FORMATTER;
            return formatter.parse(idString);
        }

        public static void setNullIdOrThrowOnInconsistentIds(String formPageAndSignerAddress, org.test.aptosformsdemo.domain.aptosformsdemomainform.AptosFormsDemoMainFormCommand value) {
            FormPageAndAddress idObj = parseIdString(formPageAndSignerAddress);
            if (value.getFormPageAndSignerAddress() == null) {
                value.setFormPageAndSignerAddress(idObj);
            } else if (!value.getFormPageAndSignerAddress().equals(idObj)) {
                throw DomainError.named("inconsistentId", "Argument Id %1$s NOT equals body Id %2$s", formPageAndSignerAddress, value.getFormPageAndSignerAddress());
            }
        }
    
        public static List<String> getQueryOrders(String str, String separator) {
            return QueryParamUtils.getQueryOrders(str, separator, AptosFormsDemoMainFormMetadata.aliasMap);
        }

        public static List<String> getQuerySorts(Map<String, String[]> queryNameValuePairs) {
            String[] values = queryNameValuePairs.get("sort");
            return QueryParamUtils.getQuerySorts(values, AptosFormsDemoMainFormMetadata.aliasMap);
        }

        public static String getFilterPropertyName(String fieldName) {
            if ("sort".equalsIgnoreCase(fieldName)
                    || "firstResult".equalsIgnoreCase(fieldName)
                    || "maxResults".equalsIgnoreCase(fieldName)
                    || "fields".equalsIgnoreCase(fieldName)) {
                return null;
            }
            if (AptosFormsDemoMainFormMetadata.aliasMap.containsKey(fieldName)) {
                return AptosFormsDemoMainFormMetadata.aliasMap.get(fieldName);
            }
            return null;
        }

        public static Class getFilterPropertyType(String propertyName) {
            if (AptosFormsDemoMainFormMetadata.propertyTypeMap.containsKey(propertyName)) {
                String propertyType = AptosFormsDemoMainFormMetadata.propertyTypeMap.get(propertyName);
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

        public static AptosFormsDemoMainFormStateDto[] toAptosFormsDemoMainFormStateDtoArray(Iterable<FormPageAndAddress> ids) {
            List<AptosFormsDemoMainFormStateDto> states = new ArrayList<>();
            ids.forEach(i -> {
                AptosFormsDemoMainFormStateDto dto = new AptosFormsDemoMainFormStateDto();
                dto.setFormPageAndSignerAddress(i);
                states.add(dto);
            });
            return states.toArray(new AptosFormsDemoMainFormStateDto[0]);
        }

    }

}

