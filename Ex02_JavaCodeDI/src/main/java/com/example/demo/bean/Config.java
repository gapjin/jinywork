package com.example.demo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	/*
	 * Bean : Spring�� IoC ������� �����ϴ� ��ü
	 * BeanFactory : Ioc�� ����ϴ� �ٽ� �����̳�
	 * Application Context : BeanFactory �� Ȯ���� IoC �����̳�
	 */
	
	@Bean
	public Member member1() {
		// Setter Injection (Setter �޼��带 �̿��� ������ ����)
		Member member1 = new Member();
		member1.setName("ȫ�浿");
		member1.setNickname("����");
		member1.setPrinter(new PrinterA());
		
		return member1;
	}
	
	@Bean(name = "hello")
	public Member member2() {
		// Constructor Injection (�����ڸ� �̿��� ������ ����)
		return new Member("����ġ","����",new PrinterA());
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
