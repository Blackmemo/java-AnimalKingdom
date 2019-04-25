package AnimalKingdom;

public class Bird extends AbstractAnimal
{
	public Bird(String name, int year) {
		super(name, year);
	}

	@Override
	public String move()
	{
		return name + " flies.";
	}

	@Override
	public String breath()
	{
		return "Lungs";
	}

	@Override
	public String reproduce()
	{
		return "Eggs";
	}
}