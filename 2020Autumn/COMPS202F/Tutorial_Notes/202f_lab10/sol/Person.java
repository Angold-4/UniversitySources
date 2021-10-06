public class Person {
    private String id;
    private String name;
    private int age;

    public Person(String anId, String aName, int anAge) {
        id = anId;
        name = aName;
        age = anAge;
    }
   
    public String getId() {
        return id;
    }

    public void setId(String anId) {
        id = anId;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int anAge) {
        age = anAge;
    } 

    public String toString() {
        return "("+id + ", " + name + ", " + age + ")";
    }
}
