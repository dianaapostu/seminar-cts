package ro.ase.cts.clase.facade;

public class BirouDeCredite {

	public static boolean areCredite(Persoana persoana) {
		return Integer.parseInt("" + persoana.getCnp().charAt(11)) % 2 == 0;
	}
}
