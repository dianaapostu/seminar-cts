package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements ZooInterface{
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
	
	public void addAnimal(Animal animal) {
		animalList.add(animal);
	}
	
	public void feedAnimals() {
		for(Animal animal : animalList) {
			zookeeper.feed(animal);
		}
	}


	@Override
	public void feedAllAnimals() {
		// TODO Auto-generated method stub
		
	}
}
