package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class IReader {
	public String numeFisier;

	public IReader(String numeFisier) {
		this.numeFisier = numeFisier;
	}

	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException, NumberFormatException;
}
