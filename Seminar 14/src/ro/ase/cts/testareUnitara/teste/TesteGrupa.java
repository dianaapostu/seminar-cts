package ro.ase.cts.testareUnitara.teste;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.testareUnitara.clase.Grupa;
import ro.ase.cts.testareUnitara.clase.IStudent;
import ro.ase.cts.testareUnitara.clase.Student;
import ro.ase.cts.testareUnitara.teste.categorii.ConstructorGrupa;
import ro.ase.cts.testareUnitara.teste.categorii.GetPromovabilitateCategory;
import ro.ase.cts.testareUnitara.teste.categorii.TesteUrgente;

public class TesteGrupa {

	@Test
	@Category(ConstructorGrupa.class)
	public void testConstructorNrGrupaCorect() {
		Grupa grupa = new Grupa(1081);
		assertEquals(1081, grupa.getNrGrupa());
	}

	@Test
	@Category(ConstructorGrupa.class)
	public void testConstructorExistaLista() {
		//principiul existence
		Grupa grupa = new Grupa(1081);
		assertNotNull(grupa.getStudenti());
	}

	@Test
	@Category(ConstructorGrupa.class)
	public void testConstructorLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}

	@Test
	@Category(ConstructorGrupa.class)
	public void testConstructorLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}

	@Test(expected = IllegalArgumentException.class)
	@Category(ConstructorGrupa.class)
	public void testExceptieConstructorInferior() {
		Grupa grupa = new Grupa(900);
	}

	@Test(expected = IllegalArgumentException.class)
	@Category(ConstructorGrupa.class)
	public void testExceptieConstructorSuperior() {
		Grupa grupa = new Grupa(1200);
	}

	@Test(timeout = 500)
	@Category(ConstructorGrupa.class)
	public void testPerformanceConstructor() {
		Grupa grupa = new Grupa(1005);
	}
	
	//JUnit 5
//	@Test
//	public void testPerformanceConstructorV5() {
//		assertTimeout(Duration.ofMillis(500), () -> {new Grupa(1081);});;
//	}

	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateRight() {
		Grupa grupa = new Grupa(1081);
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
		
		assertEquals(0.66f, grupa.getPromovabilitate(), 0.1);
	}

	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateLimitataInferioare() {
		Grupa grupa = new Grupa(1001);
		for(int i=0; i<5; i++) {
			IStudent student = new Student();
			student.adaugaNota(4);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0, grupa.getPromovabilitate(),0.01);
	}

	@Test
	@Category({GetPromovabilitateCategory.class, TesteUrgente.class})
	public void testGetPromovabilitateLimitaSuperioara() {
		Grupa grupa = new Grupa(1081);
		for(int i=0; i<10; i++) {
			IStudent student = new Student();
			student.adaugaNota(6);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateErrorCondition() {
		Grupa grupa = new Grupa(1050);
		grupa.getPromovabilitate();
	}

	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateCardinality1() {
		Grupa grupa = new Grupa(1081);
		IStudent stud = new Student();
		stud.adaugaNota(5);
		stud.adaugaNota(6);
		grupa.adaugaStudent(stud);
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
}