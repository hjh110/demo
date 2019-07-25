package com.newer.demo3.domain;

import java.io.Serializable;
import java.util.Date;

public class Answer implements Serializable {
    private static final long serialVersionUID = 1753992799253720849L;
    private Integer answerid;
    private Date uploadTime;
    private Integer uploadid;
    private Integer Userid;
    private Integer Llikenum;
    private String text;
    private Integer browse;
    private String draft;
    private String audit;
    private Integer anonymity;
    private Integer comment;


    public Answer() {
    }

    public Answer(Integer answerid, Date uploadTime, Integer uploadid, Integer userid, Integer llikenum, String text, Integer browse, String draft, String audit, Integer anonymity, Integer comment) {
        this.answerid = answerid;
        this.uploadTime = uploadTime;
        this.uploadid = uploadid;
        Userid = userid;
        Llikenum = llikenum;
        this.text = text;
        this.browse = browse;
        this.draft = draft;
        this.audit = audit;
        this.anonymity = anonymity;
        this.comment = comment;
    }


    public Integer getAnswerid() {
        return answerid;
    }

    public void setAnswerid(Integer answerid) {
        this.answerid = answerid;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Integer getUploadid() {
        return uploadid;
    }

    public void setUploadid(Integer uploadid) {
        this.uploadid = uploadid;
    }

    public Integer getUserid() {
        return Userid;
    }

    public void setUserid(Integer userid) {
        Userid = userid;
    }

    public Integer getLlikenum() {
        return Llikenum;
    }

    public void setLlikenum(Integer llikenum) {
        Llikenum = llikenum;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getBrowse() {
        return browse;
    }

    public void setBrowse(Integer browse) {
        this.browse = browse;
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

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }
}
