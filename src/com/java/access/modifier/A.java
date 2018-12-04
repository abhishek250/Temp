package com.java.access.modifier;

public class A {
	
	//checking demo1
	
///demo eejghkj
//sa
	public int  avarInstance1; //all class
	private int  avarInstance2; //same class  no child class  
	 int  avarInstance3;// package   default/package
	protected int  avarInstance4;  //samep pack + other pack child
	

	static public int  avarInstance1s;
	static private int  avarInstance2s;
	  static int  avarInstance3s;
 static protected int  avarInstance4s;
 
 public static void main(String[] args) {

	 A data1=new A();
	 System.out.println(data1.avarInstance1);  // inside the same class 
	 System.out.println(data1.avarInstance2);// instance variable inside static block using object reference (directly)
	 System.out.println(data1.avarInstance3);
	 System.out.println(data1.avarInstance4);
	 
	 System.out.println(avarInstance1s); // static variable inside static block directly access
	 System.out.println(avarInstance2s);
	 System.out.println(avarInstance3s);
	 System.out.println(avarInstance4s);
	 
	 
	 
}
 
 
 
 
 
 
 {
	 

System.out.println(avarInstance1s); // instance variable inside instance block directly access
System.out.println(avarInstance2s);
System.out.println(avarInstance3s);
System.out.println(avarInstance4s);

System.out.println(avarInstance1s);  // static variable inside instance block directly access
System.out.println(avarInstance1s);
System.out.println(avarInstance1s);
System.out.println(avarInstance1s);

 }
 
	static{
		
		A data4=new A();
		
		System.out.println("inside static block");
		System.out.println(A.avarInstance1s);     //  inside static block
		System.out.println(avarInstance2s); //  static varible directly access
		System.out.println(avarInstance3s);
		System.out.println(avarInstance4s);
		
		
		System.out.println(data4.avarInstance1);
		System.out.println(data4.avarInstance2);  // instance variable inside static block throght object refernce
		System.out.println(data4.avarInstance3);
		System.out.println(data4.avarInstance4);
		
	}
	

	public void instanceMeth()
	
	{
	 
		
		
   
		System.out.println(avarInstance1);   // instance method
		System.out.println(avarInstance2);// instance variable inside instance block  directly access
		System.out.println(avarInstance3);
		System.out.println(avarInstance4);
		
		System.out.println(avarInstance1s);
		System.out.println(avarInstance2s);//static variable
		System.out.println(avarInstance3s);// directly access
		System.out.println(avarInstance4s);
		
	}
	
	public static void staticMeth()
	
	
	{
		
	A data3=new A();
		
		System.out.println(data3.avarInstance1);
		System.out.println(data3.avarInstance2); // inside static method   // you have to create object here then only you can access
		System.out.println(data3.avarInstance3);// instance varaible throght object refrence
		System.out.println(data3.avarInstance4);
		
		
		System.out.println(avarInstance1s);
		System.out.println(avarInstance3s); // static area static varaible directly access
		System.out.println(avarInstance2s);
		System.out.println(avarInstance4s);
	}	
	
}
