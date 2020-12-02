package com.xgdjweb.bean;

public class Admin {
    private Integer id;

    private String number;

    private String password;

    private String role;

    private String phone;

    private String college;

    private String qq;

    private String name;

    private String wachat;

    private String wachatname;

    private Integer tid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getWachat() {
        return wachat;
    }

    public void setWachat(String wachat) {
        this.wachat = wachat == null ? null : wachat.trim();
    }

    public String getWachatname() {
        return wachatname;
    }

    public void setWachatname(String wachatname) {
        this.wachatname = wachatname == null ? null : wachatname.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}