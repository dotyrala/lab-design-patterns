package pl.edu.wszib.lab1.builder;

public class Person {
    private final String firstName;
    private final String lastname;
    private final boolean sex;
    private final Integer age;
    private final Address address;

    private Person(final String firstName,
                  final String lastname,
                  final boolean sex,
                  final Integer age,
                  final Address address) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private boolean sex;

        private Integer age;
        private Address address;

        public Person build(){
            return new Person(
                    firstName,
                    lastName,
                    sex,
                    age,
                    address
            );
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = firstName;
            return this;
        }

        public Builder setSex(boolean sex) {
            this.sex = sex;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }
    }
}
