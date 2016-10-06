package com.reader.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.reader.model.Article;
import com.reader.model.User;
import com.reader.service.ArticleService;
import com.reader.service.UserService;

@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/addArticle/{id}", method = RequestMethod.GET)
	public String addArticle(@PathVariable Integer id, Model model){
		User user = userService.getUserById(id);
		Article article = new Article();
		model.addAttribute("user", user);
		model.addAttribute("article", article);
		return "addArticle";
	}
	
	@RequestMapping(value = "/addArticle/{id}", method = RequestMethod.POST)
	public ModelAndView addArticle(@PathVariable Integer id, @ModelAttribute Article article) {
		article.setUserId(userService.getUserById(id));
		ModelAndView mav = new ModelAndView();
		articleService.addArticle(article);
		mav.setViewName("redirect:/success");
		return mav;
	}
}
