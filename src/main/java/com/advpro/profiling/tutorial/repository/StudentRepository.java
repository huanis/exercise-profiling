package com.advpro.profiling.tutorial.repository;

import com.advpro.profiling.tutorial.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author muhammad.khadafi
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(value = "SELECT s.name FROM Student AS s")
    List<String> getAllStudentNames();

    @Query(value = "SELECT s FROM Student s " +
            "WHERE s.gpa = (SELECT MAX(s2.gpa) " +
            "               FROM Student s2) ")
    List<Student> getStudentsWithHighestGpa();
}