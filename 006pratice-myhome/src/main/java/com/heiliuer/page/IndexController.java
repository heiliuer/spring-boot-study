package com.heiliuer.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {


    @RequestMapping
    String index() {
        return "redirect:/record";
    }


}