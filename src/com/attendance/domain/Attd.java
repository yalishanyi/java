package com.attendance.domain;

import java.util.Date;

public class Attd {
    private Integer attid;

    private Date dnt;

    private Boolean status;

    private Integer userid;

    public Integer getAttid() {
        return attid;
    }

    public void setAttid(Integer attid) {
        this.attid = attid;
    }

    public Date getDnt() {
        return dnt;
    }

    public void setDnt(Date dnt) {
        this.dnt = dnt;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}