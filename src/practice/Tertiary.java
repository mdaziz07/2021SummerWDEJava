package practice;

public class Tertiary {
    public static void main(String[] args) {
        System.out.println(LearnAccessModifiers.y);
        // we will not able print z's value because z is protected and accessible
        // within method of same class.
        //System.out.println(LearnAccessModifiers.z);
    }
}
