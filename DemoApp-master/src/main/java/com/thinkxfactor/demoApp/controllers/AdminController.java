package com.thinkxfactor.demoApp.controllers;
import com.thinkxfactor.demoApp.entity.admin;
import com.thinkxfactor.demoApp.repository.AdminRepository;

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
@RequestMapping({"/admin"})

public class AdminController{

    @Autowired
    AdminRepository adminRepository;

    @GetMapping("/hello")
    public String helloadmin()
    {
        return "Hello World";
    }
    @GetMapping("/hello2")
    public String hello(@RequestParam("n") String name)
    {
        admin Admin= new admin(name);
        return "hello" + Admin.getName();
    }
    @GetMapping({ "/helloadmin" })
    public List<admin> helloadmin(@RequestParam("ne") String name) {
        admin Admin = new admin(name);
        List<admin> adminList = new ArrayList<admin>();
        adminList.add(Admin);
        return adminList;
    }

    @PostMapping({"/add"})
    public admin addadmin(@RequestBody admin Admin)
    {   
        admin persistenceAdmin=adminRepository.saveAndFlush(Admin);
        System.out.println(Admin.getName()+ Admin.getId()+ Admin.getPassword());
        return persistenceAdmin;
    }
}
