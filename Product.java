package com.Store.Store.entities;

public class Product {
	
	private long id;
	private String Title;
	private String Description;
	private long Price;
	public Product(long id, String title, String description, long price) {
		super();
		this.id = id;
		Title = title;
		Description = description;
		Price = price;
	}
	public Product() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public long getPrice() {
		return Price;
	}
	public void setPrice(long price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", Title=" + Title + ", Description=" + Description + ", Price=" + Price + "]";
	}
	
	
}
