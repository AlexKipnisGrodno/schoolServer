package edu.school.schoolServer.dto.mapper;

import edu.school.schoolServer.dto.DayScheduleDto;
import edu.school.schoolServer.entity.DaySchedule;

import java.util.List;

public class DayScheduleDtoMapper {
    public static DayScheduleDto convertDaySchedule(DaySchedule source)
    {
        return DayScheduleDto.builder()
                .id(source.getId())
                .dayDate(source.getDayDate())
                .pupils(source.getPupils())
                .subjects(source.getSubjects())
                .build();
    }

    public static DaySchedule convertDto(DayScheduleDto source)
    {
        return DaySchedule.builder()
                .id(source.getId())
                .dayDate(source.getDayDate())
                .pupils(source.getPupils())
                .subjects(source.getSubjects())
                .build();
    }

    public static List<DayScheduleDto> ConverDaySchedules(List<DaySchedule> source)
    {
        return source.stream()
                .map(DayScheduleDtoMapper::convertDaySchedule)
                .toList();
    }

    public static List<DaySchedule> ConverDtos(List<DayScheduleDto> source)
    {
        return source.stream()
                .map(DayScheduleDtoMapper::convertDto)
                .toList();
    }

}
