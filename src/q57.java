//57. Develop a Java program that takes a user's full name as input and displays the 
//name in uppercase, lowercase, and its length.

import java.util.Scanner;

public class q57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name:");
        String name = sc.nextLine();
        System.out.println("Your name in uppercase: "+name.toUpperCase());
        System.out.println("Your name in lowercase: "+name.toLowerCase());
        System.out.println("Your name length:"+ name.length());
    }
}