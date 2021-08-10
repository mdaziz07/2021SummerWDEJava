package firstPackage;

import basics.oopPractice.LearnEncapsulation;
import practice.LearnAccessModifiers;

public class Secondary {
    public static void main(String[] args) {
        System.out.println(LearnAccessModifiers.x);

        LearnAccessModifiers.doSomethingSpecial();
        LearnAccessModifiers.accessZVariable();

        LearnEncapsulation obj1 = new LearnEncapsulation();
        System.out.println(obj1.getAccount_bal());
    }
}
