package conditional;
import java.util.*;
public class oddEven {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("Even");
            
        }
        else{
            System.out.println("odd");
        }
    }
}
