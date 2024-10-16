package week1;

import java.util.*;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int a  = sc.nextInt();
        if(a%2==0){
            System.out.println("A is even");
        }else {
            System.out.println("A is odd");
        }
        sc.close();
    }
}
