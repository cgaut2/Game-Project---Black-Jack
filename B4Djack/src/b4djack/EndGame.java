//Author Justin Weiner
//Minor edits: Curtis Gauthier

/*
Contains everything that is ran after the players are done their turns
Calls the dealer AI
Contains all possible win conditions
Eg. player 1 busts, dealer 19, player 2 20
    player 2 wins
gives winner the amount of money in the pot
*/


package b4djack;


public class EndGame {
  static boolean P1Bust=false;  
  static boolean P2Bust=false;
  static boolean DealerBust=false;
  static boolean P1Hold=false;
  static boolean P2Hold=false;
  static boolean P1Done = false;
  static boolean P2Done =false;
 
  public static void DealerGo(){
  //Starts AIs turn
   AI.dealerAI();   
  }
public static void ValueCheck() {
    //Checks to see if Player 1 buested
    if(Window.P1CardTotal >=22){
        P1Bust = true;
        P1Done = true;
        Window.P1Hit.setEnabled(false);
        Window.P1Stand.setEnabled(false);
        
    }
    if(Window.P2CardTotal >=22){
        //Checks to see if player 2 busted
        P2Bust = true;
        P2Done = true;
        Window.P2Hit.setEnabled(false);
        Window.P2Stand.setEnabled(false);
    }
    if(P1Hold){
        //Checks to see if player 1 held
        Window.P1Hit.setEnabled(false);
        Window.P1Stand.setEnabled(false);
        P1Done = true;
    }
    if(P2Hold){
        //Checks to see if player 2 held
        Window.P2Hit.setEnabled(false);
        Window.P2Stand.setEnabled(false);
        P2Done = true;
    }
 
    if(P1Done && P2Done){
        //Starts the dealers turn, then checks to see who won the game
        DealerGo();
        WinConditions();
    }
}

public static void WinConditions(){
        //Win conditions for if the dealer busts
       if(DealerBust){
           //Win conditions where both players don't bust
           //Win condition where player 1 beats player 2, giving player 1 his prize money
           if(!P1Bust&&!P2Bust){
               if(Window.P1CardTotal>Window.P2CardTotal){
                   Window.WinnerDisplay.setText("P1 Wins!");
                   InitBetting.playerMoney+=Betting.potSize;
               }
               //Win condition where player 2 beats player 1, giving player 2 his prize money
               else if(Window.P1CardTotal<Window.P2CardTotal){
                   Window.WinnerDisplay.setText("P2 Wins!");
                   InitBetting.player2Money+=Betting.potSize;
               }
               //Win condition where player 1 and player 2 tie, splitting the prize money between the 2 players
               else if(Window.P1CardTotal==Window.P2CardTotal){
                   Window.WinnerDisplay.setText("P1 and P2 tie!");
                   InitBetting.playerMoney+=(Betting.potSize/2);
                   InitBetting.player2Money+=(Betting.potSize/2);
               }
           }
           //Win condition where player 2 busts and player 1 doesn't giving player 1 his prize money
           else if(!P1Bust && P2Bust){
               Window.WinnerDisplay.setText("P1 Wins!");
               InitBetting.playerMoney+=Betting.potSize;
           }
           //Win condition where Player 1 busts and player 2 doesn't, giving player 2 his prize money
           else if(P1Bust && !P2Bust){
               Window.WinnerDisplay.setText("P2 Wins!");
               InitBetting.player2Money+=Betting.potSize;
           }
           //Win condition where everyone busts, giving the house the prize money
           else if(P1Bust && P2Bust){
               Window.WinnerDisplay.setText("Dealer Wins!");
           }
       }
       //Win condition where they both bust, giving the house the prize money
       else{
           if(P1Bust && P2Bust){
        Window.WinnerDisplay.setText("Dealer Wins!");
    }
           //Win Conditions where the dealer doesn't bust
           //Win condition where both players bust, giving the house the prize money
           if(!P1Bust&&!P2Bust){
               //Checks to see if player 1 beats player 2
               if(Window.P1CardTotal>Window.P2CardTotal){
                   //Win condition where the house beats everyone, with the prize money going back to the house
                   if(AI.dealerTotal>=Window.P1CardTotal){
                       Window.WinnerDisplay.setText("Dealer Wins!");
                   }
                   //Win condition where player 1 beats both player 2 and the dealer, giving him his prize money
                   else if(AI.dealerTotal<Window.P1CardTotal){
                       Window.WinnerDisplay.setText("P1 Wins!");
                       InitBetting.playerMoney+=Betting.potSize;
                   }
               }
               //Checks to see if player 2 beats player 1
               else if(Window.P1CardTotal<Window.P2CardTotal){
                   //Win condition where the house beats everyone, with the prize money going back to the house
                   if(AI.dealerTotal>=Window.P2CardTotal){
                       Window.WinnerDisplay.setText("Dealer Wins!");
                   }
                   //Win condition where player 2 beats both player 1 and the dealer, giving him his prize money
                   else if(AI.dealerTotal<Window.P2CardTotal){
                       Window.WinnerDisplay.setText("P2 Wins!");
                       InitBetting.player2Money+=Betting.potSize;
                   }
               }
               //Checks to see if the players tie
               else if(Window.P1CardTotal==Window.P2CardTotal){
                   //Win condition where the house beats everyone, with the prize money going back to the house
                   if(AI.dealerTotal>=Window.P2CardTotal){
                       Window.WinnerDisplay.setText("Dealer Wins!");
                   }
                   //Win condition where both players tie, but beat the dealer, letting them split the prize money
                   else if(AI.dealerTotal<Window.P2CardTotal){
                       Window.WinnerDisplay.setText("P1 and P2 Wins!");
                       InitBetting.playerMoney=Betting.potSize/2;
                       InitBetting.player2Money=Betting.potSize/2;
                   }
               }
           }
           //Checks to see if player 2 doesn't bust
           else if(P1Bust && !P2Bust){
               //Win condition where the house beats everyone, with the prize money going back to the house
               if(AI.dealerTotal>=Window.P2CardTotal){
                       Window.WinnerDisplay.setText("Dealer Wins!");
                   }
               //Window Condition where player 2 beats the dealer, giving him the prize money
                   else if(AI.dealerTotal<Window.P2CardTotal){
                       Window.WinnerDisplay.setText("P2 Wins!");
                       InitBetting.player2Money+=Betting.potSize;
                   }
           }
           //Checks to see if player 1 doesn't bust
           else if (!P1Bust && P2Bust){
               //Win condition where the house beats everyone, with the prize money going back to the house
                 if(AI.dealerTotal>=Window.P1CardTotal){
                       Window.WinnerDisplay.setText("Dealer Wins!");
                   }
                 //Win condition where player 1 beats the dealer, giving him the prize money
                   else if(AI.dealerTotal<Window.P1CardTotal){
                       Window.WinnerDisplay.setText("P1 Wins!");
                       InitBetting.playerMoney+=Betting.potSize;
                   }
           }
           
       }
}
}
