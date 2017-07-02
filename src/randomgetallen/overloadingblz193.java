package randomgetallen;

/**
 * Created by edwincox on 28-6-2017.
 */
public class overloadingblz193 {

    public static void main(String[] args){

        overloadingblz193 done1 = new overloadingblz193();

        done1.flyspeed(3);

    }

//    public void flyspeed(int speed){
//        System.out.println(speed);
//    }
//
//
//    public int flyspeed(int speed){
//        System.out.println();
//        return speed;
//    }


    public void flyspeed(int speed){
        System.out.println("Int");
    }

    public void flyspeed(){
        System.out.println("Short");
    }


}
