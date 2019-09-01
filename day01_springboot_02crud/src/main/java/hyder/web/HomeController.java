package hyder.web;

import hyder.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 杨欢
 * @created: 2019/9/1 下午6:12
 * @description:
 */
@RestController
@Slf4j
@RequestMapping("user")
public class HomeController {

	@Autowired
	private UserService userService;

	@GetMapping("/hello.html")
	public String Hello(){
		log.debug("哈哈哈哈");
		return "hello, Spring-Boot";
	}

	@GetMapping("{id}")
	public String getUser(@PathVariable("id") Long id){
		return userService.getUser(id).toString();
	}
}
