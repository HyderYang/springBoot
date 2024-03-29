package hyder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "hyder.dao")
public class App {

	public static void main(String[] args) {
        SpringApplication.run(App.class);
	}
}
