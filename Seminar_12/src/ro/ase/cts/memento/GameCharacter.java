package ro.ase.cts.memento;

public class GameCharacter {
String name;
int hitPoints;
public GameCharacter(String name, int hitPoints) {
	super();
	this.name = name;
	this.hitPoints = hitPoints;
}
public void setMemento(CharacterMemento memento)
{
	this.name = name;
	this.hitPoints = hitPoints;
}
public CharacterMemento generateMemento()
{
	return new CharacterMemento(this.name, this.hitPoints);
}
public void bleed()
{
	this.hitPoints-=10;

	}
public String getName() {
	return name;
}
public int getHitPoints() {
	return hitPoints;
}

//public saveState();
}
