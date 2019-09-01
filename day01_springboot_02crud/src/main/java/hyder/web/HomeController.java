package hyder.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 杨欢
 * @created: 2019/9/1 下午6:12
 * @description:
 */
@RestController
@Slf4j
public class HomeController {

	@GetMapping("/hello.html")
	public String Hello(){
		log.debug("哈哈哈哈");
		return "hello, Spring-Boot";
	}
}
