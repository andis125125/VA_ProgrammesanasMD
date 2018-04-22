package tehinternets.homepage.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AvailabilityController {
    @RequestMapping(value = "/index",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity getStatus() {
        return new ResponseEntity(HttpStatus.SERVICE_UNAVAILABLE);
    }

    @PostMapping
    public ResponseEntity setStatus(@PathVariable("url") String url) {
        if(url == null) {
            return new ResponseEntity(HttpStatus.SERVICE_UNAVAILABLE);
        } else {
            return new ResponseEntity(HttpStatus.OK);
        }
    }
}
