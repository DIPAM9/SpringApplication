package com.thinkxfactor.demoApp.controllers;

import com.thinkxfactor.demoApp.entity.student;
import com.thinkxfactor.demoApp.repository.StudentRepository;

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
@RequestMapping("/student")

public class StudentController
{   
    @Autowired
    StudentRepository studentrepository;

    @GetMapping("/hello")
    public String hello()
    {
        return "hello world";
    }
    @GetMapping("/addstudent")
    public List<student> hellostudent(@RequestParam("s") String stu)
    {   
        String [] a=stu.split(",");
        List<student> studentname= new ArrayList<student>();
        student Student;
        for(int i=0;i<a.length;++i)
        {
            String []b=a[i].split(":");
            Student= new student(Long.parseLong(b[0]),b[1]);
            studentname.add(Student);
        }

        return studentname;
    }

    @PostMapping("/add")
    public student Studentname(@RequestBody student Student)
    {
        student persistancestudent = studentrepository.saveAndFlush(Student);
        return persistancestudent;

    }


}
