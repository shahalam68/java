package conditional;

public class largestOfThree {
    public static void main(String[] args) {
        int A = 1, B = 8, C = 6;
        if ((A>=B) &&(A>=C)) {
            System.out.println("the largest number is A");
        }  
        else if ((A<=B) && (C<=B)){
            System.out.println("Largest number is B");
        }
        else{
            System.out.println("Largest is c");
        }
    }
}
