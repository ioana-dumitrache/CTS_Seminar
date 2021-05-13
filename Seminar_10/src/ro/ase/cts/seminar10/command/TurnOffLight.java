package ro.ase.cts.seminar10.command;

public class TurnOffLight implements CommandInterface{

	private LightBulb lightBulb;
	
	public TurnOffLight(LightBulb lightBulg) {
		super();
		this.lightBulb = lightBulg;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		lightBulb.turnOffLight();
	}

}
