

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
       
        //Dealer drwars cards until dealers card values are 16 or over
        while (dealerTotal<=16){          
            int card = drawCard.drawCard();
            dealerTotal = dealerTotal + card;
            DealerCards.append(card+" ");
            
            
        }
        //Checks to see if dealer busts or not once he draws a card while his caerd values are 16 or greater
        if (dealerTotal>=16){

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
        //draws a card for the dealer
        return(Hitting.addCard());
    }

 
    }

   
    

    


