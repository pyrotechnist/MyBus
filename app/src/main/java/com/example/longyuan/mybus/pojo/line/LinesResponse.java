package com.example.longyuan.mybus.pojo.line;

import javax.annotation.Generated;

import com.example.longyuan.mybus.pojo.Metadata;
import com.example.longyuan.mybus.pojo.line.LinesResult;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class LinesResponse {

	@SerializedName("result")
	private LinesResult result;

	@SerializedName("_metadata")
	private Metadata metadata;

	public void setResult(LinesResult result){
		this.result = result;
	}

	public LinesResult getResult(){
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
			"LinesResponse{" +
			"result = '" + result + '\'' + 
			",_metadata = '" + metadata + '\'' + 
			"}";
		}
}