package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

//基金公告信息表
public class SecuAnnouncementInfoD {
    //biz_date	跑批日期	int
    @JsonProperty("biz_date")
    private String biz_date;
    //SecuCode	证券代码	string
    @JsonProperty("SecuCode")
    private String secuCode;
    //ChiName	中文名称	string
    @JsonProperty("ChiName")
    private String chiName;
    //EngName	英文名称	string
    @JsonProperty("EngName")
    private String engName;
    //SecuAbbr	证券简称	string
    @JsonProperty("SecuAbbr")
    private String secuAbbr;
    //AnnouncementID	基金公告原文ID	decimal（19，0）
    @JsonProperty("AnnouncementID")
    private BigDecimal announcementID;
    //InterBulletinID	基金临时公告ID	decimal（19，0）
    @JsonProperty("InterBulletinID")
    private BigDecimal interBulletinID;
    //CompanyCode	公司代码	decimal（10，0）
    @JsonProperty("CompanyCode")
    private BigDecimal companyCode;
    //Category	内容类别	decimal（10，0）
    @JsonProperty("Category")
    private BigDecimal category;
    //InfoTitle	信息标题	string
    @JsonProperty("InfoTitle")
    private String infoTitle;
    //LanguageType	语言类别	decimal（10，0）
    @JsonProperty("LanguageType")
    private BigDecimal languageType;
    //FileType	文件格式	decimal（10，0）
    @JsonProperty("FileType")
    private String fileType;
    //FileName	文件名	string
    @JsonProperty("FileName")
    private String fileName;
    //InfoType	信息类别	decimal（10，0）
    @JsonProperty("InfoType")
    private BigDecimal infoType;
    //SecuMarket	证券市场	decimal（10，0）
    @JsonProperty("SecuMarket")
    private BigDecimal secuMarket;
    //SecuCategory	证券类别	decimal（10，0）
    @JsonProperty("SecuCategory")
    private BigDecimal secuCategory;
    //ListedSector	上市板块	decimal（10，0）
    @JsonProperty("ListedSector")
    private BigDecimal listedSector;
    //ListedState	上市状态	decimal（10，0）
    @JsonProperty("ListedState")
    private BigDecimal listedState;
    //ListedDate	上市日期	int
    @JsonProperty("ListedDate")
    private String listedDate;
    //FilePath	文件路径	string
    @JsonProperty("FilePath")
    private String filePath;
    //InsertTime,
    @JsonProperty("InsertTime")
    private String insertTime;
    //XGRQ,
    @JsonProperty("XGRQ")
    private String xgrq;
    //ID,
    @JsonProperty("ID")
    private BigDecimal id;
    @JsonIgnore
    public String getBiz_date() {
        return biz_date;
    }
    @JsonIgnore
    public void setBiz_date(String biz_date) {
        this.biz_date = biz_date;
    }
    @JsonIgnore
    public String getSecuCode() {
        return secuCode;
    }
    @JsonIgnore
    public void setSecuCode(String secuCode) {
        this.secuCode = secuCode;
    }
    @JsonIgnore
    public String getChiName() {
        return chiName;
    }
    @JsonIgnore
    public void setChiName(String chiName) {
        this.chiName = chiName;
    }
    @JsonIgnore
    public String getEngName() {
        return engName;
    }
    @JsonIgnore
    public void setEngName(String engName) {
        this.engName = engName;
    }
    @JsonIgnore
    public String getSecuAbbr() {
        return secuAbbr;
    }
    @JsonIgnore
    public void setSecuAbbr(String secuAbbr) {
        this.secuAbbr = secuAbbr;
    }
    @JsonIgnore
    public BigDecimal getAnnouncementID() {
        return announcementID;
    }
    @JsonIgnore
    public void setAnnouncementID(BigDecimal announcementID) {
        this.announcementID = announcementID;
    }
    @JsonIgnore
    public BigDecimal getInterBulletinID() {
        return interBulletinID;
    }
    @JsonIgnore
    public void setInterBulletinID(BigDecimal interBulletinID) {
        this.interBulletinID = interBulletinID;
    }
    @JsonIgnore
    public BigDecimal getCompanyCode() {
        return companyCode;
    }
    @JsonIgnore
    public void setCompanyCode(BigDecimal companyCode) {
        this.companyCode = companyCode;
    }
    @JsonIgnore
    public BigDecimal getCategory() {
        return category;
    }
    @JsonIgnore
    public void setCategory(BigDecimal category) {
        this.category = category;
    }
    @JsonIgnore
    public String getInfoTitle() {
        return infoTitle;
    }
    @JsonIgnore
    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
    }
    @JsonIgnore
    public BigDecimal getLanguageType() {
        return languageType;
    }
    @JsonIgnore
    public void setLanguageType(BigDecimal languageType) {
        this.languageType = languageType;
    }
    @JsonIgnore
    public String getFileType() {
        return fileType;
    }
    @JsonIgnore
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
    @JsonIgnore
    public String getFileName() {
        return fileName;
    }
    @JsonIgnore
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    @JsonIgnore
    public BigDecimal getInfoType() {
        return infoType;
    }
    @JsonIgnore
    public void setInfoType(BigDecimal infoType) {
        this.infoType = infoType;
    }
    @JsonIgnore
    public BigDecimal getSecuMarket() {
        return secuMarket;
    }
    @JsonIgnore
    public void setSecuMarket(BigDecimal secuMarket) {
        this.secuMarket = secuMarket;
    }
    @JsonIgnore
    public BigDecimal getSecuCategory() {
        return secuCategory;
    }
    @JsonIgnore
    public void setSecuCategory(BigDecimal secuCategory) {
        this.secuCategory = secuCategory;
    }
    @JsonIgnore
    public BigDecimal getListedSector() {
        return listedSector;
    }
    @JsonIgnore
    public void setListedSector(BigDecimal listedSector) {
        this.listedSector = listedSector;
    }
    @JsonIgnore
    public BigDecimal getListedState() {
        return listedState;
    }
    @JsonIgnore
    public void setListedState(BigDecimal listedState) {
        this.listedState = listedState;
    }
    @JsonIgnore
    public String getListedDate() {
        return listedDate;
    }
    @JsonIgnore
    public void setListedDate(String listedDate) {
        this.listedDate = listedDate;
    }
    @JsonIgnore
    public String getFilePath() {
        return filePath;
    }
    @JsonIgnore
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    @JsonIgnore
    public String getInsertTime() {
        return insertTime;
    }
    @JsonIgnore
    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }
    @JsonIgnore
    public String getXgrq() {
        return xgrq;
    }
    @JsonIgnore
    public void setXgrq(String xgrq) {
        this.xgrq = xgrq;
    }
    @JsonIgnore
    public BigDecimal getId() {
        return id;
    }
    @JsonIgnore
    public void setId(BigDecimal id) {
        this.id = id;
    }
}
