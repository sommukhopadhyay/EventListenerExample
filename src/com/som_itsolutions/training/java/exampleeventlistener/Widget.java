package com.som_itsolutions.training.java.exampleeventlistener;

import java.util.ArrayList;
import java.util.Iterator;

public class Widget implements Events{
	
	ArrayList<OnClickEventListener> mClickEventListener = new ArrayList<OnClickEventListener>(); 
    ArrayList<OnLongClickEventListener> mLongClickEventListener = new ArrayList<OnLongClickEventListener>();
	
    @Override
	public void clickEvent() {
		// TODO Auto-generated method stub
    	Iterator<OnClickEventListener> it = mClickEventListener.iterator();
    			while(it.hasNext()){
    				OnClickEventListener li = it.next();
    				li.onClick(this);
    			}
		
	}

	@Override
	public void longClickEvent() {
		// TODO Auto-generated method stub
		Iterator<OnLongClickEventListener> it = mLongClickEventListener.iterator();
		while(it.hasNext()){
			OnLongClickEventListener li = it.next();
			li.onLongClick(this);
		}

	}
	
	public interface OnClickEventListener
	{
	    public void onClick (Widget source);
	}
	
	public interface OnLongClickEventListener
	{
	    public void onLongClick (Widget source);
	}
	
	public void setOnClickEventListner(OnClickEventListener li){
		mClickEventListener.add(li);
	}
	public void setOnLongClickEventListner(OnLongClickEventListener li){
		mLongClickEventListener.add(li);
	}
}
