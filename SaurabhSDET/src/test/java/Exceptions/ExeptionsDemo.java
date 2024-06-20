package Exceptions;

import java.util.Scanner;

public class ExeptionsDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no.");
        int num=sc.nextInt();
        System.out.println(100/num);     //ArithmeticException
    }
}
