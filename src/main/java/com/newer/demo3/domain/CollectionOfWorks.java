package com.newer.demo3.domain;

import java.io.Serializable;

public class CollectionOfWorks implements Serializable {
    private static final long serialVersionUID = 133016195252766945L;
    private Integer cowId;
    private Integer collectid;
    private Integer uploadid;



    public CollectionOfWorks() {
    }

    public CollectionOfWorks(Integer cowId, Integer collectid, Integer uploadid) {
        this.cowId = cowId;
        this.collectid = collectid;
        this.uploadid = uploadid;
    }

    public Integer getCowId() {
        return cowId;
    }

    public void setCowId(Integer cowId) {
        this.cowId = cowId;
    }

    public Integer getCollectid() {
        return collectid;
    }

    public void setCollectid(Integer collectid) {
        this.collectid = collectid;
    }

    public Integer getUploadid() {
        return uploadid;
    }

    public void setUploadid(Integer uploadid) {
        this.uploadid = uploadid;
    }
}
