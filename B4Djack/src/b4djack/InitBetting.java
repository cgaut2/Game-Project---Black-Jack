
package b4djack;


public class InitBetting extends Betting {
    

   static int playerMoney;
    
public static void InitBets(){
    int playerMoney =100 ;
    Window.P1Money.setText(String.valueOf("$" + playerMoney));

    }
}