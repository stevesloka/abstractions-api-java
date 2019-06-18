package demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<TeamMember, Long> {

    List<TeamMember> findByLastName(String lastName);
}