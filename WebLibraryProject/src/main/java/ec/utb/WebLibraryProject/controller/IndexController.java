package ec.utb.WebLibraryProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Author: Benjamin Boson
@Controller
public class IndexController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
