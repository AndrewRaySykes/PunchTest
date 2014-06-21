package com.andrewraysykes.punchtest;

import hirondelle.date4j.DateTime;

public class PayTime {
	
	private int id;
	private DateTime punchIn;
	private DateTime punchOut;
	
	public PayTime(){}
	
	public PayTime(DateTime punchIn, DateTime punchOut) {
		super();
		this.punchIn = punchIn;
		this.punchOut = punchOut;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public DateTime getPunchIn() {
		return punchIn;
	}
	
	public void setPunchIn(DateTime punchIn) {
		this.punchIn = punchIn;
	}
	
	public DateTime getPunchOut() {
		return punchOut;
	}
	
	public void setPunchOut(DateTime punchOut) {
		this.punchOut = punchOut;
	}
	
	@Override
	public String toString() {
		return "PayTime [id=" + id + 
				", punchIn=" + punchIn.format(PunchConstants.DATETIME_FORMAT_FOR_SQL).toString() + 
				", punchOut=" + punchIn.format(PunchConstants.DATETIME_FORMAT_FOR_SQL).toString() + 
				"]";
	}

}
