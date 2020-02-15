package com.thinkxfactor.demoApp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity    
@Table(name="tbl_admin")
public class admin{
    @Id
    @GeneratedValue
    @Column(name="admin_id")
    private long id;
    @Column(name="admin_name")
    String name;
    @Column(name="admin_password")
    String password;

    

    public admin(String name) {
        this.name = name;
    }

    public admin() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}




