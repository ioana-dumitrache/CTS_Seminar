package ro.ase.cts.template;

public abstract class AbstractFormater {
public void displayOutput(int input)
{
	int userInput=getInput(input);
	}
public int getInput(int fakeInput)
{
	System.out.println("Geting the input");
	return 0;
}
public abstract String formatInput(int input);
public void display(String input)
{
	System.out.println(input);
	}
}
