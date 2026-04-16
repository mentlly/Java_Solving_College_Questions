// 53. Write a Java program that throws a user-defined exception
// InsufficientBalanceException when withdrawal amount exceeds balance.

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }   
}

public class q53 {
    public static void main(String[] args) {
        int money = 5000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amt wanna withdraw: ");
        try {
            int withdraw_amt = sc.nextInt();
            sc.nextLine();
            if (withdraw_amt > money) 
                throw new InsufficientBalanceException("Invalid amt in bank");
            else
                money -= withdraw_amt;
        }catch (InsufficientBalanceException e ) {
            System.out.println(e);
        }
        System.out.println("Balance amt: "+money);
    }
}
