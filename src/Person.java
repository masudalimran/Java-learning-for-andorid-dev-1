import java.util.Random;

public class Person {
    Random rand = new Random();

    private String id = "Guest" + rand.nextInt(100000, 999999);
    private String firstName;
    private String lastName;

    public String getPersonId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fname) {
        firstName = fname;
        id = fname.toLowerCase().strip() + rand.nextInt(100000, 999999);
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


}
