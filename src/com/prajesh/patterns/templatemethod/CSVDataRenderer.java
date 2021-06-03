package com.prajesh.patterns.templatemethod;

public class CSVDataRenderer extends DataRenderer{

	@Override
	public Object readData() {
		return "Reading data";
	}

	@Override
	public Object processData(Object data) {
		return data+" using CSV Data Renderer";
	}

}
