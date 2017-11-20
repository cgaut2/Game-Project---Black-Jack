
package b4djack;


public class B4Djack  {
    static Window NewFrame= new Window();
    static MainMenu NewFrame2 = new MainMenu();
    
      

    public static void main(String[] args) {
        NewFrame2.setVisible(true);
       
       
    
    
}
    public static void ChooseGame(){
         if(MainMenu.ChooseOnePlayer){
           OnePlayer.OnePlayer(); 
        }
         else if (!MainMenu.ChooseOnePlayer){
             TwoPlayer.TwoPlayer();
         }
         else{
             System.out.println("Something went wrong if you got here");
         }
    }

class OnePlayer extends OnePlayerGame{
    
}

class TwoPlayer extends TwoPlayerGame{

}
}