// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.domain.mainform;

import java.util.*;
import java.math.*;
import java.math.BigInteger;
import java.util.Date;
import org.test.aptosformsdemo.domain.*;
import org.test.aptosformsdemo.specialization.*;


public class MainFormStateDto {

    private String accountAddress;

    public String getAccountAddress()
    {
        return this.accountAddress;
    }

    public void setAccountAddress(String accountAddress)
    {
        this.accountAddress = accountAddress;
    }

    private BigInteger fr_5pqi;

    public BigInteger getFr_5pqi()
    {
        return this.fr_5pqi;
    }

    public void setFr_5pqi(BigInteger fr_5pqi)
    {
        this.fr_5pqi = fr_5pqi;
    }

    private String fr_8xjs;

    public String getFr_8xjs()
    {
        return this.fr_8xjs;
    }

    public void setFr_8xjs(String fr_8xjs)
    {
        this.fr_8xjs = fr_8xjs;
    }

    private String fr_9c3f;

    public String getFr_9c3f()
    {
        return this.fr_9c3f;
    }

    public void setFr_9c3f(String fr_9c3f)
    {
        this.fr_9c3f = fr_9c3f;
    }

    private BigInteger fr_4ok6;

    public BigInteger getFr_4ok6()
    {
        return this.fr_4ok6;
    }

    public void setFr_4ok6(BigInteger fr_4ok6)
    {
        this.fr_4ok6 = fr_4ok6;
    }

    private String fr_b3ub;

    public String getFr_b3ub()
    {
        return this.fr_b3ub;
    }

    public void setFr_b3ub(String fr_b3ub)
    {
        this.fr_b3ub = fr_b3ub;
    }

    private BigInteger fr_1z7o;

    public BigInteger getFr_1z7o()
    {
        return this.fr_1z7o;
    }

    public void setFr_1z7o(BigInteger fr_1z7o)
    {
        this.fr_1z7o = fr_1z7o;
    }

    private BigInteger fr_6f68;

    public BigInteger getFr_6f68()
    {
        return this.fr_6f68;
    }

    public void setFr_6f68(BigInteger fr_6f68)
    {
        this.fr_6f68 = fr_6f68;
    }

    private String fr_hhzp;

    public String getFr_hhzp()
    {
        return this.fr_hhzp;
    }

    public void setFr_hhzp(String fr_hhzp)
    {
        this.fr_hhzp = fr_hhzp;
    }

    private String single_text1;

    public String getSingle_text1()
    {
        return this.single_text1;
    }

    public void setSingle_text1(String single_text1)
    {
        this.single_text1 = single_text1;
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

    private String[] fr_duif;

    public String[] getFr_duif() {
        return this.fr_duif;
    }

    public void setFr_duif(String[] fr_duif) {
        this.fr_duif = fr_duif;
    }

    private String[] fr_6i34;

    public String[] getFr_6i34() {
        return this.fr_6i34;
    }

    public void setFr_6i34(String[] fr_6i34) {
        this.fr_6i34 = fr_6i34;
    }

    private String[] fr_gh3o;

    public String[] getFr_gh3o() {
        return this.fr_gh3o;
    }

    public void setFr_gh3o(String[] fr_gh3o) {
        this.fr_gh3o = fr_gh3o;
    }

    private String[] fr_fbba;

    public String[] getFr_fbba() {
        return this.fr_fbba;
    }

    public void setFr_fbba(String[] fr_fbba) {
        this.fr_fbba = fr_fbba;
    }


    public static class DtoConverter extends AbstractStateDtoConverter
    {
        public static Collection<String> collectionFieldNames = Arrays.asList(new String[]{});

        @Override
        protected boolean isCollectionField(String fieldName) {
            return CollectionUtils.collectionContainsIgnoringCase(collectionFieldNames, fieldName);
        }

        public MainFormStateDto[] toMainFormStateDtoArray(Iterable<MainFormState> states) {
            return toMainFormStateDtoList(states).toArray(new MainFormStateDto[0]);
        }

        public List<MainFormStateDto> toMainFormStateDtoList(Iterable<MainFormState> states) {
            ArrayList<MainFormStateDto> stateDtos = new ArrayList();
            for (MainFormState s : states) {
                MainFormStateDto dto = toMainFormStateDto(s);
                stateDtos.add(dto);
            }
            return stateDtos;
        }

        public MainFormStateDto toMainFormStateDto(MainFormState state)
        {
            if(state == null) {
                return null;
            }
            MainFormStateDto dto = new MainFormStateDto();
            if (returnedFieldsContains("AccountAddress")) {
                dto.setAccountAddress(state.getAccountAddress());
            }
            if (returnedFieldsContains("Fr_5pqi")) {
                dto.setFr_5pqi(state.getFr_5pqi());
            }
            if (returnedFieldsContains("Fr_8xjs")) {
                dto.setFr_8xjs(state.getFr_8xjs());
            }
            if (returnedFieldsContains("Fr_9c3f")) {
                dto.setFr_9c3f(state.getFr_9c3f());
            }
            if (returnedFieldsContains("Fr_4ok6")) {
                dto.setFr_4ok6(state.getFr_4ok6());
            }
            if (returnedFieldsContains("Fr_b3ub")) {
                dto.setFr_b3ub(state.getFr_b3ub());
            }
            if (returnedFieldsContains("Fr_1z7o")) {
                dto.setFr_1z7o(state.getFr_1z7o());
            }
            if (returnedFieldsContains("Fr_6f68")) {
                dto.setFr_6f68(state.getFr_6f68());
            }
            if (returnedFieldsContains("Fr_hhzp")) {
                dto.setFr_hhzp(state.getFr_hhzp());
            }
            if (returnedFieldsContains("Single_text1")) {
                dto.setSingle_text1(state.getSingle_text1());
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
            if (returnedFieldsContains("Fr_duif")) {
                ArrayList<String> arrayList = new ArrayList();
                if (state.getFr_duif() != null) {
                    for (String s : state.getFr_duif()) {
                        arrayList.add(s);
                    }
                }
                dto.setFr_duif(arrayList.toArray(new String[0]));
            }
            if (returnedFieldsContains("Fr_6i34")) {
                ArrayList<String> arrayList = new ArrayList();
                if (state.getFr_6i34() != null) {
                    for (String s : state.getFr_6i34()) {
                        arrayList.add(s);
                    }
                }
                dto.setFr_6i34(arrayList.toArray(new String[0]));
            }
            if (returnedFieldsContains("Fr_gh3o")) {
                ArrayList<String> arrayList = new ArrayList();
                if (state.getFr_gh3o() != null) {
                    for (String s : state.getFr_gh3o()) {
                        arrayList.add(s);
                    }
                }
                dto.setFr_gh3o(arrayList.toArray(new String[0]));
            }
            if (returnedFieldsContains("Fr_fbba")) {
                ArrayList<String> arrayList = new ArrayList();
                if (state.getFr_fbba() != null) {
                    for (String s : state.getFr_fbba()) {
                        arrayList.add(s);
                    }
                }
                dto.setFr_fbba(arrayList.toArray(new String[0]));
            }
            return dto;
        }

    }
}

