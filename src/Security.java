public class Security extends Person{

    private int securityID;
	private double baseSalary;


    public Security(String last, String first, String middle, int id, double sal) {
		super(last, first, middle);
		securityID = id;
		baseSalary = sal;

	}

	public int getID()
	{
		return securityID;

	}

	public double getSalary()
	{
		return baseSalary;
	}
    
}
