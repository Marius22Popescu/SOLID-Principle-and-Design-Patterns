package org.OpenClosePrinciple.DesignPatterns;

import java.util.List;

public class Ecomerce {
	public double calculateTotalOrder(List<Product> products) {
		double orderTotal = 0;
		
		for(Product product:products) {
			orderTotal+=product.calTaxIncludePrice();
		}
		return orderTotal;
	}
}
