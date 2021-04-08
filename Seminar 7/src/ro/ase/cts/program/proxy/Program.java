package ro.ase.cts.program.proxy;

import ro.ase.cts.clase.proxy.Moneda;
import ro.ase.cts.clase.proxy.OperatorCredite;
import ro.ase.cts.clase.proxy.OperatorCrediteProxy;

public class Program {
	
	public static void main(String[] args) {
		
		OperatorCredite operator = new OperatorCredite();
		operator.creareCredit(Moneda.EUR, 4000);
		
		OperatorCrediteProxy proxy = new OperatorCrediteProxy(operator);
		proxy.creareCredit(Moneda.USD, 3000);
		proxy.creareCredit(Moneda.RON, 3000);
	}
}
