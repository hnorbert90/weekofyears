package com.epam.webinar.hnorbert90.hanyadikhetvan.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestWeekOfYearServiceImpl {

    @RequestMapping(value="/", method=RequestMethod.GET, produces="text/plain")
    public String getWeeksOfYear(Model model) {
        model.addAttribute("weekofyear",Calendar.getInstance().get(Calendar.WEEK_OF_YEAR)+".");
        model.addAttribute("date", new SimpleDateFormat().format(Calendar.getInstance().getTime()));
        return "index";
    }
}
