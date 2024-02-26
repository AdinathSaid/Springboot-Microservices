package com.user.entity;


import java.util.ArrayList;
import java.util.List;

public class User {
    private Long userid;
    private String name;
    private String mob;

    //every user may have multiple contact.so we create list of Contact

    List<Contacts> contacts=new ArrayList<>();

    public User() {
    }

    public User(Long userid, String name, String mob, List<Contacts> contacts) {
        this.userid = userid;
        this.name = name;
        this.mob = mob;
        this.contacts = contacts;
    }

    public User(Long userid, String name, String mob) {
        this.userid = userid;
        this.name = name;
        this.mob = mob;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public List<Contacts> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contacts> contacts) {
        this.contacts = contacts;
    }
}
