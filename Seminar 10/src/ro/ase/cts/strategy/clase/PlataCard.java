package ro.ase.cts.strategy.clase;

public class PlataCard implements IPlata{

	@Override
	public void plateste(Float suma) {
		System.out.println("A fost realizata plata cu cardul pentru suma de " + suma + " lei");
		
	}

}
