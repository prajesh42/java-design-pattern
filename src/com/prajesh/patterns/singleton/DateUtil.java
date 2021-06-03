package com.prajesh.patterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable {
	private static final long serialVersionUID = 1L;
	/*
	 * volatile ensures that the cache data is not created for the object and the
	 * data is directly accessed from main memory
	 */
	private static volatile DateUtil instance;

	/*
	 * Eager Initialization
	 * 
	 * This approach should be considered only when you are sure that this method
	 * will be called at least once.
	 */
//	private static DateUtil instance=new DateUtil();
//   static {
//	   instance=new DateUtil();
//   }
	private DateUtil() {

	}

	// 1st technique
//	public static synchronized DateUtil getInstance() {
//		if (instance == null) {
//			instance = new DateUtil();
//		}
//		return instance;
//	}

	// 2nd technique
	public static DateUtil getInstance() {
		if (instance == null) {
			
			/*
			 * Handle multiple threads
			 * 
			 * Using synchronized ensures that the method will be accessed by only one
			 * thread at a time.
			 */
			synchronized (DateUtil.class) {
					instance = new DateUtil();
			}
		}
		return instance;
	}

//	public static DateUtil getInstance() {
//			if (instance == null) {
//				instance = new DateUtil();
//			}	
//		return instance;
//	}

	// readResolve resolves the serialization and deserialization issue
	public Object readResolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
}
