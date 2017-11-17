
package b4djack;


public class MainMenu extends javax.swing.JFrame {

   public static boolean ChooseOnePlayer;
    public MainMenu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        OnePlayer = new javax.swing.JButton();
        TwoPlayer = new javax.swing.JButton();
        QuitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Vladimir Script", 1, 48)); // NOI18N
        jLabel1.setText("B4Djack");

        OnePlayer.setText("1 Player");
        OnePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnePlayerActionPerformed(evt);
            }
        });

        TwoPlayer.setText("2 Players");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(184, 184, 184))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(OnePlayer)
                .addGap(70, 70, 70)
                .addComponent(TwoPlayer)
                .addGap(66, 66, 66)
                .addComponent(QuitButton)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OnePlayer)
                    .addComponent(TwoPlayer)
                    .addComponent(QuitButton))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_QuitButtonActionPerformed

    private void TwoPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoPlayerActionPerformed
        setVisible(false);
        ChooseOnePlayer = false;
        B4Djack.ChooseGame();
        new Window().setVisible(true);
    }//GEN-LAST:event_TwoPlayerActionPerformed

    private void OnePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnePlayerActionPerformed
        setVisible(false);
        ChooseOnePlayer = true;
        B4Djack.ChooseGame();
        new Window().setVisible(true);
    }//GEN-LAST:event_OnePlayerActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OnePlayer;
    private javax.swing.JButton QuitButton;
    private javax.swing.JButton TwoPlayer;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
