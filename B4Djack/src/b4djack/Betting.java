/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b4djack;

import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class Betting {
    int Bet;
    
    
    public Betting(){
    
    int Bet = Integer.parseInt(Window.GetBet.getText());
    }
    public static void PlayerOneBet(){
       int playerMoney = 100;
      Betting P1Bet = new Betting();
      int money= P1Bet.Bet;
      System.out.println(P1Bet.Bet);
      System.out.println(money);
    }
   
    
    public static void PlayerTwoBet(){
        int playerMoney = 100;
        int player2Money = 100;
    }
             
}
