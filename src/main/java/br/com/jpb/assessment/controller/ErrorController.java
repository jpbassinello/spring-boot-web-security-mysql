package br.com.jpb.assessment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Slf4j
public class ErrorController extends AbstractController {

	@RequestMapping(value = "/404", method = RequestMethod.GET)
	public String notFound() {
		return "404";
	}

	@RequestMapping(value = "/500", method = RequestMethod.GET)
	private String badRequest() {
		return "500";
	}

}