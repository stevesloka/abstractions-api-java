package demo.Controllers;

import demo.TeamMember;
import demo.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    @Autowired
    TeamRepository repository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/team")
    public Iterable<TeamMember> team() {
        return repository.findAll();
    }
}