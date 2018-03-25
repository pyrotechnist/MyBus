package com.example.longyuan.mybus.pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SchedulesItem{

	@SerializedName("destination")
	private String destination;

	@SerializedName("message")
	private String message;

	public void setDestination(String destination){
		this.destination = destination;
	}

	public String getDestination(){
		return destination;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"SchedulesItem{" + 
			"destination = '" + destination + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}