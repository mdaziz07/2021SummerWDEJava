package basics.oopPractice;

public class LearnEncapsulation {

    // Encapsulation : Data Hiding

    private double account_bal = 50.35;

    // to get the value of private variable
    public double getAccount_bal() {
        return account_bal;
    }

/*
    public static void main(String[] args) {
        LearnEncapsulation obj = new LearnEncapsulation();
        System.out.println(obj.getAccount_bal());
    }
*/
}
