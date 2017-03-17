package nl.edwincox;

public class BinaryArithmeticOperators {
    public static void main(String[] args) {

        int addition = 10 + 2; // 12
        System.out.println("Example 1, optellen: " + addition);

        int substraction = 10 - 2; // 8
        System.out.println("Example 2, aftrekken: " + substraction);

        int division = 10 / 2; // 5
        System.out.println("Example 3, delen: " + division);

        int multiply = 10 * 2; // 20
        System.out.println("Example 4, keer: " + multiply);

        int modulus = 10 % 2; // 0
        System.out.println("Example 5, modules: " + modulus);

        //Primitive number types
        // byte
        // short
        // char
        // int
        // long

        //Result is automatically converted to highest value
        int a = 10;
        System.out.println("Example 6,: " + a);
        long b = 12L;
        System.out.println("Example 7,: " + b);
        long c = a + b;
        System.out.println("Example 8,: " + c);
        //int d = a + b; // compiler error
        System.out.println("Example 9,: compiler error ");

        // Compound Assignment
        long z = 10L;
        System.out.println("Example 10,: compiler error " + z);

        z += 2L; // a is now 12
        System.out.println("Example 11,: compiler error " + z);




    }
}
