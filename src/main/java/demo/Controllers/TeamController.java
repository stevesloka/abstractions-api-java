package demo.Controllers;

import demo.TeamRepository;
import demo.TeamMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    @Autowired
    TeamRepository repository;

    @RequestMapping("/team")
    public Iterable<TeamMember> team() {
        return repository.findAll();
    }
}