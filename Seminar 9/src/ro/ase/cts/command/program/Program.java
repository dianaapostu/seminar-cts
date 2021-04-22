package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.Comanda;
import ro.ase.cts.command.clase.ComandaOcupare;
import ro.ase.cts.command.clase.ComandaRezervare;
import ro.ase.cts.command.clase.Masa;
import ro.ase.cts.command.clase.Operator;

public class Program {

	public static void Main(String[] args) {
		
		Masa masa1 = new Masa(1);
		Masa masa2 = new Masa(2);
		
		Comanda comandaRezervare = new ComandaRezervare(masa1);
		Comanda comandaOcupare1 = new ComandaOcupare(masa2);
		Comanda comandaOcupare2 = new ComandaOcupare(masa2);
		
		Operator operator = new Operator();
		operator.invoca(comandaRezervare);
		operator.executaComanda();
		operator.invoca(comandaOcupare1);
		operator.invoca(comandaOcupare2);
		
		operator.executaComanda();
		operator.executaComanda();
	}
}
