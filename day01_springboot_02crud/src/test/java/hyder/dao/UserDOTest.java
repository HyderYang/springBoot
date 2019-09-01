package hyder.dao;

import hyder.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDOTest {

	@Autowired
	private UserDO userDO;

	@Test
	public void testQuery(){
		User user = this.userDO.selectByPrimaryKey(1L);
		System.out.println(user);
	}
}