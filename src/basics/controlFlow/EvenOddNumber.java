package basics.controlFlow;

public class EvenNumber {
    public static void main(String[] args) {

        getEvenNumber();
        getOddNumber();

    }

    public static void getEvenNumber(){
        int modulo = 0;

        for (int i = 1; i <= 100; i++) {

            if ( i % 2 == modulo) {
                System.out.println("Even Number: " + i);
            }
        }
    }

    public static void getOddNumber(){
        int modulo = 0;

        for (int i = 1; i <= 100; i++) {

            if ( i % 2 != modulo) {
                System.out.println("Odd Number: " + i);
            }
        }
    }

}
