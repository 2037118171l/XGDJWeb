package com.xgdjweb.bean;

import java.util.Date;

public class Task {
    private Integer tid;

    private String tasktitle;

    private String tasktype;

    private String taskcontent;

    private String isshow;

    private String srole;

    private Date releasetime;

    private Date endtime;

    private String publisher;

    private String number;

    private String closeperson;

    private String resolver;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTasktitle() {
        return tasktitle;
    }

    public void setTasktitle(String tasktitle) {
        this.tasktitle = tasktitle == null ? null : tasktitle.trim();
    }

    public String getTasktype() {
        return tasktype;
    }

    public void setTasktype(String tasktype) {
        this.tasktype = tasktype == null ? null : tasktype.trim();
    }

    public String getTaskcontent() {
        return taskcontent;
    }

    public void setTaskcontent(String taskcontent) {
        this.taskcontent = taskcontent == null ? null : taskcontent.trim();
    }

    public String getIsshow() {
        return isshow;
    }

    public void setIsshow(String isshow) {
        this.isshow = isshow == null ? null : isshow.trim();
    }

    public String getSrole() {
        return srole;
    }

    public void setSrole(String srole) {
        this.srole = srole == null ? null : srole.trim();
    }

    public Date getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getCloseperson() {
        return closeperson;
    }

    public void setCloseperson(String closeperson) {
        this.closeperson = closeperson == null ? null : closeperson.trim();
    }

    public String getResolver() {
        return resolver;
    }

    public void setResolver(String resolver) {
        this.resolver = resolver == null ? null : resolver.trim();
    }
}