// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.aptosformsdemo.aptos.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.wubuku.aptos.bean.*;

import java.math.*;
import java.util.*;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AptosFormsDemoMainForm {

    private String signerAddress;

    private Long offChainVersion;

    private BigInteger fr_5pqi;

    private String[] fr_duif;

    private String[] fr_6i34;

    private String fr_8xjs;

    private String fr_9c3f;

    private BigInteger fr_4ok6;

    private String fr_b3ub;

    private BigInteger fr_1z7o;

    private DateRange fr_d8rw;

    private DateRange fr_dy3l;

    private BigInteger fr_6f68;

    private TimeRange fr_47yy;

    private String[] fr_gh3o;

    private String[] fr_fbba;

    private XRenderFormDate fr_hhzp;

    private String single_text1;

    private BigInteger version;

    public String getSignerAddress() {
        return signerAddress;
    }

    public void setSignerAddress(String signerAddress) {
        this.signerAddress = signerAddress;
    }

    public Long getOffChainVersion() {
        return offChainVersion;
    }

    public void setOffChainVersion(Long offChainVersion) {
        this.offChainVersion = offChainVersion;
    }

    public BigInteger getFr_5pqi() {
        return fr_5pqi;
    }

    public void setFr_5pqi(BigInteger fr_5pqi) {
        this.fr_5pqi = fr_5pqi;
    }

    public String[] getFr_duif() {
        return fr_duif;
    }

    public void setFr_duif(String[] fr_duif) {
        this.fr_duif = fr_duif;
    }

    public String[] getFr_6i34() {
        return fr_6i34;
    }

    public void setFr_6i34(String[] fr_6i34) {
        this.fr_6i34 = fr_6i34;
    }

    public String getFr_8xjs() {
        return fr_8xjs;
    }

    public void setFr_8xjs(String fr_8xjs) {
        this.fr_8xjs = fr_8xjs;
    }

    public String getFr_9c3f() {
        return fr_9c3f;
    }

    public void setFr_9c3f(String fr_9c3f) {
        this.fr_9c3f = fr_9c3f;
    }

    public BigInteger getFr_4ok6() {
        return fr_4ok6;
    }

    public void setFr_4ok6(BigInteger fr_4ok6) {
        this.fr_4ok6 = fr_4ok6;
    }

    public String getFr_b3ub() {
        return fr_b3ub;
    }

    public void setFr_b3ub(String fr_b3ub) {
        this.fr_b3ub = fr_b3ub;
    }

    public BigInteger getFr_1z7o() {
        return fr_1z7o;
    }

    public void setFr_1z7o(BigInteger fr_1z7o) {
        this.fr_1z7o = fr_1z7o;
    }

    public DateRange getFr_d8rw() {
        return fr_d8rw;
    }

    public void setFr_d8rw(DateRange fr_d8rw) {
        this.fr_d8rw = fr_d8rw;
    }

    public DateRange getFr_dy3l() {
        return fr_dy3l;
    }

    public void setFr_dy3l(DateRange fr_dy3l) {
        this.fr_dy3l = fr_dy3l;
    }

    public BigInteger getFr_6f68() {
        return fr_6f68;
    }

    public void setFr_6f68(BigInteger fr_6f68) {
        this.fr_6f68 = fr_6f68;
    }

    public TimeRange getFr_47yy() {
        return fr_47yy;
    }

    public void setFr_47yy(TimeRange fr_47yy) {
        this.fr_47yy = fr_47yy;
    }

    public String[] getFr_gh3o() {
        return fr_gh3o;
    }

    public void setFr_gh3o(String[] fr_gh3o) {
        this.fr_gh3o = fr_gh3o;
    }

    public String[] getFr_fbba() {
        return fr_fbba;
    }

    public void setFr_fbba(String[] fr_fbba) {
        this.fr_fbba = fr_fbba;
    }

    public XRenderFormDate getFr_hhzp() {
        return fr_hhzp;
    }

    public void setFr_hhzp(XRenderFormDate fr_hhzp) {
        this.fr_hhzp = fr_hhzp;
    }

    public String getSingle_text1() {
        return single_text1;
    }

    public void setSingle_text1(String single_text1) {
        this.single_text1 = single_text1;
    }

    public BigInteger getVersion() {
        return version;
    }

    public void setVersion(BigInteger version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "AptosFormsDemoMainForm{" +
                ", signerAddress=" + '\'' + signerAddress + '\'' +
                ", offChainVersion=" + offChainVersion +
                ", fr_5pqi=" + fr_5pqi +
                ", fr_duif=" + Arrays.toString(fr_duif) +
                ", fr_6i34=" + Arrays.toString(fr_6i34) +
                ", fr_8xjs=" + '\'' + fr_8xjs + '\'' +
                ", fr_9c3f=" + '\'' + fr_9c3f + '\'' +
                ", fr_4ok6=" + fr_4ok6 +
                ", fr_b3ub=" + '\'' + fr_b3ub + '\'' +
                ", fr_1z7o=" + fr_1z7o +
                ", fr_d8rw=" + fr_d8rw +
                ", fr_dy3l=" + fr_dy3l +
                ", fr_6f68=" + fr_6f68 +
                ", fr_47yy=" + fr_47yy +
                ", fr_gh3o=" + Arrays.toString(fr_gh3o) +
                ", fr_fbba=" + Arrays.toString(fr_fbba) +
                ", fr_hhzp=" + fr_hhzp +
                ", single_text1=" + '\'' + single_text1 + '\'' +
                ", version=" + version +
                '}';
    }

    public static class Tables {
        @JsonProperty("aptos_forms_demo_main_form_table")
        private Table aptosFormsDemoMainFormTable;

        public Table getAptosFormsDemoMainFormTable() {
            return aptosFormsDemoMainFormTable;
        }

        public void setAptosFormsDemoMainFormTable(Table aptosFormsDemoMainFormTable) {
            this.aptosFormsDemoMainFormTable = aptosFormsDemoMainFormTable;
        }

        @Override
        public String toString() {
            return "AptosFormsDemoMainForm.Tables{" +
                    "aptosFormsDemoMainFormTable=" + aptosFormsDemoMainFormTable +
                    '}';
        }
    }

}
