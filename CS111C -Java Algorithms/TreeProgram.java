import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TreeProgram {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner keyboard = new Scanner(System.in);
        BinarySearchTree<KeyString, String> tree = new BinarySearchTree<>();
    
        System.out.print("Tree sort program\n" +
                "Enter name of input file: ");
    
        String path = keyboard.nextLine();
        keyboard.close();
        Scanner file = new Scanner(new File(path));
    
        System.out.println("\nBinary search tree:\n");
        
        while (file.hasNext()) {
            String s = file.nextLine();
            KeyString key = new KeyString(s);
            tree.insert(key);
        }
        
        tree.display();
    }

    private static class KeyString extends KeyedItem<String> {
        KeyString(String s) {
            super(s);
        }
        
        public String toString() {
            return getKey();
        }
    }
}

