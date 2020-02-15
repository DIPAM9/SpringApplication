package com.thinkxfactor.demoApp.repository;

import com.thinkxfactor.demoApp.entity.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<student, Long>
{

}