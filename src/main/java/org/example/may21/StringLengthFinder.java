package org.example.may21;

import java.util.Scanner;
import java.util.function.Consumer;

public class StringLengthFinder {

    public void finder(Consumer<String> consumer){
        System.out.println(" Enter the string for which you want to find the length for :");
        String s = new Scanner(System.in).next();
        System.out.println("Your string length is :");
        consumer.accept(s);
    }
}
