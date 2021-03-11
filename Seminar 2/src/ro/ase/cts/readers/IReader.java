package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class IReader {
	public String numeFisier;

	public IReader(String numeFisier) {
		this.numeFisier = numeFisier;
	}

	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException, NumberFormatException;

	public Aplicant readAplicant(Scanner input, Aplicant aplicant) {
		String nume = input.next();
		String prenume = input.next();
		int varsta = input.nextInt();
		int punctaj = input.nextInt();
		int nr = input.nextInt();
		String[] vect = new String[nr];
		for (int i = 0; i < nr; i++)
			vect[i] = input.next();
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setVectorDenumiriProiecte(vect, nr);

		return aplicant;
	}
}
