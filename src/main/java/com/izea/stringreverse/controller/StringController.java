package com.izea.stringreverse.controller;

import com.izea.stringreverse.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dvelma on 2/25/2016.
 */
@RestController
@RequestMapping("/stringreverse")
public class StringController {
    @Autowired
    StringService stringService;
    @RequestMapping(value = "/reverse",method= RequestMethod.GET)
    public String reverse(@RequestParam(value="parameter",required = true)String parameter){
        return stringService.reverse(parameter);
    }
}
