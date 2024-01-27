/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package webcrawler;

import java.util.ArrayList;
import static webcrawler.WebCrawler.printAllInSection;

/**
 *
 * @author anhad
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTabPanel = new javax.swing.JTabbedPane();
        onionPanel = new javax.swing.JPanel();
        onionComboBox = new javax.swing.JComboBox<>();
        onionOK = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        onionOutput = new javax.swing.JTextArea();
        onionSlider = new javax.swing.JSlider();
        onionSliderVal = new javax.swing.JTextField();
        pBWikiPanel = new javax.swing.JPanel();
        pBSlider = new javax.swing.JSlider();
        pBSliderVal = new javax.swing.JTextField();
        pBOK = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pBOutput = new javax.swing.JTextArea();
        treeOctopusWebsite = new javax.swing.JPanel();
        tOOK = new javax.swing.JButton();
        tOSliderVal = new javax.swing.JTextField();
        tOSlider = new javax.swing.JSlider();
        jScrollPane3 = new javax.swing.JScrollPane();
        tOOutput = new javax.swing.JTextArea();
        tOComboBox = new javax.swing.JComboBox<>();
        cPWikiPanel = new javax.swing.JPanel();
        cPOK = new javax.swing.JButton();
        cPSlider = new javax.swing.JSlider();
        cPSliderVal = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        cPOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        onionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categories", "Titles", "Text" }));

        onionOK.setText("Do the render thingy");
        onionOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onionOKMouseClicked(evt);
            }
        });

        onionOutput.setColumns(20);
        onionOutput.setRows(5);
        jScrollPane1.setViewportView(onionOutput);

        onionSlider.setMaximum(50);
        onionSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                onionSliderMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout onionPanelLayout = new javax.swing.GroupLayout(onionPanel);
        onionPanel.setLayout(onionPanelLayout);
        onionPanelLayout.setHorizontalGroup(
            onionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(onionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(onionPanelLayout.createSequentialGroup()
                        .addComponent(onionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(onionSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(onionSliderVal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(onionOK)))
                .addContainerGap())
        );
        onionPanelLayout.setVerticalGroup(
            onionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(onionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onionOK)
                    .addComponent(onionSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onionSliderVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );

        JTabPanel.addTab("The Onion", onionPanel);

        pBSlider.setMaximum(200);
        pBSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pBSliderMouseDragged(evt);
            }
        });

        pBOK.setText("Do the render thingy");
        pBOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pBOKMouseClicked(evt);
            }
        });

        pBOutput.setColumns(20);
        pBOutput.setRows(5);
        jScrollPane2.setViewportView(pBOutput);

        javax.swing.GroupLayout pBWikiPanelLayout = new javax.swing.GroupLayout(pBWikiPanel);
        pBWikiPanel.setLayout(pBWikiPanelLayout);
        pBWikiPanelLayout.setHorizontalGroup(
            pBWikiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBWikiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBWikiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(pBWikiPanelLayout.createSequentialGroup()
                        .addComponent(pBSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(pBSliderVal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pBOK)))
                .addContainerGap())
        );
        pBWikiPanelLayout.setVerticalGroup(
            pBWikiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBWikiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBWikiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pBSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pBSliderVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pBOK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );

        JTabPanel.addTab("Property Brothers Episodes (Oldest to Newest)", pBWikiPanel);

        tOOK.setText("Do the render thingy");
        tOOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tOOKMouseClicked(evt);
            }
        });

        tOSlider.setMaximum(15);
        tOSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tOSliderMouseDragged(evt);
            }
        });

        tOOutput.setColumns(20);
        tOOutput.setRows(5);
        jScrollPane3.setViewportView(tOOutput);

        tOComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "About", "HELP!", "FAQs", "Sightings", "Media", "Activities", "Links" }));

        javax.swing.GroupLayout treeOctopusWebsiteLayout = new javax.swing.GroupLayout(treeOctopusWebsite);
        treeOctopusWebsite.setLayout(treeOctopusWebsiteLayout);
        treeOctopusWebsiteLayout.setHorizontalGroup(
            treeOctopusWebsiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treeOctopusWebsiteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(treeOctopusWebsiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                    .addGroup(treeOctopusWebsiteLayout.createSequentialGroup()
                        .addComponent(tOComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tOSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(tOSliderVal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tOOK)))
                .addContainerGap())
        );
        treeOctopusWebsiteLayout.setVerticalGroup(
            treeOctopusWebsiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treeOctopusWebsiteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(treeOctopusWebsiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tOOK)
                    .addComponent(tOSliderVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tOSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tOComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );

        JTabPanel.addTab("Tree Octopus (Text Boxes)", treeOctopusWebsite);

        cPOK.setText("Do the render thingy");
        cPOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cPOKMouseClicked(evt);
            }
        });

        cPSlider.setMaximum(20);
        cPSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cPSliderMouseDragged(evt);
            }
        });

        cPOutput.setColumns(20);
        cPOutput.setRows(5);
        jScrollPane4.setViewportView(cPOutput);

        javax.swing.GroupLayout cPWikiPanelLayout = new javax.swing.GroupLayout(cPWikiPanel);
        cPWikiPanel.setLayout(cPWikiPanelLayout);
        cPWikiPanelLayout.setHorizontalGroup(
            cPWikiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cPWikiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cPWikiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(cPWikiPanelLayout.createSequentialGroup()
                        .addComponent(cPSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cPSliderVal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cPOK)))
                .addContainerGap())
        );
        cPWikiPanelLayout.setVerticalGroup(
            cPWikiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cPWikiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cPWikiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPOK)
                    .addComponent(cPSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPSliderVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );

        JTabPanel.addTab("Club Penguin Wikipedia Page (Table of Contents)", cPWikiPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cPSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cPSliderMouseDragged
        // TODO add your handling code here:
        String value = ""+cPSlider.getValue()+"";
        cPSliderVal.setText(value);
    }//GEN-LAST:event_cPSliderMouseDragged

    private void cPOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cPOKMouseClicked
        // TODO add your handling code here:
        int num = cPSlider.getValue();

        String url = "https://en.wikipedia.org/wiki/Club_Penguin";

        ArrayList<String> output = printAllInSection(url, 0, "toctext", ">", "</span>", num);

        cPOutput.setText("");
        for(String item : output)
        {
            cPOutput.append(item);
            cPOutput.append("\n");
        }
    }//GEN-LAST:event_cPOKMouseClicked

    private void tOSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tOSliderMouseDragged
        // TODO add your handling code here:
        String value = ""+tOSlider.getValue()+"";
        tOSliderVal.setText(value);
    }//GEN-LAST:event_tOSliderMouseDragged

    private void tOOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tOOKMouseClicked
        // TODO add your handling code here:
        int num = tOSlider.getValue();
        int selection = tOComboBox.getSelectedIndex();
        
        String baseUrl = "https://zapatopi.net/treeoctopus/";
        String[] selectedUrls = {"", "help", "faq", "sightings", "media",
            "activities", "links"};
        String urlEnd = ".html";
        
        String url = baseUrl+selectedUrls[selection];
        if(selection > 0)
        {
            url += urlEnd;
        }

        ArrayList<String> output = printAllInSection(url, 0,"<p", ">", "</p>", num);

        for(String item : output)
        {
            tOOutput.append(item);
            tOOutput.append("\n");
        }
    }//GEN-LAST:event_tOOKMouseClicked

    private void pBOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pBOKMouseClicked
        // TODO add your handling code here:
        int num = pBSlider.getValue();
        
        String url = "https://en.wikipedia.org/wiki/List_of_Property_Brothers_episodes";
        String magicKey = "<td class=\"summary\" style=\"text-align:left\"";

        ArrayList<String> output = printAllInSection(url, 0, magicKey, ">\"", "\"</td>", num);
        
        pBOutput.setText("");
        for(String item : output)
        {
            pBOutput.append(item);
            pBOutput.append("\n");
        }
    }//GEN-LAST:event_pBOKMouseClicked

    private void pBSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pBSliderMouseDragged
        // TODO add your handling code here:
        String value = ""+pBSlider.getValue()+"";
        pBSliderVal.setText(value);
    }//GEN-LAST:event_pBSliderMouseDragged

    private void onionSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onionSliderMouseDragged
        // TODO add your handling code here:
        String value = ""+onionSlider.getValue()+"";
        onionSliderVal.setText(value);
    }//GEN-LAST:event_onionSliderMouseDragged

    private void onionOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onionOKMouseClicked
        // TODO add your handling code here:
        int num = onionSlider.getValue();

        String[] magicKeys = {"sc-1out364-0 hMndXN sc-1hjwdsc-0 bFEOoK js_link",
            "sc-1qoge05-0 gWMyPL", "sc-1d3a351-0 cOnuyB"};
        String[] suffixes = {"</a", "</h4", "</p"};

        int selection = onionComboBox.getSelectedIndex();
        String url = "https://www.theonion.com/";
        String magicKey = magicKeys[selection];
        String suffix = suffixes[selection];

        ArrayList<String> output = printAllInSection(url, 0, magicKey, ">", suffix, num);

        onionOutput.setText("");
        for(String item : output)
        {
            onionOutput.append(item);
            onionOutput.append("\n");
        }
    }//GEN-LAST:event_onionOKMouseClicked
    
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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTabPanel;
    private javax.swing.JButton cPOK;
    private javax.swing.JTextArea cPOutput;
    private javax.swing.JSlider cPSlider;
    private javax.swing.JTextField cPSliderVal;
    private javax.swing.JPanel cPWikiPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> onionComboBox;
    private javax.swing.JButton onionOK;
    private javax.swing.JTextArea onionOutput;
    private javax.swing.JPanel onionPanel;
    private javax.swing.JSlider onionSlider;
    private javax.swing.JTextField onionSliderVal;
    private javax.swing.JButton pBOK;
    private javax.swing.JTextArea pBOutput;
    private javax.swing.JSlider pBSlider;
    private javax.swing.JTextField pBSliderVal;
    private javax.swing.JPanel pBWikiPanel;
    private javax.swing.JComboBox<String> tOComboBox;
    private javax.swing.JButton tOOK;
    private javax.swing.JTextArea tOOutput;
    private javax.swing.JSlider tOSlider;
    private javax.swing.JTextField tOSliderVal;
    private javax.swing.JPanel treeOctopusWebsite;
    // End of variables declaration//GEN-END:variables
}
