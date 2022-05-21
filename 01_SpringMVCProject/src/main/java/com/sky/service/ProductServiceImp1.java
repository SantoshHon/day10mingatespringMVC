package com.sky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.domain.Product;
import com.sky.repository.ProductRepository;
@Service
public class ProductServiceImp1 implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		System.out.println("in Service");
		if (product.getPrice() > 20) {
			productRepository.addProduct(product);
		}

	}

	@Override
	public List<Product> getProduct() {
		return productRepository.getProduct();
	}

}
