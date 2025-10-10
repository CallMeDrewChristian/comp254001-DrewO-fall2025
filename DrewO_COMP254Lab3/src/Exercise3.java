//Drew Oro 301337741 F25 COMP254-001
import java.util.Scanner;
import java.io.File;
public class Exercise3 {
    public static void find(File path, String filename) {
        if (path.getName().equals(filename)) {
            System.out.println("Found: " + path.getAbsolutePath());
        }
        if (path.isDirectory()) {
            String[] children = path.list();

            if (children != null) { //Permission
                for (String childname : children) {
                    File child = new File(path, childname);
                    find(child, filename);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String inputFileName = scanner.next();
        String userHome = System.getProperty("user.home"); //Goes to the User's Home (C:\Users\User)
        File homeDir = new File(userHome); //Starts at Home!
        find(homeDir, inputFileName); //Starts Method

        System.out.println();
        System.out.println("Search complete!");
    }
}
