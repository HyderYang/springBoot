package hyder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

/**
 * @author: 杨欢
 * @created: 2019/9/1 下午3:12
 * @description:
 */
@SpringBootApplication
public class BootDemoApplication {

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class);
	}
}
