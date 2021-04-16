package com.java.string;

public class PalindromDemo {
public static void main(String[] args) {
	String str="rnnr";
	String[] splitstr=str.split("n");	
	for (String string : splitstr) {
		System.out.println(string);
	}
	boolean b=isPalindrom(str);
	int n=4;
	System.out.println(4%3==0);
	
}

private static boolean isPalindrom(String str) {
	StringBuilder builder=new StringBuilder();
	builder=builder.append(str);
	
	builder=builder.reverse();
	
	if (str.equalsIgnoreCase(builder.toString())) {
		return true;
	}
	return false;
}
}
