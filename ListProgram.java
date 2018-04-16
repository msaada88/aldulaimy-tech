import java.util.Scanner;

public class ListProgram {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        while (true) {
            print("What you want to do?\n" +
                    "1) Replace a value in a list of integers\n" +
                    "2) Compare two lists of integers\n" +
                    "3) Quit\n" +
                    "Enter your choice: ");
            
            int number = keyboard.nextInt();
            keyboard.nextLine();
            
            
            if (number == 1) {
                print("Enter a list of integers: ");
                ListReferencedBased aList = returnList();
                
                print("Enter a value to be modified: ");
                int numToReplace = keyboard.nextInt();
                keyboard.nextLine();
                
                print("Enter replacement value: ");
                int replaceWith = keyboard.nextInt();
                keyboard.nextLine();
                
                int numSwaps = aList.replace(numToReplace, replaceWith);
                
                print("Modified list: ");
                print(aList);
                print("Number of items replaced: " + numSwaps + "\n");
            }
            else if (number == 2) {
                print("Enter first list to be compared: ");
                ListReferencedBased l1 = returnList();
                print("Enter second list to be compared: ");
                ListReferencedBased l2 = returnList();
                
                if (l1.equals(l2)) {
                    print("The two lists are equal.\n");
                }
                else
                {
                    print("The two lists are not equal.\n");
                }
            }
            else {
                break;
            }
        }
    }
    
    static void print (String s) {
        System.out.print(s);
    }
    
    static void print (ListReferencedBased aList) {
        int length = aList.size();
        for (int i = 0; i < length; i++) {
            try {
                print(aList.get(i) + " ");
            }
            catch (ListIndexOutOfBoundsException e) {
                print("");
            }
        }
        print("\n");
    }
    
    static ListReferencedBased returnList() {
        Scanner keyboard = new Scanner(System.in);
        
        String numbersString = keyboard.nextLine();
        String[] numbersArray = numbersString.split(" ");
        
        ListReferencedBased aList = new ListReferencedBased();
        
        for (String s : numbersArray) {
            try {
                aList.add(aList.size(), Integer.parseInt(s));
            }
            catch (ListIndexOutOfBoundsException e) {
                print("");
            }
        }
        
        return aList;
    }
}
