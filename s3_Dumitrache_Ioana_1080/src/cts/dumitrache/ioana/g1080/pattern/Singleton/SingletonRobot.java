package cts.dumitrache.ioana.g1080.pattern.Singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class SingletonRobot {
private static Map<String, SingletonRobot> INSTANCES=null;
public ArrayList<String> cereri;
private String tip;
private SingletonRobot(){
	cereri=new ArrayList<String>();
	}
public static synchronized SingletonRobot getInstance(String tip) {
	if(INSTANCES==null)
	{
	INSTANCES=new HashMap<>();
	
	}
	if(!INSTANCES.containsKey(tip))
	{
	
		SingletonRobot SingletonRobot=new SingletonRobot();
		SingletonRobot.tip=tip;
		INSTANCES.put(tip,SingletonRobot);
	}
	return INSTANCES.get(tip);
}
public ArrayList<String> getCereri() {
	return cereri;
}
private Object readResolve() throws Exception{
	return SingletonRobot.getInstance(tip);
}
}

