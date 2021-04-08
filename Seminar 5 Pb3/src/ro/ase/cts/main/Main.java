package ro.ase.cts.main;

import ro.ase.cts.clase.Reteta;

public class Main {
	public static void main(String[] args) {
		Reteta reteta=new Reteta("Paracetamol", 250);
		Reteta reteta1=(Reteta) reteta.copiaza();
		System.out.println(reteta);
		System.out.println(reteta1);
	}
}
