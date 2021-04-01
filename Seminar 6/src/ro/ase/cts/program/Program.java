package ro.ase.cts.program;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareBuilder;
import ro.ase.cts.clase.RezervareBuilderV2;

public class Program {
	
	public static void main(String[] args) {
		Rezervare rezervare1;
		
		RezervareBuilder rezervareBuilder = new RezervareBuilder();
		rezervareBuilder.setCodRezervare(100).setAreMancare(true);
		rezervare1 = rezervareBuilder.build();
		
		Rezervare rezervare2 = new RezervareBuilder().setCodRezervare(101).setAreMuzica(true).build();
		
		Rezervare rezervare3 = new Rezervare(102, true, false, true, true, "pop");
		
		Rezervare rezervare4;
		rezervareBuilder.setCodRezervare(104).setAreMuzica(true).setAreScaun(true);
		rezervare4 = rezervareBuilder.build();
		
		System.out.println(rezervare1);
		System.out.println(rezervare2);
		System.out.println(rezervare3);
		System.out.println(rezervare4);
		
		RezervareBuilderV2 rbv2 = new RezervareBuilderV2().setAreMancareInclusa(true).setAreBautura(true).setAreScaunErgonomic(true);
		Rezervare rezervare5 = rbv2.setCodRezervare(105).build();
		Rezervare rezervare6 = rbv2.setCodRezervare(106).build();
	}
}
