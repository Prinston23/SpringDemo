package com.niit.ps.hello;

public class GreetingImpl implements Greetings {
private String message;


public String getMessage() {
	return message;
}


public void setMessage(String message) {
	this.message = message;
}


public String sayGreetings() {
		return this.message;
	}

}
