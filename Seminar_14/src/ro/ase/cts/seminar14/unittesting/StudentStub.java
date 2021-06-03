package ro.ase.cts.seminar14.unittesting;

import ro.acs.cts.exceptions.StudentExceptionWrongValue;
import ro.ase.cts.seminar14.StudentAbstract;

public class StudentStub extends StudentAbstract{
	float calculMedieReturnValue;
	

	public void setCalculMedieReturnValue(float calculMedieReturnValue) {
		this.calculMedieReturnValue = calculMedieReturnValue;
	}


	@Override
	public float calculMedie() throws StudentExceptionWrongValue {
		// TODO Auto-generated method stub
		return 0;
	}

}
