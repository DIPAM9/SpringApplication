package com.thinkxfactor.demoApp.repository;

import com.thinkxfactor.demoApp.entity.admin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<admin, Long>
{


}