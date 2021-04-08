package ro.ase.cts.clase;

public class RezervareBuilder {
	
	private Rezervare rezervare;
	
	public RezervareBuilder() {
		this.rezervare = new Rezervare(0, false, false, false, false, "notFound");
	}

	public RezervareBuilder(int codRezervare) {
		this.rezervare = new Rezervare(codRezervare, false, false, false, false, "notFound");
	}

	public RezervareBuilder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}

	public RezervareBuilder setAreMancare(boolean areMancare) {
		rezervare.setAreMancareInclusa(areMancare);
		return this;
	}
	
	public RezervareBuilder setAreScaun(boolean areScaun) {
		rezervare.setAreScaunErgonomic(areScaun);
		return this;
	}
	
	public RezervareBuilder setAreBautura(boolean areBautura) {
		rezervare.setAreBautura(areBautura);
		return this;
	}
	
	public RezervareBuilder setAreMuzica(boolean areMuzica) {
		rezervare.setAreMuzicaAmbientala(areMuzica);
		return this;
	}
	
	public RezervareBuilder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}
	
	public Rezervare build() {
		return rezervare;
	}
}
