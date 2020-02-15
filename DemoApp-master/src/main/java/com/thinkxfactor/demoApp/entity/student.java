package com.thinkxfactor.demoApp.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="tbl_student")

public class student
{   @Id
    @GeneratedValue
    @Column(name="student_id")
    private Long s_user_id;
    @Column(name="student_name")
    String s_name;
    @Column(name="student_dept")
    String s_dept;
    @Column(name="student_roll")
    int s_roll;
    @Column(name="student_gender")
    private String s_gender;
    @Column(name="student_password")
    String s_password;

    
    public student(String s_name, String s_dept, int s_roll, String s_gender, Long s_user_id, String s_password) {
        this.s_name = s_name;
        this.s_dept = s_dept;
        this.s_roll = s_roll;
        this.s_gender = s_gender;
        this.s_user_id = s_user_id;
        this.s_password = s_password;
    }

    public student(Long s_user_id,String s_password)
    {
        this.s_user_id=s_user_id;
        this.s_password=s_password;
    }

    public student() 
    {   
        System.out.println("Student portal created");
    }

    public Long getS_user_id() {
        return s_user_id;
    }

    public void setS_user_id(Long s_user_id) {
        this.s_user_id = s_user_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_dept() {
        return s_dept;
    }

    public void setS_dept(String s_dept) {
        this.s_dept = s_dept;
    }

    public int getS_roll() {
        return s_roll;
    }

    public void setS_roll(int s_roll) {
        this.s_roll = s_roll;
    }

    public String getS_gender() {
        return s_gender;
    }

    public void setS_gender(String s_gender) {
        this.s_gender = s_gender;
    }

    public String getS_password() {
        return s_password;
    }

    public void setS_password(String s_password) {
        this.s_password = s_password;
    }


    
}