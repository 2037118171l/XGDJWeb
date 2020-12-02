package com.xgdjweb.bean;

public class Parameter {
    private Integer id;

    private String name;

    private String icp;

    private String shopname;

    private String url;

    private String appid;

    private String appsecret;

    private String basetoken;

    private Integer shopid;

    private String shopkey;

    private String distributionimg;

    private String logo;

    private String official;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIcp() {
        return icp;
    }

    public void setIcp(String icp) {
        this.icp = icp == null ? null : icp.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret == null ? null : appsecret.trim();
    }

    public String getBasetoken() {
        return basetoken;
    }

    public void setBasetoken(String basetoken) {
        this.basetoken = basetoken == null ? null : basetoken.trim();
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getShopkey() {
        return shopkey;
    }

    public void setShopkey(String shopkey) {
        this.shopkey = shopkey == null ? null : shopkey.trim();
    }

    public String getDistributionimg() {
        return distributionimg;
    }

    public void setDistributionimg(String distributionimg) {
        this.distributionimg = distributionimg == null ? null : distributionimg.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official == null ? null : official.trim();
    }
}