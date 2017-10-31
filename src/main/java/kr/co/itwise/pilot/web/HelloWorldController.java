package kr.co.itwise.pilot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	public String getHelloWolrd(Model model) {
		
		return "hello";
	}
}