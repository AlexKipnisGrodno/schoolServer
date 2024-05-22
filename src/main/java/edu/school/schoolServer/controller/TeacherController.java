package edu.school.schoolServer.controller;

import edu.school.schoolServer.entity.Teacher;
import edu.school.schoolServer.service.Impl.TeacherServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class TeacherController {
    private final TeacherServiceImpl teacherServiceImpl;
    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherServiceImpl.findAll();
    }

    @GetMapping("/{id}")
    public Teacher getTeacher(@PathVariable Long id) {
        return teacherServiceImpl.findById(id);
    }

    @GetMapping("/{lastName}")
    public Teacher getTeacherByLastName(@PathVariable String lastName) {
        return teacherServiceImpl.findByLastName(lastName);
    }
}
