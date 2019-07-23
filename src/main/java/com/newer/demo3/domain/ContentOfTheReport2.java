package com.newer.demo3.domain;

import java.io.Serializable;

public class ContentOfTheReport2 implements Serializable {
    private static final long serialVersionUID = 966720735824035581L;
    private Integer cotr2id;
    private Integer cotrid;
    private Integer Titile;

    public ContentOfTheReport2() {
    }

    public ContentOfTheReport2(Integer cotr2id, Integer cotrid, Integer titile) {
        this.cotr2id = cotr2id;
        this.cotrid = cotrid;
        Titile = titile;
    }

    public Integer getCotr2id() {
        return cotr2id;
    }

    public void setCotr2id(Integer cotr2id) {
        this.cotr2id = cotr2id;
    }

    public Integer getCotrid() {
        return cotrid;
    }

    public void setCotrid(Integer cotrid) {
        this.cotrid = cotrid;
    }

    public Integer getTitile() {
        return Titile;
    }

    public void setTitile(Integer titile) {
        Titile = titile;
    }
}
