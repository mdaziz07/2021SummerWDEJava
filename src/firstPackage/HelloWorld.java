package firstPackage;

//Class
public class HelloWorld {

    //Declare Global Variable. Inside class but outside methods
    static String name = "Aziz";

    // Method
    public static void main(String[] args) {
        printName();
        printName1();
        System.out.println("Hello World");
        System.out.println(name);
    }
    public static void printName() {
        String name = "Osman"; // local variable
        System.out.println(name);
    }
    public static void printName1() {

        System.out.println(name);
    }
}
