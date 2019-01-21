package com.daniel.cursojava.aula35;

public class Exe01 {

	public static void main(String[] args) {
		
		System.out.println(fibonacci(6));

	}
	
	public static int fibonacci(int n) {
		
		if(n==0) {
			
			return 0;
		}
	    else 
	    if(n==1 || n==2) {
	    	
	    	return 1;
	    }
	    else {
	    	
	    	return fibonacci(n-1) + fibonacci(n-2);
	    }	      
	}
}
