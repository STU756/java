package com.jia.chapter.ch01;


/**
 * 编写一个方法，将字符串中的空格全部替换为%20
 * @author Administrator
 *
 */
public class Pro1_4 {
	public String transferWiltespace(String input) {
		if(null == input || input.length() == 0)
			throw new RuntimeException("input argument error.");
		char[] chars = input.trim().toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char c : chars) {
			if(Character.isWhitespace(c)) {
				sb.append("%20");
			}else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Pro1_4 pro1_4 = new Pro1_4();
		String inputStr = "Mr John Smith ";
		System.out.println(pro1_4.transferWiltespace(inputStr));
	}
}
