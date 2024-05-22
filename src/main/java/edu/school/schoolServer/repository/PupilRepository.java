package edu.school.schoolServer.repository;

import edu.school.schoolServer.entity.Pupil;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PupilRepository  extends CrudRepository<Pupil, Long> {
     Pupil findByLastName(String lastName);

     List<Pupil> findAllPupils();

}
