package ro.ase.cts.seminar09.flyweight;

import java.util.ArrayList;
import java.util.Random;

public class Model3DFlyweight implements ModelFlyweightInterface{
	String name;
	ArrayList<Double> modelPoints=new ArrayList<>();
	
	
	public Model3DFlyweight(String name) {
		super();
		this.name = name;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.modelPoints=new ArrayList<>(new Random().nextInt(1000));
	}


	@Override
	public void display(ScreenData data) {
		// TODO Auto-generated method stub
		System.out.println(String.format("%s at coordinates (%f, %f, %f) with color %s" , this.name, data.getX(),data.getY(),data.getZ(), data.getColor()));
	}

}
