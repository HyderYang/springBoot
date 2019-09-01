package hyder.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: 杨欢
 * @created: 2019/9/1 下午4:29
 * @description:
 *        org.projectlombok
 * 	        lombok
 * 	        此依赖 加上注解 Data
 * 	        在编译器自动生成 getter/setter 方法
 */
@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {
	String url;
	String driverClassName;
	String username;
	String password;
}
