package com.java.access.modifier;

public class C {
	
	public static void main(String[] args) {
		
		C objC=new C();
		A obja=new A();
		objC.instanceC();
		
		
		 System.out.println(obja.avarInstance1);          // non child same package
		 // System.out.println(obja.avarInstance2); // you have to create object of A here
		 System.out.println(obja.avarInstance3); // instance variable inside static block thorgh object reference
		 System.out.println(obja.avarInstance4);

		 
		 System.out.println(A.avarInstance1s);
	//	 System.out.println(A.avarinstance2s);
		 System.out.println(A.avarInstance3s);        // static variable  inside static block through static reference(class name)
		 System.out.println(A.avarInstance4s);
		
	}	
	
	
	
	
	{
		A newdata=new A();
	   
		 System.out.println(newdata.avarInstance1);	
	//	 System.out.println(A.avarInstance2);     // private
		 System.out.println(newdata.avarInstance3);  //instance varaible inside instance block non child through object reference
		 System.out.println(newdata.avarInstance4);

		 
		 System.out.println(A.avarInstance1s);
	  //   System.out.println(A.avarInstance2s);  // static variable inside instance block non child throgh static refrernce
		 System.out.println(A.avarInstance3s);
		 System.out.println(A.avarInstance4s);
		
	}
	
	
	
	public void instanceC()
	
	
	{
		
		A objaa=new A();
		 System.out.println(objaa.avarInstance1); // instance block
		// System.out.println(objaa.avarInstance2);// instaance variable inisde instance block non chilld through object refrence
		 System.out.println(objaa.avarInstance3);
		 System.out.println(objaa.avarInstance4);

		 
		 System.out.println(B.avarInstance1s);  // static varaiblr through static reference
		// System.out.println(B.avarInstance2s);
		 System.out.println(B.avarInstance3s);
		 System.out.println(B.avarInstance4s);
		
	}
	
	
  static void staticC()
	{
		 System.out.println(obja.avarinstance1);
		 System.out.println(obja.avarinstance2);
		 System.out.println(obja.avarinstance3);  // thorugh object refrence of class A
		 System.out.println(obja.avarinstance4);

		 
		 System.out.println(A.avarInstance1s);   // static refrence of class
	   //7  System.out.println(A.avarInstance2s);
		 System.out.println(A.avarInstance3s);
		 System.out.println(A.avarInstance4s);
		
		
	}
	
	


	static{
		
		
		
		
	}
	
	
}
