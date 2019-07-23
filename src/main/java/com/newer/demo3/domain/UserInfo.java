package com.newer.demo3.domain;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    private static final long serialVersionUID = 126634955451799665L;
    private Integer infoid;
    private String sex;
    private String introduce;
    private Date regTime;
    private Integer userid;
    private Integer Phone;

    public UserInfo() {
    }

    public UserInfo(Integer infoid, String sex, String introduce, Date regTime, Integer userid, Integer phone) {
        this.infoid = infoid;
        this.sex = sex;
        this.introduce = introduce;
        this.regTime = regTime;
        this.userid = userid;
        Phone = phone;
    }

    public Integer getInfoid() {
        return infoid;
    }

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer phone) {
        Phone = phone;
    }
}
