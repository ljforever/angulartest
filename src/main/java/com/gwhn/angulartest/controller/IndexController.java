package com.gwhn.angulartest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author banxian1804@qq.com
 * @date 2022/1/7 11:59
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView indexModelAndView(ModelAndView modelAndView){
        modelAndView.setViewName("/index.html");
        return modelAndView;
    }

    @RequestMapping("/myapp")
    public ModelAndView myappModelAndView(ModelAndView modelAndView){
        modelAndView.setViewName("/myapp.html");
        return modelAndView;
    }

    @RequestMapping("/model")
    public ModelAndView modelModelAndView(ModelAndView modelAndView){
        modelAndView.setViewName("/model.html");
        return modelAndView;
    }

    @RequestMapping("/scope")
    public ModelAndView scopeModelAndView(ModelAndView modelAndView){
        modelAndView.setViewName("/scope.html");
        return modelAndView;
    }


}
