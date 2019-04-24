package AnimalKingdom;

public class Fish extends AbstractAnimal
{
	public Fish(String name, int year) {
		super(name, year);
	}

	@Override
	public String move()
	{
		return name + " swims!";
	}

	@Override
	public String breath()
	{
		return name + "s, gills breath.";
	}

	@Override
	public String reproduce()
	{
		return "Eggs";
	}
}