package com.base.math;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TestRandom {

	private static Logger log = LogManager.getLogger(TestRandom.class);
	
	public static void main(String[] args) {
		String cpu = (int)(1+Math.random()*(2-0+1)) + "." + (int)(1+Math.random()*(10-1+1));
		String mem = 8 + "." + (int)(1+Math.random()*(10-1+1));
		log.info("cpu: "+cpu);
		log.info("mem: "+mem);
	}

}
