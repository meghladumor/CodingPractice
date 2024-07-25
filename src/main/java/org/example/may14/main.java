package org.example.may14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {

        List<String> phoneNo = new ArrayList<>();
        phoneNo.add("1112223334");
        phoneNo.add("1112227777");
        phoneNo.add("1112223994");
        phoneNo.add("1112223000");

        StudentAddress address = new StudentAddress("Fountainhead","M9w2t6","NorthYork","Canada");

        Student s1 = new Student("John","Smith","123456789","John@gmail.com",phoneNo,address);
        Student s2 = new Student("Sam","Smith","123456789","John@gmail.com",phoneNo,address);
        Student s3 = new Student("Paul","Aitken","123456789","John@gmail.com",phoneNo,address);
        Student s4 = new Student("John","Smith","123456789","John@gmail.com",phoneNo,address);

        Map<Student,Integer> marks = new HashMap<>();
        marks.put(s1,70);
        marks.put(s2,80);
        marks.put(s3,90);
        marks.put(s4,79);
       // System.out.println(marks);
       s1.setPhoneNo("678999999 ");
      //  s1.getPhoneNos().add("1234567899");
        System.out.println(marks.get(s1));
        System.out.println(marks);

    }
}
