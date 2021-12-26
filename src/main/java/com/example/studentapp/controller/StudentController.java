package com.example.studentapp.controller;


import com.example.studentapp.db.DataBase;
import com.example.studentapp.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    @GetMapping("/all")
    public ArrayList<Student> getAllStudents(){
        return DataBase.studentsDatable;
    }
}
