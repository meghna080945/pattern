package com.practice.java;

class Pattern  implements Runnable
{ 
      

	static void printn(int num) 
	{ 
	    if (num == 0) 
	        return; 
	    System.out.print ("* "); 
	    printn(num - 1); 
	} 
	  
	static void pattern(int n, int i) 
	{ 
	    if (n == 0) 
	        return; 
	    printn(i); 
	    System.out.println(); 
	    pattern(n - 1, i + 1); 
	} 
	  

@Override
public void run() {
	// TODO Auto-generated method stub
	pattern(5,1);
} 
} 