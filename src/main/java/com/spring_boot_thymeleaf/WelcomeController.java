package com.spring_boot_thymeleaf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by rakeshsoni on 7/10/17.
 */
@Controller
public class WelcomeController {
    @Value("${welcome.message:test}")
    private String message = "Hello World22";

    @RequestMapping(value = "")
    public ModelAndView welcome(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("message", this.message);
        return modelAndView;
    }
}
