package com.prajesh.patterns.templatemethod;

public class XMLDataRenderer extends DataRenderer{

	@Override
	public Object readData() {
		return "Reading data";
	}

	@Override
	public Object processData(Object data) {
		return data+" using XML Data Renderer";
	}

}
