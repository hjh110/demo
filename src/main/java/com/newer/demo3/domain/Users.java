package com.newer.demo3.domain;

import java.io.Serializable;

public class Users implements Serializable {
    private static final long serialVersionUID = 5216197222892474294L;
    private Integer userid;
    private String username;
    private String pwd;
    private String headpicture;
    private int ban;
    private int infractions;
    private int grade;
    private int state;

    public Users(){

    }

    public Users(Integer userid, String username, String pwd, String headpicture, int ban, int infractions, int grade, int state) {
        this.userid = userid;
        this.username = username;
        this.pwd = pwd;
        this.headpicture = headpicture;
        this.ban = ban;
        this.infractions = infractions;
        this.grade = grade;
        this.state = state;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getHeadpicture() {
        return headpicture;
    }

    public void setHeadpicture(String headpicture) {
        this.headpicture = headpicture;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getInfractions() {
        return infractions;
    }

    public void setInfractions(int infractions) {
        this.infractions = infractions;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
