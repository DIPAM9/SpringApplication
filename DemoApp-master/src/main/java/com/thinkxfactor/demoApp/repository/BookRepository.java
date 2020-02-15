package com.thinkxfactor.demoApp.repository;

import com.thinkxfactor.demoApp.entity.book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<book, Long>
{

}