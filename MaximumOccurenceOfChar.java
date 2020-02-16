package com.baburajan.geeks;

public class MaximumOccurenceOfChar {

	public static void main(String[] args) {
		System.out.println(maxOccInStr("brajanbabu"));
	}

	public static String maxOccInStr(String str) {
		String retStr = "";
		int max = 0;
		String[] strArr = str.split("");
		for (String c : strArr) {
			if (str.split(c).length > max) {
				max = str.split(c).length;
				retStr = c;
			}
		}

		return retStr;
	}

}
