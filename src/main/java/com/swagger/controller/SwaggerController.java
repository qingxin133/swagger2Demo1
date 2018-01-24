package com.swagger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("测试类")
@Controller
public class SwaggerController {
    
    @ApiOperation(value="测试方法",httpMethod="GET")
    @RequestMapping(value="/test",method=RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "hello word!!!";
    }

}