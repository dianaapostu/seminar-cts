package ro.ase.cts.testareUnitara.teste;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.testareUnitara.clase.Grupa;
import ro.ase.cts.testareUnitara.clase.IStudent;
import ro.ase.cts.testareUnitara.teste.categorii.GetPromovabilitateCategory;
import ro.ase.cts.testareUnitara.teste.mocks.DummyStudent;
import ro.ase.cts.testareUnitara.teste.mocks.FakeStudent;
import ro.ase.cts.testareUnitara.teste.mocks.StubStudent;


public class TesteGrupaMock {

	@Test
	public void testAdaugaStudent() {
		IStudent student = new DummyStudent();
		Grupa grupa = new Grupa(1001);
		grupa.adaugaStudent(student);
		assertEquals("Adaugare student", 1, grupa.getStudenti().size());
	}
	
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitate() {
		IStudent student = new StubStudent();
		Grupa grupa = new Grupa(1001);
		grupa.adaugaStudent(student);
		
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateFakeStudent() {
		Grupa grupa = new Grupa(1001);
		for(int i = 0; i < 8; i++) {
			FakeStudent student = new FakeStudent();
			student.setAreRestante(false);
			grupa.adaugaStudent(student);
		}
		
		for(int i = 0; i < 2; i++) {
			FakeStudent student = new FakeStudent();
			student.setAreRestante(true);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.8f, grupa.getPromovabilitate(), 0.01);
	}

}
