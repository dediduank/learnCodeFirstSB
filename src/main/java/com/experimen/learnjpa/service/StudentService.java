package com.experimen.learnjpa.service;



import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.experimen.learnjpa.model.entities.Student;
import com.experimen.learnjpa.model.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService {
    
    @Autowired
    private StudentRepository studentrepo;

    public Student create(Student student){
        return studentrepo.save(student);
    }

    public Student finddata(String nim){
        Optional<Student> studentdata = studentrepo.findById(nim);
        if(!studentdata.isPresent()){
            return null;
        }
        return studentdata.get();
    }

    public Iterable<Student> findalldata(){
        return studentrepo.findAll();
    }

    public void detelebynim(String nim){
        studentrepo.deleteById(nim);
    }

    public List<Student> findbyname(String nama){
        return studentrepo.findByNameContains(nama);
    }


}
