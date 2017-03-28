package nl.edwincox;

/**
 * Created by edwincox on 26-2-2017.
 */
public class oefenblz91 {



    public static void main(String[] args) {

        FIRST_CHAR_LOOP: for (int a = 1; a <=4; a++){
            for (char x = 'a'; x <= 'c'; x++){
                if ( a == 2 || x == 'b')
                 continue FIRST_CHAR_LOOP;
                System.out.println(" " + a + x);
            }
        }


        System.out.println("------------------");

        boolean varken = true;

        System.out.println("niets gedaan " + varken);

        varken = !varken;

        System.out.println("wel gedaan " + varken);

    }





    }
