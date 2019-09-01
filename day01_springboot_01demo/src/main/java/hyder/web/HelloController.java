package hyder.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: 杨欢
 * @created: 2019/9/1 下午3:16
 * @description:
 */
@Controller
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "hello, Spring Boot";
	}
}
