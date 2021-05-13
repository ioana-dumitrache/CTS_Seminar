package ro.ase.cts.seminar11.state;

public class LockedState implements GateStateInterface{

	@Override
	public void enter(Gate gate) {
		// TODO Auto-generated method stub
		System.out.println("You must log in");
	}

	@Override
	public void authorized(Gate gate) {
		// TODO Auto-generated method stub
		
	}

}
