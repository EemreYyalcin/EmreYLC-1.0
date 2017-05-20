//package com.emreylc.data.executors;
//
//import java.util.List;
//
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.emreylc.data.entities.Account;
//import com.emreylc.services.AccountService;
//
//public class Application {
//
//	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
//		AccountService accountService = context.getBean(AccountService.class);
//
//		Account account = new Account("emreylc", "emreylc123");
//
//		accountService.getRepo().save(account);
//		displayElementsAccount("ACCOUNTS", accountService.getRepo().findAll());
//
//	}
//
//	private static void displayElementsAccount(String prefix, List<Account> objects) {
//		for (Object object : objects) {
//			System.out.println(prefix + " ==> " + object.toString());
//		}
//	}
//}
