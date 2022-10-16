package pl.edu.wszib.lab1.builder;

public class Address {
    private Address(final String city,
                    final String street,
                    final String number,
                    final String addressCode) {
        this.city = city;
        this.street = street;
        this.number = number;
        this.addressCode = addressCode;
    }

    private final String city;
    private final String street;
    private final String number;
    private final String addressCode;

    public static class AddressBuilder{
        public AddressBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public AddressBuilder setStreet(String street) {
            this.street = street;
            return this;
        }

        public AddressBuilder setNumber(String number) {
            this.number = number;
            return this;
        }

        public AddressBuilder setAddressCode(String addressCode) {
            this.addressCode = addressCode;
            return this;
        }

        private String city;
        private String street;
        private String number;
        private String addressCode;

        public Address build(){
            return new Address(
                    city,
                    street,
                    number,
                    addressCode
            );
        }
    }
}
