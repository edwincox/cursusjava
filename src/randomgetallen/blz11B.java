package randomgetallen;

import java.util.Random;

public class blz11B {

    public int getRandomGetal(){
        Random r = new Random();
        int randomGetal = r.nextInt(5);
        return randomGetal;
    }
}
