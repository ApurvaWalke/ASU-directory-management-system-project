public class Executive extends Person{

    private int executiveID;
	private double baseSalary;


    public Executive(String last, String first, String middle, int id, double sal) {
		super(last, first, middle);
		executiveID = id;
		baseSalary = sal;

	}

	public int getID()
	{
		return executiveID;

	}

	public double getSalary()
	{
		return baseSalary;
	}
    
}



