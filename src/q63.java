//63. Develop a Java program that creates an ArrayList of names and a HashMap with
// names and ages. Print the contents of both the ArrayList and the HashMap.
// Implement a method to check if a specific name exists in both collections.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class q63 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();

        hashMap.put("samuel",19);
        hashMap.put("shreya", 19);
        hashMap.put("laya", 20);

        arrayList.add("samuel");
        arrayList.add("laya");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        if(hashMap.containsKey(name)) {
            System.out.println(name + " is in the hashmap");
        } else {
            System.out.println(name + " is not in the hashmap");
        }

        if(arrayList.contains(name)) {
            System.out.println(name + " is in the arraylist");
        } else {
            System.out.println(name + " is not in the arraylist");
        }
        sc.close();
    }
}
