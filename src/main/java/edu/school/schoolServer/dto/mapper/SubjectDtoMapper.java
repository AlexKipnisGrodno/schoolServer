package edu.school.schoolServer.dto.mapper;

import edu.school.schoolServer.dto.SubjectDto;
import edu.school.schoolServer.entity.Subject;

import java.util.List;

public class SubjectDtoMapper {
    public static SubjectDto EntityToDto(Subject source)
    {
        return SubjectDto.builder()
                .id(source.getId())
                .title(source.getTitle())
                .teachers(source.getTeachers())
                .build();
    }

    public static Subject DtoToEntity(SubjectDto source)
    {
        return Subject.builder()
                .id(source.getId())
                .title(source.getTitle())
                .teachers(source.getTeachers())
                .build();
    }

    public static List<SubjectDto> EntitiesToDtos(List<Subject> source)
    {
        return source.stream()
                .map(SubjectDtoMapper::EntityToDto)
                .toList();
    }

    public static List<Subject> DtosToEntities(List<SubjectDto> source)
    {
        return source.stream()
                .map(SubjectDtoMapper::DtoToEntity)
                .toList();
    }
}