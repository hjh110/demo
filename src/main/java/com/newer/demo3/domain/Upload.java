package com.newer.demo3.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Upload implements Serializable {
    private static final long serialVersionUID = 7951459882390493436L;
    private Integer uploadid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date uploadTime;
    private String text;
    private Integer userid;
    private  String title;
    private Integer llikenum;
    private Integer invite;
    private Integer browse;
    private String draft;
    private String audit;
    private Integer sortedID;
    private Integer count;//问题数

    public Upload(Integer uploadid, Date uploadTime, String text, Integer userid, String title, Integer llikenum, Integer invite, Integer browse, String draft, String audit, Integer sortedID, Integer count) {
        this.uploadid = uploadid;
        this.uploadTime = uploadTime;
        this.text = text;
        this.userid = userid;
        this.title = title;
        this.llikenum = llikenum;
        this.invite = invite;
        this.browse = browse;
        this.draft = draft;
        this.audit = audit;
        this.sortedID = sortedID;
        this.count = count;
    }

    public Upload() {
    }

    public Upload(Integer uploadid, Date uploadTime, String text, Integer userid, String title, Integer llikenum, Integer invite, Integer browse, String draft, String audit, Integer sortedID) {
        this.uploadid = uploadid;
        this.uploadTime = uploadTime;
        this.text = text;
        this.userid = userid;
        this.title = title;
        this.llikenum = llikenum;
        this.invite = invite;
        this.browse = browse;
        this.draft = draft;
        this.audit = audit;
        this.sortedID = sortedID;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Upload{" +
                "uploadid=" + uploadid +
                ", uploadTime=" + uploadTime +
                ", text='" + text + '\'' +
                ", userid=" + userid +
                ", title='" + title + '\'' +
                ", llikenum=" + llikenum +
                ", invite=" + invite +
                ", browse=" + browse +
                ", draft='" + draft + '\'' +
                ", audit='" + audit + '\'' +
                ", sortedID=" + sortedID +
                '}';
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
