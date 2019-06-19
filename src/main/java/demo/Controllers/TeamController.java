package demo.Controllers;

import demo.TeamMember;
import demo.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TeamController {

    @Autowired
    TeamRepository repository;

    @RequestMapping("/team")
    public Iterable<TeamMember> team() {
        return repository.findAll();
    }
}