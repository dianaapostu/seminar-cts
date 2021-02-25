package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeeper zookeeper;
	private List<Animal> animalList;
	
	public Zoo() {
		animalList = new ArrayList<>();
		zookeeper = new Zookeeper("Ion");
	}

	
	public Zoo(Zookeeper zookeeper, List<Animal> animalList) {
		super();
		this.zookeeper = zookeeper;
		this.animalList = animalList;
	}
	
	public void adaugaAnimal(Animal animal) {
		animalList.add(animal);
	}
	
	public void feedAnimals() {
		//for()
	}
}
