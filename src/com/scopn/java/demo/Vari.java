package com.scopn.java.demo;

public class Vari {
	
	
	int idVari;
	String nameVari;
	 static String compVari;
	 
	 
	 public static void main(String[] args) {
		System.out.println("Inside main method");
		Vari object1=new Vari();
		Vari object2=new Vari(1001,"Pratik");
	}
	 
	 Vari()
	 {
		 System.out.println("Inside no arg constructor");
		 
	 }
	 
	 Vari(int id, String name)
	 
	 {
		 this.idVari=id;
		 this.nameVari=name;
		 
	 }
	 
	 
	 
	 
	 {
		 
		 System.out.println("instance block");
	 }
	 
	 static{
		 
		 System.out.println("inside static block");
		 
		 
	 }
	 
	 static void staticVari()
	 {
		 System.out.println("inside static method");
		 
		 
	 }
	 
	 
	void instanceVari()
	{
		
		System.out.println("inside instance method");
		
		
	}

}
