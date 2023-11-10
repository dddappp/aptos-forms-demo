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
import java.math.BigInteger;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.specialization.*;
import org.test.aptosformsdemo.domain.formdefinition.*;
import static org.test.aptosformsdemo.domain.meta.M.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.dddml.support.criterion.TypeConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequestMapping(path = "FormDefinitions", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class FormDefinitionResource {
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private FormDefinitionApplicationService formDefinitionApplicationService;


    /**
     * Retrieve.
     * Retrieve FormDefinitions
     */
    @GetMapping
    @Transactional(readOnly = true)
    public FormDefinitionStateDto[] getAll( HttpServletRequest request,
                    @RequestParam(value = "sort", required = false) String sort,
                    @RequestParam(value = "fields", required = false) String fields,
                    @RequestParam(value = "firstResult", defaultValue = "0") Integer firstResult,
                    @RequestParam(value = "maxResults", defaultValue = "2147483647") Integer maxResults,
                    @RequestParam(value = "filter", required = false) String filter) {
        try {
        if (firstResult < 0) { firstResult = 0; }
        if (maxResults == null || maxResults < 1) { maxResults = Integer.MAX_VALUE; }

            Iterable<FormDefinitionState> states = null; 
            CriterionDto criterion = null;
            if (!StringHelper.isNullOrEmpty(filter)) {
                criterion = new ObjectMapper().readValue(filter, CriterionDto.class);
            } else {
                criterion = QueryParamUtils.getQueryCriterionDto(request.getParameterMap().entrySet().stream()
                    .filter(kv -> FormDefinitionResourceUtils.getFilterPropertyName(kv.getKey()) != null)
                    .collect(Collectors.toMap(kv -> kv.getKey(), kv -> kv.getValue())));
            }
            Criterion c = CriterionDto.toSubclass(criterion, getCriterionTypeConverter(), getPropertyTypeResolver(), 
                n -> (FormDefinitionMetadata.aliasMap.containsKey(n) ? FormDefinitionMetadata.aliasMap.get(n) : n));
            states = formDefinitionApplicationService.get(
                c,
                FormDefinitionResourceUtils.getQuerySorts(request.getParameterMap()),
                firstResult, maxResults);

            FormDefinitionStateDto.DtoConverter dtoConverter = new FormDefinitionStateDto.DtoConverter();
            if (StringHelper.isNullOrEmpty(fields)) {
                dtoConverter.setAllFieldsReturned(true);
            } else {
                dtoConverter.setReturnedFieldsString(fields);
            }
            return dtoConverter.toFormDefinitionStateDtoArray(states);

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    /**
     * Retrieve in pages.
     * Retrieve FormDefinitions in pages.
     */
    @GetMapping("_page")
    @Transactional(readOnly = true)
    public Page<FormDefinitionStateDto> getPage( HttpServletRequest request,
                    @RequestParam(value = "fields", required = false) String fields,
                    @RequestParam(value = "page", defaultValue = "0") Integer page,
                    @RequestParam(value = "size", defaultValue = "20") Integer size,
                    @RequestParam(value = "filter", required = false) String filter) {
        try {
            Integer firstResult = (page == null ? 0 : page) * (size == null ? 20 : size);
            Integer maxResults = (size == null ? 20 : size);
            Iterable<FormDefinitionState> states = null; 
            CriterionDto criterion = null;
            if (!StringHelper.isNullOrEmpty(filter)) {
                criterion = new ObjectMapper().readValue(filter, CriterionDto.class);
            } else {
                criterion = QueryParamUtils.getQueryCriterionDto(request.getParameterMap().entrySet().stream()
                    .filter(kv -> FormDefinitionResourceUtils.getFilterPropertyName(kv.getKey()) != null)
                    .collect(Collectors.toMap(kv -> kv.getKey(), kv -> kv.getValue())));
            }
            Criterion c = CriterionDto.toSubclass(criterion, getCriterionTypeConverter(), getPropertyTypeResolver(), 
                n -> (FormDefinitionMetadata.aliasMap.containsKey(n) ? FormDefinitionMetadata.aliasMap.get(n) : n));
            states = formDefinitionApplicationService.get(
                c,
                FormDefinitionResourceUtils.getQuerySorts(request.getParameterMap()),
                firstResult, maxResults);
            long count = formDefinitionApplicationService.getCount(c);

            FormDefinitionStateDto.DtoConverter dtoConverter = new FormDefinitionStateDto.DtoConverter();
            if (StringHelper.isNullOrEmpty(fields)) {
                dtoConverter.setAllFieldsReturned(true);
            } else {
                dtoConverter.setReturnedFieldsString(fields);
            }
            Page.PageImpl<FormDefinitionStateDto> statePage =  new Page.PageImpl<>(dtoConverter.toFormDefinitionStateDtoList(states), count);
            statePage.setSize(size);
            statePage.setNumber(page);
            return statePage;

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    /**
     * Retrieve.
     * Retrieves FormDefinition with the specified ID.
     */
    @GetMapping("{formSequenceId}")
    @Transactional(readOnly = true)
    public FormDefinitionStateDto get(@PathVariable("formSequenceId") Long formSequenceId, @RequestParam(value = "fields", required = false) String fields) {
        try {
            Long idObj = formSequenceId;
            FormDefinitionState state = formDefinitionApplicationService.get(idObj);
            if (state == null) { return null; }

            FormDefinitionStateDto.DtoConverter dtoConverter = new FormDefinitionStateDto.DtoConverter();
            if (StringHelper.isNullOrEmpty(fields)) {
                dtoConverter.setAllFieldsReturned(true);
            } else {
                dtoConverter.setReturnedFieldsString(fields);
            }
            return dtoConverter.toFormDefinitionStateDto(state);

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
                n -> (FormDefinitionMetadata.aliasMap.containsKey(n) ? FormDefinitionMetadata.aliasMap.get(n) : n));
            count = formDefinitionApplicationService.getCount(c);
            return count;

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    @GetMapping("_metadata/filteringFields")
    public List<PropertyMetadataDto> getMetadataFilteringFields() {
        try {

            List<PropertyMetadataDto> filtering = new ArrayList<>();
            FormDefinitionMetadata.propertyTypeMap.forEach((key, value) -> {
                filtering.add(new PropertyMetadataDto(key, value, true));
            });
            return filtering;

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    @GetMapping("{formSequenceId}/_events/{version}")
    @Transactional(readOnly = true)
    public FormDefinitionEvent getEvent(@PathVariable("formSequenceId") Long formSequenceId, @PathVariable("version") long version) {
        try {

            Long idObj = formSequenceId;
            //FormDefinitionStateEventDtoConverter dtoConverter = getFormDefinitionStateEventDtoConverter();
            return formDefinitionApplicationService.getEvent(idObj, version);

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    @GetMapping("{formSequenceId}/_historyStates/{version}")
    @Transactional(readOnly = true)
    public FormDefinitionStateDto getHistoryState(@PathVariable("formSequenceId") Long formSequenceId, @PathVariable("version") long version, @RequestParam(value = "fields", required = false) String fields) {
        try {

            Long idObj = formSequenceId;
            FormDefinitionStateDto.DtoConverter dtoConverter = new FormDefinitionStateDto.DtoConverter();
            if (StringHelper.isNullOrEmpty(fields)) {
                dtoConverter.setAllFieldsReturned(true);
            } else {
                dtoConverter.setReturnedFieldsString(fields);
            }
            return dtoConverter.toFormDefinitionStateDto(formDefinitionApplicationService.getHistoryState(idObj, version));

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }



    //protected  FormDefinitionStateEventDtoConverter getFormDefinitionStateEventDtoConverter() {
    //    return new FormDefinitionStateEventDtoConverter();
    //}

    protected TypeConverter getCriterionTypeConverter() {
        return new DefaultTypeConverter();
    }

    protected PropertyTypeResolver getPropertyTypeResolver() {
        return new PropertyTypeResolver() {
            @Override
            public Class resolveTypeByPropertyName(String propertyName) {
                return FormDefinitionResourceUtils.getFilterPropertyType(propertyName);
            }
        };
    }

    // ////////////////////////////////
 
    public static class FormDefinitionResourceUtils {

        public static void setNullIdOrThrowOnInconsistentIds(Long formSequenceId, FormDefinitionCommand value) {
            Long idObj = formSequenceId;
            if (value.getFormSequenceId() == null) {
                value.setFormSequenceId(idObj);
            } else if (!value.getFormSequenceId().equals(idObj)) {
                throw DomainError.named("inconsistentId", "Argument Id %1$s NOT equals body Id %2$s", formSequenceId, value.getFormSequenceId());
            }
        }
    
        public static List<String> getQueryOrders(String str, String separator) {
            return QueryParamUtils.getQueryOrders(str, separator, FormDefinitionMetadata.aliasMap);
        }

        public static List<String> getQuerySorts(Map<String, String[]> queryNameValuePairs) {
            String[] values = queryNameValuePairs.get("sort");
            return QueryParamUtils.getQuerySorts(values, FormDefinitionMetadata.aliasMap);
        }

        public static String getFilterPropertyName(String fieldName) {
            if ("sort".equalsIgnoreCase(fieldName)
                    || "firstResult".equalsIgnoreCase(fieldName)
                    || "maxResults".equalsIgnoreCase(fieldName)
                    || "fields".equalsIgnoreCase(fieldName)) {
                return null;
            }
            if (FormDefinitionMetadata.aliasMap.containsKey(fieldName)) {
                return FormDefinitionMetadata.aliasMap.get(fieldName);
            }
            return null;
        }

        public static Class getFilterPropertyType(String propertyName) {
            if (FormDefinitionMetadata.propertyTypeMap.containsKey(propertyName)) {
                String propertyType = FormDefinitionMetadata.propertyTypeMap.get(propertyName);
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

        public static FormDefinitionStateDto[] toFormDefinitionStateDtoArray(Iterable<Long> ids) {
            List<FormDefinitionStateDto> states = new ArrayList<>();
            ids.forEach(i -> {
                FormDefinitionStateDto dto = new FormDefinitionStateDto();
                dto.setFormSequenceId(i);
                states.add(dto);
            });
            return states.toArray(new FormDefinitionStateDto[0]);
        }

    }

}

