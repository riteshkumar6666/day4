package com.company;
import java.util.Scanner;

public class Uc2 {
    // Use method to roll die
    static void rolldie() {
        int min=1;
        int max=6;
        int Number= (int) Math.floor(Math.random()*(max-min)+min);

        System.out.println("Die = "+Number);
    }

    public static void main(String[] args) {

        int position=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter how many players want to play");
        int player=sc.nextInt();

        System.out.println("Player in the position = "+position);

        // Function call
        rolldie();
    }
}




