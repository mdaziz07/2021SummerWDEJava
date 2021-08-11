package basics.controlFlow;

public class ForLoops {

    /*
    For Loops - Used ONLY when we know EXACTLY how many times we would like to loop/iterate
     */

    public static void main(String[] args) {
            //Start      While true, run this loop         Step
        for (int i = 0;         i < 10;                     i++) {
            System.out.println("The value of i is: " + i);
            for (int j = 0; j < 2; j++){
                System.out.println("--------");
            }
        }
    }
}
