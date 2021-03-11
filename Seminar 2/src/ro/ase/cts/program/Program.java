package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.Student;
import ro.ase.cts.readers.AngajatiReader;
import ro.ase.cts.readers.IReader;

public class Program {

	public static List<Aplicant> citesteAplicanti(IReader readAplicant)
			throws NumberFormatException, FileNotFoundException {
		return readAplicant.readAplicanti();
	}

	public static void main(String[] args) {
		System.out.println("Suma finantata pentru angajati: " + Angajat.getSumaFinanta());
		System.out.println("Suma finantata pentru studenti: " + Student.getSumaFinanta());
		System.out.println("Suma finantata pentru elevi: " + Elev.getSumaFinanta());
		System.out.println("\n");

		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new AngajatiReader("angajati.txt"));	
			Proiect proiect = new Proiect (81);
			for (Aplicant aplicant : listaAplicanti) {
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantare());
				
				aplicant.afisareRaspunsProiect(proiect);
				System.out.println("\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
