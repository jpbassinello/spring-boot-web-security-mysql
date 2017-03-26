package br.com.jpb.sbwsm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Slf4j
public class UserController extends AbstractController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String root() {
		return "redirect:/user/";
	}

	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	private String userLogin() {
		return "user/login";
	}

	@RequestMapping(value = "/user/home", method = RequestMethod.GET)
	public String userHome() {
		return "user/home";
	}
}