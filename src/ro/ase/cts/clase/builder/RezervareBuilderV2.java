package ro.ase.cts.clase.builder;

public class RezervareBuilderV2 implements AbstractBuilder{
	
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areScaunErgonomic;
	private boolean areBautura;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	
	public RezervareBuilderV2() {
		this.codRezervare=100;
		this.areBautura=false;
		this.areMancareInclusa=false;
		this.areMuzicaAmbientala=false;
		this.areScaunErgonomic=false;
		this.genMuzica="pop";
	}
	
	public Rezervare build() {
		return new Rezervare(codRezervare, areMancareInclusa, areScaunErgonomic, areBautura, areMuzicaAmbientala, genMuzica);
	}
	

	public RezervareBuilderV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}

	public RezervareBuilderV2 setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}

	public RezervareBuilderV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}

	public RezervareBuilderV2 setAreBautura(boolean areBautura) {
		this.areBautura = areBautura;
		return this;
	}

	public RezervareBuilderV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		return this;
	}

	public RezervareBuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}

	
}
