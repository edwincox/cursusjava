package nl.edwincox;

/**
 * Created by edwincox on 5-4-2017.
 */
public class stringbuild {

    public static void main(String args[]) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10);

        sb3 = sb2;

        sb2.append("voetbal"); // wijzig sb2 maar sb3 wijzigd ook omdat de reference naar het zelfde is

        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " +  sb2);
        System.out.println("sb3 = " + sb3);

        //
        //
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
