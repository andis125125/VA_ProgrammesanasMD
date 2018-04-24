package tehinternets.homepage.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/status")
public class AvailabilityController {

    private static boolean avalable;

    @GetMapping
    @ResponseBody
    public void getStatus(HttpServletResponse stats) {
        stats.setStatus(avalable ? stats.SC_OK : stats.SC_SERVICE_UNAVAILABLE);
    }

    @PostMapping("/{value}")
    @ResponseBody
    public void setStatus(@PathVariable("value") boolean value) {
        avalable = value;
    }
}
