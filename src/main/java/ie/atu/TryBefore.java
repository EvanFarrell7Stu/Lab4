package ie.atu;

import java.util.Scanner;

public class TryBefore {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int age=0;
    System.out.print("Enter your age: ");
    String text = sc.nextLine().trim();
    age = Integer.parseInt(text);
    System.out.print("your age: " + age);



    }

}
