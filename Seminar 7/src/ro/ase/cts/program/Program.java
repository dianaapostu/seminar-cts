package ro.ase.cts.program;

import ro.ase.cts.clase.facade.Persoana;
import ro.ase.cts.clase.facade.VerificatorPersoane;

public class Program {

	public static void Program(String[] args) {
		Persoana persoana= new Persoana("Alexandru", "1951010254675");
		if(VerificatorPersoane.esteEligibil(persoana)) {
			System.out.println("Persoana este eligibila.");
		}
		else {
			System.out.println("Persoana nu este eligibila.");
		}
	
	}
}
