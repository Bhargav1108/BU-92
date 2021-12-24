package p1.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import p1.Laptop;
import p1.Mobile;

public class Test {

	public static void main(String[] args) {

		// IOC container
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Laptop laptop = context.getBean(Laptop.class);
		laptop.boot();

		Mobile mobile = context.getBean(Mobile.class);
		mobile.on();

	}
}