public class Volunteer extends Person{

    private int volunteerID;
	


    public Volunteer(String last, String first, String middle, int id) {
        super(last, first, middle);
		volunteerID = id;

	}


    public int getVolunteerID() {
        return volunteerID;
    }



    
}
