package com.contact.entity;

public class Contact {
    private Long cid;
    private String cname;
    private String email;
    private Long userid;

    public Contact(Long cid, String cname, String email, Long userid) {
        this.cid = cid;
        this.cname = cname;
        this.email = email;
        this.userid = userid;
    }

    public Contact() {
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

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }
}
