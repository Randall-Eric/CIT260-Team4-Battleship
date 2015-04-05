/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit260.team4.battleship.frames;
import cit260.team4.battleship.cit260group4BattleshipMenus.MainMenuView;
import cit260.team4.battleship.cit260group4BattleshipMenus.HelpMenuView;
/**
 *
 * @author Jordan
 */
public class MainFrame extends javax.swing.JFrame {
private MainMenuView getInput = new MainMenuView();

    /** Creates new form MainFrame */
    public MainFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBody = new javax.swing.JPanel();
        jpTitle = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        jpMenuitems = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jbHelp = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtWelcome = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Battleship");

        jpBody.setBackground(new java.awt.Color(204, 204, 255));
        jpBody.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jpTitle.setBackground(new java.awt.Color(204, 204, 255));

        jlTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitle.setText("Battleship");
        jlTitle.setToolTipText("");

        org.jdesktop.layout.GroupLayout jpTitleLayout = new org.jdesktop.layout.GroupLayout(jpTitle);
        jpTitle.setLayout(jpTitleLayout);
        jpTitleLayout.setHorizontalGroup(
            jpTitleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpTitleLayout.createSequentialGroup()
                .add(147, 147, 147)
                .add(jlTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTitleLayout.setVerticalGroup(
            jpTitleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jpTitleLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jlTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpMenuitems.setBackground(new java.awt.Color(204, 204, 255));
        jpMenuitems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Decorated Veterain");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Options");

        jButton3.setText("Play Game");

        jButton4.setText("Settings");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jbHelp.setText("Help");
        jbHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHelpActionPerformed(evt);
            }
        });

        jbExit.setText("Exit");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jpMenuitemsLayout = new org.jdesktop.layout.GroupLayout(jpMenuitems);
        jpMenuitems.setLayout(jpMenuitemsLayout);
        jpMenuitemsLayout.setHorizontalGroup(
            jpMenuitemsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpMenuitemsLayout.createSequentialGroup()
                .add(19, 19, 19)
                .add(jpMenuitemsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jbHelp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jbExit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jpMenuitemsLayout.setVerticalGroup(
            jpMenuitemsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpMenuitemsLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .add(jButton3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton4)
                .add(13, 13, 13)
                .add(jButton1)
                .add(11, 11, 11)
                .add(jbHelp)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jbExit)
                .add(26, 26, 26))
        );

        jtWelcome.setEditable(false);
        jtWelcome.setColumns(20);
        jtWelcome.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jtWelcome.setLineWrap(true);
        jtWelcome.setRows(5);
        jtWelcome.setText("Welcome to the game of Battleship! You will be playing agaist the computer. Good Luck.");
        jtWelcome.setWrapStyleWord(true);
        jtWelcome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtWelcome.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane1.setViewportView(jtWelcome);

        org.jdesktop.layout.GroupLayout jpBodyLayout = new org.jdesktop.layout.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpTitle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jpBodyLayout.createSequentialGroup()
                .addContainerGap()
                .add(jpMenuitems, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpBodyLayout.createSequentialGroup()
                .add(jpTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jpBodyLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jpMenuitems, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 242, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(20, 20, 20))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jpBody, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jpBody, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbExitActionPerformed

    private void jbHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHelpActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbHelpActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsFrame().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton4ActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreBoardFrame().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnterPlayerName().setVisible(true);
            }
        });
    } 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbHelp;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpMenuitems;
    private javax.swing.JPanel jpTitle;
    private javax.swing.JTextArea jtWelcome;
    // End of variables declaration//GEN-END:variables

}
