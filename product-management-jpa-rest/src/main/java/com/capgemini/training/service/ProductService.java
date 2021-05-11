package com.capgemini.training.service;

import java.util.List;

import com.capgemini.training.entity.Product;
import com.capgemini.training.exception.ProductException;

public interface ProductService {
	public Integer addProduct(Product product) throws ProductException;
	public Product getProductById(Integer productId) throws ProductException;
	public Integer deleteProduct(Integer productId) throws ProductException;
	public List<Product> getAllProducts() throws ProductException;
	public Product updateProduct(Product product) throws ProductException;
}
