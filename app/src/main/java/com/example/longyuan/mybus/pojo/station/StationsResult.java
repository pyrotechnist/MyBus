package com.example.longyuan.mybus.pojo.station;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class StationsResult {

	@SerializedName("stations")
	private List<StationsItem> stations;

	public void setStations(List<StationsItem> stations){
		this.stations = stations;
	}

	public List<StationsItem> getStations(){
		return stations;
	}

	@Override
 	public String toString(){
		return 
			"StationsResult{" +
			"stations = '" + stations + '\'' + 
			"}";
		}
}