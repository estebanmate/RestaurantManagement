/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author emtp
 */

@Controller
public class accountController {
    
    @Autowired
    
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public ModelAndView loginView(HttpServletRequest request) {
        return new ModelAndView("login.jsp");
    }
}
