package com.exception;

public class Try_Catch {
	
	
	
	public static void main(String[] args) {
		int a =10;
		int b =0;
		
		
		try {
			
			String s = "Java";
			System.out.println(s.charAt(10));
			
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			
			System.out.println("I handle Arith Exception");
			
		}catch (NullPointerException e) {
			System.out.println("I handle Null pointer");
			
			
		}catch (Exception e) {
			System.out.println("i handle every Exception");
			
		}
	}
	
	
	
	
	
	

}
