// 1benchpress - 3c - l
// 1pushup - 1c - l
// 5kg dumbell, 1min - 2c - l 
//  bool - 1tspoon - 5c g

package week1;
import java.util.*;

public class calorie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many benchpress you did?");
        int benchpress = sc.nextInt();
        
        System.out.println("How many pushups you did?");
        int pushup = sc.nextInt();

        System.out.println("What's your dumbell weight?");
        int dweight = sc.nextInt();

        System.out.println("How many minutes did you do dumbells?");
        int time = sc.nextInt();

        System.out.println("Did to take protein shake?");
        boolean pshake = sc.nextBoolean();
        int tspoon = 0;
        if (pshake){
            System.out.println("How many teaspoon protein shake you took?");
            tspoon = sc.nextInt();
        }

        int total = benchpress * 3 + pushup * 1 + (dweight/5 * time * 2) - (tspoon * 5);

        System.out.println("Total calories burn: " + total);

        sc.close();
    }
}
