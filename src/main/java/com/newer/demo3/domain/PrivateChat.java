package com.newer.demo3.domain;

import java.io.Serializable;
import java.util.Date;

public class PrivateChat implements Serializable {
    private static final long serialVersionUID = -8783755139554301101L;
    private Integer privateid;
    private Integer userid;
    private Integer uploadid;
    private String text;
    private Date chattime;
    private Integer Privateid2;


    public PrivateChat() {
    }

    public PrivateChat(Integer privateid, Integer userid, Integer uploadid, String text, Integer privateid2) {
        this.privateid = privateid;
        this.userid = userid;
        this.uploadid = uploadid;
        this.text = text;
        Privateid2 = privateid2;
    }

    public Integer getPrivateid() {
        return privateid;
    }

    public void setPrivateid(Integer privateid) {
        this.privateid = privateid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getUploadid() {
        return uploadid;
    }

    public void setUploadid(Integer uploadid) {
        this.uploadid = uploadid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getPrivateid2() {
        return Privateid2;
    }

    public void setPrivateid2(Integer privateid2) {
        Privateid2 = privateid2;
    }
}
