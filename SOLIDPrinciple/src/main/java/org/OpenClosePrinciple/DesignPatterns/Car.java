package org.OpenClosePrinciple.DesignPatterns;

public class Car extends Product{
	@Override
	public double calTaxIncludePrice() {
		return getBasePrice()*1.60*1.18;
	}

}
