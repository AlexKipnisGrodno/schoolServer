package edu.school.schoolServer.dto;

import edu.school.schoolServer.entity.Pupil;
import edu.school.schoolServer.entity.Subject;
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
public class DayScheduleDto {
    private Long id;
    private Date dayDate;
    private List<Pupil> pupils;
    private List<Subject> subjects;
}
