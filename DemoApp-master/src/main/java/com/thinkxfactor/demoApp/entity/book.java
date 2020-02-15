package com.thinkxfactor.demoApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="tbl_book")

public class book{
    @Column(name="book_name")
    String b_name;
    @Column(name="book_auhtor")
    String b_author;
    @Id
    @GeneratedValue
    @Column(name="book_isbn")
    private Long b_ISBN;
    @Column(name ="book_category")
    String b_category;

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getB_author() {
        return b_author;
    }

    public void setB_author(String b_author) {
        this.b_author = b_author;
    }

    public Long getB_ISBN() {
        return b_ISBN;
    }

    public void setB_ISBN(Long b_ISBN) {
        this.b_ISBN = b_ISBN;
    }

    public String getB_category() {
        return b_category;
    }

    public void setB_category(String b_category) {
        this.b_category = b_category;
    }

    public book(String b_name, String b_author) {
        this.b_name = b_name;
        this.b_author = b_author;
    }

    public book() {
        System.out.println("book portal created");
    }

}