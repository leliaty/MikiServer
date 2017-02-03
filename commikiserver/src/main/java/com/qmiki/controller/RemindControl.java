package com.qmiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Muzya on 03.02.2017.
 */
@Controller
@RequestMapping("/remind")
public class RemindControl {

    @RequestMapping(value ="/get",method = RequestMethod.GET)
    @ResponseBody
    public String getReminder(ModelMap model){
        return "My reminder";
    }
}
