/**
 * @description 
 * @date 2016-9-7
 * @author hxg	
 */
package com.utils;

public class SingleTon {

	public SingleTon() {
	}

	static class Nest {
		private static SingleTon instance = new SingleTon();
	}

	public static SingleTon getInstance() {
		return Nest.instance;
	}
}
