package com.example.longyuan.mybus.pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class LinesItem {

	@SerializedName("code")
	private String code;

	@SerializedName("directions")
	private String directions;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setDirections(String directions){
		this.directions = directions;
	}

	public String getDirections(){
		return directions;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"LinesItem{" +
			"code = '" + code + '\'' + 
			",directions = '" + directions + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}