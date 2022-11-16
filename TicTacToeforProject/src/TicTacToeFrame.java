/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Shivam
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.JOptionPane;

public class TicTacToeFrame extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToeFrame
     */
    
    private String turn="X";
    private  int xCount=0;
    private  int oCount=0;
    private  int occupied=0;
    private boolean active=true;
    
    private void disableButtons(){
        active=false;
        return;
    }
    
    private void throwAlreadyExists() {
        javax.swing.JFrame errorBox=new javax.swing.JFrame("Exit");
        JOptionPane.showMessageDialog(errorBox, "This place already holds a value!", 
                "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
     
    private void checkDraw(){
        if(occupied==9)
        {
            if(!checkWin("O") && !checkWin("X")){
                JFrame oWin=new JFrame("GAME OVER!");
                JOptionPane.showMessageDialog(oWin, "The Match is a draw!", 
                "Game Over!", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
    
    private void enableButtons(){
        active=true;
        return;
    }
    
     private boolean checkWin(String a)
    {
        if(btn11.getText().equalsIgnoreCase(a) && 
           btn12.getText().equalsIgnoreCase(a) &&
           btn13.getText().equalsIgnoreCase(a) ){
            btn11.setBackground(Color.green);
            btn12.setBackground(Color.green);
            btn13.setBackground(Color.green);
            
            disableButtons();
            return true;
        }
        
        if(btn21.getText().equalsIgnoreCase(a) && 
           btn22.getText().equalsIgnoreCase(a) &&
           btn23.getText().equalsIgnoreCase(a) ){
            btn21.setBackground(Color.green);
            btn22.setBackground(Color.green);
            btn23.setBackground(Color.green);
            disableButtons();
            return true;
        }
        
        if(btn31.getText().equalsIgnoreCase(a) && 
           btn32.getText().equalsIgnoreCase(a) &&
           btn33.getText().equalsIgnoreCase(a) ){
            btn31.setBackground(Color.green);
            btn32.setBackground(Color.green);
            btn33.setBackground(Color.green);
            disableButtons();
            return true;
        }
        
        if(btn11.getText().equalsIgnoreCase(a) && 
           btn21.getText().equalsIgnoreCase(a) &&
           btn31.getText().equalsIgnoreCase(a) ){
            btn11.setBackground(Color.green);
            btn21.setBackground(Color.green);
            btn31.setBackground(Color.green);
            disableButtons();
            return true;
        }
        
        if(btn12.getText().equalsIgnoreCase(a) && 
           btn22.getText().equalsIgnoreCase(a) &&
           btn32.getText().equalsIgnoreCase(a) ){
            btn12.setBackground(Color.green);
            btn22.setBackground(Color.green);
            btn32.setBackground(Color.green);
            disableButtons();
            return true;
        }
        
        if(btn13.getText().equalsIgnoreCase(a) && 
           btn23.getText().equalsIgnoreCase(a) &&
           btn33.getText().equalsIgnoreCase(a) ){
            btn13.setBackground(Color.green);
            btn23.setBackground(Color.green);
            btn33.setBackground(Color.green);
            disableButtons();
            return true;
        }
        
        if(btn11.getText().equalsIgnoreCase(a) && 
           btn22.getText().equalsIgnoreCase(a) &&
           btn33.getText().equalsIgnoreCase(a) ){
            btn11.setBackground(Color.green);
            btn22.setBackground(Color.green);
            btn33.setBackground(Color.green);
            disableButtons();
            return true;
        }
        
        
        if(btn13.getText().equalsIgnoreCase(a) && 
           btn22.getText().equalsIgnoreCase(a) &&
           btn31.getText().equalsIgnoreCase(a) ){
            btn13.setBackground(Color.green);
            btn31.setBackground(Color.green);
            btn22.setBackground(Color.green);
            disableButtons();
            return true;
        }
        return false;
          
    }
     
    private void changeTurn(){
        if(turn.equalsIgnoreCase("X")){
            turn="O";
            displayTurn.setText(turn);
        }
        else
        {
            turn="X";
            displayTurn.setText(turn);
        }
    }
    
    private void xTurn(JButton btn){
        btn.setForeground(Color.red);
        btn.setFont(new Font("Copperplate Gothic Light",Font.PLAIN, 20));
        btn.setText(turn);
        if(checkWin("X"))
        {
            xCount++;
            scoreO.setText(Integer.toString(oCount));
            scoreX.setText(Integer.toString(xCount));
            JFrame xWin=new JFrame("GAME OVER!");
            JOptionPane.showMessageDialog(xWin, "Player 1 has won the match!", 
                "Game Over!", JOptionPane.PLAIN_MESSAGE);
            
        }
        changeTurn();
    }
    
    private void oTurn(JButton btn){
        btn.setForeground(Color.blue);
        btn.setFont(new Font("Copperplate Gothic Light",Font.PLAIN, 20));
        btn.setText(turn);
        if(checkWin("O")){
            oCount++;
            scoreO.setText(Integer.toString(oCount));
            scoreX.setText(Integer.toString(xCount));
            JFrame oWin=new JFrame("GAME OVER!");
            JOptionPane.showMessageDialog(oWin, "Player 2 has won the match!", 
                "Game Over!", JOptionPane.PLAIN_MESSAGE);
        }
        changeTurn();
    }
    
    public TicTacToeFrame() {
        initComponents();
    }
     /*
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        scoreX = new javax.swing.JLabel();
        scoreO = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        displayTurn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("TIC TAC TOE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(220, 220, 220))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        btn12.setMaximumSize(new java.awt.Dimension(40, 40));
        btn12.setMinimumSize(new java.awt.Dimension(40, 40));
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setMaximumSize(new java.awt.Dimension(40, 40));
        btn13.setMinimumSize(new java.awt.Dimension(40, 40));
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn31.setMaximumSize(new java.awt.Dimension(40, 40));
        btn31.setMinimumSize(new java.awt.Dimension(40, 40));
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });

        btn32.setMaximumSize(new java.awt.Dimension(40, 40));
        btn32.setMinimumSize(new java.awt.Dimension(40, 40));
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });

        btn33.setMaximumSize(new java.awt.Dimension(40, 40));
        btn33.setMinimumSize(new java.awt.Dimension(40, 40));
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });

        btn11.setMaximumSize(new java.awt.Dimension(40, 40));
        btn11.setMinimumSize(new java.awt.Dimension(40, 40));
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn22.setMaximumSize(new java.awt.Dimension(40, 40));
        btn22.setMinimumSize(new java.awt.Dimension(40, 40));
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn23.setMaximumSize(new java.awt.Dimension(40, 40));
        btn23.setMinimumSize(new java.awt.Dimension(40, 40));
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });

        btn21.setMaximumSize(new java.awt.Dimension(40, 40));
        btn21.setMinimumSize(new java.awt.Dimension(40, 40));
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Player 1 (X) :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Player 2 (O) : ");

        scoreX.setText("------");

        scoreO.setText("------");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scoreX, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(scoreO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(scoreX))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(scoreO))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel6.setText("TURN");

        displayTurn.setText("X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(displayTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 82, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(338, Short.MAX_VALUE)
                    .addComponent(Reset)
                    .addGap(172, 172, 172)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(displayTurn))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(exit)
                        .addGap(139, 139, 139))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(383, Short.MAX_VALUE)
                    .addComponent(Reset)
                    .addGap(140, 140, 140)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your
        if(!active)
        {
            return;
        }
        if(btn12.getText().equalsIgnoreCase("X") || btn12.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(btn12);
            }
            else
            {
                oTurn(btn12);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        // TODO add your handling code here:
        if(!active)
        {
            return;
        }
        if(btn13.getText().equalsIgnoreCase("X") || btn13.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(btn13);
            }
            else
            {
                oTurn(btn13);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_btn13ActionPerformed
    
    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        // TODO add your handling code here:
        if(!active)
        {
            return;
        }
        if(btn22.getText().equalsIgnoreCase("X") || btn22.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(btn22);
            }
            else
            {
                oTurn(btn22);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_btn22ActionPerformed
    
    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        // TODO add your handling code here:
        if(!active)
        {
            return;
        }
        if(btn33.getText().equalsIgnoreCase("X") || btn33.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(btn33);
            }
            else
            {
                oTurn(btn33);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_btn33ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        javax.swing.JFrame frame=new javax.swing.JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?",
            "Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed
     
    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
        if(!active)
        {
            return;
        }
        if(btn11.getText().equalsIgnoreCase("X") || btn11.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(btn11);
            }
            else
            {
                oTurn(btn11);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        javax.swing.JFrame frame=new javax.swing.JFrame("Reset");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to reset?", 
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
           btn11.setText("");
            btn12.setText("");
            btn13.setText("");
            btn21.setText("");
            btn22.setText("");
            btn23.setText("");
            btn31.setText("");
            btn32.setText("");
            btn33.setText("");
            
            btn11.setBackground(Color.WHITE);
            btn12.setBackground(Color.WHITE);
            btn13.setBackground(Color.WHITE);
            btn21.setBackground(Color.WHITE);
            btn22.setBackground(Color.WHITE);
            btn23.setBackground(Color.WHITE);
            btn31.setBackground(Color.WHITE);
            btn32.setBackground(Color.WHITE);
            btn33.setBackground(Color.WHITE);
            
            enableButtons();
            occupied=0;
            JFrame tmp=new JFrame("choice");
                if(JOptionPane.showConfirmDialog(tmp, "Set first turn for Player 1?", 
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                    turn="X";
                }
                else
                {
                    turn="O";
                }
                displayTurn.setText(turn);
        }
    }//GEN-LAST:event_ResetActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // TODO add your handling code here:
        if(!active)
        {
            return;
        }
        if(btn21.getText().equalsIgnoreCase("X") || btn21.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(btn21);
            }
            else
            {
                oTurn(btn21);
            }
            occupied++;
            checkDraw();
        }
        
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        // TODO add your handling code here:
        if(!active)
        {
            return;
        }
        if(btn23.getText().equalsIgnoreCase("X") || btn23.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(btn23);
            }
            else
            {
                oTurn(btn23);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        // TODO add your handling code here:
        if(!active)
        {
            return;
        }
        if(btn31.getText().equalsIgnoreCase("X") || btn31.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(btn31);
            }
            else
            {
                oTurn(btn31);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        // TODO add your handling code here:
        if(!active)
        {
            return;
        }
        if(btn32.getText().equalsIgnoreCase("X") || btn32.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(btn32);
            }
            else
            {
                oTurn(btn32);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_btn32ActionPerformed
    
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
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JLabel displayTurn;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel scoreO;
    private javax.swing.JLabel scoreX;
    // End of variables declaration//GEN-END:variables
}
