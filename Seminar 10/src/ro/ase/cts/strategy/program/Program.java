package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.PlataCard;

public class Program {
	
	public static void main(String[] args) {
		Client client = new Client("Diana");
		
		client.plateste(30);
		client.setTipPlata(new PlataCard());
		client.plateste(25);
	}
}
