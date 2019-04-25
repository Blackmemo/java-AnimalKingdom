package AnimalKingdom;

public abstract class AbstractAnimal
{
	public static int maxId = 0;
	int id;
	String name;
	int year;

	public AbstractAnimal(String name, int year)
	{
		this.name = name;
		this.year = year;
		id = maxId++;
	}

	public abstract String move();
	public abstract String breath();
	public abstract String reproduce();

	public String eat()
	{
		return "crunch";
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public int getId()
	{
		return id;
	}


}