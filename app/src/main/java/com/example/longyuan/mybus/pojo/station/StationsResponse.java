package com.example.longyuan.mybus.pojo.station;

import javax.annotation.Generated;

import com.example.longyuan.mybus.pojo.Metadata;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class StationsResponse{

	@SerializedName("result")
	private StationsResult mStationsResult;

	@SerializedName("_metadata")
	private Metadata metadata;

	public void setStationsResult(StationsResult stationsResult){
		this.mStationsResult = stationsResult;
	}

	public StationsResult getStationsResult(){
		return mStationsResult;
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
			"StationsResponse{" + 
			"mStationsResult = '" + mStationsResult + '\'' +
			",_metadata = '" + metadata + '\'' + 
			"}";
		}
}