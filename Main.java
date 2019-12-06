package main;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       System.out.println("HELLO WORLD!");
       Scanner scn = new Scanner(System.in);
       System.out.print("What's your name? ");
       String name = scn.nextLine();
       System.out.print("How old are you? ");
       int a = scn.nextInt();
       System.out.println("What's Your address)? ");
       String address = scn.nextLine();
       address = scn.nextLine();
	   
       System.out.println(" ");
       System.out.println("Konnichiwa " + name);
       System.out.println("You are " + a + "years old");
       System.out.println("You live at " + address);
    }
    
}
