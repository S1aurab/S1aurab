package Exceptions;

import java.util.Scanner;

public class HandleException {

        public static void main(String[] args) {
            System.out.println("program is started");
            Scanner sc= new Scanner(System.in);
            System.out.println("enter a no.");
            int num=sc.nextInt();
            try{
                System.out.println(100/num);
            }
            catch( ArithmeticException e) {
                System.out.println("Invalid data provided");
                System.out.println(e.getMessage());
            }
            System.out.println("program is completed");
        }
    }


