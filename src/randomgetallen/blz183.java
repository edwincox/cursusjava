package randomgetallen;

/**
 * Created by edwincox on 27-6-2017.
 */
public class blz183 {




    private String name = "Static class";

    // static methode
    public static void first(){};

    // static methode
    public static void second(){};

    // instance methode
    public void third(){
        System.out.println(name);
    };

    public static void main(String[] args){


        first();
        second();
        //third();

    }


}
