package edu.school.schoolServer.service;

import edu.school.schoolServer.dto.TeacherDto;

import java.util.List;

public interface TeacherService {
    TeacherDto save(TeacherDto teacherDto);
    TeacherDto findById(Long id);
    TeacherDto findByLastName(String lastName);
    List<TeacherDto> findAllTeachers();

}
