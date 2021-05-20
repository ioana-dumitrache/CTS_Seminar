package ro.ase.cts.unitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTestCase {

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
		assertEquals(studentName, student.nume, "Not equal");
		//if(!studentName.equals(studentName))
		assertEquals(studentAge, student.varsta, "Not equal");
		assertEquals(note, student.note,"Not equal");
		fail("Not yet implemented");
	}

}
