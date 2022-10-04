import com.google.gson.Gson;

public class Main {

    public static void main (String[] args) {
        Person person = new Person ("a", 32, true);
        Gson gson = new Gson();
        String gsonPerson = gson.toJson (person);
        Person person1 = gson.fromJson (gsonPerson, Person.class);
        System.out.println (person.equals (person1));
    }
}
