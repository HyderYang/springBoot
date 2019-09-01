package hyder.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author: 杨欢
 * @created: 2019/9/1 下午3:27
 * @description:
 */
@Configuration
//@PropertySource("classpath:jdbc.properties")
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {
//	@Value("${jdbc.url}")
//	String url;
//	@Value("${jdbc.driverClassName}")
//	String driverClassName;
//	@Value("${jdbc.username}")
//	String username;
//	@Value("${jdbc.password}")
//	String password;

//	@Bean
//	public DataSource dataSource(JdbcProperties prop){
//		DruidDataSource dataSource = new DruidDataSource();
//		dataSource.setDriverClassName(prop.driverClassName);
//		dataSource.setUrl(prop.url);
//		dataSource.setName(prop.username);
//		dataSource.setPassword(prop.password);
//		return dataSource;
//	}

	@Bean
	@ConfigurationProperties(prefix = "jdbc")
	public DataSource dataSource(){
		return new DruidDataSource();
	}
}
