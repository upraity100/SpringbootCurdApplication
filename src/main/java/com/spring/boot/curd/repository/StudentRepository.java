package com.spring.boot.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.curd.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
