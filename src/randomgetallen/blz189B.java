package randomgetallen;

/**
 * Created by edwincox on 29-6-2017.
 */
public class blz189B {

    public static void main(String[] args){
        StringBuilder name = new StringBuilder();
        speak(name);
        System.out.println(name);
    }

    private static void speak(StringBuilder s) {
        s.append("Wendy");
    }

}
