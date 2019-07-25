package com.newer.demo3.domain;

import java.io.Serializable;
import java.util.Date;

public class AnswerComments implements Serializable {
    private static final long serialVersionUID = 4610690952880385483L;
    private Integer acId;
    private Date uploadTime;
    private Integer answerid;
    private Integer userid;
    private Integer llikenum;
    private String  text;
    private String draft;
    private String audit;
    private Integer anonymity;
    private Integer acId2;
    private Integer type;


    public AnswerComments() {
    }

    public AnswerComments(Integer acId, Date uploadTime, Integer answerid, Integer userid, Integer llikenum, String text, String draft, String audit, Integer anonymity, Integer acId2, Integer type) {
        this.acId = acId;
        this.uploadTime = uploadTime;
        this.answerid = answerid;
        this.userid = userid;
        this.llikenum = llikenum;
        this.text = text;
        this.draft = draft;
        this.audit = audit;
        this.anonymity = anonymity;
        this.acId2 = acId2;
        this.type = type;
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Integer getAnswerid() {
        return answerid;
    }

    public void setAnswerid(Integer answerid) {
        this.answerid = answerid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getLlikenum() {
        return llikenum;
    }

    public void setLlikenum(Integer llikenum) {
        this.llikenum = llikenum;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDraft() {
        return draft;
    }

    public void setDraft(String draft) {
        this.draft = draft;
    }

    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    public Integer getAnonymity() {
        return anonymity;
    }

    public void setAnonymity(Integer anonymity) {
        this.anonymity = anonymity;
    }

    public Integer getAcId2() {
        return acId2;
    }

    public void setAcId2(Integer acId2) {
        this.acId2 = acId2;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
