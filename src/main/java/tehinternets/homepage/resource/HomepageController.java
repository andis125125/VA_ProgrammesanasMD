package tehinternets.homepage.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tehinternets.homepage.domain.Response;

@Controller
public class HomepageController {

    @GetMapping(value ="/")
    @ResponseBody

    public String testEndpoint() {
        return "Teh internetz";
    }

    @GetMapping(value ="/index")
    @ResponseBody

    public Response nextTestEndpoint() {
        return new Response("Best programm ever");
    }

}
//object oriented design patterns - gang of four
