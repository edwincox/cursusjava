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
        System.out.println("Example 10,: Long " + z);

        z += 2L; // a is now 12
        System.out.println("Example 11,: Long " + z);

        //Relational Operators
        boolean smallerThan = 10 < 10; // false
        System.out.println("Example 10,: smallerThan " + smallerThan);

        boolean smallerThanOrEquals = 10 <= 10; // true
        System.out.println("Example 10,: smallerThanOrEquals " + smallerThanOrEquals);

        boolean greaterThan = 20 > 10; // true
        System.out.println("Example 10,: greaterThan " + greaterThan);

        boolean greaterThanOrEquals = 20 >= 10; // true
        System.out.println("Example 10,: greaterThanOrEquals " + greaterThanOrEquals);

        boolean sameType = "hello" instanceof String; // true
        System.out.println("Example 10,: sameType instanceof " + sameType);

        // Equality Operators
        boolean equal = 10 == 10; // true
        System.out.println("Example 10,: equal " + equal);

        boolean notEqual = 10 != 11; // true
        System.out.println("Example 10,: notEqual " + notEqual);

        // Logical Operators
        boolean logicalAnd = true & false; // false
        System.out.println("Example 10,: logical And " + logicalAnd);

        boolean logicalOr = true | false; // true
        System.out.println("Example 10,: logical Or " + logicalOr);

        boolean logicalExclusiveOr = true ^ true; // false
        System.out.println("Example 10,: logical Exclusive Or " + logicalExclusiveOr);

        // Short Circuit Logical Operators
//        int u = 8;
//        if (u != null && u.getValue() < 5) {
//            // x.getValue() will only be called when x != null is true
//            // u mag niet null zijn
//        }
//        int y = 6;
//        boolean result = (y >= 6) || (++y <= 7);
//        System.out.println(y + " result is: " + result);

        // Ternary Operator

        // Evaluates left or right operand, based on input operand
        boolean choice = false;
        System.out.println("Example 20,: choice " + choice);

        // is choise true waarde na ?  in dit geval 10 wordt aan value toegwezen
        // is choise flase waarde na : in dit geval 5 wordt aan value toegwezen
        int value = choice ? 10 : 5; // value is 10
        System.out.println("Example 21,: value " + value);

        // Precedence

        // Operators are evaluated in a specific order. Can be overriden with parentheses
        int x = 20 + 2 * 2; // 24
        System.out.println("Example 22,:  20 + 2 * 2 =  " + x);
        // * wordt als eerste uitgevoerd daarna de rest

        int y = (20 + 2) * 2; // 44
        System.out.println("Example 22,:  (20 + 2) * 2 =  " + y);
        // tussen ( ) haakjes wordt als eerste uitgevoerd daarna *



    }
}
