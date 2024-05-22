package edu.school.schoolServer.dto.mapper;

import edu.school.schoolServer.dto.PupilDto;
import edu.school.schoolServer.entity.Pupil;

import java.util.List;

public class PupilDtoMapper {
    public static PupilDto EntityToDto(Pupil source)
    {
        return PupilDto.builder()
                .id(source.getId())
                .firstName(source.getFirstName())
                .lastName(source.getLastName())
                .password(source.getPassword())
                .email(source.getEmail())
                .age(source.getAge())
                .birthDate(source.getBirthDate())
                .group(source.getGroup())
                .schedule(source.getSchedule())
                .build();
    }

    public static Pupil DtoToEntity(PupilDto source)
    {
        return Pupil.builder()
                .id(source.getId())
                .firstName(source.getFirstName())
                .lastName(source.getLastName())
                .password(source.getPassword())
                .email(source.getEmail())
                .age(source.getAge())
                .birthDate(source.getBirthDate())
                .group(source.getGroup())
                .schedule(source.getSchedule())
                .build();
    }

    public static List<PupilDto> EntitiesToDtos(List<Pupil> source)
    {
        return source.stream()
                .map(PupilDtoMapper::EntityToDto)
                .toList();
    }

    public static List<Pupil> DtosToEntities(List<PupilDto> source)
    {
        return source.stream()
                .map(PupilDtoMapper::DtoToEntity)
                .toList();
    }
}
