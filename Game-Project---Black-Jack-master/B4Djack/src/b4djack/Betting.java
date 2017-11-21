package b4djack;

/*
 * @author Ben
 */
import javax.swing.*;
public class Betting{

    int Bet;
   static int potSize = 0;
  static int UserBet;
  static int UserBet2;
   
    
    
    
    public static void PlayerOneBet(){
     
        try{
            UserBet = Integer.parseInt(Window.GetBet.getText());
            System.out.println(UserBet);
            Window.P1Money.setText("$"+ Integer.toString(InitBetting.playerMoney - UserBet));
            InitBetting.playerMoney -= UserBet;
            Window.Pot.setText("Pot: $" + (potSize + UserBet));
        }
      catch(NumberFormatException e){
          Window.GetBet.setText("");
          JFrame f;
          f = new JFrame();
          JOptionPane.showMessageDialog(f, "Invalid Input");
          
      }
      
 
    }
    
    public static void PlayerTwoBet(){
        try{
        
            UserBet2 = Integer.parseInt(Window.GetBet.getText());
            System.out.println(UserBet2);
            Window.P2Money.setText("$"+ Integer.toString(InitBetting.player2Money - UserBet2));
            InitBetting.player2Money -= UserBet2;
            Window.Pot.setText("Pot: $" + (UserBet + UserBet2));
            
            
            
        }
      catch(NumberFormatException e){
          Window.GetBet.setText("");
          JFrame f;
          f = new JFrame();
          JOptionPane.showMessageDialog(f, "Invalid Input");
          
      }
        
    }
             
}
