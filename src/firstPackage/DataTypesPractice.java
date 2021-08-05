package firstPackage;

public class DataTypesPractice {

    static int a = 40;
    static int b = 60;
    static int c = a; //initialize c=40;
    static int d = b;

    static String name = "AZIZ";

    public static void main(String[] args) {
        System.out.println(a+b);
        System.out.println(c+d);
        System.out.println(name);
        a = 50; // still c=40. it is not changing the value of c
        b = 70; // still d=60
        name = "Osman"; // initializing name with Osman

        System.out.println(a+b);
        System.out.println(c+d);
        System.out.println(name);
    }
}
