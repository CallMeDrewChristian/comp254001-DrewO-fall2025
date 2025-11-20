public class Q2 {
    public static void main(String[] args) {
        LinkedBinaryTree lbt = new LinkedBinaryTree();
        Position<String> root = lbt.addRoot("Game Programming");
        Position<String> Engines = lbt.addLeft(root, "Game Engines");
        Position<String> Unity = lbt.addLeft(Engines, "Unity");
        Position<String> Unreal = lbt.addRight(Engines, "Unreal Engine");
        Position<String> Languages = lbt.addRight(root, "Languages");
        Position<String> C_Sharp = lbt.addLeft(Languages, "C#");
        Position<String> C_Plus = lbt.addRight(Languages, "C++");
        Position<String> C_SharpA = lbt.addLeft(C_Sharp, "A");
        Position<String> C_SharpB = lbt.addLeft(C_SharpA, "B");
        Position<String> C_SharpC = lbt.addLeft(C_SharpB, "C");
        System.out.println("The Height of C_SharpC is: " + lbt.postorderHeight(C_SharpC));
        System.out.println("The Height of C_SharpC is: " + lbt.postorderHeight(C_Sharp));
    }
}
