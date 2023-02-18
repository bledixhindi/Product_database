package ums;

public class Payment {

	private Product product;
	protected  double amount;
	
	public Payment(Product product, double amount) {
		this.product = product;
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	

	public Product getProduct() {
	return product;

	}
	
	public boolean ChechValidAmount() {
		double productOnSale = (product.getQuantity() * product.getPrice());
		if(productOnSale == amount) {
			
			return true;
		}
		
		
		return false;
		
	}
	
	
	
	
}
