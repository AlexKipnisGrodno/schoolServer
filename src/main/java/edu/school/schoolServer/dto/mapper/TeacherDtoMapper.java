package edu.school.schoolServer.dto.mapper;

import edu.school.schoolServer.entity.Teacher;
import edu.school.schoolServer.dto.TeacherDto;

import java.util.List;

public class TeacherDtoMapper {
    public static TeacherDto EntityToDto(Teacher source)
    {
        return TeacherDto.builder()
                .id(source.getId())
                .firstName(source.getFirstName())
                .lastName(source.getLastName())
                .password(source.getPassword())
                .email(source.getEmail())
                .age(source.getAge())
                .birthDate(source.getBirthDate())
                .subject(source.getSubject())
                .schedule(source.getSchedule())
                .build();
    }

    public static Teacher DtoToEntity(TeacherDto source)
    {
        return Teacher.builder()
                .id(source.getId())
                .firstName(source.getFirstName())
                .lastName(source.getLastName())
                .password(source.getPassword())
                .email(source.getEmail())
                .age(source.getAge())
                .birthDate(source.getBirthDate())
                .subject(source.getSubject())
                .schedule(source.getSchedule())
                .build();
    }

    public static List<TeacherDto> EntitiesToDtos(List<Teacher> source)
    {
        return source.stream()
                .map(TeacherDtoMapper::EntityToDto)
                .toList();
    }

    public static List<Teacher> DtosToEntities(List<TeacherDto> source)
    {
        return source.stream()
                .map(TeacherDtoMapper::DtoToEntity)
                .toList();
    }
}
