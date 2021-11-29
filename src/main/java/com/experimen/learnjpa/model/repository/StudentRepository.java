package com.experimen.learnjpa.model.repository;

import java.util.List;

import com.experimen.learnjpa.model.entities.Student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,String>{ //<nama entity, tipe variable PK
    List<Student> findByNameContains(String name);
}
