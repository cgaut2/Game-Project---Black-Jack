
package b4djack;


public class InitBetting extends Betting {
    

   static int playerMoney = 100;
   static int player2Money = 100;
    
public static void InitBets1P(){
    
    Window.P1Money.setText(String.valueOf("$" + playerMoney));

    }
public static void InitBets2P(){
    Window.P1Money.setText(String.valueOf("$" + playerMoney));
    Window.P2Money.setText(String.valueOf("$" + player2Money));
}
}