import java.util.*;

public class Company {
	
    private ArrayList<Person> personList = new ArrayList<>();

    public void addPerson(Person aPerson) {
        personList.add(aPerson);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> aPersonList) {
        personList = aPersonList;
    }

    public Person exists(String id) {
        for (Person aPerson : personList) {
            if (id.equals(aPerson.getId())) {  
                return aPerson;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Company aCompany = new Company();
        
        Person peter1 = new Person("a123", "Peter", 20);    
        Person may = new Person("b222", "May", 21); 
		Person peter2 = new Person("b234", "Peter", 25);
		Person ada = new Person("c333", "Ada", 20);
        
		aCompany.addPerson(peter1);        
        aCompany.addPerson(may);
        aCompany.addPerson(peter2);
        aCompany.addPerson(ada);

        System.out.println("The Person list contains:");                
        System.out.println(aCompany.getPersonList());

        System.out.println("\nCheck if ID b234 exists: " + aCompany.exists("b234"));
        System.out.println("\nCheck if ID c334 exists: " + aCompany.exists("c334"));
    }
}
