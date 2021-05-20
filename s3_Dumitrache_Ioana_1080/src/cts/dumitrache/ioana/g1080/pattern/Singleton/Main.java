package cts.dumitrache.ioana.g1080.pattern.Singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonRobot cerere1 = SingletonRobot.getInstance("First requests");
		SingletonRobot cerere2 = SingletonRobot.getInstance("Second requests");
		cerere1.getCereri();
		cerere2.getCereri();
		
		Robot r1 = Robot.INSTANCE;
		Robot r2 = Robot.INSTANCE;
		
		if(r1 == r2) {
			System.out.println("Obiecte identice!");
		}

	}

}
