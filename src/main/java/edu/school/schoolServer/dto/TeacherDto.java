package edu.school.schoolServer.dto;

import edu.school.schoolServer.entity.DaySchedule;
import edu.school.schoolServer.entity.Subject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int age;
    private Date birthDate;
    private DaySchedule schedule;
    private Subject subject;

}

