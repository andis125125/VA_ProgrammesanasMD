package tehinternets.homepage.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tehinternets.homepage.dao.DataBaseOperations;
import tehinternets.homepage.domain.Advertesment;
import tehinternets.homepage.domain.Response;
import tehinternets.homepage.service.AdvertesmentService;

import javax.persistence.GeneratedValue;
import java.util.Map;

import static java.lang.Long.valueOf;

@Controller
public class HomepageController {

    @Autowired
    private AdvertesmentService advertesmentService;

    @Autowired DataBaseOperations operations;

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
    @GetMapping("/ads")
    public String getAds(Map<String, Object> model) {
        model.put("advertesmentList", advertesmentService.getADs());
        return "advertesmentUI";
    }

    @GetMapping("/ads/{author}")
    public String getAdsByAuthor(Map<String, Object> model, @PathVariable(value ="author") String author){
        model.put("advertesmentList", advertesmentService.searchAdList(author));
        return "advertesmentUI";
    }

    @GetMapping("/putUrAdsHere")
    public String adForm(Model model) {
        model.addAttribute("ad", new Advertesment());
        return "adForm";
    }

    @GetMapping("/putUrAdsHereDB")
    public String adFormDB(Model model){
        model.addAttribute("ad", new Advertesment());
        return "adFormDB";
    }

    @PostMapping("/aDs")
    public String adFormSubmit(Map<String ,Object> model, @ModelAttribute Advertesment addAD) {
        int nextAdvertID = advertesmentService.initList.size();
        addAD.setID(valueOf(nextAdvertID + 1));
        advertesmentService.initList.add(0, addAD);
        model.put("advertesment", addAD);
        return "result";
    }

    @PostMapping("/aDsDB")
    public String adFormSubmitDB(Map<String ,Object> model, @ModelAttribute Advertesment addAD) {
        operations.save(addAD);
        model.put("ad", addAD);
        return  "result";
    }


}
//object oriented design patterns - gang of four
