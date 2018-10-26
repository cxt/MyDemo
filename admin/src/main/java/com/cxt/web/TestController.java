package com.cxt.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author Administrator
 * date   2018/10/22
 */
@Controller
public class TestController {

    @RequestMapping("test")
    public String test(){
        return "index";
    }
}
