package Test;
public class Name {

    String firstName, lastName;

    public Name setName(String firstName, String lastName) {
        setFirst(firstName);
        setLast(lastName);
        
        return this;
    }

    public void setFirst(String firstName) {
        this.firstName = firstName;
    }

    public void setLast(String lastName) {
        this.lastName = lastName;
    }
}
