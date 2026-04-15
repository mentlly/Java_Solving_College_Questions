//60. Develop a text analyzer using Java that takes a string input and performs the
//following operations: finds its length, extracts specific characters, modifies a
//substring, and converts numerical values to strings.

import java.util.Scanner;

public class q60 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a text: ");
            String text = sc.nextLine();
            
            // 1) Find length
            int length = text.length();
            System.out.println("Length of the text: " + length);
            
            // 2) Extract specific characters
            if (length > 0) {
                System.out.println("First character: " + text.charAt(0));
                System.out.println("Last character: " + text.charAt(length - 1));
            }
            
            System.out.print("Enter an index to extract character (0 to " + Math.max(0, length - 1) + "): ");
            int index = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            
            if (index >= 0 && index < length) {
                System.out.println("Character at index " + index + ": " + text.charAt(index));
            } else {
                System.out.println("Invalid index. No character extracted.");
            }
            
            // 3) Modify a substring
            System.out.print("Enter substring to replace: ");
            String oldPart = sc.nextLine();
            System.out.print("Enter new substring: ");
            String newPart = sc.nextLine();
            
            String modifiedText = text.replace(oldPart, newPart);
            System.out.println("Modified text: " + modifiedText);
            
            // 4) Convert numerical values to strings
            System.out.print("Enter an integer value: ");
            int intValue = sc.nextInt();
            System.out.print("Enter a decimal value: ");
            double doubleValue = sc.nextDouble();
            
            String intAsString = String.valueOf(intValue);
            String doubleAsString = String.valueOf(doubleValue);
            
            System.out.println("Integer as String: " + intAsString);
            System.out.println("Decimal as String: " + doubleAsString);
        }
    }
}
