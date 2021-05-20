package ro.ase.cts.template;

public class HexFormater extends AbstractFormater {

	@Override
	public String formatInput(int input) {
		// TODO Auto-generated method stub
		return String.format("%X", input);
	}

}
