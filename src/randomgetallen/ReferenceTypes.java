package randomgetallen;

/**
 * Created by edwincox on 29-6-2017.
 */
public class ReferenceTypes {
    //Reference Types
    public void fly(int s){
        System.out.println("Int");
    }

    public void fly(long l){
        System.out.println("Long");
    }

    public static void main(String[] args){

        ReferenceTypes r = new ReferenceTypes();
        r.fly(444);
        r.fly(234L);
    }
}
