package com.som_itsolutions.training.java.exampleeventlistener;

public class CheckBox extends Widget{
	private boolean checked;
	
	public CheckBox() {
		// TODO Auto-generated constructor stub
		checked = false;
	}

	public boolean isChecked(){
		return (checked == true);
	}
	
	public void setCheck(boolean checked){
		this.checked = checked;
	}
}
