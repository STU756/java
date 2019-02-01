package com.jia.chapter.ch01;

public class pro1_1 {
	/**
	 * 确定字符串的所有字符是否全都不同
	 * @param str  输入的字符串
	 * @return    如果字符串的所有字符是都不同返回true，否则返回false
	 */
	public boolean isAllDifferent(String str) {
		if(str == null || str.length() == 0) throw new RuntimeException("argument error.");
		boolean[] dic = new boolean[256];
		for(int i = 0; i < str.length(); i++) {
			if(dic[str.charAt(i)]) {
				return false;
			}else {
				dic[str.charAt(i)] = true;
			}
		}
		return true;
	}
	public static void main(String[] args) {
//		String str = "abcdefg";
		String str = "abcdefga";
		System.out.println(new pro1_1().isAllDifferent(str));
	}
}
