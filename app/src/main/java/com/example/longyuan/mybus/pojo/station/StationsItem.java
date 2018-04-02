package com.example.longyuan.mybus.pojo.station;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class StationsItem{

	@SerializedName("name")
	private String name;

	@SerializedName("slug")
	private String slug;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	@Override
 	public String toString(){
		return 
			"StationsItem{" + 
			"name = '" + name + '\'' + 
			",slug = '" + slug + '\'' + 
			"}";
		}
}