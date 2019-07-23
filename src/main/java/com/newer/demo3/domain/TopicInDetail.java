package com.newer.demo3.domain;

import java.io.Serializable;

public class TopicInDetail implements Serializable {
    private static final long serialVersionUID = 1677289883318051629L;
    private Integer ttidID;
    private String title;
    private String picture;
    private String introduce;
    private String more;

    public TopicInDetail() {
    }

    public TopicInDetail(Integer ttidID, String title, String picture, String introduce, String more) {
        this.ttidID = ttidID;
        this.title = title;
        this.picture = picture;
        this.introduce = introduce;
        this.more = more;
    }

    public Integer getTtidID() {
        return ttidID;
    }

    public void setTtidID(Integer ttidID) {
        this.ttidID = ttidID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }
}
