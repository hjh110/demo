package com.newer.demo3.domain;

import java.util.List;

public class Recommend<E> {

    private List<E> list;
    private Integer attention;//关注的问题数
    private Integer invite;//邀请总数

    public Recommend(List<E> list, Integer attention, Integer invite) {
        this.list = list;

        this.attention = attention;
        this.invite = invite;
    }


    public Recommend() {
    }

    @Override
    public String toString() {
        return "Recommend{" +
                "list=" + list +
                "attention=" + attention +
                ", invite=" + invite +
                '}';
    }

    public List<E> getList() {
        return list;
    }

    public void setList(List<E> list) {
        this.list = list;
    }

    public Integer getAttention() {
        return attention;
    }

    public void setAttention(Integer attention) {
        this.attention = attention;
    }

    public Integer getInvite() {
        return invite;
    }

    public void setInvite(Integer invite) {
        this.invite = invite;
    }
}
