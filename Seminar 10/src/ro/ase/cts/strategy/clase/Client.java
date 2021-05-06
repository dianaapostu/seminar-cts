package ro.ase.cts.strategy.clase;

public class Client {

	private IPlata tipPlata;
	private String nume;
	
	
	public Client(String nume) {
		super();
		this.nume = nume;
		this.tipPlata =new PlataCash();
	}


	public void setTipPlata(IPlata tipPlata) {
		this.tipPlata = tipPlata;
	}
	
	public void plateste(float suma) {
		this.tipPlata.plateste(suma);
	}
	
	
}
