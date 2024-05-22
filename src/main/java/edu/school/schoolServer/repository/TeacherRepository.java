package edu.school.schoolServer.repository;

import edu.school.schoolServer.entity.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TeacherRepository  extends CrudRepository<Teacher, Long>{
     Teacher findByLastName(String lastName);
}
