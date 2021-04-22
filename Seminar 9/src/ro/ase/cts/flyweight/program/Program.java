package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Flyweight;
import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Program {

	public static void Main(String[] args) {
		Rezervare rezervare1 = new Rezervare(10, 5, 15);
		Rezervare rezervare2 = new Rezervare(42, 7, 22);
		Rezervare rezervare3 = new Rezervare(19, 2, 14);
		Rezervare rezervare4 = new Rezervare(15, 1, 20);
		
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		Flyweight client1 = flyweightFactory.getFlyweight("0730303030");
		client1.printeazaRezervare(rezervare1);
		
		flyweightFactory.getFlyweight("0722222222").printeazaRezervare(rezervare2);
		flyweightFactory.getFlyweight("0725555552").printeazaRezervare(rezervare3);
		flyweightFactory.getFlyweight("0744444444").printeazaRezervare(rezervare4);
	}
}
