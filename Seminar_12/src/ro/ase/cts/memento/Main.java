package ro.ase.cts.memento;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CharacterMemento> saveList=new ArrayList<CharacterMemento>();
			GameCharacter myCharacter=new GameCharacter("Alex", 0);
			saveList.add(myCharacter.generateMemento());
			myCharacter.bleed();
			System.out.println("Character hitpoints: "+myCharacter.getHitPoints());
			myCharacter.setMemento(saveList.get(0));
			System.out.println("Character hitpoints: "+myCharacter.getHitPoints());
			
	}

}
