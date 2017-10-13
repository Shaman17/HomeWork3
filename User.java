package HomeWork3;

public class User {

    private String name;
    private String lastName;

    User () {
        name = "John";
        lastName = "Smith";
    }

    User (String n, String l) {
        name = n;
        lastName = l;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameS) {
        name = nameS;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastNameS) {
        lastName = lastNameS;
    }
}