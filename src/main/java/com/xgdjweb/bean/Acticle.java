package com.xgdjweb.bean;

import java.util.Date;

public class Acticle {
    private Integer aid;

    private String category;

    private String title;

    private Date articletime;

    private String srole;

    private String url;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getArticletime() {
        return articletime;
    }

    public void setArticletime(Date articletime) {
        this.articletime = articletime;
    }

    public String getSrole() {
        return srole;
    }

    public void setSrole(String srole) {
        this.srole = srole == null ? null : srole.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}