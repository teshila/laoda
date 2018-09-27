package com.ly.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ly.dao.StockDao;

public class StockTest {
	
	
public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
	StockDao dao = ac.getBean(StockDao.class);
	System.out.println(dao);
	
	Map map = new HashMap();
	map.put("code","000983");
	
	dao.getStock(map);
	
	
	//dao.save(stock);
}
}
