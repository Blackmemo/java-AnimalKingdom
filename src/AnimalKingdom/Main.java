package AnimalKingdom;

import java.util.ArrayList;
import java.util.Comparator;

public class Main
{
	public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester)
	{
		for (AbstractAnimal animal : animals)
		{
			if (tester.test(animal))
			{
				System.out.println(animal.getName());
			}
		}
	}

	public static void main(String[] args)
	{
		Mammal panda = new Mammal("Panda", 1869);
		Mammal zebra = new Mammal("Zebra", 1778);
		Mammal koala = new Mammal("Koala", 1816);
		Mammal sloth = new Mammal("Sloth", 1804);
		Mammal armadillo = new Mammal("Armadillo", 1758);
		Mammal raccoon = new Mammal("Raccoon", 1758);
		Mammal bigFoot = new Mammal("BigFoot", 2021);

		Bird pigeon = new Bird("Pigeon", 1837);
		Bird peacock = new Bird("Peacock", 1821);
		Bird toucan = new Bird("Toucan", 1758);
		Bird parrot = new Bird("Parrot", 1824);
		Bird swan = new Bird("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("CatFish", 1817);
		Fish perch = new Fish("Perch", 1758);

		ArrayList<AbstractAnimal> animalList = new ArrayList<AbstractAnimal>();
		animalList.add(panda);
		animalList.add(zebra);
		animalList.add(koala);
		animalList.add(sloth);
		animalList.add(armadillo);
		animalList.add(raccoon);
		animalList.add(bigFoot);
		animalList.add(pigeon);
		animalList.add(peacock);
		animalList.add(toucan);
		animalList.add(parrot);
		animalList.add(swan);
		animalList.add(salmon);
		animalList.add(catfish);
		animalList.add(perch);

		// 1. List all animals in descending order by year named:
		System.out.println("Animals in descending order by year");
		animalList.sort((a1, a2) -> a2.getYear() - a1.getYear());
		animalList.forEach(animal -> System.out.println(animal.getName() + ": " + animal.getYear()));

		//2. List all the animals alphabetically
		System.out.println();
		System.out.println("Listing all animal alphabetically");
		animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		animalList.forEach(animal -> System.out.println(animal.getName()));

		//3. List all the animals order by how they move
		System.out.println();
		System.out.println("Listing all animals order by how they move");
		animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
		animalList.forEach(animal -> System.out.println(animal.getName() + ": " + animal.move()));

		//4. List only those animals that breath with lungs
		System.out.println();
		System.out.println("Listing all animals that breath with lungs");
		printAnimals(animalList, animal -> animal.breath().equals("Lungs"));

		//5. List only those animals that breath with lungs and were named in 1758
		System.out.println();
		System.out.println("Listing all animals that breath with lungs and were named in 1758");
		printAnimals(animalList, animal -> animal.breath().equals("Lungs") && animal.getYear() == 1758);

		//6. List only those animals that lay eggs and breath with lungs
		System.out.println();
		System.out.println("Listing all animals that that lay eggs and breath with lungs");
		printAnimals(animalList, animal -> animal.breath().equals("Lungs") && animal.reproduce().equals("Eggs"));

		//7. List alphabetically only those animals that were named in 1758
		System.out.println();
		System.out.println("Listing all animals alphabetically that were named in 1758");
		 animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
         printAnimals(animalList, animal -> animal.getYear() == 1758);
	}
}