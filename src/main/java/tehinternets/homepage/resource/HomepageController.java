package tehinternets.homepage.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tehinternets.homepage.domain.Response;
import tehinternets.homepage.service.AdvertesmentService;

import java.util.Map;

@Controller
public class HomepageController {

    @Autowired
    private AdvertesmentService advertesmentService;

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

    @GetMapping("/main")
    public String getUI(Map<String, Object> module) {
        module.put("message", "hello user");
        module.put("ad", advertesmentService.getAd());
        return "main";
    }
}
//object oriented design patterns - gang of four
