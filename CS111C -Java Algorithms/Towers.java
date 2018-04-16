// mohamed saada
// lab1a
// jgrasp
// javac 1.8.0_121
// windows 10

public class Towers {
    public static void main (String[] args) {
        solveTowers(5, 'a', 'b', 'c');
    } 
    // solveTowers: solves towers of hanoi
    public static void solveTowers(int count, char source, char spare, char destination) {
        if (count == 1) //base case: simplest solution
            System.out.println("Move the top disk from " + source + " to " + destination);
        else { //recursion: if we're not at the base case, solve more towers
            solveTowers(count - 1, source, destination, spare);
            solveTowers(1, source, spare, destination);
            solveTowers(count - 1, spare, source, destination);
        }
    }
}