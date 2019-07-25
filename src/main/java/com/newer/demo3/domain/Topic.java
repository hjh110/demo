package com.newer.demo3.domain;

import java.io.Serializable;

public class Topic implements Serializable {
    private static final long serialVersionUID = -6868566359745670462L;
    private Integer SortedID;
    private String title;
    private String picture;
    private String introduce;
    private String more;


    public Topic() {
    }

    public Topic(Integer sortedID, String title, String picture, String introduce, String more) {
        SortedID = sortedID;
        this.title = title;
        this.picture = picture;
        this.introduce = introduce;
        this.more = more;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public Integer getSortedID() {
        return SortedID;
    }

    public void setSortedID(Integer sortedID) {
        SortedID = sortedID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



}
