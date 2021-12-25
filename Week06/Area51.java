package Week06;
import java.util.Scanner;


public class Area51 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = kb.nextInt();
        System.out.print("Enter y : ");
        int y = kb.nextInt();

        int z = x*y;
        System.out.println("คำตอบ : " +x  + " + " +  y + " = "+ z);
        
    }
    
}
