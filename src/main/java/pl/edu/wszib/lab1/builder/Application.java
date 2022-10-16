package pl.edu.wszib.lab1.builder;

public class Application {

    public static void main(String[] args) {
        Person.Builder personBuilder = Person.builder()
                .firstName("Dom")
                .lastName("T")
                .age(13)
                .gender(Gender.MALE);
    }
}

