package ro.ase.cts.program.adapter;

import ro.ase.cts.clase.adapter.Bilet;
import ro.ase.cts.clase.adapter.BiletAdapterClase;
import ro.ase.cts.clase.adapter.BiletAdaptor;
import ro.ase.cts.clase.adapter.IBiletOnline;

public class Program {

	public static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet) {
		bilet.rezervare();
		bilet.vanzare();
	}
	
	public static void rezervaSiAfiseazaBiletOnline(IBiletOnline bilet) {
		bilet.rezervaBiletOnline();
		bilet.vindeBiletOnline();
	}
	
	public static void main(String[] args) {
		Bilet bilet = new Bilet(30f);
		rezervaSiAfiseazaBiletLaCasa(bilet);
		IBiletOnline adaptor = new BiletAdaptor(bilet);
		rezervaSiAfiseazaBiletOnline(adaptor);
		
		IBiletOnline adaptorClase = new BiletAdapterClase(50);
		rezervaSiAfiseazaBiletOnline(adaptorClase);
	}
}
