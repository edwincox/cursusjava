package randomgetallen;

/**
 * Created by edwincox on 2-7-2017.
 */
public class blz203 {

    private String name = "Torchie";
    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }
    {
        COUNT++;
        System.out.println(COUNT);
    }

    public blz203() {
        System.out.println("Constructor");
    }

    public static void main(String[] args){
        System.out.println("read to constructor");
        new blz203();
    }
}
