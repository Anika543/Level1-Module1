package _05_popcorn;

import java.util.Scanner;

public class PopcornMaker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.println("What flavor would you like for your popcorn?");
        String flavor = scan.nextLine();
        System.out.println("How many minutes would you like to microwave your popcorn?"); 
        int cookTime = scan.nextInt();

        Popcorn pop = new Popcorn(flavor); 
        Microwave m = new Microwave();

        m.putInMicrowave(pop);
        m.setTime(cookTime);
        m.startMicrowave();
        
        pop.applyHeat();
        pop.eat(); 
    }
}
