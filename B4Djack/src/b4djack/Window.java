
package b4djack;


public class Window extends javax.swing.JFrame {

    boolean P1Turn = true;
    boolean checkBet = false;
    public Window() {
        initComponents();
        DealerCards.append("LimeAde"+"");
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
                System.out.println("Player 2 Bet");
                checkBet = true;
            }
                else if(P1Turn){
               System.out.println("Player 1 bet");
              Betting.PlayerOneBet();
              P1Turn=false;
              
             
            }
            
    }
    public void turnSystem(){
         if(!MainMenu.ChooseOnePlayer){
           
            if (!P1Turn){
                P1Hit.setEnabled(false);
                P1Stand.setEnabled(false);
                P2Hit.setEnabled(true);
                P2Stand.setEnabled(true);
                
            }
            else if(P1Turn){
                P1Hit.setEnabled(true);
                P1Stand.setEnabled(true);
                P2Hit.setEnabled(false);
                P2Stand.setEnabled(false);
                
            }
        }
         else{
             P1Hit.setEnabled(true);
             P1Stand.setEnabled(true);
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

        P1Money.setText("$0");

        P2Money.setText("$0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P1Money)
                        .addGap(356, 356, 356)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P2Money))
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
                        .addGap(265, 265, 265)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(Pot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(Pot)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(P1Money))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(P2Money)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        
        if(!MainMenu.ChooseOnePlayer){
            System.out.println("Player 1 hit");
            P1Turn=false;
            turnSystem();
            //Player 1 Hits
        }
        else{
            //Player 1 hits
            System.out.println("P1 Hits");
            
        }
        
    }//GEN-LAST:event_P1HitActionPerformed

    private void P1StandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1StandActionPerformed
        //Player 1 Stands?
        System.out.println("Player 1 Stands");
        P1Turn=false;
        turnSystem();
        
    }//GEN-LAST:event_P1StandActionPerformed

    private void BetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BetButtonActionPerformed

        if(!MainMenu.ChooseOnePlayer){
            if(P1Turn){
               BettingTurnSystem(); 
            }
            else if(!P1Turn){
              BettingTurnSystem();
              BetButton.setEnabled(false);
              turnSystem();
            }
            
        }
        else{
            Betting.PlayerOneBet();
            checkBet=true;
            P1Hit.setEnabled(true);
            P1Stand.setEnabled(true);
        }
        
        
      
        
    }//GEN-LAST:event_BetButtonActionPerformed

    private void P2HitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2HitActionPerformed
        ///Player 2 Hits
        P1Turn=true;
        turnSystem();
        System.out.println("Player 2 hit");
    }//GEN-LAST:event_P2HitActionPerformed

    private void P2StandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2StandActionPerformed
        P1Turn=true;
        turnSystem();
       System.out.println("Player 2 Stands");
    }//GEN-LAST:event_P2StandActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BetButton;
    private javax.swing.JTextArea DealerCards;
    public static javax.swing.JTextField GetBet;
    private javax.swing.JTextArea P1Cards;
    private javax.swing.JButton P1Hit;
    public static javax.swing.JLabel P1Money;
    private javax.swing.JButton P1Stand;
    private javax.swing.JTextArea P2Cards;
    private javax.swing.JButton P2Hit;
    public static javax.swing.JLabel P2Money;
    private javax.swing.JButton P2Stand;
    public static javax.swing.JLabel Pot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
