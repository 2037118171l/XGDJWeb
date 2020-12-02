package com.xgdjweb.bean;

public class Fileupload {
    private Integer id;

    private String filetitle;

    private String filepath;

    private String filename;

    private Integer putton;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFiletitle() {
        return filetitle;
    }

    public void setFiletitle(String filetitle) {
        this.filetitle = filetitle == null ? null : filetitle.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Integer getPutton() {
        return putton;
    }

    public void setPutton(Integer putton) {
        this.putton = putton;
    }
}