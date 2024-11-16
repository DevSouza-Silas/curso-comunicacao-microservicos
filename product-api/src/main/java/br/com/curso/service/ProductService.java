package br.com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.curso.model.Product;
import br.com.curso.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public void save(Product p) {
		this.repository.save(p);
	}
	
	public List<Product> findAll() {
		return this.repository.findAll();
	}
}
