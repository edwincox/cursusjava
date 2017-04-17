package nl.edwincox;


import java.util.ArrayList;

public class blz130 {

    public static void main(String... args) {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // Begin array grote
        System.out.println("Wat is de grote bij aanmaken list array " + list1.size());

        // Toevoegen aan de list met add
        list1.add("Nelly");
        list1.add("Edwin");
        list1.add("Nicolette");


        // Remove uit de arraylist
        System.out.println(list1.remove("Edwin") + " : Remove ");

        // Size Grootte Array list
        System.out.println("Wat is de grote bij aanmaken list array " + list1.size());

        // Set change the element of the arraylist
        System.out.println("Set : " + list1.set(1, "gewisseld met waar nicolette"));

        // isempty en size kijken hoeveel of de slots in gebruikt zijn
        System.out.println("Empty gebruik = " + list1.isEmpty());  // False wanneer er waardes zijn de array list andes true bij leeg
        System.out.println("Size gebruik = " + list1.size());

        // Clear Alles is leeg in de array list
        System.out.println("Voor clear gebruikt is Empty gebruik = " + list1.isEmpty());
        list1.clear();
        System.out.println("Na gebruik van clear laat Empty gebruik = " + list1.isEmpty());
        System.out.println("laat grote zien na gebruik clear, Size gebruik = " + list1.size());

        // Contains() zit waar de er in ?
        System.out.println("Na clear nieuwe waarde in list zetten met: "+ list1.add("Leo"));
        System.out.println("Zit de waarde leo in de list? : "+ list1.contains("Leo"));

        // equals compare two list see if they contain the same elements
        System.out.println();
        System.out.println("list 1 en list 2 zijn het zelfde? : " + list1.equals(list2));
        System.out.println("list 1 : " + list1.size());
        System.out.println("list 2 : " + list2.size());

        // copie list 1 naar list 2
        list2 = list1;

        System.out.println();
        System.out.println("list 1 en list 2 zijn het zelfde poging 2? : " + list1.equals(list2));
        System.out.println("list 1 : " + list1.size());
        System.out.println("list 2 : " + list2.size());


    }
}