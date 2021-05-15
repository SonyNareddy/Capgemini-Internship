package com.capg.basic.SpringMVCapp1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;


@RestController
public class MyRestController {
	
	@Autowired
	ProductDAOImpl dao;
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello";
	}
    
	//            localhost:9090:\product\10000\40000
	//  endpoint :- www.abc.com\product\10000\40000
	@GetMapping("/product/{r1}/{r2}")
	public List<Product> getProductsbyrange(@PathVariable int r1 ,@PathVariable int r2)
	{
		return dao.getProductsByRange(r1, r2);
	}
	
	// ..../product/101
	@GetMapping("/productbyid/{searchid}")
	public Product getProductByid(@PathVariable int searchid)
	{
		return dao.getProductById(searchid);
	}
	
	
	@GetMapping("/productbyname/{searchname}")
	public Product getProductByname(@PathVariable String searchname)
	{
		return dao.getProductByName(searchname);
	}
	
	
	@PostMapping("/addProduct")
	public Product insertProduct(@RequestBody Product product)
	{
		if(dao.doAdd(product))
		{
			return product;
		}
		else 
			return null;
	}
	
	@PutMapping("/updateProduct")
	public Product updateproduct(@RequestBody Product product)
	{
		return dao.doUpdate(product, product.getProductId());
	}
	
	@GetMapping("/deleteproduct/{id}")
	public String deleteproduct(@PathVariable int id)
	{
		boolean pro = dao.deleteProduct(id);
		if(pro == true)
		{
			return "Record with the given id" +id+" is deleted";
		}
		else
		{
			return id+ " not found";
		}
		//return dao.deleteProduct(id);
	}
}
