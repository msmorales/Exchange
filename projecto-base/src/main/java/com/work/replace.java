package com.work;

public class replace {
	
	public static String replaceMethod(String body) {
		body = body.replaceAll("n", "ñ");
		body = "<body>" + body + "</body>";
		return body;
		}

}
