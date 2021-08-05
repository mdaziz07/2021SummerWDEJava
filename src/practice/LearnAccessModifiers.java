package practice;

public class LearnAccessModifiers {
/*
Access modifiers allow us to restrict access to members of a class.
    - public - able to access globally within the project
    - protected - able to access within same package.
    - private  - only access by member of same class.
 */
    static public int x = 10; // can be call within project. call by Secondary class from different package
    static protected int y = 20; // can be call within same package. call by Tertiary class
    static private int z = 30;  // only can be access by members within this class

    public static void main(String[] args) {
        System.out.println(x);
        accessZVariable();
    }
// public method can be call from different class within same Project.
    // we will call it from Secondary class.

    public static void doSomethingSpecial() {
        int a = x + y + z;

        System.out.println(a);
    }

    public static void accessZVariable(){
        System.out.println(z);
    }
}
