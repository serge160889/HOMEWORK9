package academy.belhard;

import java.io.*;
import java.util.ArrayList;

public class PersonIOUtil {
    public static void writePersons(String fileName, ArrayList<Person> persons) {


        try (FileWriter writer = new FileWriter(fileName)) {
            for (Person person : persons) {
                writer.write(person.getFirstName()+" "+
                                person.getLastName()+" "+
                                person.address.getCity()+" "+
                                person.address.getStreet()+" "+
                                person.address.getNumberHouse()+ "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Person> readPersons(String fileName) throws EmptySourseFileException {
        ArrayList<Person> persons = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String txtString;
            while ((txtString = reader.readLine()) != null) {
                String[] dataArray = txtString.split(" ");
               String firstName=dataArray[0];
               String lastName=dataArray[1];
               String city=dataArray[2];
               String street=dataArray[3];
               int numberHouse=Integer.parseInt(dataArray[4]);
                Person person= new Person(firstName,lastName,new Address(city,street,numberHouse));
                persons.add(person);
            }
            if (persons.size()==0){
                throw new  EmptySourseFileException("Файл не существует или пуст");
            }


            } catch(FileNotFoundException e){
                e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            } catch (NullFieldException e){
            e.printStackTrace();
            }


        return persons;
    }
    }



