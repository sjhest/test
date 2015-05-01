package com.sjh.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sjh.service.UserService;

public class ConnetionTest {

	private ApplicationContext ctx = null;
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	@Test
	public void test() throws SQLException{
		DataSource ds = ctx.getBean(DataSource.class);
		System.out.println(ds);
		UserService us = ctx.getBean(UserService.class);
		System.out.println(us.getUserName(2));
	}

}
