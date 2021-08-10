public class LearnStatic {

    // Class comprised of two things: states and behaviors
    /*
    We can not call a non-static class members(variable or method) from other non-static
    methods whether they are in the same class or entirely in different class.
    In order to call non-static member from static methods, we need to create an object
    of the class where class members lives.
     */

    String name = "Aziz";

   /*
   public static void main(String[] args) {
        LearnStatic obj = new LearnStatic();
        obj.printName();
    }
    */

    public void printName(){
        System.out.println("My name is " + name);
    }

}


