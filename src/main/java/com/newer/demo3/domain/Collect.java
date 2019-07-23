package com.newer.demo3.domain;

import java.io.Serializable;

public class Collect implements Serializable {
    private static final long serialVersionUID = -1487340764493910499L;
    private Integer collectid;
    private String collectname;
    private Integer userid;

    public Collect() {
    }

    public Collect(Integer collectid, String collectname, Integer userid) {
        this.collectid = collectid;
        this.collectname = collectname;
        this.userid = userid;
    }

    public Integer getCollectid() {
        return collectid;
    }

    public void setCollectid(Integer collectid) {
        this.collectid = collectid;
    }

    public String getCollectname() {
        return collectname;
    }

    public void setCollectname(String collectname) {
        this.collectname = collectname;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
