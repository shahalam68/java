import java.util.*;
public class JavaInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Example of capturing a single word:
        // String input = sc.next();
        // System.out.println(input);

        // Example of capturing a full line:
        // String name = sc.nextLine();
        // System.out.println(name);

        // Example of capturing an integer:
        // int number = sc.nextInt();
        // System.out.println(number);

        // Capturing a boolean value:
        System.out.println("Enter a boolean value (true/false):");
        boolean bool = sc.nextBoolean();
        System.out.println("You entered: " + bool);
        
        sc.close(); // Good practice to close the Scanner.
    }
}
