package com.java.access2.modi2;

import com.java.access.modifier.A;
public class D extends A{

	
	
	{
		
		System.out.println(avarInstance1);   // child class
	//	System.out.println(avarInstance2); //private  not acess
	//	System.out.println(avarInstance3);  // default not aceesss
		System.out.println(avarInstance4);// only to child      //  instance variable inside instance block directly access if child 
		
		 
		System.out.println(A.avarInstance1s);
	//	System.out.println(A.avarInstance2s);// private
		
		// System.out.println(A.avarInstance3s);// default
		System.out.println(A.avarInstance4s); // static variable ibside instance block using class name
		
		
	}
	
	static{
		A nwe =new A();
		System.out.println(nwe.avarInstance1); // instance variable static block through object refrence
		//System.out.println(nwe.avarInstance2); //
	//	System.out.println(nwe.avarInstance3);//
		System.out.println(nwe.avarInstance4); 
		
		System.out.println(avarInstance1s); // static variable in side static block  directly.
	//	System.out.println(avarInstance2s);
//		System.out.println(avarInstance3s);
		System.out.println(avarInstance4s);
		
		
	}
	
	
	void InstanceD()
	{ 
		
		A new1=new A();
		
		
		
		System.out.println(new1.avarInstance1);
		//System.out.println(new1.avarInstance2);
		//System.out.println(new1.avarInstance3);
		System.out.println(new1.avarInstance4);
		
		System.out.println(avarInstance1s);
		System.out.println(avarInstance2s);
		System.out.println(avarInstance3s);
		System.out.println(avarInstance4s);
		
		
		
	}
	
	
	static void StaticD()
	{
		
		System.out.println(avarInstance1);
		System.out.println(avarInstance2);
		System.out.println(avarInstance3);
		System.out.println(avarInstance4);
		
		System.out.println(avarInstance1s);
		System.out.println(avarInstance2s);
		System.out.println(avarInstance3s);
		System.out.println(avarInstance4s);
		
		
	
	}
	
	
	abstract class nwew{
		
		
	}
	
	
	
	
	public static void main(String [] args)

	

	{   A neww=new A();
		
		
	//	System.out.println(neww.avarinstance3);
		System.out.println(neww.avarInstance1);
	//	System.out.println(neww.avarinstance2);
	//	System.out.println(neww.avarinstance4);
		
		System.out.println(A.avarInstance1s);
		System.out.println(avarInstance2s);
		System.out.println(avarInstance3s);
		System.out.println(avarInstance4s);
		
		
	}

}
