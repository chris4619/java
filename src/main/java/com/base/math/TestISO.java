package com.base.math;

import java.util.Random;

public class TestISO {

	private static long smnum = 0;
	
	private static long getsmid(){
		smnum++;
		String lownum = String.valueOf(smnum);
		Random r = new Random();
		String highnum = String.valueOf(r.nextInt(50));
		return Long.parseLong(highnum + lownum);
	}
	
	public static void main(String[] args) {
		System.out.println(getsmid());
		System.out.println(getsmid());
		System.out.println(getsmid());
		System.out.println(getsmid());
		System.out.println(getsmid());
	}

}
