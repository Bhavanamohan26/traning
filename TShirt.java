package com.sonata;

public class TShirt {
	String color;
	String material;
	String design;
	String Size;
	
	public TShirt(String cl,String mt,String de,String si) {
		
	
	this.color=cl;
	this.material=mt;
	this.design=de;
	this.Size=si;
	
	}
	
	public void small() {
		
		System.out.println("This is Small size");
		
	}
	
	public void Medium() {
		System.out.println("This is  medium size");
		
	}
	public void Large() {
		System.out.println("This is Large size");
	}
	
	public void display() {
		System.out.println("Color: "+color);
		System.out.println("Material: "+material);
		System.out.println("Design: "+design);
		System.out.println("Size: "+Size);
		
		
	}
	
	public static void main(String[]args) {
		TShirt t1=new TShirt("LemonYellow","cotton","printed","S");
		System.out.println();
		t1.display();
		t1.small();
		TShirt t2=new TShirt("Black","cotton","Floral","M");
		System.out.println();
		t2.display();
		t2.Large();
		TShirt t3=new TShirt("White","cotton","Plain","L");
		System.out.println();
		t3.display();
		t3.Medium();
	}
}


