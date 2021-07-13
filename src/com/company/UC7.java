package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class UC7 {
    public void startGame()
    {
        int player1 =0, player2=0;
        int currentPlayer=-1;
        Scanner s = new Scanner(System.in);
        String str;
        int diceValue =0;
        int rollDice;
        do
        {
            System.out.println(currentPlayer==-1?"\n\nFIRST PLAYER TURN":"\n\nSECOND PLAYER TURN");
            System.out.println("Press r to roll Dice");
            str = s.next();
            diceValue = rollDice();
            int calculatePlayerValue;
            boolean isWin;



            if(currentPlayer == -1)
            {
                player1 = calculatePlayerValue(player1,diceValue);
                System.out.println("First Player :: " + player1);
                System.out.println("Second Player :: " + player2);
                System.out.println("------------------");
                if(isWin(player1))
                {
                    System.out.println("First player wins");
                    return;
                }
            }
            else
            {
                player2 = calculatePlayerValue(player2,diceValue);
                System.out.println("First Player :: " + player1);
                System.out.println("Second Player :: " + player2);
                System.out.println("------------------");
                if(isWin(player2))
                {
                    System.out.println("Second player wins");
                    return;
                }
            }

            currentPlayer= -currentPlayer;



        }while("r".equals(str));
    }
}
