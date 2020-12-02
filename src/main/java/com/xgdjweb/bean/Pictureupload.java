package com.xgdjweb.bean;

public class Pictureupload {
    private Integer pid;

    private String picturetitle;

    private String picturepath;

    private String picturename;

    private String putton;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPicturetitle() {
        return picturetitle;
    }

    public void setPicturetitle(String picturetitle) {
        this.picturetitle = picturetitle == null ? null : picturetitle.trim();
    }

    public String getPicturepath() {
        return picturepath;
    }

    public void setPicturepath(String picturepath) {
        this.picturepath = picturepath == null ? null : picturepath.trim();
    }

    public String getPicturename() {
        return picturename;
    }

    public void setPicturename(String picturename) {
        this.picturename = picturename == null ? null : picturename.trim();
    }

    public String getPutton() {
        return putton;
    }

    public void setPutton(String putton) {
        this.putton = putton == null ? null : putton.trim();
    }
}