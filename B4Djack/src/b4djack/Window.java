
//Author Justin Weiner
//minor edits: Curtis Gauthier

/*
Creates the GUI of the game
Contains buttons which lead to bet,stand hit
Creates turn system which allows players to each pick a card and bet on their own turn
*/
package b4djack;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Window extends javax.swing.JFrame {

    boolean P1Turn = true;
    boolean checkBet = false;
    static int P1CardTotal;
    static int P2CardTotal;
    int card;

    public Window() {
        initComponents();
        EndGame.DealerBust=false;
        EndGame.P2Bust=false;
        EndGame.P1Bust=false;
        EndGame.P1Done=false;
        EndGame.P2Done=false;
        EndGame.P1Hold=false;
        EndGame.P2Hold=false;
        P1CardTotal =0;
        P2CardTotal =0;
        AI.dealerTotal=0;
        checkBet=false;
        Betting.potSize=0;
        P1Turn = true;
        DealerCards.setEnabled(false);
        P1Cards.setEnabled(false);
        P2Cards.setEnabled(false);
        P2Hit.setEnabled(false);
        P2Stand.setEnabled(false);
        P1Hit.setEnabled(false);
        P1Stand.setEnabled(false);
         
    }
    public void BettingTurnSystem(){
            
                if (!P1Turn){
                Betting.PlayerTwoBet();
                Betting.DealerBet();
                //System.out.println("Player 2 Bet");
                checkBet = true;
            }
                else if(P1Turn){
              // System.out.println("Player 1 bet");
              Betting.PlayerOneBet();
              P1Turn=false;
              
             
            }
            
    }
    public void turnSystem(){
        EndGame.ValueCheck();
        
            
            if (!P1Turn){
                
                P1Hit.setEnabled(false);
                P1Stand.setEnabled(false);
                if(!EndGame.P2Done){
                P2Hit.setEnabled(true);
                P2Stand.setEnabled(true);
                }
                else{
                    if(!EndGame.P1Done){
                        P1Hit.setEnabled(true);
                        P1Stand.setEnabled(true);
                    }
                }
            }
            else if(P1Turn){
                P2Hit.setEnabled(false);
                P2Stand.setEnabled(false);
                if(!EndGame.P1Done){
                P1Hit.setEnabled(true);
                P1Stand.setEnabled(true);
                }
                else{
                    if(!EndGame.P2Done){
                        P2Hit.setEnabled(true);
                        P2Stand.setEnabled(true);
                    }
                }
                
               
                
            }
            
        
        
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        P1Hit = new javax.swing.JButton();
        P1Stand = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        P1Cards = new javax.swing.JTextArea();
        GetBet = new javax.swing.JTextField();
        BetButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        P2Cards = new javax.swing.JTextArea();
        P2Hit = new javax.swing.JButton();
        P2Stand = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DealerCards = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        Pot = new javax.swing.JLabel();
        P1Money = new javax.swing.JLabel();
        P2Money = new javax.swing.JLabel();
        GotoMainMenu = new javax.swing.JButton();
        WinnerDisplay = new javax.swing.JLabel();
        P1Pic = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DealerMoney = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        P1Hit.setText("Hit");
        P1Hit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1HitActionPerformed(evt);
            }
        });

        P1Stand.setText("Stand");
        P1Stand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1StandActionPerformed(evt);
            }
        });

        P1Cards.setColumns(20);
        P1Cards.setRows(5);
        jScrollPane1.setViewportView(P1Cards);

        BetButton.setText("Bet");
        BetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BetButtonActionPerformed(evt);
            }
        });

        P2Cards.setColumns(20);
        P2Cards.setRows(5);
        jScrollPane3.setViewportView(P2Cards);

        P2Hit.setText("Hit");
        P2Hit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2HitActionPerformed(evt);
            }
        });

        P2Stand.setText("Stand");
        P2Stand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2StandActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("P1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("P2");

        DealerCards.setColumns(20);
        DealerCards.setRows(5);
        jScrollPane2.setViewportView(DealerCards);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Dealer");

        Pot.setText("Pot: $0");
        Pot.setToolTipText("");

        P1Money.setText("$100");

        P2Money.setText("$100");

        GotoMainMenu.setText("Main Menu");
        GotoMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GotoMainMenuActionPerformed(evt);
            }
        });

        P1Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b4djack/PAC-MAN.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b4djack/MSPACMAN.jpg"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b4djack/INKY.jpg"))); // NOI18N

        DealerMoney.setText("$999999");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(323, 323, 323)
                                .addComponent(Pot, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(P1Pic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P1Money, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P2Money, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P1Hit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(P1Stand))
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GetBet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(BetButton)))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P2Hit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(P2Stand))
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(GotoMainMenu)
                                .addGap(195, 195, 195)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(292, 292, 292)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DealerMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(WinnerDisplay)
                .addGap(311, 311, 311))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(DealerMoney))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(GotoMainMenu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(WinnerDisplay)
                .addGap(18, 18, 18)
                .addComponent(Pot)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(P1Money)
                        .addComponent(P1Pic))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(P2Money)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P2Hit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(P2Stand))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(GetBet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BetButton)))))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(P1Hit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P1Stand)
                        .addGap(57, 57, 57))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void P1HitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1HitActionPerformed
        
        
            //System.out.println("Player 1 hit");
            card = drawCard.drawCard();
            P1CardTotal+= card;
            //System.out.println(P1CardTotal);
            P1Cards.append(Integer.toString(card)+" ");
           
            P1Turn=false;
            turnSystem();
            //Player 1 Hits
        
       
        
    }//GEN-LAST:event_P1HitActionPerformed

    private void P1StandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1StandActionPerformed
  
        EndGame.P1Hold = true;
        //System.out.println("Player 1 Stands");
        P1Turn=false;
        turnSystem();
        
        
    }//GEN-LAST:event_P1StandActionPerformed

    private void BetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BetButtonActionPerformed
    
            if(P1Turn){
               BettingTurnSystem(); 
            }
            else if(!P1Turn){
              BettingTurnSystem();
              BetButton.setEnabled(false);
              turnSystem();
            
            }
            
      
        
        
      
        
    }//GEN-LAST:event_BetButtonActionPerformed

    private void P2HitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2HitActionPerformed
        ///Player 2 Hits
        card = drawCard.drawCard();
        P2CardTotal+= card;
        //System.out.println(P2CardTotal);
        P2Cards.append(Integer.toString(card)+" ");
        P1Turn=true;
        turnSystem();
        //System.out.println("Player 2 hit");
    }//GEN-LAST:event_P2HitActionPerformed

    private void P2StandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2StandActionPerformed
        EndGame.P2Hold = true;
        P1Turn=true;
        turnSystem();
       //System.out.println("Player 2 Stands");
    }//GEN-LAST:event_P2StandActionPerformed

    private void GotoMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GotoMainMenuActionPerformed
        dispose();
        if(InitBetting.playerMoney ==0){
                InitBetting.playerMoney+=25;
            }
       if(InitBetting.player2Money ==0){
                InitBetting.player2Money+=25;
              
            }
        B4Djack.NewFrame2.setVisible(true);
    }//GEN-LAST:event_GotoMainMenuActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BetButton;
    public static javax.swing.JTextArea DealerCards;
    public static javax.swing.JLabel DealerMoney;
    public static javax.swing.JTextField GetBet;
    private javax.swing.JButton GotoMainMenu;
    private javax.swing.JTextArea P1Cards;
    public static javax.swing.JButton P1Hit;
    public static javax.swing.JLabel P1Money;
    private javax.swing.JLabel P1Pic;
    public static javax.swing.JButton P1Stand;
    private javax.swing.JTextArea P2Cards;
    public static javax.swing.JButton P2Hit;
    public static javax.swing.JLabel P2Money;
    public static javax.swing.JButton P2Stand;
    public static javax.swing.JLabel Pot;
    public static javax.swing.JLabel WinnerDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
