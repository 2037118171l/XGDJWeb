package com.xgdjweb.bean;

import java.util.Date;

public class Volunteer {
    private Integer vid;

    private String number;

    private String volunteername;

    private Date vtime;

    private Integer neednum;

    private Integer applicantsnum;

    private String contacts;

    private String cphone;

    private String publisher;

    private String college;

    private Date releasetime;

    private Date endtime;


    private Date assemblytime;

    private String collectionplace;

    private String content;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getVolunteername() {
        return volunteername;
    }

    public void setVolunteername(String volunteername) {
        this.volunteername = volunteername == null ? null : volunteername.trim();
    }

    public Date getVtime() {
        return vtime;
    }

    public void setVtime(Date vtime) {
        this.vtime = vtime;
    }

    public Integer getNeednum() {
        return neednum;
    }

    public void setNeednum(Integer neednum) {
        this.neednum = neednum;
    }

    public Integer getApplicantsnum() {
        return applicantsnum;
    }

    public void setApplicantsnum(Integer applicantsnum) {
        this.applicantsnum = applicantsnum;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone == null ? null : cphone.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
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

    public Date getAssemblytime() {
        return assemblytime;
    }

    public void setAssemblytime(Date assemblytime) {
        this.assemblytime = assemblytime;
    }

    public String getCollectionplace() {
        return collectionplace;
    }

    public void setCollectionplace(String collectionplace) {
        this.collectionplace = collectionplace == null ? null : collectionplace.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}