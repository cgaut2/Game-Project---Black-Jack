
package b4djack;



 class AI extends Window {
    static void dealerAI(int upCard, int downCard, int total) throws InterruptedException{
        DealerCards.append(Integer.toString(upCard)+" ");
        total = upCard;
        while (total<=16){          
            int card = drawCard.drawCard();
            total = total + card;
            DealerCards.append(card+" ");
            
            
        }
        
        if (total>=17){
            DealerCards.append(Integer.toString(downCard)+" ");
            total = total + downCard;
            if (total<=21){
                
                DealerCards.append("stand");
            }
            if (total>21){
                DealerCards.append("bust");
            }
        }
      
    
    }
    
}
class drawCard extends Hitting{
    public static int drawCard(){
        
        return(Hitting.addCard());
    }

 
    }

   
    

    


