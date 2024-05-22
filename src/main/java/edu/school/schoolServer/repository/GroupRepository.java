package edu.school.schoolServer.repository;

import edu.school.schoolServer.entity.Group;
import org.springframework.data.repository.CrudRepository;

public interface GroupRepository extends CrudRepository<Group, Long> {
}
