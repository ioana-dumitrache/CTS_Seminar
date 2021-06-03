package ro.ase.cts.seminar14.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.acs.cts.exceptions.StudentExceptionWrongValue;
import ro.ase.cts.seminar14.DepartamentSecretariat;
import ro.ase.cts.seminar14.Student;
import ro.ase.cts.seminar14.StudentAbstract;

class SecretariatTestCase {
DepartamentSecretariat secretariat;
static final ArrayList<Student> DEFAULT_STUDENTS;
static {
	DEFAULT_STUDENTS=new ArrayList<Student>();
}
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		int defaultNote[]= {7,8,9};
		int defaultNote2[]= {10,8,9};
		DEFAULT_STUDENTS.add(new Student("Anonim", 19,defaultNote));
		DEFAULT_STUDENTS.add(new Student("Anonim2", 20,defaultNote2));
	}

	@BeforeEach
	void setUp() throws Exception {
		secretariat=new DepartamentSecretariat();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculBursa() {
			StudentAbstract defaultStudent=new StudentAbstract() {
			
			@Override
			public float calculMedie() throws StudentExceptionWrongValue {
				// TODO Auto-generated method stub
				return 8;
			}
		};
		
		ArrayList<StudentAbstract> listaStudenti=new ArrayList<StudentAbstract>();
		listaStudenti.add(defaultStudent);
		secretariat.setStudenti(listaStudenti);
		
		//secretariat.calculBursa(0);
	}

}
