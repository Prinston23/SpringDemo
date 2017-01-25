package com.niit.ps.dependency;

public class Car implements Vehicle  {
	private double costperkm;

	public double getCostperkm() {
		return costperkm;
	}

	public void setCostperkm(double costperkm) {
		this.costperkm = costperkm;
	}

	public double getCostDeatails() {
		// 
		return this.costperkm;
	}

}
