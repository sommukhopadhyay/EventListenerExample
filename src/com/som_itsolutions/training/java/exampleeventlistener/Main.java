package com.som_itsolutions.training.java.exampleeventlistener;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Activity a = new Activity();
		OtherClass o = new OtherClass();
		
		a.doSomeWork(a.mButton);
		a.doSomeWork(a.mCheckBox);
	}

}
