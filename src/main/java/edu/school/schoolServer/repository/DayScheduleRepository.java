package edu.school.schoolServer.repository;

import edu.school.schoolServer.entity.DaySchedule;

import org.springframework.data.repository.CrudRepository;

public interface DayScheduleRepository extends CrudRepository<DaySchedule, Long> {
}
