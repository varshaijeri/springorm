package com.varsha.springcore.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.varsha.springcore.springorm.product.dao.ProductDao;
import com.varsha.springcore.springorm.product.model.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/varsha/springcore/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) ctx.getBean("productDaoImpl");

//insert new product
		Product product = new Product();
//		product.setId(1);
//		product.setName("camera");
//		product.setDesc("used to take pictures");
//		product.setPrice(10.88);
//		int result = productDao.create(product);
//		System.out.println("Number of records inserted: " + result);
//		product.setId(2);
//		product.setName("tea powder");
//		product.setDesc("used to make tea");
//		product.setPrice(2.50);
//		result = productDao.create(product);
//		System.out.println("Number of records inserted: " + result);
		
//update the record
//		product.setId(2);
//		product.setName("tea powder");
//		product.setDesc("used to make tea");
//		product.setPrice(3.50);
//		productDao.update(product);

//delete the record
//		product.setId(2);
//		productDao.delete(product);

//read a single record
//		product = productDao.read(1);
//		System.out.println("Product details: "+product);
		
//read all data
		List<Product> products = productDao.readAll();
		System.out.println("All products: \n"+products);

	}

}
