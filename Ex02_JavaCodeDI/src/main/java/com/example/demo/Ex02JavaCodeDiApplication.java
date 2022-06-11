package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.bean.Config;
import com.example.demo.bean.Member;
import com.example.demo.bean.Printer;

//@SpringBootApplication
public class Ex02JavaCodeDiApplication {

	/**
	 * ������ ��Ʈ�� @SpringBootApplication ������̼ǿ� ���� �ڵ����� ������ �̷������ ������Ʈ�� ����� �Ǳ� ������ ���� �ּ� ó���Ͽ� �ڵ� ����� ���´�.
	 * ���� ���۾����� IoC ���ؽ�Ʈ�� �����. 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//SpringApplication.run(Ex02JavaCodeDiApplication.class, args);
		
		// 1. IoC �����̳� ����
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		// 2. Member Bean ��������
		Member member1 = (Member)context.getBean("member1");
		member1.print();
		
		// 3. Member Bean ��������
		Member member2 = (Member)context.getBean("hello");
		member2.print();
		
		// 4. Printer Bean ��������
		Printer printer = context.getBean("printerB", Printer.class);
		member1.setPrinter(printer);
		member1.print();
		
		// 5. singleton ���� Ȯ��
		if(member1 == member2) {
			System.out.println("������ ��ü");
		} else {
			System.out.println("�ٸ� ��ü");
		}
		
	}

}
