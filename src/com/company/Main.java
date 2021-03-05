package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        nzToUsd();
    }


    public static void nzToUsd(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Amount in NZD");
        double NZD= sc.nextDouble();
        double USD = (NZD * 0.74);
        System.out.println("USD amount " + USD);
        next();
    }
    public static void next(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Do you want to calculate something else?");
        String reply = sc.next();
        if (reply.equals("Yes")  || reply.equals("yes") ) {
            nzToUsd();
        }
        else if (reply.equals("No")  || reply.equals("no")) {
            System.exit(0);
        }
        else {
            System.out.println("Please enter Yes, yes, no, or No");
            next();
        }
    }
}
