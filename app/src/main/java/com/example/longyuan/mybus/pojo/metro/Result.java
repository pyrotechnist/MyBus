package com.example.longyuan.mybus.pojo.metro;

import java.util.List;
import javax.annotation.Generated;

import com.example.longyuan.mybus.pojo.LinesItem;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Result{

	@SerializedName("metros")
	private List<LinesItem> metros;

	public void setMetros(List<LinesItem> metros){
		this.metros = metros;
	}

	public List<LinesItem> getMetros(){
		return metros;
	}

	@Override
 	public String toString(){
		return 
			"Result{" + 
			"metros = '" + metros + '\'' + 
			"}";
		}
}