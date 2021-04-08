package ro.ase.cts.clase.facade;

public class Politie {

	public static boolean esteUrmarit(Persoana persoana) {
		if (Integer.parseInt("" + persoana.getCnp().charAt(12)) % 2 == 0) {
			return true;
		}
		else return false;
	}
}
