package com.heiliuer.reservetion.page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/record")
public class MainController {


    @RequestMapping
    String record(Model model) {
        return "record";
    }


}