package nl.edwincox;

public class Statements {
    public static void main(String[] args) {

        //Statements: if-then


        //Only execute code if expression is true
        boolean booleanExpression = true;
        if (booleanExpression) {
            // code to execute if true
        }

        // tussen de ( ) wordt expression genoemd

        int hourOfDay = 0;
        int morningGreetingCount= 0;
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
            morningGreetingCount++;
        }

        // Statements: if-then-else

        //Else blocks can be added to evaluate alternate branches
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

        // Statements: switch
        String probableCountryCode;
        String lastName = "Vries";
        switch (lastName) {
            case "Smith":
                probableCountryCode = "USA";
                break;
            case "Janssen":
            case "Vries":
                probableCountryCode = "NLD";
                break;
            default:
                probableCountryCode = null;
        }
        System.out.println(probableCountryCode);

        //Statements: while loop

        //Loops over a code block until expression is false
//        int number = 14;
//        while (!isPrime(number))
//            number++;

        // Statements: do-while loop
//        private int getNextPrime(int number) {
//            do {
//                number++;
//            } while (!isPrime(number));
//        }


        // Statements: for loop

        for (int i = 1; i < 43; i++)
            System.out.println("Example for " + i);

        // Using multiple variables in a single for loop
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.println(x);
        }

        // A safe short-hand to loop over all elements in a collection
        String[] testFrameworks = new String[] {"JUnit", "Cucumber",
                "Selenium"};
        for (String name : testFrameworks) {
            System.out.println("a short-hand to loop: " + name);
        }


        //All statements can be nested, including loops
//        for (int i = 1; i < 43; i++) {
//            if (isPrime(i)) {
//                System.out.println(i);
//            }
//        }

    }

}