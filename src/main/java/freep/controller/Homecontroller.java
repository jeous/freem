package freep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Server on 2017/12/27.
 */
@Controller
public class Homecontroller {
    @RequestMapping("/index")
    public String getIndex(){
        return "welcome";
    }
}
