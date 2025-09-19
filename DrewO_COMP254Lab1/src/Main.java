//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import linkedlists.SinglyLinkedList;
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<String> newList = new SinglyLinkedList<>();
        newList.addFirst("Drew");
        newList.addFirst("Matthew");
        newList.addFirst("Johnathan");
        System.out.println(newList);
        System.out.println(newList.size());
        System.out.println(newList.toString());
    }
}