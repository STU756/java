package com.jia.chapter.ch01;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串，一个字符串重排列后是否变成另外一个字符串
 * @author Administrator
 *
 */
public class Pro1_3 {

	/**
	 * 给定两个字符串，一个字符串重排列后是否变成另外一个字符串
	 * 如果可以返回true，否则返回false
	 * @param str1
	 * @param str2
	 * @return 
	 */
	public boolean isSameStr(String str1, String str2) {
		int[] dic = new int[65535];
		for(int i = 0; i < str1.length(); i++) {
			++dic[str1.charAt(i)];
		}
		for(int i = 0; i < str2.length(); i++) {
			char c = str2.charAt(i);
			if(dic[c] == 0) {
				return false;
			}else {
				--dic[c];
			}
		}
		for(int i = 0; i < dic.length; i++) {
			if(dic[i] != 0) return false;
		}
		return true;
	}
	
	public boolean isSameStr2(String str1, String str2) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			int count = map.containsKey(c)? map.get(c) + 1 : 1;
			map.put(c, count);
		}
		for(int i = 0; i < str2.length(); i++) {
			char c = str2.charAt(i);
			int count = map.containsKey(c)? map.get(c) : 0;
			if(count == 0) return false;
			if(count == 1) {
				map.remove(c);
			}else {
				map.put(c, count - 1);
			}
		}
		return map.size() == 0? true : false;
	}
	public static void main(String[] args) {
		Pro1_3 pro1_3 = new Pro1_3();
		String str1 = "abcd";
		String str2 = "badc";
		System.out.println(pro1_3.isSameStr2(str1, str2));
		System.out.println(pro1_3.isSameStr(str1, str2));
	}
}
