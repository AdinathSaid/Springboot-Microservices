package com.user.entity;

public class Contacts {
    private Long cid;
    private String cname;
    private String email;
    private long userid; //This contact belongs to which user

    public Contacts() {
    }

    public Contacts(Long cid, String cname, String email, long userid) {
        this.cid = cid;
        this.cname = cname;
        this.email = email;
        this.userid = userid;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }
}
