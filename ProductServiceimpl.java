package com.Store.Store.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.Store.Store.entities.Product;

@Service
public class ProductServiceimpl implements ProductService {

	List<Product> list;
	
	public ProductServiceimpl() {
		list=new ArrayList<>();
		list.add(new Product(145,"Corn Flakes","Nice Cerial",50));
		list.add(new Product(1451,"Corn Kernels","Golden Corn",25));
		list.add(new Product(51,"Potato Chips","Layys",10));
		list.add(new Product(45,"Dark Chocolate","Amul",100));
	}
	
	
	@Override
	public List<Product> getProducts() {
		return list;
	}


	@Override
	public Product getProduct(long productId) {
		Product c = null;
		for(Product product:list)
		{
			if(product.getId()==productId)
			{
				c=product;
				break;
			}
		}
		return c;
	}


	@Override
	public Product addProduct(Product product) {
		list.add(product);
		return product;
	}


	@Override
	public Product updateProduct(Product product) {
		list.forEach(e -> {
			if(e.getId() == product.getId()) {
				e.setTitle(product.getTitle());
				e.setDescription(product.getDescription());
				e.setPrice(product.getPrice());
			}
		});
		return product;
	}


	@Override
	public void deleteProduct(long parseLong) {
		list=this.list.stream().filter(e -> e.getId()!=parseLong).collect(Collectors.toList());
	}
}
