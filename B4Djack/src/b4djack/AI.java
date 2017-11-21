
package b4djack;



 class AI extends Window {
     public static int total =0;
    static void dealerAI(){
       
        
        while (total<=16){          
            int card = drawCard.drawCard();
            total = total + card;
            DealerCards.append(card+" ");
            
            
        }
        
        if (total>=17){

            if (total<=21){
                
                DealerCards.append("stand");
            }
            if (total>21){
                DealerCards.append("bust");
                EndGame.DealerBust = true;
            }
        }
      
    
    }
    
}
class drawCard extends Hitting{
    public static int drawCard(){
        
        return(Hitting.addCard());
    }

 
    }

   
    

    


