package com.example.longyuan.mybus.pojo.schedule;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SchedulesResult {

	@SerializedName("schedules")
	private List<SchedulesItem> schedules;

	public void setSchedules(List<SchedulesItem> schedules){
		this.schedules = schedules;
	}

	public List<SchedulesItem> getSchedules(){
		return schedules;
	}

	@Override
 	public String toString(){
		return 
			"SchedulesResult{" +
			"schedules = '" + schedules + '\'' + 
			"}";
		}
}