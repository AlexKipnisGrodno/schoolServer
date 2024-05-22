package edu.school.schoolServer.controller;

import edu.school.schoolServer.entity.Teacher;
import edu.school.schoolServer.repository.TeacherRepository;
import edu.school.schoolServer.service.Impl.TeacherServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
@RequiredArgsConstructor
public class TeacherController {
    private final TeacherServiceImpl teacherServiceImpl;
    private final TeacherRepository teacherRepository;

    @GetMapping("/page1")
    public List<Teacher> getAllTeachers() {
        return teacherServiceImpl.findAll();
    }

    @GetMapping("/page2")
    public Teacher getTeacher(@PathVariable Long id) {
        return teacherServiceImpl.findById(id);
    }

    @GetMapping("/{lastName}")
    public Teacher getTeacherByLastName(@PathVariable String lastName) {
        return teacherServiceImpl.findByLastName(lastName);
    }

    @PostMapping("/new-school-user")
    public String addSchoolUser(@RequestBody Teacher teacher) {
        teacherServiceImpl.save(teacher);
        return "SchoolUser is saved";
    }
}
