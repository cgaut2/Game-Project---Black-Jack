package hitting;

import java.util.*;


public class Hitting {



static void hit(){
    
    
    
    int Card1 = new Card((int)Math.floor(Math.random()*13+1)).getValue();
    int Card2 = new Card((int)Math.floor(Math.random()*13+1)).getValue();
    int value = 0;
    int hvalue = 0;
    value = Card1+Card2;
    System.out.println("Your cards are a "+Card1+ " and a "+Card2 + " and the total value of your hand is: "+ value);
    

}
 private void addCard(Player p)
     {
         
         int gains = new Card((int)Math.floor(Math.random()*13+1)).getValue();
          
        p.hit(gains);
        // Somehow link this hit with my temp hand up there
     }
public static void main(String[] args) {
    hit();
    }
    
}
