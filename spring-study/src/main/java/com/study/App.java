package com.study;

import com.study.repo.CommandManager;
import com.study.repo.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@Configuration
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new
				ClassPathXmlApplicationContext( "application.xml" );
		CommandManager commandManager = ctx.getBean("commandManager", CommandManager.class);


	}
//	@PostConstruct
//	@Bean(name = "countryObj")
	public Country getCountry() {
		return new Country("India");
	}
}
