import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("p1");
        p1.setFirstName("Masud");
        p1.setLastName("Al Imran");

        Person p2 = new Person("p2");
        p2.setFirstName("Saidul");
        p2.setLastName("Islam");

        Person p3 = new Person("p3");
        p3.setFirstName("Azfar");
        p3.setLastName("Ahmed");
//        System.out.println(p.toString());

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        String findResult = "No Match Found";
        if (Person.findPerson(persons, p3) != null) {
            findResult = Objects.requireNonNull(Person.findPerson(persons, p3)).toString();
        }

        for (Person person :
                persons) {
            System.out.println(person.getPersonInfo());
        }

        System.out.println("------------------------------------------\nSearch Result");
        System.out.println(findResult);

    }
}