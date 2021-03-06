package com.example.longyuan.mybus.pojo.schedule;

import javax.annotation.Generated;

import com.example.longyuan.mybus.pojo.Metadata;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SchedulesResponse{

	@SerializedName("mSchedulesResult")
	private SchedulesResult mSchedulesResult;

	@SerializedName("_metadata")
	private Metadata metadata;

	public void setSchedulesResult(SchedulesResult schedulesResult){
		this.mSchedulesResult = schedulesResult;
	}

	public SchedulesResult getSchedulesResult(){
		return mSchedulesResult;
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
			"mSchedulesResult = '" + mSchedulesResult + '\'' +
			",_metadata = '" + metadata + '\'' + 
			"}";
		}
}