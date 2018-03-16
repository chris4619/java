package com.base.array;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		String str = "1";
		String[] array = str.split(",");
		List<String> list = Arrays.asList(array);
		for (String string : list) {
			System.out.println(string);
		}
	}

}
