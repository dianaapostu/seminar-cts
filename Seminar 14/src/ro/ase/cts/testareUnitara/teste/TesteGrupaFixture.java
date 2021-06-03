package ro.ase.cts.testareUnitara.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.testareUnitara.clase.Grupa;
import ro.ase.cts.testareUnitara.clase.IStudent;
import ro.ase.cts.testareUnitara.clase.Student;
import ro.ase.cts.testareUnitara.teste.categorii.GetPromovabilitateCategory;
import ro.ase.cts.testareUnitara.teste.categorii.TesteUrgente;

public class TesteGrupaFixture {
	private Grupa grupa;
	
	@Before
	public void setup() {
		grupa = new Grupa(1001);
		for(int i=0; i<10; i++) {
			IStudent student = new Student();
			student.adaugaNota(5);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		for(int i=0; i<5; i++) {
			IStudent student = new Student();
			student.adaugaNota(4);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
	}

	@Test(timeout = 500) 
	@Category({GetPromovabilitateCategory.class, TesteUrgente.class})
	public void testGetPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}
}