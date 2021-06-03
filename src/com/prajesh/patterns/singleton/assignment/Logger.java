package com.prajesh.patterns.singleton.assignment;

public class Logger implements Cloneable{

	public static String message;
	public static Logger instance;
	private Logger() {
		
	}
	
	public static void log(String message) {
	if(instance==null) {
		synchronized (Logger.class) {
			instance=new Logger();
		}
	  }
	  Logger.message=message;
	  logger();
	}
	
	private static void logger() {
		System.out.println(message);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
