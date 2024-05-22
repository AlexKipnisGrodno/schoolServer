package edu.school.schoolServer.service;

import edu.school.schoolServer.entity.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher findById(Long id);
    Teacher findByLastName(String lastName);
    List<Teacher> findAll();
    void save(Teacher teacher);

}
