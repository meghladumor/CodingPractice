package org.example.may18;

public class Main {
    public static void main(String[] args) {


      /*  Iplay play = () -> Math.random() > 0.5;


        LongWeekend lw = new LongWeekend();
        lw.vacation(play);

        OR
        */
        // here we are passing the function directly to the method, this is called functional programming
        LongWeekend lw = new LongWeekend();
        lw.vacation(() -> Math.random() > 0.5);
        String s = "abcdefghjikskksks";
        s.length();


    }
}





//        sport sport = new sport();
//        System.out.println(sport.calculate(2,3));
//        //Anonymous inner class to override the method from the interface
//
//    Iplay play = (int a,int b) -> {
//        return a+b;
//    }




//        Iplay play = new Iplay(){
//            public int calculate(int a,int b){
//                return a+b;
//
//            }





//        Iplay sport = new sport();
//        System.out.println(sport.a);
//
//        sport.abc();
