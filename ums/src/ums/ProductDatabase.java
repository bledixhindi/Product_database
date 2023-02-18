package ums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ProductDatabase {
	
	ArrayList<Product> products;
	
	public ProductDatabase() {
		
		products = new ArrayList<Product>();
		
	}
	
	public Product getProduct(int index) {
		return products.get(index);
	}
	
	public boolean soryByPrice() {
		
		        Collections.sort(products, new Comparator<Product>() {

		            public int compare(Product prod1, Product prod2) {
		                if (prod1.getPrice() < prod2.getPrice()) {
		                    return -1;
		                } else if (prod1.getPrice() > prod2.getPrice()) {
		                    return 1;
		                } else {
		                    return 0;
		                }
		            }
		        });
				return false;
		   
	}
	
	public static double calculateRevenue(ArrayList<Product> products) {
	    double total = 0;
	    for (Product item : products) {
	        total += item.getPrice();
	    }
	    return total;
	}
	
	public static int countExpensiveProducts(ArrayList<Product> products) {
		int count = 0;
		
		for (Product item : products) {
			if(item.getPrice()>10) {
				 count++;
			}
		}
		return count;

		
	}

	
	
	


}
