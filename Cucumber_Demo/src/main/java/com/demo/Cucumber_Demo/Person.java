package com.demo.Cucumber_Demo;

public class Person {

	private Integer distance;
	private String message;

	public void setDistance(Integer distance) {
		if(distance>0&&distance<30)
		{
			this.distance=distance;
		}
		
	}

	public void setmessage(String message) {
		// TODO Auto-generated method stub
		this.message=message;
	}

	public String getmessage() {
		// TODO Auto-generated method stub
		return this.message;
	}

}
