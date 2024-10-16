package week1;
import java.util.*;
public class oddevenconversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        
        if(a%2==0){
            System.out.print("Entered number is even. Converted to odd: ");
            a += 1;
            System.out.println(a);
        }else {
            System.out.print("Entered number is odd. Converted to even: ");
            a +=1;
            System.out.println(a);
        }
        sc.close();
    }
}
