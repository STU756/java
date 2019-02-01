package com.jia.chapter.ch01;



/**
 * s1 =xy=waterbottle
 * x = wat
 * y = erbottle
 * s2 = yx = erbottlewat
 * 
 * yx 肯定是  xyxy子串
 * @author Administrator
 *
 */
public class Pro1_8 {
	public boolean isRotation(String s1, String s2) {
		int len = s1.length();
		if(len == s2.length() && len > 0) {
			String s1s1 = s1+s1;
			return s1s1.contains(s2);
		}
		return false;
	}
}
