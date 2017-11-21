

// Author: Ben Krajewski
// Editor: Justin Weiner

/*
allows the user to enter their bet through text box on the GUI
seperates player one and two to allow different bets
adds the amount bet to the pot in the middle
the dealer will double the pot
*/

package b4djack;


import javax.swing.*;
public class Betting{

    int Bet;
  public static int potSize = 0;
  static int UserBet;
  static int UserBet2;
   
    
    
    
    public static void PlayerOneBet(){
        
        try{
            UserBet = Integer.parseInt(Window.GetBet.getText());
            if(UserBet<0){
                UserBet=1/0;
            }
            //System.out.println(UserBet);
            Window.P1Money.setText("$"+ Integer.toString(InitBetting.playerMoney - UserBet));
            InitBetting.playerMoney -= UserBet;
            potSize +=UserBet;
            Window.Pot.setText("Pot: $" + (potSize));
        }
      catch(NumberFormatException e){
          Window.GetBet.setText("");
          JFrame f;
          f = new JFrame();
          JOptionPane.showMessageDialog(f, "Alright smartass, now there goes all of your money!");
          Window.P1Money.setText("$"+ Integer.toString(InitBetting.playerMoney - InitBetting.playerMoney));
          potSize+=InitBetting.playerMoney;
          InitBetting.playerMoney -= InitBetting.playerMoney;
          Window.Pot.setText("Pot: $" + (potSize));
      }
      catch(ArithmeticException z){
          Window.GetBet.setText("");
          JFrame f;
          f = new JFrame();
          JOptionPane.showMessageDialog(f, "Alright smartass, now there goes all of your money!");
          Window.P1Money.setText("$"+ Integer.toString(InitBetting.playerMoney -InitBetting.playerMoney));
          potSize+=InitBetting.playerMoney;
          InitBetting.playerMoney -= InitBetting.playerMoney;
          
          Window.Pot.setText("Pot: $" + (potSize));
      }
      
 
    }
    
    public static void PlayerTwoBet(){
        try{
        
            UserBet2 = Integer.parseInt(Window.GetBet.getText());
            if(UserBet2<0){
                UserBet2=1/0;
            }
            //System.out.println(UserBet2);
            Window.P2Money.setText("$"+ Integer.toString(InitBetting.player2Money - UserBet2));
            InitBetting.player2Money -= UserBet2;
            potSize+=UserBet2;
            Window.Pot.setText("Pot: $" + (potSize));
            
            
            
        }
      catch(NumberFormatException e){
          Window.GetBet.setText("");
          JFrame f;
          f = new JFrame();
          JOptionPane.showMessageDialog(f, "Alright smartass, now there goes all of your money!");
          Window.P2Money.setText("$"+ Integer.toString(InitBetting.player2Money - InitBetting.player2Money));
          potSize+=InitBetting.player2Money;
          InitBetting.player2Money -= InitBetting.player2Money;
          Window.Pot.setText("Pot: $" + (potSize));
          
      }
           catch(ArithmeticException z){
          Window.GetBet.setText("");
          JFrame f;
          f = new JFrame();
          JOptionPane.showMessageDialog(f, "Alright smartass, now there goes all of your money!");
          Window.P2Money.setText("$"+ Integer.toString(InitBetting.player2Money - InitBetting.player2Money));
          potSize+=InitBetting.player2Money;
          InitBetting.player2Money -= InitBetting.player2Money;
          Window.Pot.setText("Pot: $" + (potSize));
      }
        
    }
    
    public static void DealerBet(){
        potSize =potSize*2;
        Window.Pot.setText("Pot: $"+(potSize));
    }
             
}
