import lists.LinkedPositionalList;
import lists.Position;
import lists.PositionalList;
//301337741 Drew Oro
public class Q1 {
    public static void main(String[] args) {
        PositionalList<String> list = new LinkedPositionalList<>();
        Position<String> posA = list.addFirst("Drew");
        Position<String> posB = list.addAfter(posA, "Isaac");
        Position<String> posC = list.addAfter(posB, "Sohaib");
        Position<String> posD = list.addLast("John");
        System.out.println("Drew is in: " + list.indexOf(posA));
        System.out.println("Sohaib is in: " + list.indexOf(posB));
        System.out.println("Isaac is in: " + list.indexOf(posC));
        System.out.println("John is in: " + list.indexOf(posD));
        PositionalList<String> List_Test = new LinkedPositionalList<String>();
        System.out.println(List_Test.indexOf(posA));  //Null or -1
        list.addAfter(posB, "Chris");
        System.out.println("Isaac has now moved to: " + list.indexOf(posB));
        System.out.println("Sohaib has now moved to: " + list.indexOf(posC));
    }
}
