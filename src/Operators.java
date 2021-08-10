public class Operators {
    /*
    There are four different types of operators
    - Arithmetic
    - Assignment
    - Comparison
    - Logical
     */

    public static void main(String[] args) {
        arithmetic();
        assignment();
        comparison();
    }
    public static void arithmetic(){
        int x = 25;
        int y = 4;
        int z = x % y;
        System.out.println("Addition: " + (x+y));
        System.out.println("Subtraction :" + (x-y));
        System.out.println("Divition: " + (x/y));
        System.out.println("Multiplication: " + (x*y));
        System.out.println("Modulo: " + z);
    }
    public static void assignment(){
        int a = 100;
        int b = 50;
        System.out.println(a);
        System.out.println(b);
        a += b; // a = a+b
        System.out.println(a);
        a -= 1;
        System.out.println(b);
    }
    public static void comparison(){
        int a = 28;
        int b = 30;
        boolean isDifferent;
        boolean isSame;
/*
        isDifferent = !(a==b); // a & b not equal
        isSame = (a==b); //a & b equal

        System.out.println(isSame);
        System.out.println(isDifferent);
*/

        String name1 = "mike";
        String name2 = "MIKE";

        isSame = name1.equals(name2);
        isDifferent = !(name1.equals(name2));

        System.out.println(isSame);
        System.out.println(isDifferent);
    }
    public static void logical(){


    }
}
