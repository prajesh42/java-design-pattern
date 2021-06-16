package com.prajesh.patterns.command;

public class Person {

	public static void main(String[] args) {
		Television television=new Television();
		Command onCommand=new OnCommand(television);
		RemoteControl remoteControl;
		remoteControl=new RemoteControl(onCommand);
		remoteControl.pressButton();
		
		Command offCommand=new OffCommand(television);
		remoteControl=new RemoteControl(offCommand);
		remoteControl.pressButton();
	}
}
