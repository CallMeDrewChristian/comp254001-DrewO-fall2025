public class Q1 {
    public static void main(String[] args) {
        LinkedBinaryTree lbt = new LinkedBinaryTree();
        Position<String> root = lbt.addRoot("Game Programming");
        Position<String> Engines = lbt.addLeft(root, "Game Engines");
        Position<String> Unity = lbt.addLeft(Engines, "Unity");
        Position<String> Unreal = lbt.addRight(Engines, "Unreal Engine");
        Position<String> Languages = lbt.addRight(root, "Languages");
        Position<String> C_Sharp = lbt.addLeft(Languages, "C#");
        Position<String> C_Plus = lbt.addRight(Languages, "C++");
        System.out.println("The next node (ig) in a preorder transversal is: " + lbt.preorderNext(C_Sharp).getElement() );
        System.out.println("The next node (ig) in a preorder transversal is: " + lbt.preorderNext(Unity).getElement() );
        System.out.println("The next node (ig) in a preorder transversal is: " + lbt.preorderNext(Unreal).getElement() );

        /*
        The worst case for a preorder transversal is if the Tree has a lot of left sided leafs, where it would be O(n)
         */
    }
}
