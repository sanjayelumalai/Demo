package com.exception;

public class throw_throws {
	
	public static void main(String[] args) throws smithException {
		
		int a = 500;
		int b =1000;
		
		
		if (a>b) {
			System.out.println("TRUE");
			
		}else {
			
			throw new smithException();
		}
		
		
		
	}
	
	
	
	
	

}
