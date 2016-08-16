package demo.Controllers;

import demo.AppVersion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class VersionController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<? extends  Object> getAppVersion() {
        return new ResponseEntity<>(new AppVersion("1.0.0"), HttpStatus.OK);
    }
}
