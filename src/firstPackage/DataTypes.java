package firstPackage;

public class DataTypes {

    // Numerical Data Types
    static byte variable1 = 123;
    static short variable2 = 32765;
    static int variable3 = 1212212;
    static long variable4 = 3435435535535L;

    // Decimal Data Types;
    static float variable5 = 2.035847587485f;
    static double variable6 = 3.12324634647348d;

    static boolean isConvertible = true;
    static boolean hasDoors; // Default value is False
    static char letter = '5';
    static char letter1 = '2';

    public static void main (String[] args) {
        System.out.println(variable5);
        System.out.println(variable6);
        System.out.println(isConvertible);
        System.out.println(hasDoors);
        System.out.println(letter);
        System.out.println(letter1);
        System.out.println(letter + letter1); // no concatenation for Char

    }

}
