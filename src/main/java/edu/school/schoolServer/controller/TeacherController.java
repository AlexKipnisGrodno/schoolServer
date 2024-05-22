package edu.school.schoolServer.controller;

import edu.school.schoolServer.dto.TeacherDto;
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
    public List<TeacherDto> getAllTeachers() {
        return teacherServiceImpl.findAllTeachers();
    }

    @GetMapping("/{id}")
    public TeacherDto getTeacher(@PathVariable Long id) {
        return teacherServiceImpl.findById(id);
    }

    @GetMapping("/emails/{lastName}")
    public TeacherDto getTeacherByEmail(@PathVariable String lastName) {
        return teacherServiceImpl.findByLastName(lastName);
    }

    @PostMapping
    public void createTeacher(@RequestBody TeacherDto teacherDto) {
         teacherServiceImpl.save(teacherDto);
    }
}
