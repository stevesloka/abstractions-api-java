package demo.Controllers;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sessions")
public class ScheduleController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<? extends  Object> getAppVersion() {
        return new ResponseEntity<>(new ClassPathResource("data/sessions.json"), HttpStatus.OK);
    }
}
