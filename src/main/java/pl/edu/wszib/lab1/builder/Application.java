package pl.edu.wszib.lab1.builder;

public class Application {
    public static void main(String[] args) {
        Person.builder();

        Person.builder()
                .setFirstName("Dominik")
                .setLastName("LastName")
                .setAge(12)
                .setSex(true)
                .setAddress();
    }
}
