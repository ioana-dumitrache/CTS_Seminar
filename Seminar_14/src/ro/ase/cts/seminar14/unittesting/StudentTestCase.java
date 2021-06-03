package ro.ase.cts.seminar14.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.acs.cts.exceptions.StudentExceptionWrongValue;
import ro.ase.cts.seminar14.Student;

class StudentTestCase {
	static Student student;
	static String defaultName = "anonim";
	static int defaultVarsta = 18;
	static int defaultNote[];
	static int NR_NOTE_DEFAULT = 3;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp was called...");
		defaultNote = new int[NR_NOTE_DEFAULT];
		defaultNote[0] = 8;
		defaultNote[1] = 9;
		defaultNote[2] = 10;
		student = new Student(defaultName, defaultVarsta, defaultNote);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculMedieOrdonance() throws StudentExceptionWrongValue {
		int note[]={8,9,10,7,6};
		student.setNote(note);
		float medie=student.calculMedie();
		float excpectedValue=8;
		assertEquals(excpectedValue, medie, "Media nu corespunde");
	}
	@Test
	void testCalculMedieCardinalityZero() 
	{
		int note[]=new int[3];
		try {
			student.setNote(note);
		}catch (StudentExceptionWrongValue e){
			fail("Exceptie generata de setNote");
		}
		assertThrows(StudentExceptionWrongValue.class, ()->
		{
			student.calculMedie();
		});
		
	}
	@Test
	void testCalculMedieCardinalityOne() 
	{
		int note[]=new int[1];
		note[0]=9;
		try {
			student.setNote(note);
		}catch (StudentExceptionWrongValue e){
			fail("Exceptie generata de setNote");
		}
		assertThrows(StudentExceptionWrongValue.class, ()->
		{
			student.calculMedie();
		});
		
	}
	

}
