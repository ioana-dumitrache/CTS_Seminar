package ro.ase.cts.seminar14;

import ro.acs.cts.exceptions.StudentExceptionWrongValue;

public abstract class StudentAbstract {
	String nume;
	int varsta;
	int[] note;
	public abstract float calculMedie()throws StudentExceptionWrongValue;
}
