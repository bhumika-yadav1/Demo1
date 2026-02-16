package com.rays.string;

// 1. When you create String object using "" , it goes to string literal pool.
// 2. when you create String object using new keyword , it goes to the heap memory.

public class TestHeapAndLiteral {
	public static void main(String[] args) {
		
		String s1 = "Sunrays";
		String s2 = "Sunrays";
		String s3 = new String("welcome");
		String s4 = new String("welcome");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println("------------");
		System.out.println(s3.equals(s4));
		
	}

}
