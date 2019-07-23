package com.newer.demo3.domain;

import java.io.Serializable;

public class ContentOfTheReport implements Serializable {
    private static final long serialVersionUID = -5824664452849486298L;
    private Integer cotrid;
    private Integer reporttype;
    private Integer Titile;

    public ContentOfTheReport() {
    }

    public ContentOfTheReport(Integer cotrid, Integer reporttype, Integer titile) {
        this.cotrid = cotrid;
        this.reporttype = reporttype;
        Titile = titile;
    }

    public Integer getCotrid() {
        return cotrid;
    }

    public void setCotrid(Integer cotrid) {
        this.cotrid = cotrid;
    }

    public Integer getReporttype() {
        return reporttype;
    }

    public void setReporttype(Integer reporttype) {
        this.reporttype = reporttype;
    }

    public Integer getTitile() {
        return Titile;
    }

    public void setTitile(Integer titile) {
        Titile = titile;
    }
}
