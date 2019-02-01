package com.jia.chapter.ch01;

/**
 * 利用字符重复出现的次数，编写一个方法，实现基本的字符压缩功能。比如字符串
 * “aabbcccccaaa”  会变为a2b1c5a3.
 * 若压缩后的字符串没有原先的短，那么返回原来字符串
 * @author Administrator
 *
 */
public class Pro1_5 {
	public String compressionString(String input) {
		if(null == input || input.length() == 0)
			throw new RuntimeException("the argument input error.");
		int count = 0;
		StringBuilder sb = new StringBuilder();
		char[] chars = input.toCharArray();
		char c;
		for(int i = 0; i < chars.length; ) {
			count = 1;
			c = chars[i];
			for(int j = i; j<chars.length - 1 && c == chars[j+1]; j++) {
				++count;
			}
			sb.append(c).append(count);
			i = i+ count;
		}
		return (sb.length() < chars.length)? sb.toString() : input;
	}
	public static void main(String[] args) {
		Pro1_5 pro1_5 = new Pro1_5();
		System.out.println(pro1_5.compressionString("aabcccccaaa"));;
	}
}
