package cn.itcast.mybatis.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.mybatis.dao.UserDao;

public class UserDaoTest {

	
	
	
	public static void main(String[] args) {
		ApplicationContext  app=   new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	
	   UserDao userDao = app.getBean(UserDao.class);
	   User user = userDao.findById(27);
	   System.out.println(user);
	}
}
