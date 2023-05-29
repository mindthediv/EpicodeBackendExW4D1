package com.w4d1.w4d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.w4d1.w4d1.Topping.toppings;

import beanConfig.ConfigurationBean;

@SpringBootApplication
public class W4d1Application {

	public static void main(String[] args) {
		SpringApplication.run(W4d1Application.class, args);
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationBean.class);

		//Pizze
		Pizza margherita = (Pizza) appContext.getBean("margherita");
		margherita.setCal(1104);
		margherita.setPrice(4.99);
		Pizza hawaian = (Pizza) appContext.getBean("hawaianPizza");
		hawaian.setCal(1024);
		hawaian.setPrice(6.49);
		Pizza salami = (Pizza) appContext.getBean("salamiPizza");
		salami.setCal(1160);
		salami.setPrice(5.99);
		Drink lemonade = (Drink) appContext.getBean("lemonade");
		Drink water = (Drink) appContext.getBean("water");
		Drink wine = (Drink) appContext.getBean("wine");
		Merch shirt = (Merch) appContext.getBean("shirt");
		Merch mug = (Merch) appContext.getBean("mug");
	
		System.out.println("Pizzas------------------------");
		margherita.showPizza();
		hawaian.showPizza();
		salami.showPizza();
		System.out.println("Toppings------------------------");
		for (toppings t : toppings.values()) {
			Topping top = new Topping(t);
			top.setCal(46);
			top.setPrice(0.69);
			System.out.println(top);
		}
		System.out.println("Drinks------------------------");
		lemonade.showDrink();
		water.showDrink();
		wine.showDrink();
		System.out.println("Franchise------------------------");
		shirt.showMerch();
		mug.showMerch();

		appContext.close();
	}


}
