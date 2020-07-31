package com.study.repo;

import lombok.Data;

@Data
public class Command {
	private Object state;

	public Object execute() {
		return state;
	}

	public Command() {
		System.out.println("hello");
	}

//	@PostConstruct
	public void init() {
		System.out.println("init");
	}
}
