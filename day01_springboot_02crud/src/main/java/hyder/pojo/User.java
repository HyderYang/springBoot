package hyder.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author: 杨欢
 * @created: 2019/9/1 下午6:04
 * @description:
 */
@Data
public class User {
	private Long id;
	private String userName;
	private String password;
	private String name;
	private Integer age;
	private Integer sex;
	private Date birthday;
	private Date created;
	private Date updated;
}
