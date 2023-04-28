import java.util.List;
import java.util.Random;

public class Person {
    Random rand = new Random();

    private String id;
    private String firstName;
    private String lastName;

    public Person(String s) {
        id = s + rand.nextInt(100000, 999999);
    }

    public String getPersonId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fname) {
        firstName = fname;
//        id = fname.toLowerCase().strip() + rand.nextInt(100000, 999999);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lname) {
        lastName = lname;
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public String getPersonInfo() {
        return "ID: " + id + "\n" + "Full Name: " + getFullName() + "\n" + "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n";
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" + "Full Name: " + getFullName() + "\n" + "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n";
    }

    public static Person findPerson(List<Person> persons, Person p) {
        for (Person person :
                persons) {
            if (person.equals(p)) {
                return person;
            }
        }
        return null;
    }


}
