package org.example.may18;

public interface IDisplay {
    int a =5;

    default void abc(){
        System.out.println("from the Display interface");
    }
}
