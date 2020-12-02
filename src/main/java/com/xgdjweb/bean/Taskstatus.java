package com.xgdjweb.bean;

import java.util.Date;

public class Taskstatus {
    public Integer id;

    private Date starttime;

    private Date completetime;

    private Date examinetime;

    private String putton;

    private String examine;

    private String state;




    private String category;

    public String number;

    public Integer sid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getCompletetime() {
        return completetime;
    }

    public void setCompletetime(Date completetime) {
        this.completetime = completetime;
    }

    public Date getExaminetime() {
        return examinetime;
    }

    public void setExaminetime(Date examinetime) {
        this.examinetime = examinetime;
    }

    public String getPutton() {
        return putton;
    }

    public void setPutton(String putton) {
        this.putton = putton == null ? null : putton.trim();
    }

    public String getExamine() {
        return examine;
    }

    public void setExamine(String examine) {
        this.examine = examine == null ? null : examine.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

}