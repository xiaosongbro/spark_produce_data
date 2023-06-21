package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class ETFIndexRankingBean {
    @JsonProperty("indxCd")
    public String indxCd;
    @JsonProperty("indxCname")
    public String indxCname;
    @JsonProperty("indxFlag")
    public String indxFlag;
    @JsonProperty("hotIndexFlag")
    public String hotIndexFlag;
    @JsonProperty("relaEtfVol")
    public int relaEtfVol;
    @JsonProperty("thisYearAoin")
    public BigDecimal thisYearAoin;
    @JsonProperty("l3mAoin")
    public BigDecimal l3mAoin;
    @JsonProperty("l1yAoin")
    public BigDecimal l1yAoin;
    @JsonProperty("l3yAoin")
    public BigDecimal l3yAoin;
    @JsonProperty("peTtm")
    public BigDecimal peTtm;
    @JsonProperty("peTtmPercentile")
    public BigDecimal peTtmPercentile;
    @JsonProperty("pbLf")
    public BigDecimal pbLf;
    @JsonProperty("pbLfPercentile")
    public BigDecimal pbLfPercentile;
    @JsonProperty("roe")
    public BigDecimal roe;
    @JsonProperty("divd")
    public BigDecimal divd;
    @JsonProperty("peg")
    public BigDecimal peg;
    @JsonProperty("crntValueQuantile")
    public BigDecimal crntValueQuantile;
    @JsonProperty("crntValueConclusion")
    public String crntValueConclusion;
    @JsonProperty("closePricePont")
    public BigDecimal closePricePont;
    @JsonProperty("rn")
    public int rn;

    @JsonIgnore
    public int getRn() {
        return rn;
    }
    @JsonIgnore
    public void setRn(int rn) {
        this.rn = rn;
    }
    @JsonIgnore
    public String getIndxCd() {
        return indxCd;
    }
    @JsonIgnore
    public void setIndxCd(String indxCd) {
        this.indxCd = indxCd;
    }
    @JsonIgnore
    public String getIndxCname() {
        return indxCname;
    }
    @JsonIgnore
    public void setIndxCname(String indxCname) {
        this.indxCname = indxCname;
    }
    @JsonIgnore
    public String getIndxFlag() {
        return indxFlag;
    }
    @JsonIgnore
    public void setIndxFlag(String indxFlag) {
        this.indxFlag = indxFlag;
    }
    @JsonIgnore
    public String getHotIndexFlag() {
        return hotIndexFlag;
    }
    @JsonIgnore
    public void setHotIndexFlag(String hotIndexFlag) {
        this.hotIndexFlag = hotIndexFlag;
    }
    @JsonIgnore
    public int getRelaEtfVol() {
        return relaEtfVol;
    }
    @JsonIgnore
    public void setRelaEtfVol(int relaEtfVol) {
        this.relaEtfVol = relaEtfVol;
    }
    @JsonIgnore
    public BigDecimal getThisYearAoin() {
        return thisYearAoin;
    }
    @JsonIgnore
    public void setThisYearAoin(BigDecimal thisYearAoin) {
        this.thisYearAoin = thisYearAoin;
    }
    @JsonIgnore
    public BigDecimal getL3mAoin() {
        return l3mAoin;
    }
    @JsonIgnore
    public void setL3mAoin(BigDecimal l3mAoin) {
        this.l3mAoin = l3mAoin;
    }
    @JsonIgnore
    public BigDecimal getL1yAoin() {
        return l1yAoin;
    }
    @JsonIgnore
    public void setL1yAoin(BigDecimal l1yAoin) {
        this.l1yAoin = l1yAoin;
    }
    @JsonIgnore
    public BigDecimal getL3yAoin() {
        return l3yAoin;
    }
    @JsonIgnore
    public void setL3yAoin(BigDecimal l3yAoin) {
        this.l3yAoin = l3yAoin;
    }
    @JsonIgnore
    public BigDecimal getPeTtm() {
        return peTtm;
    }
    @JsonIgnore
    public void setPeTtm(BigDecimal peTtm) {
        this.peTtm = peTtm;
    }
    @JsonIgnore
    public BigDecimal getPeTtmPercentile() {
        return peTtmPercentile;
    }
    @JsonIgnore
    public void setPeTtmPercentile(BigDecimal peTtmPercentile) {
        this.peTtmPercentile = peTtmPercentile;
    }
    @JsonIgnore
    public BigDecimal getPbLf() {
        return pbLf;
    }
    @JsonIgnore
    public void setPbLf(BigDecimal pbLf) {
        this.pbLf = pbLf;
    }
    @JsonIgnore
    public BigDecimal getPbLfPercentile() {
        return pbLfPercentile;
    }
    @JsonIgnore
    public void setPbLfPercentile(BigDecimal pbLfPercentile) {
        this.pbLfPercentile = pbLfPercentile;
    }
    @JsonIgnore
    public BigDecimal getRoe() {
        return roe;
    }
    @JsonIgnore
    public void setRoe(BigDecimal roe) {
        this.roe = roe;
    }
    @JsonIgnore
    public BigDecimal getDivd() {
        return divd;
    }
    @JsonIgnore
    public void setDivd(BigDecimal divd) {
        this.divd = divd;
    }
    @JsonIgnore
    public BigDecimal getPeg() {
        return peg;
    }
    @JsonIgnore
    public void setPeg(BigDecimal peg) {
        this.peg = peg;
    }
    @JsonIgnore
    public BigDecimal getCrntValueQuantile() {
        return crntValueQuantile;
    }
    @JsonIgnore
    public void setCrntValueQuantile(BigDecimal crntValueQuantile) {
        this.crntValueQuantile = crntValueQuantile;
    }
    @JsonIgnore
    public String getCrntValueConclusion() {
        return crntValueConclusion;
    }
    @JsonIgnore
    public void setCrntValueConclusion(String crntValueConclusion) {
        this.crntValueConclusion = crntValueConclusion;
    }
    @JsonIgnore
    public BigDecimal getClosePricePont() {
        return closePricePont;
    }
    @JsonIgnore
    public void setClosePricePont(BigDecimal closePricePont) {
        this.closePricePont = closePricePont;
    }
}
