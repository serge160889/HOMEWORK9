package academy.belhard;


import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Sergei", "Voitehovich", new Address("Minsk", "Glebki", 1));
        Person person2 = new Person("Tom", "Hardy", new Address("London", "Lochaline", 49));
        Person person3 = new Person("Jason", "Statham", new Address("Shirebrook", "Park-road", 36));
//        System.out.println(person1+ " \n" +person2+"\n"+person3);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        PersonIOUtil.writePersons("Person", persons);
        System.out.println("Объекты записаны в файл");




        }


    }






