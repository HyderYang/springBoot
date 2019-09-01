package hyder.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

/**
 * @author: 杨欢
 * @created: 2019/9/1 下午3:16
 * @description:
 */
@Controller
public class HelloController {

	@Autowired
	private DataSource dataSource;

	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "hello, Spring Boot";
	}
}
