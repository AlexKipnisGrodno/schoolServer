package edu.school.schoolServer.dto.mapper;

import edu.school.schoolServer.dto.GroupDto;

import java.util.List;

public class GroupDtoMapper {
    public static GroupDto EntityToDto(GroupDto source)
    {
        return GroupDto.builder()
                .id(source.getId())
                .title(source.getTitle())
                .pupils(source.getPupils())
                .build();
    }

    public static GroupDto DtoToEntity(GroupDto source)
    {
        return GroupDto.builder()
                .id(source.getId())
                .title(source.getTitle())
                .pupils(source.getPupils())
                .build();
    }

    public static List<GroupDto> EntitiesToDtos(List<GroupDto> source)
    {
        return source.stream()
                .map(GroupDtoMapper::EntityToDto)
                .toList();
    }

    public static List<GroupDto> DtosToEntities(List<GroupDto> source)
    {
        return source.stream()
                .map(GroupDtoMapper::DtoToEntity)
                .toList();
    }
}
