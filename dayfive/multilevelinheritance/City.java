package com.tns.dayfive.multilevelinheritance;

public class City extends State {
	private String cityName;
	private float area;
	
	public String getcityName() {
		return cityName;
	}
	
	public void setcityname(String cityName) {
		this.cityName=cityName;
	}
	
	public float getArea() {
		return area;
	}
	
	public void setArea(float area) {
		this.area=area;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", getstatename()=" + getstatename()
				+ ", getlanguage()=" + getlanguage() + ", toString()=" + super.toString() + ", getcountryname()="
				+ getcountryname() + ", getcapital()=" + getcapital() + "]";
	}
	
	
}
