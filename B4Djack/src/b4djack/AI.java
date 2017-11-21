

// Author: Curtis Gauthier

/*
Determines when the dealer will draw more cards or stand.
Once the sum of the dealers cards is at least 17 he will stand
If it is over 21 he busts
Displays cards in the dealer hand section of GUI 
*/
package b4djack;
 class AI extends Window {
     public static int dealerTotal =0;
    static void dealerAI(){
       
        
        while (dealerTotal<=16){          
            int card = drawCard.drawCard();
            dealerTotal = dealerTotal + card;
            DealerCards.append(card+" ");
            
            
        }
        
        if (dealerTotal>=17){

            if (dealerTotal<=21){
                
                DealerCards.append("stand");
            }
            if (dealerTotal>21){
                DealerCards.append("bust");
                EndGame.DealerBust = true;
            }
        }
      
    
    }
    
}
//I made this before we put code together but it still works
class drawCard extends Hitting{
    public static int drawCard(){
        
        return(Hitting.addCard());
    }

 
    }

   
    

    


