package org.example.may14;

public class StudentAddress {

    private  final String streetName;
    private final String postalCode;
    private final String city;
    private final String country;

    public StudentAddress(String streetName, String postalCode, String city, String country) {
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;


    }

    public String getStreetName() {
        return streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "streetName='" + streetName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
