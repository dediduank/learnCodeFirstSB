package com.experimen.learnjpa.controller;

import com.experimen.learnjpa.model.entities.Student;
import com.experimen.learnjpa.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/check/student")
public class projectController {
    
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student postMethodName(@RequestBody Student student) {
        return studentService.create(student);
    }

    @GetMapping
    public Iterable <Student> findAll() {
        return studentService.findalldata();
    }

    @GetMapping("/{nim}")
    public Student findAllbyname(@PathVariable("nim") String nim) { 
        return studentService.finddata(nim);
    }

    @PutMapping
    public Student updatedata(@RequestBody Student student) {
        return studentService.create(student);
    }
    
    @DeleteMapping("/{nim}")
    public void deletedata(@PathVariable("nim") String nim) { 
         studentService.detelebynim(nim);
    }
    
    
    
}
