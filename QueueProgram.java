import java.util.Scanner;

public class QueueProgram {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Queue queue = new Queue();
        
        while (true) {
            print("1) Add item\n" +
                    "2) Show Queue items in odd positions\n" +
                    "3) Show Queue items in even positions\n" +
                    "\n" +
                    "4) Exit program\n" +
                    "Enter your choice (1-3): ");
            int number = keyboard.nextInt();
            keyboard.nextLine(); // clera buffer
    
    
            if (number == 1) {
                print("Enter item: ");
                queue.enqueue(keyboard.nextLine());
                print("\n");
            }
            else if (number == 2) {
                print("Queue items in odd positions: " + queue.oddListings() + "\n");
            }
            else if (number == 3) {
                print("Queue items in even positions: " + queue.evenListings() + "\n");
            }
            else {
                print("Goodbye\n");
                break;
            }
        }
    }
    
    static void print (String s) {
        System.out.print(s);
    }
}
