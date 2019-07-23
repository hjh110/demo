package com.newer.demo3.domain;

import java.io.Serializable;
import java.util.Date;

public class Attention implements Serializable {
    private static final long serialVersionUID = 8514728793674573228L;
    private Integer attentionid;
    private Integer type;
    private Integer adverseid;
    private Date attentiondate;

    public Attention() {
    }

    public Attention(Integer attentionid, Integer type, Integer adverseid, Date attentiondate) {
        this.attentionid = attentionid;
        this.type = type;
        this.adverseid = adverseid;
        this.attentiondate = attentiondate;
    }

    public Integer getAttentionid() {
        return attentionid;
    }

    public void setAttentionid(Integer attentionid) {
        this.attentionid = attentionid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getAdverseid() {
        return adverseid;
    }

    public void setAdverseid(Integer adverseid) {
        this.adverseid = adverseid;
    }

    public Date getAttentiondate() {
        return attentiondate;
    }

    public void setAttentiondate(Date attentiondate) {
        this.attentiondate = attentiondate;
    }
}
