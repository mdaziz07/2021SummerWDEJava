package basics.oopPractice;

public class LearnPolymorphism {

    /*
    Two different type of polymorphism
    1. Compile-time polymorphism(Method Overloading)
    2.-----
    Method overloading depends on :
    1. Number of parameters
    2. Type of parameters
    3. Order of parameters.
     */
    public static void main(String[] args) {
        System.out.println(addition(20,35));
        System.out.println(addition(98,747,838));
        System.out.println(addition(0.567f, .987f));
        System.out.println(addition(2323.9990,9299.688866));
    }

    public static int addition(int x, int y) {
        return x + y;
    }

    public static double addition(double x, int y) {
        return x + y;
    }

    public static double addition(int x, double y) {
        return x + y;
    }

    public static int addition(int x, int y, int z) {
        return x + y + z;
    }

    public static double addition(float x, float y) {
        return x + y;
    }

   public static double addition(double x, double y) {
        return x + y;
    }
}
