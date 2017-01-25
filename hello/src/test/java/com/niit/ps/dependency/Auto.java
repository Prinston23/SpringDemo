package com.niit.ps.dependency;

import com.niit.ps.dependency.Vehicle;

public class Auto  implements Vehicle{
private double price;

	public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

	public double getCostDeatails() {
		
		return this.price;
	}

}
