// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.aptosformsdemocoin_claimer_1;

import java.util.*;
import java.math.*;
import org.test.aptosformsdemo.domain.*;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.specialization.*;


public class AptosFormsDemoCoin_claimer_1StateDto {

    private FormPageAndAddress formPageAndSignerAddress;

    public FormPageAndAddress getFormPageAndSignerAddress()
    {
        return this.formPageAndSignerAddress;
    }

    public void setFormPageAndSignerAddress(FormPageAndAddress formPageAndSignerAddress)
    {
        this.formPageAndSignerAddress = formPageAndSignerAddress;
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

    private Boolean active;

    public Boolean getActive()
    {
        return this.active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
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

    private OffsetDateTime createdAt;

    public OffsetDateTime getCreatedAt()
    {
        return this.createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt)
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

    private OffsetDateTime updatedAt;

    public OffsetDateTime getUpdatedAt()
    {
        return this.updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt)
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

        public AptosFormsDemoCoin_claimer_1StateDto[] toAptosFormsDemoCoin_claimer_1StateDtoArray(Iterable<AptosFormsDemoCoin_claimer_1State> states) {
            return toAptosFormsDemoCoin_claimer_1StateDtoList(states).toArray(new AptosFormsDemoCoin_claimer_1StateDto[0]);
        }

        public List<AptosFormsDemoCoin_claimer_1StateDto> toAptosFormsDemoCoin_claimer_1StateDtoList(Iterable<AptosFormsDemoCoin_claimer_1State> states) {
            ArrayList<AptosFormsDemoCoin_claimer_1StateDto> stateDtos = new ArrayList();
            for (AptosFormsDemoCoin_claimer_1State s : states) {
                AptosFormsDemoCoin_claimer_1StateDto dto = toAptosFormsDemoCoin_claimer_1StateDto(s);
                stateDtos.add(dto);
            }
            return stateDtos;
        }

        public AptosFormsDemoCoin_claimer_1StateDto toAptosFormsDemoCoin_claimer_1StateDto(AptosFormsDemoCoin_claimer_1State state)
        {
            if(state == null) {
                return null;
            }
            AptosFormsDemoCoin_claimer_1StateDto dto = new AptosFormsDemoCoin_claimer_1StateDto();
            if (returnedFieldsContains("FormPageAndSignerAddress")) {
                dto.setFormPageAndSignerAddress(state.getFormPageAndSignerAddress());
            }
            if (returnedFieldsContains("Version")) {
                dto.setVersion(state.getVersion());
            }
            if (returnedFieldsContains("Active")) {
                dto.setActive(state.getActive());
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

