package ie.atu;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class ResourceFeature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = sc.nextLine().trim();

        System.out.print("Enter a name to save: ");
        String name=sc.nextLine().trim();

        try(PrintWriter out=new PrintWriter(new FileWriter(filename, true)))
        {


            out.println(name);
            System.out.println("Saved to: "+filename);
            //out.close();  "try with resources" makes .close() redundant
        }
        catch(IOException ex){
            System.out.println("Could not write to file : "+ex);
        }
    }
}
