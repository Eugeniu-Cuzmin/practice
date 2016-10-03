package com.reader.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.reader.model.User;
import com.reader.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String openRegisterPage(ModelMap model) {
		User user = new User();
		model.addAttribute("user", user);
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(@ModelAttribute @Valid User user,
			BindingResult result,
			final RedirectAttributes redirectAttributes) {
		
		if (result.hasErrors())
			return new ModelAndView("error");
		
		ModelAndView mav = new ModelAndView();
		userService.addUser(user);
		mav.setViewName("redirect:/success");
		return mav;
	}
	
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String success() {
		return "success";
	}
	
	@RequestMapping(value = "/allUsers", method = RequestMethod.GET)
	public String allUsers(Model model){
		List<User> users = userService.findAll();
		model.addAttribute("users", users);
		return "allUsers";
	}
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public String getUserById(@PathVariable Integer id, ModelMap model) {
		User user = userService.getUserById(id);
		model.addAttribute("user", user);
		return "user";
	}
}
