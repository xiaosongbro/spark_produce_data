package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

public class ETFIndexDetailsPageList {
    @JsonProperty("indxCd")
    private String indxCd;
    @JsonProperty("indxCname")
    private String indxCname;
    @JsonProperty("bizDt")
    private String bizDt;
    @JsonProperty("indxFlag")
    private String indxFlag;
    @JsonProperty("hotIndexFlag")
    private int hotIndexFlag;
    @JsonProperty("relaEtfVol")
    private int relaEtfVol;
    @JsonProperty("indxThisYearAoin")
    private BigDecimal indxThisYearAoin;
    @JsonProperty("indxL3mAoin")
    private BigDecimal indxL3mAoin;
    @JsonProperty("indxL1yAoin")
    private BigDecimal indxL1yAoin;
    @JsonProperty("indxL3yAoin")
    private BigDecimal indxL3yAoin;
    @JsonProperty("peTtm")
    private BigDecimal peTtm;
    @JsonProperty("peTtmPercentile")
    private BigDecimal peTtmPercentile;
    @JsonProperty("pbLf")
    private BigDecimal pbLf;
    @JsonProperty("pbLfPercentile")
    private BigDecimal pbLfPercentile;
    @JsonProperty("roe")
    private BigDecimal roe;
    @JsonProperty("divd")
    private BigDecimal divd;
    @JsonProperty("peg")
    private BigDecimal peg;
    @JsonProperty("crntValueQuantile")
    private BigDecimal crntValueQuantile;
    @JsonProperty("crntValueConclusion")
    private String crntValueConclusion;
    @JsonProperty("closePricePont")
    private BigDecimal closePricePont;
    @JsonProperty("indxIntr")
    private String indxIntr;


    @JsonProperty("dataList")
    private List<ETFIndexDetailsPage> dataList;

    public String getIndxCd() {
        return indxCd;
    }

    public void setIndxCd(String indxCd) {
        this.indxCd = indxCd;
    }

    public String getIndxCname() {
        return indxCname;
    }

    public void setIndxCname(String indxCname) {
        this.indxCname = indxCname;
    }

    public String getBizDt() {
        return bizDt;
    }

    public void setBizDt(String bizDt) {
        this.bizDt = bizDt;
    }

    public String getIndxFlag() {
        return indxFlag;
    }

    public void setIndxFlag(String indxFlag) {
        this.indxFlag = indxFlag;
    }

    public int getHotIndexFlag() {
        return hotIndexFlag;
    }

    public void setHotIndexFlag(int hotIndexFlag) {
        this.hotIndexFlag = hotIndexFlag;
    }

    public int getRelaEtfVol() {
        return relaEtfVol;
    }

    public void setRelaEtfVol(int relaEtfVol) {
        this.relaEtfVol = relaEtfVol;
    }

    public BigDecimal getIndxThisYearAoin() {
        return indxThisYearAoin;
    }

    public void setIndxThisYearAoin(BigDecimal indxThisYearAoin) {
        this.indxThisYearAoin = indxThisYearAoin;
    }

    public BigDecimal getIndxL3mAoin() {
        return indxL3mAoin;
    }

    public void setIndxL3mAoin(BigDecimal indxL3mAoin) {
        this.indxL3mAoin = indxL3mAoin;
    }

    public BigDecimal getIndxL1yAoin() {
        return indxL1yAoin;
    }

    public void setIndxL1yAoin(BigDecimal indxL1yAoin) {
        this.indxL1yAoin = indxL1yAoin;
    }

    public BigDecimal getIndxL3yAoin() {
        return indxL3yAoin;
    }

    public void setIndxL3yAoin(BigDecimal indxL3yAoin) {
        this.indxL3yAoin = indxL3yAoin;
    }

    public BigDecimal getPeTtm() {
        return peTtm;
    }

    public void setPeTtm(BigDecimal peTtm) {
        this.peTtm = peTtm;
    }

    public BigDecimal getPeTtmPercentile() {
        return peTtmPercentile;
    }

    public void setPeTtmPercentile(BigDecimal peTtmPercentile) {
        this.peTtmPercentile = peTtmPercentile;
    }

    public BigDecimal getPbLf() {
        return pbLf;
    }

    public void setPbLf(BigDecimal pbLf) {
        this.pbLf = pbLf;
    }

    public BigDecimal getPbLfPercentile() {
        return pbLfPercentile;
    }

    public void setPbLfPercentile(BigDecimal pbLfPercentile) {
        this.pbLfPercentile = pbLfPercentile;
    }

    public BigDecimal getRoe() {
        return roe;
    }

    public void setRoe(BigDecimal roe) {
        this.roe = roe;
    }

    public BigDecimal getDivd() {
        return divd;
    }

    public void setDivd(BigDecimal divd) {
        this.divd = divd;
    }

    public BigDecimal getPeg() {
        return peg;
    }

    public void setPeg(BigDecimal peg) {
        this.peg = peg;
    }

    public BigDecimal getCrntValueQuantile() {
        return crntValueQuantile;
    }

    public void setCrntValueQuantile(BigDecimal crntValueQuantile) {
        this.crntValueQuantile = crntValueQuantile;
    }

    public String getCrntValueConclusion() {
        return crntValueConclusion;
    }

    public void setCrntValueConclusion(String crntValueConclusion) {
        this.crntValueConclusion = crntValueConclusion;
    }

    public BigDecimal getClosePricePont() {
        return closePricePont;
    }

    public void setClosePricePont(BigDecimal closePricePont) {
        this.closePricePont = closePricePont;
    }

    public List<ETFIndexDetailsPage> getDataList() {
        return dataList;
    }

    public void setDataList(List<ETFIndexDetailsPage> dataList) {
        this.dataList = dataList;
    }

    public String getIndxIntr() {
        return indxIntr;
    }

    public void setIndxIntr(String indxIntr) {
        this.indxIntr = indxIntr;
    }

    @Override
    public String toString() {
        return "ETFIndexDetailsPageList{" +
                "indxCd='" + indxCd + '\'' +
                ", indxCname='" + indxCname + '\'' +
                ", bizDt='" + bizDt + '\'' +
                ", indxFlag='" + indxFlag + '\'' +
                ", hotIndexFlag=" + hotIndexFlag +
                ", relaEtfVol=" + relaEtfVol +
                ", indxThisYearAoin=" + indxThisYearAoin +
                ", indxL3mAoin=" + indxL3mAoin +
                ", indxL1yAoin=" + indxL1yAoin +
                ", indxL3yAoin=" + indxL3yAoin +
                ", peTtm=" + peTtm +
                ", peTtmPercentile=" + peTtmPercentile +
                ", pbLf=" + pbLf +
                ", pbLfPercentile=" + pbLfPercentile +
                ", roe=" + roe +
                ", divd=" + divd +
                ", peg=" + peg +
                ", crntValueQuantile=" + crntValueQuantile +
                ", crntValueConclusion='" + crntValueConclusion + '\'' +
                ", closePricePont=" + closePricePont +
                ", indxIntr=" + indxIntr +
                ", dataList=" + dataList +
                '}';
    }
}
