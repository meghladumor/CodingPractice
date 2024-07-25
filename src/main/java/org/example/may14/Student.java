package org.example.may14;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private  final String firstName;
    private final String lastName;
    private  String phoneNo;
    private final String email;

    private final List<String> phoneNos;

    private final StudentAddress address;

    public Student(String firstName, String lastName, String phoneNo, String email, List<String> phoneNos, StudentAddress address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.email = email;
        this.phoneNos = phoneNos;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getPhoneNos() {
        // using the cloned phonenos to avoid the break of immutability
        List<String> clonedPhoneNos = new ArrayList<>(phoneNos);
        return clonedPhoneNos;
    }
    public StudentAddress getAddress(){
        StudentAddress clonedAddress = new StudentAddress(address.getStreetName(), address.getPostalCode(), address.getCity(), address.getCountry());
        return clonedAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(phoneNo, student.phoneNo) && Objects.equals(email, student.email) && Objects.equals(phoneNos, student.phoneNos) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, phoneNo, email, phoneNos, address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                ", phoneNos=" + phoneNos +
                ", address=" + address +
                '}';
    }
}
