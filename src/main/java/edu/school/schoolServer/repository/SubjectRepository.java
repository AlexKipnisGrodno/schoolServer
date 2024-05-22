package edu.school.schoolServer.repository;

import edu.school.schoolServer.entity.Pupil;
import edu.school.schoolServer.entity.Subject;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubjectRepository  extends CrudRepository<Subject, Long> {

}
