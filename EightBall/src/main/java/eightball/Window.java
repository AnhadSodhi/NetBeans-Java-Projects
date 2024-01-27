/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eightball;

/**
 *
 * @author anhad
 */
public class Window extends javax.swing.JFrame {

    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        magic8BallLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\anhad\\Desktop\\NetBeans\\EightBall\\src\\main\\java\\resources\\8Ball.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        questionLabel = new javax.swing.JLabel();
        questionText = new javax.swing.JTextField();
        questionButton = new javax.swing.JButton();
        magic8BallLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shake the Magic 8 Ball!");
        setPreferredSize(new java.awt.Dimension(645, 635));

        questionLabel.setText("Ask the Magic 8 Ball your question!");

        questionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionTextActionPerformed(evt);
            }
        });

        questionButton.setText("Do the do");
        questionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                questionButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                questionButtonMouseEntered(evt);
            }
        });
        questionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(questionLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(questionText, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(questionButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(magic8BallLabel)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(questionButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(magic8BallLabel)
                .addContainerGap(573, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void shake()
    {
        int choice = (int)(Math.random()*8); //0-7
        
        String prefix = "C:\\Users\\anhad\\Desktop\\NetBeans\\EightBall\\src\\main\\java\\resources\\";
        String[] files = {"AskAgain.png", "CantSayNow.png", "ChancesArentGood.png", "DontBetOnIt.png",
            "IndicationsSayYes.png", "LooksLikeYes.png", "NoDoubtAboutIt.png", "TheStarsSayNo.png"};
        String location = prefix+files[choice];
        
        magic8BallLabel.setIcon(new javax.swing.ImageIcon(location));
    }
    
int counter = 0;

    private void questionTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionTextActionPerformed

    private void questionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionButtonActionPerformed

    private void questionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionButtonMouseClicked
        // TODO add your handling code here:
        if(questionText.getText().length() > 0)
        {
            shake();
        }
    }//GEN-LAST:event_questionButtonMouseClicked

    private void questionButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionButtonMouseEntered
        int x = (int)(Math.random()*(655-questionButton.getWidth()));
        int y = (int)(Math.random()*(630-questionButton.getHeight()));
        
        if(counter < 5)
        {
            questionButton.setLocation(x, y);
            counter++;
        }
    }//GEN-LAST:event_questionButtonMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Window().setVisible(true);
                Window app = new Window();
                app.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel magic8BallLabel;
    private javax.swing.JButton questionButton;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JTextField questionText;
    // End of variables declaration//GEN-END:variables
}
