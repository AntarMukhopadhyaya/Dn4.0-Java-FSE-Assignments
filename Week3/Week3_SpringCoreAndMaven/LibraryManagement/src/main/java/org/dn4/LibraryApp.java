package org.dn4;


import org.dn4.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryApp {
   public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       BookService bookService = context.getBean("bookService",BookService.class);
       bookService.addBook("Effective Java");
   }
}