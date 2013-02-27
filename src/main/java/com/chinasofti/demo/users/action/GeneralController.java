package com.chinasofti.demo.users.action;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GeneralController {
    
    @RequestMapping(value="index.do")
    public void index(Model model){
    	System.out.println(".....");
        model.addAttribute("xujj","yyyy");        
    }

}
