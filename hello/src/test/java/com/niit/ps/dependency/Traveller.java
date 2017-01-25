package com.niit.ps.dependency;

public class Traveller {
private int kmdistance;
private Vehicle vehicle;
public int getKmdistance() {
	return kmdistance;
}
public void setKmdistance(int kmdistance) {
	this.kmdistance = kmdistance;
}
public Vehicle getVehicle() {
	return vehicle;
}
public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}
public String getTravelDetails(){
	return "Total cost"+this.kmdistance*vehicle.getCostDeatails();
}
}
