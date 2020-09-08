package com.github.sonarapp;

public class SecondApplication {
	
	public String giveName() {
		return "success";
	}
	
	public int giveGreater(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}

	public String giveGreaterNumber(int a, int b) {
		if(a > b) {
			return "a is greater than b";
		}else if(a < b) {
			return "b is greater than a";
		}else if(a == b) {
			return "both are same number";
		}else {
			return "invalid. Try again";
		}
	}
}
