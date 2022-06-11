package com.example.demo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	/*
	 * Bean : Spring이 IoC 방식으로 관리하는 객체
	 * BeanFactory : Ioc를 담당하는 핵심 컨테이너
	 * Application Context : BeanFactory 를 확장한 IoC 컨테이너
	 */
	
	@Bean
	public Member member1() {
		// Setter Injection (Setter 메서드를 이용한 의존성 주입)
		Member member1 = new Member();
		member1.setName("김갑진");
		member1.setNickname("도사");
		member1.setPrinter(new PrinterA());
		
		return member1;
	}
	
	@Bean(name = "hello")
	public Member member2() {
		// Constructor Injection (생성자를 이용한 의존성 주입)
		return new Member("전우치","도사",new PrinterA());
	}
	
	@Bean
	public PrinterA printerA() {
		return new PrinterA();
	}

	@Bean
	public PrinterB printerB() {
		return new PrinterB();
	}
	
}
