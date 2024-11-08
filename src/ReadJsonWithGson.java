import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.IOException;

public class ReadJsonWithGson {
    public static void main(String[] args) {
        // Create a Gson instance
        Gson gson = new GsonBuilder().create();

        // Specify the path to the JSON file
        String filePath = "data.json";

        try (FileReader reader = new FileReader(filePath)) {
            // Read JSON file and convert it to Person object
            Person person = gson.fromJson(reader, Person.class);

            // Access and print data from the Person object
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Email: " + person.getEmail());
            System.out.println("Is Married: " + person.isMarried());
            System.out.println("Skills: " + person.getSkills());
            System.out.println("Address:");
            System.out.println("\tStreet: " + person.getAddress().getStreet());
            System.out.println("\tCity: " + person.getAddress().getCity());
            System.out.println("\tZipcode: " + person.getAddress().getZipcode());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
