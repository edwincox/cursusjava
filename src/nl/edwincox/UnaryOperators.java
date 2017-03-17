package nl.edwincox;

public class UnaryOperators {
public static void main(String[] args) {

    //Unary Operators

    boolean thruth = true;  // true
    System.out.println("Example 1: " + thruth);

    boolean lie = !thruth; // false
    System.out.println("Example 2: " + lie);

    int value = +10; // allowed, but + prefix always meaningless
    System.out.println("Example 3: " + value);


    int age = 30;  // age variable wordt 30


    //Prefix: increment first, then return result
    //Postfix: return result first, then increment
    int previousAge = age++; // age is now 31, previousAge 30
    System.out.println("Example 4: age++ newage= " + previousAge + " age= " + age  );

    int newAge = ++age; // newAge is now 32, age is 32
    System.out.println("Example 5: ++age newage= " + newAge + " age= " + age  );


 }
}