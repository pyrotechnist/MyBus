package com.example.longyuan.mybus.pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Metadata{

	@SerializedName("call")
	private String call;

	@SerializedName("date")
	private String date;

	@SerializedName("version")
	private int version;

	public void setCall(String call){
		this.call = call;
	}

	public String getCall(){
		return call;
	}

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setVersion(int version){
		this.version = version;
	}

	public int getVersion(){
		return version;
	}

	@Override
 	public String toString(){
		return 
			"Metadata{" + 
			"call = '" + call + '\'' + 
			",date = '" + date + '\'' + 
			",version = '" + version + '\'' + 
			"}";
		}
}