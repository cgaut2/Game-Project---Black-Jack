package b4djack;

import java.util.*;


public class Hitting {
static int hvalue = 0;


static void  hand(){
    int Card1 = new Cards((int)Math.floor(Math.random()*13+1)).getValue();
    int Card2 = new Cards((int)Math.floor(Math.random()*13+1)).getValue();
    
    
    hvalue = Card1+Card2;
    System.out.println("Your cards are a "+Card1+ " and a "+Card2 + " and the total value of your hand is: "+ hvalue);
    
    
    

    

}
static int addCard()
     {
        
        int gains = new Cards((int)Math.floor(Math.random()*13+1)).getValue();
          return (gains);
        
        
     }

/*public static void main(String[] args) {
    hand();
    addCard();
    
    }
  */  

}


