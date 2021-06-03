package com.prajesh.patterns.singleton;

import com.prajesh.patterns.singleton.assignment.Logger;

public class Test implements Runnable {

	private Thread t;
	private String threadName;
	
	public Test(String name) {
		threadName=name;
		System.out.println("Creating "+ name);
	}

	@Override
	public void run() {
		System.out.println("Running -> " + threadName);
		try {
			for (int i = 0; i < 100; ++i) {
				Logger.log(threadName+" "+"hello"+i);
//				System.out.println("Thread: " + threadName+" , " + i);
				Thread.sleep(50);

			}
		} catch (InterruptedException e) {
			System.out.println("Thread: " + threadName + " interrupted.");
		}
		System.out.println("Thread "+threadName+" exiting.");
	}
	
	public void start() {
		System.out.println("Starting "+ threadName);
		if(t==null) {
			t=new Thread(this,threadName);
			t.start();
		}
	}

	public static void main(String[] args) {
		Test test1=new Test("DateUtilCheck1");
		Test test2=new Test("DateUtilCheck2");
		Test test3=new Test("DateUtilCheck3");
		Test test4=new Test("DateUtilCheck4");
		Test test5=new Test("DateUtilCheck5");

		test1.start();
		test2.start();
		test3.start();
		test4.start();
		test5.start();
	
		

	}

}
