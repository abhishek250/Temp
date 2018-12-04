package com.java.access.modifier;

public class B extends A{
	
	//java by kiran
	public static void main(String[] args) {
		B objectb=new B();
      objectb.instanceB();
      B.staticB();
	}
	//ffabshi
	{
      System.out.println(avarInstance1);  // instance area
    //  System.out.println(avarInstance2); // instance variable  to child of parent directly access on instance area
      System.out.println(avarInstance3);
      System.out.println(avarInstance4);//because of private property of a it can not access ouside the class
      
      
      System.out.println(avarInstance1s);  // child class
      System.out.println(avarInstance1s);// static variable inside instance block directly access
      System.out.println(avarInstance1s);
      System.out.println(avarInstance1s);
	}
	/*
	static
	
	{   // B objectNew=new B();
	    
		System.out.println(objectb.avarInstance1);
	//	 System.out.println(objectNew.avarInstance2); // private
		 System.out.println(data1.avarInstance3);
		 System.out.println(data1.avarInstance4);  
		 
		 System.out.println(A.avarInstance1s);
	// 	 System.out.println(avarInstance2s);   //private
		 System.out.println(avarInstance3s);
		 System.out.println(avarInstance4s);
		
		
	}
	
	*/
	public	void instanceB()
		{   
                		
		 System.out.println(avarInstance1);   // instance area    // instance variable inside instance block directly access
		// System.out.println(avarInstance2);//private 
		 System.out.println(avarInstance3);
		 System.out.println(avarInstance4);
		 
		 
		 System.out.println(avarInstance1s);
		//private  System.out.println(avarInstance2s);  // static varaible inside inatance block directly access
		 System.out.println(avarInstance3s);
		 System.out.println(avarInstance4s);
			
			
		}
	
	public	static void staticB()
		{
		
		 B objb =new B();
		 System.out.println(objb.avarInstance1);  // static area
		 //System.out.println(objb.avarInstance2); // instance varaible inside static block  thoright object refrence
		 System.out.println(objb.avarInstance3);
		 System.out.println(objb.avarInstance4);

		 
		 System.out.println(avarInstance1s); // static vareaiblr inside static block directly access
	//	 System.out.println(avarInstance2s);
		 System.out.println(avarInstance3s);
		 System.out.println(avarInstance4s);

			
		}

	
	
	
	
	
}
