// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemoglobal;

import java.util.*;
import java.math.*;
import org.test.aptosformsdemo.domain.*;
import java.util.Date;
import java.math.BigInteger;
import org.test.aptosformsdemo.specialization.*;


public class AptosFormsDemoGlobalStateDto {

    private FormAndAddress formAndAccountAddress;

    public FormAndAddress getFormAndAccountAddress()
    {
        return this.formAndAccountAddress;
    }

    public void setFormAndAccountAddress(FormAndAddress formAndAccountAddress)
    {
        this.formAndAccountAddress = formAndAccountAddress;
    }

    private Boolean active;

    public Boolean getActive()
    {
        return this.active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
    }

    private BigInteger version;

    public BigInteger getVersion()
    {
        return this.version;
    }

    public void setVersion(BigInteger version)
    {
        this.version = version;
    }

    private Long offChainVersion;

    public Long getOffChainVersion()
    {
        return this.offChainVersion;
    }

    public void setOffChainVersion(Long offChainVersion)
    {
        this.offChainVersion = offChainVersion;
    }

    private String createdBy;

    public String getCreatedBy()
    {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    private Date createdAt;

    public Date getCreatedAt()
    {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt)
    {
        this.createdAt = createdAt;
    }

    private String updatedBy;

    public String getUpdatedBy()
    {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    private Date updatedAt;

    public Date getUpdatedAt()
    {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    private Map<String, Object> dynamicProperties = new HashMap<>();

    public Map<String, Object> getDynamicProperties() {
        return this.dynamicProperties;
    }

    public void setDynamicProperties(Map<String, Object> dynamicProperties) {
        this.dynamicProperties = dynamicProperties;
    }


    public static class DtoConverter extends AbstractStateDtoConverter
    {
        public static Collection<String> collectionFieldNames = Arrays.asList(new String[]{});

        @Override
        protected boolean isCollectionField(String fieldName) {
            return CollectionUtils.collectionContainsIgnoringCase(collectionFieldNames, fieldName);
        }

        public AptosFormsDemoGlobalStateDto[] toAptosFormsDemoGlobalStateDtoArray(Iterable<AptosFormsDemoGlobalState> states) {
            return toAptosFormsDemoGlobalStateDtoList(states).toArray(new AptosFormsDemoGlobalStateDto[0]);
        }

        public List<AptosFormsDemoGlobalStateDto> toAptosFormsDemoGlobalStateDtoList(Iterable<AptosFormsDemoGlobalState> states) {
            ArrayList<AptosFormsDemoGlobalStateDto> stateDtos = new ArrayList();
            for (AptosFormsDemoGlobalState s : states) {
                AptosFormsDemoGlobalStateDto dto = toAptosFormsDemoGlobalStateDto(s);
                stateDtos.add(dto);
            }
            return stateDtos;
        }

        public AptosFormsDemoGlobalStateDto toAptosFormsDemoGlobalStateDto(AptosFormsDemoGlobalState state)
        {
            if(state == null) {
                return null;
            }
            AptosFormsDemoGlobalStateDto dto = new AptosFormsDemoGlobalStateDto();
            if (returnedFieldsContains("FormAndAccountAddress")) {
                dto.setFormAndAccountAddress(state.getFormAndAccountAddress());
            }
            if (returnedFieldsContains("Active")) {
                dto.setActive(state.getActive());
            }
            if (returnedFieldsContains("Version")) {
                dto.setVersion(state.getVersion());
            }
            if (returnedFieldsContains("OffChainVersion")) {
                dto.setOffChainVersion(state.getOffChainVersion());
            }
            if (returnedFieldsContains("CreatedBy")) {
                dto.setCreatedBy(state.getCreatedBy());
            }
            if (returnedFieldsContains("CreatedAt")) {
                dto.setCreatedAt(state.getCreatedAt());
            }
            if (returnedFieldsContains("UpdatedBy")) {
                dto.setUpdatedBy(state.getUpdatedBy());
            }
            if (returnedFieldsContains("UpdatedAt")) {
                dto.setUpdatedAt(state.getUpdatedAt());
            }
            dto.setDynamicProperties(state.getDynamicProperties());
            return dto;
        }

    }
}
