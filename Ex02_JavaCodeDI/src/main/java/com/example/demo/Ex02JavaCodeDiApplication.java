package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.bean.Config;
import com.example.demo.bean.Member;
import com.example.demo.bean.Printer;

//@SpringBootApplication
public class Ex02JavaCodeDiApplication {

	/**
	 * 스프링 부트는 @SpringBootApplication 어노테이션에 의해 자동으로 설정이 이루어지고 컴포넌트가 등록이 되기 때문에 먼저 주석 처리하여 자동 등록을 막는다.
	 * 이후 수작업으로 IoC 컨텍스트를 만든다. 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//SpringApplication.run(Ex02JavaCodeDiApplication.class, args);
		
		// 1. IoC 컨테이너 생성
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		// 2. Member Bean 가져오기
		Member member1 = (Member)context.getBean("member1");
		member1.print();
		
		// 3. Member Bean 가져오기
		Member member2 = (Member)context.getBean("hello");
		member2.print();
		
		// 4. Printer Bean 가져오기
		Printer printer = context.getBean("printerB", Printer.class);
		member1.setPrinter(printer);
		member1.print();
		
		// 5. singleton 인지 확인
		if(member1 == member2) {
			System.out.println("동일한 객체");
		} else {
			System.out.println("다른 객체");
		}
		
	}

}
