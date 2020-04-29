package com.administration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        EmailAccount user1;
        System.out.println("Welcome to email account registration!");
        System.out.println("your firstname: ");
        String firstname= scanner.next();
        scanner.nextLine();
        System.out.print("your lastname: ");
        String lastname=scanner.next();
        scanner.nextLine();
        user1= new EmailAccount(firstname,lastname);
        printDetails(user1);
    }
    public static void printDetails(EmailAccount user1){
        System.out.println("Account Details: ");
        System.out.print(user1.toString());
    }
}
