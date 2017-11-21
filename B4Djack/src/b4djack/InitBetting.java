
package b4djack;


public class InitBetting extends Betting {
    

   public static int playerMoney = 100;
   public static int player2Money = 100;
   public static int dealerMoney = 99999;
    

public static void InitBets2P(){
    Window.P1Money.setText(String.valueOf("$" + playerMoney));
    Window.P2Money.setText(String.valueOf("$" + player2Money));
    Window.DealerMoney.setText(String.valueOf("$"+dealerMoney));
}
}

