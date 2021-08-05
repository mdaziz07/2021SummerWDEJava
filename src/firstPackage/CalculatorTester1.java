package firstPackage;

public class CalculatorTester1 {
    public static void main(String[] args) {

        Calculator1 obj = new Calculator1();

        System.out.println("Addition: " + obj.addition(40,20));
        System.out.println("Subtraction: " + obj.subtraction(40,20));
        System.out.println("Multiplication: " + obj.multiplication(40,20));
        System.out.println("Division: " + obj.division(40,20));
    }
}
