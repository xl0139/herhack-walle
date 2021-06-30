package com.hsbc.herhack.walle.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class HomeCtrl {
    private static final Logger LOG = Logger.getLogger("HomeCtrl");

    @GetMapping("/")
    public String homePage(Model model) {
        return "home";
    }


    @GetMapping("/candidate/login")
    public String candidateLogon(Model model) {
        return "candidate/login";
    }

    @GetMapping("/hiringmgr/login")
    public String hiringmgrlogon(Model model) {
        return "hiringmgr/login";
    }
}
