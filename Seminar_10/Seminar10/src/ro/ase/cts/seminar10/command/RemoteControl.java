package ro.ase.cts.seminar10.command;

public class RemoteControl {
CommandInterface lightOnC0mmand;
CommandInterface lightOffC0mmand;
CommandInterface dimLightC0mmand;
CommandInterface increaseLightC0mmand;
public RemoteControl(CommandInterface lightOnC0mmand, CommandInterface lightOffC0mmand,
		CommandInterface dimLightC0mmand, CommandInterface increaseLightC0mmand) {
	super();
	this.lightOnC0mmand = lightOnC0mmand;
	this.lightOffC0mmand = lightOffC0mmand;
	this.dimLightC0mmand = dimLightC0mmand;
	this.increaseLightC0mmand = increaseLightC0mmand;
}

public void pressLightOn() {
	
	lightOnC0mmand.execute();
}
public void pressLightOff() {
	
	lightOffC0mmand.execute();
}
public void pressDimButton() {
	
	dimLightC0mmand.execute();
}

public void pressIncreaseButton() {
	
	increaseLightC0mmand.execute();
}
}
