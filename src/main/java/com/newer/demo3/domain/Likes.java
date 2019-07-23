package com.newer.demo3.domain;

import java.io.Serializable;

public class Likes implements Serializable {
    private static final long serialVersionUID = -5122630936853042817L;
    private Integer likeid;
    private Integer type;
    private Integer myid;
    private Integer adverse;
    private Integer likecount;

    public Likes() {
    }

    public Likes(Integer likeid, Integer type, Integer myid, Integer adverse, Integer likecount) {
        this.likeid = likeid;
        this.type = type;
        this.myid = myid;
        this.adverse = adverse;
        this.likecount = likecount;
    }

    public Integer getLikeid() {
        return likeid;
    }

    public void setLikeid(Integer likeid) {
        this.likeid = likeid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getMyid() {
        return myid;
    }

    public void setMyid(Integer myid) {
        this.myid = myid;
    }

    public Integer getAdverse() {
        return adverse;
    }

    public void setAdverse(Integer adverse) {
        this.adverse = adverse;
    }

    public Integer getLikecount() {
        return likecount;
    }

    public void setLikecount(Integer likecount) {
        this.likecount = likecount;
    }
}
