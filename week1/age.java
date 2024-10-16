// age < 3 :: no fare
// age >3 :: 100%
// age >60 :: 70%
// student :: 50%
package week1;
import java.util.*;
public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the full fare?");
        int fare = sc.nextInt();
        System.out.println("What's your age?");
        int age = sc.nextInt();

        if(age < 3 ){
            System.out.println("Infants can travel for free!");
        }else if(age > 3 && age < 60){
            System.out.println("Are you a student?");
            boolean student = sc.nextBoolean();
            if(student){
                System.out.println("Student get 50% discount. Fare is " + fare/2);
            }else{
                System.out.println("No discount. Fare is " + fare);
            }
        }else if(age > 60){
            System.out.println("Senior citizen get 30% discount. Fare is " + (fare*70)/100);
        }
        sc.close();
    }
}
