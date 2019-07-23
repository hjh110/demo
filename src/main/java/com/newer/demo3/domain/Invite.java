package com.newer.demo3.domain;

import java.io.Serializable;

public class Invite implements Serializable {
    private static final long serialVersionUID = -6503539117528975218L;
    private Integer inviteid;
    private Integer uploadid;
    private Integer Userid;

    public Invite() {
    }

    public Invite(Integer inviteid, Integer uploadid, Integer Userid) {
        this.inviteid = inviteid;
        this.uploadid = uploadid;
        this.Userid = Userid;
    }

    public Integer getInviteid() {
        return inviteid;
    }

    public void setInviteid(Integer inviteid) {
        this.inviteid = inviteid;
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

    public void setUserid(Integer Userid) {
        this.Userid = Userid;
    }
}
