package com.paulhammant.springantinteg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "api/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<String> getGreetings() throws InterruptedException {
        return new ArrayList<String>() {{
            add("hello");
            add("world");
        }};
    }

}
