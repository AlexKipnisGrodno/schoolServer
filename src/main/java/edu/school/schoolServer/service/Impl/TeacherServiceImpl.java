package edu.school.schoolServer.service.Impl;

import edu.school.schoolServer.dto.TeacherDto;
import edu.school.schoolServer.dto.mapper.TeacherDtoMapper;
import edu.school.schoolServer.entity.Teacher;
import edu.school.schoolServer.repository.TeacherRepository;
import edu.school.schoolServer.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.DialectOverride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;

    @Override
    public TeacherDto save(TeacherDto teacherDto) {
        return TeacherDtoMapper.EntityToDto(teacherRepository.save(TeacherDtoMapper.DtoToEntity(teacherDto)));
    }

    @Override
    public TeacherDto findById(Long id){
        return TeacherDtoMapper.EntityToDto(teacherRepository.findById(id).get());
    }

    @Override
    public TeacherDto findByLastName(String lastName) {
        return TeacherDtoMapper.EntityToDto(teacherRepository.findByLastName(lastName));
    }

    @Override
    public List<TeacherDto> findAllTeachers() {
        return TeacherDtoMapper.EntitiesToDtos(teacherRepository.findAllTeachers());
    }
}
