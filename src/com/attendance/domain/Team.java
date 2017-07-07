package com.attendance.domain;

public class Team {
    private Integer tid;

    private String tname;

    private Boolean tattendance;

    private Integer tno;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Boolean getTattendance() {
        return tattendance;
    }

    public void setTattendance(Boolean tattendance) {
        this.tattendance = tattendance;
    }

    public Integer getTno() {
        return tno;
    }

    public void setTno(Integer tno) {
        this.tno = tno;
    }
}