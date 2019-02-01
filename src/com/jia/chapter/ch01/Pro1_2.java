package com.jia.chapter.ch01;

/**
 * 反转字符串
 * @author Administrator
 *
 */
public class Pro1_2 {
	/**
	 * reverse a string
	 * @param str  input string
	 * @return   the reversing string of str
	 */
	public String reverse(String str) {
		if(null == str || str.length() < 2) return str;
		StringBuilder sb = new StringBuilder();
		int len = str.length();
		for(int i = len - 1; i >=0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	public String reverse2(String str) {
		if(null == str || str.length() < 2) return str;
		char[] chars = str.toCharArray();
		int i = 0, j = chars.length - 1;
		while(i < j) {
			swap(chars, i, j);
			++i;
			--j;
		}
		return new String(chars);
	}
	private void swap(char[] chars, int i, int j) {
		char tempC = chars[i];
		chars[i] = chars[j];
		chars[j] = tempC;
	}
	public static void main(String[] args) {
		Pro1_2 pro1_2 = new Pro1_2();
		String str = "abcd";
		System.out.println(pro1_2.reverse2(str ));
	}
}
