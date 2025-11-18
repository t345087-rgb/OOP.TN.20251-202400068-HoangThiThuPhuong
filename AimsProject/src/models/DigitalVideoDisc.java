package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {
	
	public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
		super(title, category, cost, length, director);
	}
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	
	public String toString() {
		return "DVD" + super.toString()
				+ "[" + this.director + "]" 
				+ "[" + this.length + "]"; 
	}
}

