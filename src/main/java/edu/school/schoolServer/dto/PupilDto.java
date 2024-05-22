package edu.school.schoolServer.dto;

import edu.school.schoolServer.entity.DaySchedule;
import edu.school.schoolServer.entity.Group;
import edu.school.schoolServer.entity.Pupil;
import edu.school.schoolServer.entity.Subject;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PupilDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int age;
    private Date birthDate;
    private Group group;
    private DaySchedule schedule;
}
