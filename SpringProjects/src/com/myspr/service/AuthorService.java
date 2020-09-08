package com.myspr.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.myspr.demo.Author;

public class AuthorService {

	public static void main(String[] args) {

		BeanFactory factory=new ClassPathXmlApplicationContext("spring.xml");
		Author author=(Author) factory.getBean("Author");
		System.out.println(author);
	}
}
