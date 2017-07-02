package nl.edwincox;

/**
 * Created by edwincox on 11-6-2017.
 */
public class Stringbulder{

        public static void main(String[] args) {

//            StringBuilder nameBuilder = new StringBuilder();
//
//            System.out.println(nameBuilder.toString());
//
//            nameBuilder.append("Edwin ");
//            System.out.println(nameBuilder);
//
//            nameBuilder.append("Chuck").append(" Norris");
//            System.out.println(nameBuilder.toString());
//
//            String name = nameBuilder.toString();
//            System.out.println(name);


            String nameBuilder = "Chuck";

            char df = nameBuilder.charAt(1);
            System.out.println(df);

            int length = nameBuilder.length(); // number of characters
            System.out.println(length);

            int index = nameBuilder.indexOf('k'); // index of k if found, or -1
            System.out.println(index);

            String initial = nameBuilder.substring(0, 1); // "C"  van 0  tot 1  1 niet meer rekenen
            System.out.println(initial);

            StringBuilder nameBuildervoet = new StringBuilder();
            nameBuildervoet.append("Chuck").append(" Norris");
            nameBuildervoet.insert(5, "-"); // "Chuck- Norris"
            nameBuildervoet.delete(1, 3); // "Cck- Norris"
            nameBuildervoet.deleteCharAt(3); // "Cck Norris"
            nameBuildervoet.reverse(); // "sirroN kcC"



        }

}
