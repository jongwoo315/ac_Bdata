package sss;

import java.lang.*;
public class sub {
	public static void main(String[] args) {
				
		String str = "/aaa.jpg";
		String substr = "";
		
		substr = str.substring(str.lastIndexOf("/")+1, str.lastIndexOf("."));
		System.out.println(substr);
	}
}
