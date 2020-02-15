package com.thinkxfactor.demoApp.controllers;

import com.thinkxfactor.demoApp.entity.book;
import com.thinkxfactor.demoApp.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")

public class BookController
{   
    @Autowired
    BookRepository bookrepository;
    @GetMapping("/addbookname")
    public String hello()
    {
        return "Hello Bookname";
    }
    @GetMapping("/addbook")
    public List<book> hellobook(@RequestParam("b") String blist) {
        String[] ar = blist.split(",");
        List<book> bookList = new ArrayList<book>();
        book Book;
        for (int i = 0; i < ar.length; ++i) {
            String[] b=ar[i].split(":");
            Book = new book(b[0],b[1]);
            bookList.add(Book);
        }
        return bookList;
    }
    @PostMapping("/add")
    public book bookname(@RequestBody book Book)
    {   
         book persistancebook =bookrepository.saveAndFlush(Book);
         return persistancebook;
    }
}
