package com.newer.demo3.domain;

import java.io.Serializable;

public class Reporting implements Serializable {
    private static final long serialVersionUID = -8755422215761809732L;
    private Integer rId;
    private Integer rUsersid;
    private Integer rAdverseid;
    private Integer rType;
    private String rWriteback;
    private String rUploadUserId;
    private String rDesc;
    private String rAdverseWriteback;

    public Reporting() {
    }

    public Reporting(Integer rId, Integer rUsersid, Integer rAdverseid, Integer rType, String rWriteback, String rUploadUserId, String rDesc, String rAdverseWriteback) {
        this.rId = rId;
        this.rUsersid = rUsersid;
        this.rAdverseid = rAdverseid;
        this.rType = rType;
        this.rWriteback = rWriteback;
        this.rUploadUserId = rUploadUserId;
        this.rDesc = rDesc;
        this.rAdverseWriteback = rAdverseWriteback;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getrUsersid() {
        return rUsersid;
    }

    public void setrUsersid(Integer rUsersid) {
        this.rUsersid = rUsersid;
    }

    public Integer getrAdverseid() {
        return rAdverseid;
    }

    public void setrAdverseid(Integer rAdverseid) {
        this.rAdverseid = rAdverseid;
    }

    public Integer getrType() {
        return rType;
    }

    public void setrType(Integer rType) {
        this.rType = rType;
    }

    public String getrWriteback() {
        return rWriteback;
    }

    public void setrWriteback(String rWriteback) {
        this.rWriteback = rWriteback;
    }

    public String getrUploadUserId() {
        return rUploadUserId;
    }

    public void setrUploadUserId(String rUploadUserId) {
        this.rUploadUserId = rUploadUserId;
    }

    public String getrDesc() {
        return rDesc;
    }

    public void setrDesc(String rDesc) {
        this.rDesc = rDesc;
    }

    public String getrAdverseWriteback() {
        return rAdverseWriteback;
    }

    public void setrAdverseWriteback(String rAdverseWriteback) {
        this.rAdverseWriteback = rAdverseWriteback;
    }
}
