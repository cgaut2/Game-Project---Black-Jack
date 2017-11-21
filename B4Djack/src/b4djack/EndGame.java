
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
   AI.dealerAI();   
  }
public static void ValueCheck() {
    if(Window.P1CardTotal >=22){
        P1Bust = true;
        P1Done = true;
        Window.P1Hit.setEnabled(false);
        Window.P1Stand.setEnabled(false);
        
    }
    if(Window.P2CardTotal >=22){
        P2Bust = true;
        P2Done = true;
        Window.P2Hit.setEnabled(false);
        Window.P2Stand.setEnabled(false);
    }
    if(P1Hold){
        Window.P1Hit.setEnabled(false);
        Window.P1Stand.setEnabled(false);
        P1Done = true;
    }
    if(P2Hold){
        Window.P2Hit.setEnabled(false);
        Window.P2Stand.setEnabled(false);
        P2Done = true;
    }
 
    if(P1Done && P2Done){
        DealerGo();
        WinConditions();
    }
}

public static void WinConditions(){

       if(DealerBust){
           if(!P1Bust&&!P2Bust){
               if(Window.P1CardTotal>Window.P2CardTotal){
                   Window.WinnerDisplay.setText("P1 Wins!");
                   InitBetting.playerMoney+=Betting.potSize;
               }
               else if(Window.P1CardTotal<Window.P2CardTotal){
                   Window.WinnerDisplay.setText("P2 Wins!");
                   InitBetting.player2Money+=Betting.potSize;
               }
               else if(Window.P1CardTotal==Window.P2CardTotal){
                   Window.WinnerDisplay.setText("P1 and P2 tie!");
                   InitBetting.playerMoney=Betting.potSize/2;
                   InitBetting.player2Money=Betting.potSize/2;
               }
           }
           else if(!P1Bust && P2Bust){
               Window.WinnerDisplay.setText("P1 Wins!");
               InitBetting.playerMoney+=Betting.potSize;
           }
           else if(P1Bust && !P2Bust){
               Window.WinnerDisplay.setText("P2 Wins!");
               InitBetting.player2Money+=Betting.potSize;
           }
       }
       else{
           if(P1Bust && P2Bust){
        Window.WinnerDisplay.setText("Dealer Wins!");
    }     
           if(!P1Bust&&!P2Bust){
               if(Window.P1CardTotal>Window.P2CardTotal){
                   if(AI.total>=Window.P1CardTotal){
                       Window.WinnerDisplay.setText("Dealer Wins!");
                   }
                   else if(AI.total<Window.P1CardTotal){
                       Window.WinnerDisplay.setText("P1 Wins!");
                       InitBetting.playerMoney+=Betting.potSize;
                   }
               }
               else if(Window.P1CardTotal<Window.P2CardTotal){
                   if(AI.total>=Window.P2CardTotal){
                       Window.WinnerDisplay.setText("Dealer Wins!");
                   }
                   else if(AI.total<Window.P2CardTotal){
                       Window.WinnerDisplay.setText("P2 Wins!");
                       InitBetting.player2Money+=Betting.potSize;
                   }
               }
               else if(Window.P1CardTotal==Window.P2CardTotal){
                   if(AI.total>=Window.P2CardTotal){
                       Window.WinnerDisplay.setText("Dealer Wins!");
                   }
                   else if(AI.total<Window.P2CardTotal){
                       Window.WinnerDisplay.setText("P1 and P2 Wins!");
                       InitBetting.playerMoney=Betting.potSize/2;
                       InitBetting.player2Money=Betting.potSize/2;
                   }
               }
           }
           else if(P1Bust && !P2Bust){
               if(AI.total>=Window.P2CardTotal){
                       Window.WinnerDisplay.setText("Dealer Wins!");
                   }
                   else if(AI.total<Window.P2CardTotal){
                       Window.WinnerDisplay.setText("P2 Wins!");
                       InitBetting.player2Money+=Betting.potSize;
                   }
           }
           else if (!P1Bust && P2Bust){
                 if(AI.total>=Window.P1CardTotal){
                       Window.WinnerDisplay.setText("Dealer Wins!");
                   }
                   else if(AI.total<Window.P1CardTotal){
                       Window.WinnerDisplay.setText("P1 Wins!");
                       InitBetting.playerMoney+=Betting.potSize;
                   }
           }
       }
}
}
