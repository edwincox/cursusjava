package nl.edwincox;

/**
 * Created by edwincox on 22-2-2017.
 */
public class oefenblz72 {

    public static void main(String args[]) {
        int y = 1;
        int z = 1;

        final int x = y < 10 ? y++ : z++;
        System.out.println(y + " , " + z);
    }

}
