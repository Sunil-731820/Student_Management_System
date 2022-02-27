package com.java.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.boot.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
