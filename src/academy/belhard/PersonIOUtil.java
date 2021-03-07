package academy.belhard;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;

public class PersonIOUtil {
    public static void writePersons(String fileName, ArrayList<Person> persons) {


        try (FileWriter writer = new FileWriter("Person")) {
            for (Person person : persons) {
                writer.write(persons+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
