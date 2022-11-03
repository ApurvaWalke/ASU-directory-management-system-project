public class PersonnelFactory {

    public static Person createPersonnel( String last, String first, String middle ){
        return new  Person(last, first, middle);
    }

    public static Volunteer createPersonnel( String last, String first, String middle, int id ){
        return new  Volunteer(last, first, middle, id);
    }

    public static Person createPersonnel(String personType, String last, String first, String middle, int id, double salary){

        if (personType == "Employee") {
            return new Employee(last, first, middle, id, salary);
        }
        else if ( personType == "Executives"){
            return new Executive(last, first, middle, id, salary);
        }

        else if (personType == "Security"){
            return new Security(last, first, middle, id, salary);
        }
        return null;

    }
    
}

