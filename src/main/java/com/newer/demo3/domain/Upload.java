package com.newer.demo3.domain;

import java.io.Serializable;
import java.util.Date;

public class Upload implements Serializable {
    private static final long serialVersionUID = 7951459882390493436L;
    private Integer uploadid;
    private Date uploadTime;
    private String text;
    private Integer userid;
    private Integer llikenum;
    private Integer invite;
    private Integer browse;
    private String draft;
    private String audit;
    private Integer sortedID;

    public Upload() {
    }

    public Upload(Integer uploadid, Date uploadTime, String text, Integer userid, Integer llikenum, Integer invite, Integer browse, String draft, String audit, Integer sortedID) {
        this.uploadid = uploadid;
        this.uploadTime = uploadTime;
        this.text = text;
        this.userid = userid;
        this.llikenum = llikenum;
        this.invite = invite;
        this.browse = browse;
        this.draft = draft;
        this.audit = audit;
        this.sortedID = sortedID;
    }

    public Integer getUploadid() {
        return uploadid;
    }

    public void setUploadid(Integer uploadid) {
        this.uploadid = uploadid;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public Integer getInvite() {
        return invite;
    }

    public void setInvite(Integer invite) {
        this.invite = invite;
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

    public Integer getSortedID() {
        return sortedID;
    }

    public void setSortedID(Integer sortedID) {
        this.sortedID = sortedID;
    }
}
