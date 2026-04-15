//61. Develop a username validator using Java that checks whether a given username
//meets the following criteria: At least 6 characters long, contains only letters and
//digits, Starts with a letter.

import java.util.Scanner;

public class q61 {
    public static boolean isValidUsername(String username) {
        if (username.length() < 6) {
            return false;
        }
        if(!Character.isLetter(username.charAt(0))) {
            return false;
        }
        for(char ch : username.toCharArray()) {
            if(!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        if(isValidUsername(username)) {
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username");
        }
        sc.close();
    }
}
