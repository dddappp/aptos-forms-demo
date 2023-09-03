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
import java.util.Date;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.specialization.*;
import org.test.aptosformsdemo.domain.mainform.*;
import static org.test.aptosformsdemo.domain.meta.M.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.dddml.support.criterion.TypeConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequestMapping(path = "MainForms", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class MainFormResource {
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private MainFormApplicationService mainFormApplicationService;


    /**
     * Retrieve.
     * Retrieve MainForms
     */
    @GetMapping
    @Transactional(readOnly = true)
    public MainFormStateDto[] getAll( HttpServletRequest request,
                    @RequestParam(value = "sort", required = false) String sort,
                    @RequestParam(value = "fields", required = false) String fields,
                    @RequestParam(value = "firstResult", defaultValue = "0") Integer firstResult,
                    @RequestParam(value = "maxResults", defaultValue = "2147483647") Integer maxResults,
                    @RequestParam(value = "filter", required = false) String filter) {
        try {
        if (firstResult < 0) { firstResult = 0; }
        if (maxResults == null || maxResults < 1) { maxResults = Integer.MAX_VALUE; }

            Iterable<MainFormState> states = null; 
            CriterionDto criterion = null;
            if (!StringHelper.isNullOrEmpty(filter)) {
                criterion = new ObjectMapper().readValue(filter, CriterionDto.class);
            } else {
                criterion = QueryParamUtils.getQueryCriterionDto(request.getParameterMap().entrySet().stream()
                    .filter(kv -> MainFormResourceUtils.getFilterPropertyName(kv.getKey()) != null)
                    .collect(Collectors.toMap(kv -> kv.getKey(), kv -> kv.getValue())));
            }
            Criterion c = CriterionDto.toSubclass(criterion, getCriterionTypeConverter(), getPropertyTypeResolver(), 
                n -> (MainFormMetadata.aliasMap.containsKey(n) ? MainFormMetadata.aliasMap.get(n) : n));
            states = mainFormApplicationService.get(
                c,
                MainFormResourceUtils.getQuerySorts(request.getParameterMap()),
                firstResult, maxResults);

            MainFormStateDto.DtoConverter dtoConverter = new MainFormStateDto.DtoConverter();
            if (StringHelper.isNullOrEmpty(fields)) {
                dtoConverter.setAllFieldsReturned(true);
            } else {
                dtoConverter.setReturnedFieldsString(fields);
            }
            return dtoConverter.toMainFormStateDtoArray(states);

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    /**
     * Retrieve in pages.
     * Retrieve MainForms in pages.
     */
    @GetMapping("_page")
    @Transactional(readOnly = true)
    public Page<MainFormStateDto> getPage( HttpServletRequest request,
                    @RequestParam(value = "fields", required = false) String fields,
                    @RequestParam(value = "page", defaultValue = "0") Integer page,
                    @RequestParam(value = "size", defaultValue = "20") Integer size,
                    @RequestParam(value = "filter", required = false) String filter) {
        try {
            Integer firstResult = (page == null ? 0 : page) * (size == null ? 20 : size);
            Integer maxResults = (size == null ? 20 : size);
            Iterable<MainFormState> states = null; 
            CriterionDto criterion = null;
            if (!StringHelper.isNullOrEmpty(filter)) {
                criterion = new ObjectMapper().readValue(filter, CriterionDto.class);
            } else {
                criterion = QueryParamUtils.getQueryCriterionDto(request.getParameterMap().entrySet().stream()
                    .filter(kv -> MainFormResourceUtils.getFilterPropertyName(kv.getKey()) != null)
                    .collect(Collectors.toMap(kv -> kv.getKey(), kv -> kv.getValue())));
            }
            Criterion c = CriterionDto.toSubclass(criterion, getCriterionTypeConverter(), getPropertyTypeResolver(), 
                n -> (MainFormMetadata.aliasMap.containsKey(n) ? MainFormMetadata.aliasMap.get(n) : n));
            states = mainFormApplicationService.get(
                c,
                MainFormResourceUtils.getQuerySorts(request.getParameterMap()),
                firstResult, maxResults);
            long count = mainFormApplicationService.getCount(c);

            MainFormStateDto.DtoConverter dtoConverter = new MainFormStateDto.DtoConverter();
            if (StringHelper.isNullOrEmpty(fields)) {
                dtoConverter.setAllFieldsReturned(true);
            } else {
                dtoConverter.setReturnedFieldsString(fields);
            }
            Page.PageImpl<MainFormStateDto> statePage =  new Page.PageImpl<>(dtoConverter.toMainFormStateDtoList(states), count);
            statePage.setSize(size);
            statePage.setNumber(page);
            return statePage;

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    /**
     * Retrieve.
     * Retrieves MainForm with the specified ID.
     */
    @GetMapping("{accountAddress}")
    @Transactional(readOnly = true)
    public MainFormStateDto get(@PathVariable("accountAddress") String accountAddress, @RequestParam(value = "fields", required = false) String fields) {
        try {
            String idObj = accountAddress;
            MainFormState state = mainFormApplicationService.get(idObj);
            if (state == null) { return null; }

            MainFormStateDto.DtoConverter dtoConverter = new MainFormStateDto.DtoConverter();
            if (StringHelper.isNullOrEmpty(fields)) {
                dtoConverter.setAllFieldsReturned(true);
            } else {
                dtoConverter.setReturnedFieldsString(fields);
            }
            return dtoConverter.toMainFormStateDto(state);

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
                n -> (MainFormMetadata.aliasMap.containsKey(n) ? MainFormMetadata.aliasMap.get(n) : n));
            count = mainFormApplicationService.getCount(c);
            return count;

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }


    @PutMapping("{accountAddress}/_commands/Create")
    public void create(@PathVariable("accountAddress") String accountAddress, @RequestBody MainFormCommands.Create content) {
        try {

            MainFormCommands.Create cmd = content;//.toCreate();
            String idObj = accountAddress;
            if (cmd.getAccountAddress() == null) {
                cmd.setAccountAddress(idObj);
            } else if (!cmd.getAccountAddress().equals(idObj)) {
                throw DomainError.named("inconsistentId", "Argument Id %1$s NOT equals body Id %2$s", accountAddress, cmd.getAccountAddress());
            }
            cmd.setRequesterId(SecurityContextUtil.getRequesterId());
            mainFormApplicationService.when(cmd);

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    @GetMapping("_metadata/filteringFields")
    public List<PropertyMetadataDto> getMetadataFilteringFields() {
        try {

            List<PropertyMetadataDto> filtering = new ArrayList<>();
            MainFormMetadata.propertyTypeMap.forEach((key, value) -> {
                filtering.add(new PropertyMetadataDto(key, value, true));
            });
            return filtering;

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    @GetMapping("{accountAddress}/_events/{version}")
    @Transactional(readOnly = true)
    public MainFormEvent getEvent(@PathVariable("accountAddress") String accountAddress, @PathVariable("version") long version) {
        try {

            String idObj = accountAddress;
            //MainFormStateEventDtoConverter dtoConverter = getMainFormStateEventDtoConverter();
            return mainFormApplicationService.getEvent(idObj, version);

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }

    @GetMapping("{accountAddress}/_historyStates/{version}")
    @Transactional(readOnly = true)
    public MainFormStateDto getHistoryState(@PathVariable("accountAddress") String accountAddress, @PathVariable("version") long version, @RequestParam(value = "fields", required = false) String fields) {
        try {

            String idObj = accountAddress;
            MainFormStateDto.DtoConverter dtoConverter = new MainFormStateDto.DtoConverter();
            if (StringHelper.isNullOrEmpty(fields)) {
                dtoConverter.setAllFieldsReturned(true);
            } else {
                dtoConverter.setReturnedFieldsString(fields);
            }
            return dtoConverter.toMainFormStateDto(mainFormApplicationService.getHistoryState(idObj, version));

        } catch (Exception ex) { logger.info(ex.getMessage(), ex); throw DomainErrorUtils.convertException(ex); }
    }



    //protected  MainFormStateEventDtoConverter getMainFormStateEventDtoConverter() {
    //    return new MainFormStateEventDtoConverter();
    //}

    protected TypeConverter getCriterionTypeConverter() {
        return new DefaultTypeConverter();
    }

    protected PropertyTypeResolver getPropertyTypeResolver() {
        return new PropertyTypeResolver() {
            @Override
            public Class resolveTypeByPropertyName(String propertyName) {
                return MainFormResourceUtils.getFilterPropertyType(propertyName);
            }
        };
    }

    // ////////////////////////////////
 
    public static class MainFormResourceUtils {

        public static void setNullIdOrThrowOnInconsistentIds(String accountAddress, MainFormCommand value) {
            String idObj = accountAddress;
            if (value.getAccountAddress() == null) {
                value.setAccountAddress(idObj);
            } else if (!value.getAccountAddress().equals(idObj)) {
                throw DomainError.named("inconsistentId", "Argument Id %1$s NOT equals body Id %2$s", accountAddress, value.getAccountAddress());
            }
        }
    
        public static List<String> getQueryOrders(String str, String separator) {
            return QueryParamUtils.getQueryOrders(str, separator, MainFormMetadata.aliasMap);
        }

        public static List<String> getQuerySorts(Map<String, String[]> queryNameValuePairs) {
            String[] values = queryNameValuePairs.get("sort");
            return QueryParamUtils.getQuerySorts(values, MainFormMetadata.aliasMap);
        }

        public static String getFilterPropertyName(String fieldName) {
            if ("sort".equalsIgnoreCase(fieldName)
                    || "firstResult".equalsIgnoreCase(fieldName)
                    || "maxResults".equalsIgnoreCase(fieldName)
                    || "fields".equalsIgnoreCase(fieldName)) {
                return null;
            }
            if (MainFormMetadata.aliasMap.containsKey(fieldName)) {
                return MainFormMetadata.aliasMap.get(fieldName);
            }
            return null;
        }

        public static Class getFilterPropertyType(String propertyName) {
            if (MainFormMetadata.propertyTypeMap.containsKey(propertyName)) {
                String propertyType = MainFormMetadata.propertyTypeMap.get(propertyName);
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

        public static MainFormStateDto[] toMainFormStateDtoArray(Iterable<String> ids) {
            List<MainFormStateDto> states = new ArrayList<>();
            ids.forEach(i -> {
                MainFormStateDto dto = new MainFormStateDto();
                dto.setAccountAddress(i);
                states.add(dto);
            });
            return states.toArray(new MainFormStateDto[0]);
        }

    }

}

