package hyder.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 杨欢
 * @created: 2019/9/1 下午6:12
 * @description:
 */
@RestController
public class HomeController {

	@GetMapping("/hello.html")
	public String Hello(){
		return "hello, Spring-Boot";
	}
}
