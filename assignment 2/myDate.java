package assignment2;

import java.util.Date;

@SuppressWarnings("deprecation")
public class myDate {
	private int day;
	private int month;
	private int year;
		public myDate() {
		Date today = new Date();
		day = today.getDate();
		month = today.getMonth();
		year = today.getYear() + 1900;
	}
	
	public myDate(long miliseconds) {
		Date today = new Date (miliseconds);
			day = today.getDate();
			month = today.getMonth();
			year = today.getYear() + 1900;
	}
	
	public myDate(int day_, int month_, int year_) {
		day = day_;
		month = month_;
		year = year_;
	}
	
	public int returnDay(){
		return day;
	}
	
	public int returnMonth(){
		return month;
	}
	
	public int returnYear(){
		return year;
	}
	
	public void setDate(long elapsedTime) {
		Date newDate = new Date(elapsedTime);
		day = newDate.getDate();
		month = newDate.getMonth();
		year = newDate.getYear() + 1900;
	}

}
