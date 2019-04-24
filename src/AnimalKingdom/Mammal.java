package AnimalKingdom;

public class Mammal extends AbstractAnimal
{
	public Mammal(String name, int year) {
		super(name, year);
	}

	@Override
	public String move()
	{
		return name + " walks.";
	}

	@Override
	public String breath()
	{
		return "Lungs";
	}

	@Override
	public String reproduce()
	{
		return name + " has just had a live birth!";
	}
}