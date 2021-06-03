package com.prajesh.patterns.templatemethod;

public abstract class DataRenderer {

	public void renderer() {
		Object data=readData();
		Object processedData=processData(data);
		System.out.println(processedData);
	}
	public abstract Object readData();
	public abstract Object processData(Object data);
}
