package com.sks.singleton.example;

public class LazySingleton {
	
	/*
	 *Please ensure to use “volatile” keyword with instance variable 
	 *otherwise you can run into out of order write error scenario, 
	 *where reference of instance is returned before actually the object is constructed 
	 *i.e. JVM has only allocated the memory and constructor code is still not executed. 
	 *In this case, your other thread, which refer to uninitialized object may throw null pointer exception
	 * and can even crash the whole application
	 */
	private static volatile LazySingleton instance = null;

	// private constructor
	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			synchronized (LazySingleton.class) {
				instance = new LazySingleton();
			}
		}
		return instance;
	}
	
	//Double lock checking...
    public static LazySingleton getInstance2() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                // Double check
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
