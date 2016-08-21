package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Bilgisayar;

public class BilgisayarTest {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("test/app-config.xml");
		
		Bilgisayar bilgisayar=context.getBean("bilgId",Bilgisayar.class);
		
		System.out.println(bilgisayar);
		
		((ClassPathXmlApplicationContext) context).close();
		
		
	}

}
