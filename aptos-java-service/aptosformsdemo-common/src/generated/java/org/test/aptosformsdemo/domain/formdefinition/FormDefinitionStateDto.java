// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.formdefinition;

import java.util.*;
import java.math.*;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.specialization.*;


public class FormDefinitionStateDto {

    private Long formSequenceId;

    public Long getFormSequenceId()
    {
        return this.formSequenceId;
    }

    public void setFormSequenceId(Long formSequenceId)
    {
        this.formSequenceId = formSequenceId;
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

        public FormDefinitionStateDto[] toFormDefinitionStateDtoArray(Iterable<FormDefinitionState> states) {
            return toFormDefinitionStateDtoList(states).toArray(new FormDefinitionStateDto[0]);
        }

        public List<FormDefinitionStateDto> toFormDefinitionStateDtoList(Iterable<FormDefinitionState> states) {
            ArrayList<FormDefinitionStateDto> stateDtos = new ArrayList();
            for (FormDefinitionState s : states) {
                FormDefinitionStateDto dto = toFormDefinitionStateDto(s);
                stateDtos.add(dto);
            }
            return stateDtos;
        }

        public FormDefinitionStateDto toFormDefinitionStateDto(FormDefinitionState state)
        {
            if(state == null) {
                return null;
            }
            FormDefinitionStateDto dto = new FormDefinitionStateDto();
            if (returnedFieldsContains("FormSequenceId")) {
                dto.setFormSequenceId(state.getFormSequenceId());
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
