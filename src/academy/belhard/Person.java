package academy.belhard;

public class Person {
    String firstName;
    String lastName;
    Address address;

    public Person(String firstName, String lastName, Address address) throws NullFieldException {
        try {
            if (firstName == null || lastName == null || address == null) {
                throw new NullFieldException("Заполните все поля");
            }
        }catch (NullFieldException e){
            System.err.println(e.getMessage());
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName)throws NullFieldException {
       if (firstName==null){
           throw new NullFieldException("Заполните все поля");
       }
        this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) throws NullFieldException {
        if (lastName==null){
            throw new NullFieldException("Заполните все поля");
        }
        this.lastName = lastName; }

    public Address getAddress() throws NullFieldException {
        if (address==null){
            throw new NullFieldException("Заполните все поля");
        }
        return address; }

    public void setAddress(Address address) { this.address = address; }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}'+"\n";
    }


    }

