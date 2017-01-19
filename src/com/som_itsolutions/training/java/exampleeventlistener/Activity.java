package com.som_itsolutions.training.java.exampleeventlistener;

public class Activity implements Widget.OnClickEventListener
{
    public Button mButton;/* = new Button();*/
    public CheckBox mCheckBox;/* = new CheckBox();*/
    private static Activity mActivityHandler;
    
    public static Activity getActivityHandle(){
    	return mActivityHandler;
    }
    
   /* private void addListener(){
    	mButton.setOnClickEventListner(this);
    	mCheckBox.setOnClickEventListner(this);
    }*/
    public Activity ()
    {
    	mActivityHandler = this;
    	mButton = new Button();
    	mButton.setOnClickEventListner(this);
    	mCheckBox = new CheckBox();
    	mCheckBox.setOnClickEventListner(this);
    	} 
    public void onClick (Widget source)
    {
    	if(source == mButton){
    		mButton.setButtonText("Thank you for clicking me...");
        	System.out.println(((Button) mButton).getButtonText());
    	}
    	if(source == mCheckBox){
    		if(mCheckBox.isChecked()==false){
    			mCheckBox.setCheck(true);
    			System.out.println("The checkbox is checked...");
    		}
    		else{
    			mCheckBox.setCheck(false);
    			System.out.println("The checkbox is not checked...");
    		}		
    	}
    }
    
    //This method will be called by framework
    public void doSomeWork(Widget source){
    	//addListener();
    	source.clickEvent();
    }   
}
