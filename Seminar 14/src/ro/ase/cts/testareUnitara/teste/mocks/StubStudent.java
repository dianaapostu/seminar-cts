package ro.ase.cts.testareUnitara.teste.mocks;

import java.util.List;

import ro.ase.cts.testareUnitara.clase.IStudent;

public class StubStudent implements IStudent {

	@Override
	public String getNume() {
		return "Gigel";
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub

	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return 6.7f;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return 9;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return false;
	}

}
