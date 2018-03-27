package com.example.longyuan.mybus.pojo.schedule;

import javax.annotation.Generated;

import com.example.longyuan.mybus.pojo.Metadata;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SchedulesResponse{

	@SerializedName("result")
	private Result result;

	@SerializedName("_metadata")
	private Metadata metadata;

	public void setResult(Result result){
		this.result = result;
	}

	public Result getResult(){
		return result;
	}

	public void setMetadata(Metadata metadata){
		this.metadata = metadata;
	}

	public Metadata getMetadata(){
		return metadata;
	}

	@Override
 	public String toString(){
		return 
			"SchedulesResponse{" + 
			"result = '" + result + '\'' + 
			",_metadata = '" + metadata + '\'' + 
			"}";
		}
}