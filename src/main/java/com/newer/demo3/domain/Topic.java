package com.newer.demo3.domain;

import java.io.Serializable;

public class Topic implements Serializable {
    private static final long serialVersionUID = -6868566359745670462L;
    private Integer SortedID;
    private String title;

    public Topic() {
    }

    public Topic(Integer sortedID, String title) {
        SortedID = sortedID;
        this.title = title;
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
