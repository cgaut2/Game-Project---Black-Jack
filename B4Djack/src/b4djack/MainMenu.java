
//Author Justin Weiner

/*
Contains buttons that either initialize the game or exit
*/

package b4djack;

import javax.swing.*;


public class MainMenu extends javax.swing.JFrame {


    public MainMenu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TwoPlayer = new javax.swing.JButton();
        QuitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Instructions = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Vladimir Script", 1, 48)); // NOI18N
        jLabel1.setText("B4Djack");

        TwoPlayer.setText("Play");
        TwoPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoPlayerActionPerformed(evt);
            }
        });

        QuitButton.setText("Quit");
        QuitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b4djack/cards-icon.png"))); // NOI18N

        Instructions.setText("Instructions");
        Instructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstructionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(TwoPlayer)
                            .addGap(27, 27, 27)
                            .addComponent(Instructions)
                            .addGap(18, 18, 18)
                            .addComponent(QuitButton))))
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuitButton)
                    .addComponent(TwoPlayer)
                    .addComponent(Instructions))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_QuitButtonActionPerformed

    private void TwoPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoPlayerActionPerformed
        //Closes the Main Menu Window, opens the game Window and sets up the money for the players
        setVisible(false);
      
       
        new Window().setVisible(true);
        InitBetting.InitBets2P();
    }//GEN-LAST:event_TwoPlayerActionPerformed

    private void InstructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstructionsActionPerformed
       //Displays Intructions 
        JFrame f;
          f = new JFrame();
        JOptionPane.showMessageDialog(f, String.format(
"Place your bet, starting with player 1\n" +
"Draw cards using the hit with the goal of getting as close to 21 as possible, without going over (Jack, Queen and King are = to 10)\n" +
"When you want to stop drawing cards press stand\n" +
"Your score will be compared to the dealer and the other player, and if your cards add up to more then you win the pot\n" +
"When the hand is done, head back to the main menu\n" +
"Press play if you want to play again or quit if you want to quit"));
    }//GEN-LAST:event_InstructionsActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Instructions;
    private javax.swing.JButton QuitButton;
    private javax.swing.JButton TwoPlayer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
