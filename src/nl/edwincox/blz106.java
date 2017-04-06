package nl.edwincox;

public class blz106 {

    public static void main(String args[]) {

        // blz 106 en109

        String s = "voetbal";

        //s .length();
        System.out.println(s.length());

        // s.charAt(1) positief 1  = van voetbal de letter o
        System.out.println(s.charAt(1));

        // indexOF()
        System.out.println("indexof: " +  s.indexOf('l'));

        // substring
        String woord = "animals";
        System.out.println(woord.substring(3)); // mals , begin 3 till end
        System.out.println(woord.substring(3, 4)); // m , begin 3 till staop at 4

        // tolowercase and to uppercase
        System.out.println("Hoofdletters uppercase: " + woord.toUpperCase()); // Upper case
        System.out.println("kleineletters lowercase: " + woord.toLowerCase()); // Upper case

        // equals and equalsignorecase
        System.out.println("equals = " + woord.equals("animals")); // is string woord  het zelfde ?   true of false is result
        System.out.println("equalsIgnoreCase = " + woord.equalsIgnoreCase("AniMals")); // kleine of hoofdletters maakt niet uit

        // start with and ends wit
        System.out.println("startsWith = " + woord.startsWith("a")); // begint met een a // true
        System.out.println("endsWith = " + woord.endsWith("l")); // eindigt met l    // false

        // contains
        System.out.println("contains = " + woord.contains("a")); // begint met een a // true
        System.out.println("contains = " + woord.contains("x")); // begint met een a // true

        // replace
        System.out.println("replace = " + woord.replace("a", "XXX")); // begint met een a // true

        //trim
        String voet = "A \n k";
        System.out.println("trim = " + voet.trim()); // trim haalt alles weg wat er om heen zit

        // van alles door elkaar
        String oefen = "bOxEn     ".trim().toLowerCase().replace("b", "zzZz");
        System.out.println(oefen);

    }

}
