package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> getAllStudentsWithCourses() {
        return studentCourseRepository.findAll();
    }

    public Optional<Student> findStudentWithHighestGpa() {
        List<Student> students = studentRepository.getStudentsWithHighestGpa();
        Student highestGpaStudent = null;
        if (!students.isEmpty()) highestGpaStudent = students.get(0);
        return Optional.ofNullable(highestGpaStudent);
    }

    public String joinStudentNames() {
        List<String> students = studentRepository.getAllStudentNames();
        StringBuilder result = new StringBuilder();
        for (String student : students) {
            result.append(student).append(", ");
        }
        return result.substring(0, result.length() - 2);
    }
}

