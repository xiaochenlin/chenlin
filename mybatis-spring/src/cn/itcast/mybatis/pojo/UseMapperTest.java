package cn.itcast.mybatis.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.mybatis.dao.UserDao;
import cn.itcast.mybatis.mapper.UserMapper;

public class UseMapperTest {

	
	
	
	public static void main(String[] args) {
		ApplicationContext  app=   new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	
	   UserMapper mapper = app.getBean(UserMapper.class);
	   User user = mapper.findById(27);
	   System.out.println(user);
	}
}
