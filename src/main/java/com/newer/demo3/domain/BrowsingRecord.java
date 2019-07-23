package com.newer.demo3.domain;

import java.io.Serializable;

public class BrowsingRecord implements Serializable {
    private static final long serialVersionUID = -4243547084493413121L;
    private Integer attentionid;
    private Integer Myid;
    private Integer adverseid;
    private Integer count;

    public BrowsingRecord() {
    }

    public BrowsingRecord(Integer attentionid, Integer myid, Integer adverseid, Integer count) {
        this.attentionid = attentionid;
        Myid = myid;
        this.adverseid = adverseid;
        this.count = count;
    }

    public Integer getAttentionid() {
        return attentionid;
    }

    public void setAttentionid(Integer attentionid) {
        this.attentionid = attentionid;
    }

    public Integer getMyid() {
        return Myid;
    }

    public void setMyid(Integer myid) {
        Myid = myid;
    }

    public Integer getAdverseid() {
        return adverseid;
    }

    public void setAdverseid(Integer adverseid) {
        this.adverseid = adverseid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
