// ask login or signup
// two attribites, name & mo.

package week1;

import java.util.*;

public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "";
        long contact = 0;
        String vname = "";
        long vcontact = 0;

        int x = 1;
        while (x >= 0) {
            System.out.println("Press 1 to Signup for new students. Press 2 to login for existing students");
            int entry = sc.nextInt();

            switch (entry) {
                case 1:
                    System.out.println("What's you name?");
                    name = sc.next();
                    System.out.println("What's you phone number?");
                    contact = sc.nextLong();
                    break;
                case 2:
                    System.out.println("Enter your name?");
                    vname = sc.next();
                    System.out.println("Enter your phone number?");
                    vcontact = sc.nextLong();
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
            if (name == vname && contact == vcontact) {
                System.out.println("Login successfull! Welcome " + name);
            } else if (name != vname && contact != vcontact) {
                System.out.println("Invalid credential!");
            }
            x--;
        }
    }
}
