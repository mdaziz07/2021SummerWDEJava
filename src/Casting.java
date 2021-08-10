public class Casting {
    /*
    Casting : Converting one data type to another data type
    - Widening: no data loss
    - Narrowing: Data loss
     */

    public static void main(String[] args) {

/*
        // Narrowing
        long y = 32121878388L;
        int x = (int) y;
        // Widening
        int a = 123;
        long b = a;
        System.out.println(y);
        System.out.println(x);
        System.out.println(b);

 */
        // Wrapper Class : Primitive to Non-Primitive and vice-versa
        int x = 15;
        int y = 23;
        // primitive to non-primitive
        String l = String.valueOf(x);
        String k = String.valueOf(y);

        System.out.println(l);
        System.out.println(k);
        System.out.println(l+k);
        // non-primitive to primitive.
        System.out.println(Integer.valueOf(l) + Integer.valueOf(k));


    }

}
