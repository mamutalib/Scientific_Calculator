/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientific_calculator;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HTCA
 */
public class TikTacToe extends javax.swing.JFrame {

    /**
     * Creates new form TikTacToe
     */
    private String startGame = "C";
    private int cCount = 0;
    private int mCount = 0;

    boolean checker;

    public TikTacToe() {
        initComponents();
    }

    private void gameScore() {
        jlblPlayerC.setText(String.valueOf(cCount));
        jlblPlayerC.setText(String.valueOf(mCount));
    }

    private void chooseAplayer() {

        if (startGame.equalsIgnoreCase("C")) {
            startGame = "M";
        } else {
            startGame = "C";
        }
    }

    private void WinningGame() {
        String b1 = jbtnTic1.getText();
        String b2 = jbtnTic1.getText();
        String b3 = jbtnTic1.getText();
        String b4 = jbtnTic1.getText();
        String b5 = jbtnTic1.getText();
        String b6 = jbtnTic1.getText();
        String b7 = jbtnTic1.getText();
        String b8 = jbtnTic1.getText();
        String b9 = jbtnTic1.getText();
        
        
        //conditions

        if (b1 == ("C") && b2 == ("C") && b3 == ("C")) {

            JOptionPane.showMessageDialog(this, "Player C wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.ORANGE);
            jbtnTic2.setBackground(Color.ORANGE);
            jbtnTic3.setBackground(Color.ORANGE);

            cCount++;
            gameScore();
        }

        if (b1 == ("C") && b4 == ("C") && b7 == ("C")) {

            JOptionPane.showMessageDialog(this, "Player C wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.ORANGE);
            jbtnTic4.setBackground(Color.ORANGE);
            jbtnTic7.setBackground(Color.ORANGE);

            cCount++;
            gameScore();
        }

        if (b2 == ("C") && b5 == ("C") && b8 == ("C")) {

            JOptionPane.showMessageDialog(this, "Player C wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic2.setBackground(Color.ORANGE);
            jbtnTic5.setBackground(Color.ORANGE);
            jbtnTic8.setBackground(Color.ORANGE);

            cCount++;
            gameScore();
        }

        if (b3 == ("C") && b6 == ("C") && b9 == ("C")) {

            JOptionPane.showMessageDialog(this, "Player C wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.ORANGE);
            jbtnTic6.setBackground(Color.ORANGE);
            jbtnTic9.setBackground(Color.ORANGE);

            cCount++;
            gameScore();
        }
          if (b1 == ("C") && b5 == ("C") && b9 == ("C")) {

            JOptionPane.showMessageDialog(this, "Player C wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.ORANGE);
            jbtnTic5.setBackground(Color.ORANGE);
            jbtnTic9.setBackground(Color.ORANGE);
            
            cCount++;
            gameScore();
        }
          
          
            if (b3 == ("C") && b5 == ("C") && b7 == ("C")) {

            JOptionPane.showMessageDialog(this, "Player C wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.ORANGE);
            jbtnTic5.setBackground(Color.ORANGE);
            jbtnTic7.setBackground(Color.ORANGE);
            
            cCount++;
            gameScore();
        }

        if (b7 == ("C") && b8 == ("C") && b9 == ("C")) {

            JOptionPane.showMessageDialog(this, "Player C wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic7.setBackground(Color.GREEN);
            jbtnTic8.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);

            cCount++;
            gameScore();
        }
        if (b4 == ("C") && b5 == ("C") && b6 == ("C")) {

            JOptionPane.showMessageDialog(this, "Player C wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic4.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic6.setBackground(Color.GREEN);

            cCount++;
            gameScore();
        }
        if (b7 == ("M") && b8 == ("M") && b9 == ("M")) {

            JOptionPane.showMessageDialog(this, "Player M wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic7.setBackground(Color.GREEN);
            jbtnTic8.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);

            mCount++;
            gameScore();
        }
        if (b1 == ("M") && b2 == ("M") && b3 == ("M")) {

            JOptionPane.showMessageDialog(this, "Player M wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.GREEN);
            jbtnTic2.setBackground(Color.GREEN);
            jbtnTic3.setBackground(Color.GREEN);

            mCount++;
            gameScore();
        }
        if (b4 == ("M") && b5 == ("M") && b6 == ("M")) {

            JOptionPane.showMessageDialog(this, "Player M wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic4.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic6.setBackground(Color.GREEN);

            mCount++;
            gameScore();
        }
        if (b1 == ("M") && b4 == ("M") && b7 == ("M")) {

            JOptionPane.showMessageDialog(this, "Player M wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.GREEN);
            jbtnTic4.setBackground(Color.GREEN);
            jbtnTic7.setBackground(Color.GREEN);

            mCount++;
            gameScore();
        }
        
        if (b2 == ("M") && b5 == ("M") && b8 == ("M")) {

            JOptionPane.showMessageDialog(this, "Player M wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic2.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic8.setBackground(Color.GREEN);

            mCount++;
            gameScore();
        }
        if (b3 == ("M") && b6 == ("M") && b9 == ("M")) {

            JOptionPane.showMessageDialog(this, "Player M wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.GREEN);
            jbtnTic6.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);

            mCount++;
            gameScore();
        }
        if (b1 == ("M") && b5 == ("M") && b9 == ("M")) {

            JOptionPane.showMessageDialog(this, "Player M wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);

            mCount++;
            gameScore();
        }
        if (b3 == ("M") && b5 == ("M") && b7 == ("M")) {

            JOptionPane.showMessageDialog(this, "Player M wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic7.setBackground(Color.GREEN);

            mCount++;
            gameScore();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jbtnTic1 = new javax.swing.JButton();
        jbtnTic2 = new javax.swing.JButton();
        jbtnTic3 = new javax.swing.JButton();
        jbtnTic4 = new javax.swing.JButton();
        jbtnTic5 = new javax.swing.JButton();
        jbtnTic9 = new javax.swing.JButton();
        jbtnTic6 = new javax.swing.JButton();
        jbtnTic7 = new javax.swing.JButton();
        jbtnTic8 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnNewGame = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jlblPlayerC = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlblPlayerM = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 204, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnTic1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic1ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 100));

        jbtnTic2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic2ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 110, 100));

        jbtnTic3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic3ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 110, 100));

        jbtnTic4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic4ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, 100));

        jbtnTic5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic5ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 110, 100));

        jbtnTic9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic9ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 110, 100));

        jbtnTic6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic6ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 110, 100));

        jbtnTic7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic7ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 110, 100));

        jbtnTic8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic8ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 110, 100));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 400, 410));

        jPanel5.setBackground(new java.awt.Color(0, 153, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setForeground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setForeground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 400, 320));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, 100));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 180, 100));

        jbtnNewGame.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnNewGame.setText("New Game");
        jbtnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNewGameActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 60));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 400, 200));

        jPanel7.setBackground(new java.awt.Color(0, 204, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setForeground(new java.awt.Color(204, 204, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(0, 153, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setForeground(new java.awt.Color(204, 204, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 400, 320));

        jButton17.setText("jButton1");
        jPanel7.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 110, 100));

        jlblPlayerC.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jlblPlayerC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerC.setText("0");
        jlblPlayerC.setOpaque(true);
        jPanel7.add(jlblPlayerC, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 150, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Player M");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, 50));

        jlblPlayerM.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jlblPlayerM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerM.setText("0");
        jlblPlayerM.setOpaque(true);
        jPanel7.add(jlblPlayerM, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 150, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("Player C");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 50));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 160));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 420, 410));

        jLabel5.setText("jLabel1");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setText("Tik Tak Toe Game");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 500, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {

            System.exit(0);
        }

    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        // TODO add your handling code here:
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);

        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");

        jbtnTic1.setBackground(Color.LIGHT_GRAY);
        jbtnTic2.setBackground(Color.LIGHT_GRAY);
        jbtnTic3.setBackground(Color.LIGHT_GRAY);
        jbtnTic4.setBackground(Color.LIGHT_GRAY);
        jbtnTic5.setBackground(Color.LIGHT_GRAY);
        jbtnTic6.setBackground(Color.LIGHT_GRAY);
        jbtnTic7.setBackground(Color.LIGHT_GRAY);
        jbtnTic8.setBackground(Color.LIGHT_GRAY);
        jbtnTic9.setBackground(Color.LIGHT_GRAY);


    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic1ActionPerformed
        // TODO add your handling code here:
        jbtnTic1.setText(startGame);
        if(startGame.equalsIgnoreCase("C")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        chooseAplayer();
        WinningGame();
    }//GEN-LAST:event_jbtnTic1ActionPerformed

    private void jbtnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNewGameActionPerformed
        // TODO add your handling code here:
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);

        jlblPlayerC.setText("0");
        jlblPlayerM.setText("0");

        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");

        jbtnTic1.setBackground(Color.LIGHT_GRAY);
        jbtnTic2.setBackground(Color.LIGHT_GRAY);
        jbtnTic3.setBackground(Color.LIGHT_GRAY);
        jbtnTic4.setBackground(Color.LIGHT_GRAY);
        jbtnTic5.setBackground(Color.LIGHT_GRAY);
        jbtnTic6.setBackground(Color.LIGHT_GRAY);
        jbtnTic7.setBackground(Color.LIGHT_GRAY);
        jbtnTic8.setBackground(Color.LIGHT_GRAY);
        jbtnTic9.setBackground(Color.LIGHT_GRAY);

    }//GEN-LAST:event_jbtnNewGameActionPerformed

    private void jbtnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic2ActionPerformed
        // TODO add your handling code here:
        jbtnTic2.setText(startGame);
        if(startGame.equalsIgnoreCase("C")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        chooseAplayer();
        WinningGame();
    }//GEN-LAST:event_jbtnTic2ActionPerformed

    private void jbtnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic3ActionPerformed
        // TODO add your handling code here:
        jbtnTic3.setText(startGame);
        if(startGame.equalsIgnoreCase("C")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        chooseAplayer();
        WinningGame();
    }//GEN-LAST:event_jbtnTic3ActionPerformed

    private void jbtnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic4ActionPerformed
        // TODO add your handling code here:
        
        jbtnTic4.setText(startGame);
        if(startGame.equalsIgnoreCase("C")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        chooseAplayer();
        WinningGame();
    }//GEN-LAST:event_jbtnTic4ActionPerformed

    private void jbtnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic5ActionPerformed
        // TODO add your handling code here:
        jbtnTic5.setText(startGame);
        if(startGame.equalsIgnoreCase("C")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        chooseAplayer();
        WinningGame();
    }//GEN-LAST:event_jbtnTic5ActionPerformed

    private void jbtnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic6ActionPerformed
        // TODO add your handling code here:
        
        jbtnTic6.setText(startGame);
        if(startGame.equalsIgnoreCase("C")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        chooseAplayer();
        WinningGame();
    }//GEN-LAST:event_jbtnTic6ActionPerformed

    private void jbtnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic7ActionPerformed
        // TODO add your handling code here:
        
        jbtnTic7.setText(startGame);
        if(startGame.equalsIgnoreCase("C")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        chooseAplayer();
        WinningGame();
    }//GEN-LAST:event_jbtnTic7ActionPerformed

    private void jbtnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic8ActionPerformed
        // TODO add your handling code here:
        
        jbtnTic8.setText(startGame);
        if(startGame.equalsIgnoreCase("C")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        chooseAplayer();
        WinningGame();
    }//GEN-LAST:event_jbtnTic8ActionPerformed

    private void jbtnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic9ActionPerformed
        // TODO add your handling code here:
        
        jbtnTic9.setText(startGame);
        if(startGame.equalsIgnoreCase("C")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        chooseAplayer();
        WinningGame();
    }//GEN-LAST:event_jbtnTic9ActionPerformed

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
            java.util.logging.Logger.getLogger(TikTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TikTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TikTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TikTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TikTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnNewGame;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTic1;
    private javax.swing.JButton jbtnTic2;
    private javax.swing.JButton jbtnTic3;
    private javax.swing.JButton jbtnTic4;
    private javax.swing.JButton jbtnTic5;
    private javax.swing.JButton jbtnTic6;
    private javax.swing.JButton jbtnTic7;
    private javax.swing.JButton jbtnTic8;
    private javax.swing.JButton jbtnTic9;
    private javax.swing.JLabel jlblPlayerC;
    private javax.swing.JLabel jlblPlayerM;
    // End of variables declaration//GEN-END:variables
}
