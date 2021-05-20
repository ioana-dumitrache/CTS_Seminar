package cts.dumitrache.ioana.g1080.pattern.Singleton;

import java.io.Serializable;


public class Robot implements Serializable{
	public static final Robot INSTANCE;
	static
	{
	INSTANCE=new Robot();
	}
	private Robot() {}
}
