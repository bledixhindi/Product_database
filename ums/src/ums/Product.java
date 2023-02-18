package ums;

public class Product {
	

	private int productid;
	private String name;
	private int quantity;
	private double price;
	
	public Product(int productid, String name, int quantity, double price) {
		this.productid = productid;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getProductid() {
		return productid;
	}
	public int getQuantity() {
		return quantity;
	}
	
	

	public String toString() {
		return "Product [productid=" + productid + ", name=" + name + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}
	
	
}
