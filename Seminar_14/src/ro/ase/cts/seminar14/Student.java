package ro.ase.cts.seminar14;

import ro.acs.cts.exceptions.StudentExceptionWrongValue;

public class Student {
String nume;
int varsta;
int[] note;
public Student(String nume, int varsta, int[] note) {
	super();
	this.nume = nume;
	this.varsta = varsta;
	this.note = note;
}
public String getNume() {
	return nume;
}
public void setNume(String nume) {
	this.nume = nume;
}
public int getVarsta() {
	return varsta;
}
public void setVarsta(int varsta) throws StudentExceptionWrongValue{
	if(varsta<0)
		throw new StudentExceptionWrongValue(  );
	this.varsta = varsta;
}
public int[] getNote() {
	return note;
}
public void setNote(int[] note) {
	this.note = note;
}
public float calculMedie() throws StudentExceptionWrongValue
{
	if(note==null)
		throw new StudentExceptionWrongValue();
	if(note.length<=1)
		throw new StudentExceptionWrongValue();
	float avg = 0;
	for(int i = 0; i < note.length; i++) {
		avg += note[i];
	}
	avg = avg / note.length ;
	return avg * 100 / 100.0f;
}

}
