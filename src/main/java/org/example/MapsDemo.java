package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

    public static void main(String[] args) {
        Map<String,Integer> empSalaries = new HashMap<>();
        empSalaries.put("Sam",115000);
        empSalaries.put("sonu",12000);
        empSalaries.put("Bod",123456);
        empSalaries.put("Peter",12478);
        empSalaries.put("David",14500);
        empSalaries.put("pelv",176900);
        empSalaries.put("Lov",130000);
        System.out.println(empSalaries);
        System.out.println(empSalaries.get("Lov"));

    }
}
