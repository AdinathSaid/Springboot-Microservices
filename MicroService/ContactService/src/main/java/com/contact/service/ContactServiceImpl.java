package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> list=List.of(
            new Contact(101l,"Sachin","sachin@gmail.com",1001l),
            new Contact(102l,"Sehwag","sehwag@gmail.com",1001l),
            new Contact(103l,"yuvraj","yuvraj@gmail.com",1002l),
            new Contact(104l,"dhoni","dhoni@gmail.com",1004l)

    );
    @Override
    public List<Contact> getContact(Long userid) {
        return  list.stream().filter(contact -> contact.getUserid().equals(userid)).collect(Collectors.toList());
    }
}
