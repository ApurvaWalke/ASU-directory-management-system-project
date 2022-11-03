import java.util.*;
public class Personnel {


	// changing this to a private variable
	private ArrayList<Person> personList;

	public Personnel() {
	   personList = new ArrayList<Person>();
	}

	public void addPersonnel(Person p)
	{
		personList.add(p);
	}

	public ArrayList<Person> getPersonnel(){
		return personList; 
	}


}