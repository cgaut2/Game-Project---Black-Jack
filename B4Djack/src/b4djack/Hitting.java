package hitting;

import java.util.*;


public class Hitting {
static int hvalue = 0;


static void  hand(){
    int Card1 = new Card((int)Math.floor(Math.random()*13+1)).getValue();
    int Card2 = new Card((int)Math.floor(Math.random()*13+1)).getValue();
    
    
    hvalue = Card1+Card2;
    System.out.println("Your cards are a "+Card1+ " and a "+Card2 + " and the total value of your hand is: "+ hvalue);
    
    
    

    

}
static void addCard()
     {
        
        int gains = new Card((int)Math.floor(Math.random()*13+1)).getValue();
          
        int nhand1 = hvalue+gains;
        
        System.out.println("Your hit card equals "+gains);
        
     }
public static void main(String[] args) {
    hand();
    addCard();
    
    }
    
}
