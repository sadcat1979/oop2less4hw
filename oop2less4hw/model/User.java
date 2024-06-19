package oop2less4hw.model;

public class User {

    protected Integer id;
    private String lastName;
    private String firstName;
    private String middleName;

    public User(Integer id, String lastName, String firstName, String middleName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    @Override
    public String toString() {
        return "User id " + id + " {"
                + "lastName='" + lastName + '\''
                + ", firstName='" + firstName + '\''
                + ", middleName='" + middleName + '\''
                + '}';
    }

}
