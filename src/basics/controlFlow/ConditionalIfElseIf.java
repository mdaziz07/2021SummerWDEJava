package basics.controlFlow;

public class IfElseIf {

    /*
    Control flow - Code that can control the flow of a program, based on certain conditions.
        Conditional - Check whether an expression is true or false before executing or not
        executing certain blocks of code.
     */
    public static void main(String[] args) {
        ifConditional();
    }

    public static void ifConditional(){
        int a = 300;
        int b = 290;
        int c = 300;
        int d = 300;

        if (a > c){ // if it is true then the code block will execute and break out the loop. it will not check any other condition
            System.out.println("A is greater than C");
        } else if (b > d){
            System.out.println("B is greater than D");
        } else if (a < d){
            System.out.println("A is greater than D");
        } else { // if all the above conditions are false then else block will execute.
            System.out.println("None of the conditions were made");
        }
        /*
        We start the conditional using: if(condition) { }
        For multiple condition we use : else if(conditions) { }
        If no condition is met, and we use : else { }
         */
    }

}
