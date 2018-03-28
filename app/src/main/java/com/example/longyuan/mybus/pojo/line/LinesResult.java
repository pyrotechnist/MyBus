package com.example.longyuan.mybus.pojo.line;

import java.util.List;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class LinesResult {

	private List<LinesItem> lines;

	public List<LinesItem> getLines() {
		return lines;
	}

	public void setLines(List<LinesItem> lines) {
		this.lines = lines;
	}

	@Override
 	public String toString(){
		return 
			"LinesResult{" +
			"metros = '" + lines + '\'' +
			"}";
		}
}