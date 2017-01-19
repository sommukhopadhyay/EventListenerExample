package com.som_itsolutions.training.java.exampleeventlistener;

public class OtherClass implements Widget.OnClickEventListener{
	Button mButton;
	//Constructor
	public OtherClass(){
		mButton = Activity.getActivityHandle().mButton;
		mButton.setOnClickEventListner(this);
	}
	
	@Override
	public void onClick(Widget source) {
		// TODO Auto-generated method stub
		if(source == mButton){
			System.out.println("Other Class has also received the event notification...");
		}
	}

}
