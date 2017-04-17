package nl.edwincox;

public class blz127 {


    public static void main(String... args) {

    String[][] rectangle = new String[3][2];
//
        rectangle[0][1] = "Edwin";
//
//        //System.out.println(rectangle[1][2]);
//        System.out.println("Beginnen " + rectangle.length);
//
//        for(int x=0;x < rectangle.length;x++){
//
//            for(int y=0; y < 2;y++) {
//                System.out.println("y=" + y + "x=" + x);
//                System.out.println(rectangle[x][y]);
//            }
//
//        }


        for(String[] inner : rectangle){
            //System.out.println(inner + "cont");
            for(String num : inner)
                System.out.println(num + "");
            System.out.println();
        }


    }

}