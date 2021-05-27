package ro.acs.cts.seminar13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import ro.acs.cts.exceptions.StudentExceptionWrongValue;
import ro.acs.cts.unittesting.Student;

class StudentTestCase {
	Student student;
	String defaultName="Anonim";
	int defautlVarsta=18;
	int defaultNote[]= {};

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before the call");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After the call");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Setup was called");
		student=new Student(defaultName,defautlVarsta,defaultNote);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("TearDown was called");
	}

	@Test
	void testStudentConstructor() {
		String studentName="Alex";
		int studentAge=18;
		int note[]= {7,8,8,9};
		Student student=new Student(studentName, studentAge, note);
		assertEquals(studentName, student.getNume(), "Not equal");
		//if(!studentName.equals(studentName))
		assertEquals(studentAge, student.getVarsta(), "Not equal");
		assertEquals(note, student.getNote(),"Not equal");
		fail("Not yet implemented");
	}
	@Test
	void testStudentConstructorRightNotNull()
	{
		int grades[]= {8,8,9};
		Student student=null;
		try {
			student=new Student("Alex", 27, grades);
		}catch(Exception e)
		{
			fail("Constructorul trb sa arunce o exceptie");
			
		}
		assertNotNull(student);
	}
	@Test()
	void testStudentSetVarstaErrorCondition() {
		assertThrows(StudentExceptionWrongValue.class, new Executable() {
			
			@Override
			public void execute() throws Throwable {
				student.setVarsta(-1);
				
			}
		});
				
		}
	@Test
	void testStudentGetVarstaRight()
	{
		int exValue=defautlVarsta;
		int acValue=student.getVarsta();
		assertEquals(exValue, acValue);
	}
	
	@Test
	void testCalculMedieErrorCondition()
	{
		student.setNote(null);
		assertThrows(StudentExceptionWrongValue.class, ()->
		{
			student.calculMedie();	
		});
	}
}
