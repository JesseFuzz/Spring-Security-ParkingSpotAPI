package com.api.parkingcontrol.controller.view;

import com.api.parkingcontrol.configs.security.WebSecurityConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class ParkingSpotView {


    WebSecurityConfig getAllParkingSpots;

    @GetMapping
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("page");
        return mv;
    }

}
