package ssm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jiangbo.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)//表示继承了SpringJunit4ClassRunner类
@ContextConfiguration(locations={"classpath:spring-applicationContext.xml"})
public class UserTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void textGetUserById(){
		//Assert.notNull();
		System.out.println(userService.getUserById(1).getUserName());
	}

}
