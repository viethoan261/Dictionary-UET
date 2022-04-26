/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Huong
 */
public class Function extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form Function
     */
    private Dictionary dictionary;
    private DictionaryCommandline dictionaryCommandline;
    private DictionaryManagement dictionaryManagement;
    public Function() {
        initComponents();
        dictionary = new Dictionary();
        dictionaryCommandline = new DictionaryCommandline();
        dictionaryManagement = new DictionaryManagement();
        dictionaryManagement.insertFromFile(dictionary);
        homeButton.getActionListeners();
        lookUpButton.getActionListeners();
        showAllWordButton.getActionListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteFunc = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        addWordTarget = new javax.swing.JTextField();
        addWordExplain = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        exportButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fixWordTarget = new javax.swing.JTextField();
        fixWordExplain = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        fixWordExplainArea = new javax.swing.JTextArea();
        fixButton = new javax.swing.JButton();
        exportButton1 = new javax.swing.JButton();
        checkButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        deleteWordTarget = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        deleteWordExplainArea = new javax.swing.JTextArea();
        deletebutton = new javax.swing.JButton();
        exportButton2 = new javax.swing.JButton();
        checkButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        lookUpButton = new javax.swing.JButton();
        showAllWordButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        addWordTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWordTargetActionPerformed(evt);
            }
        });

        addButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huong\\Documents\\NetBeansProjects\\Dictionary\\image\\add.png")); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        exportButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huong\\Documents\\NetBeansProjects\\Dictionary\\image\\export_26px.png")); // NOI18N
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 13)); // NOI18N
        jLabel1.setText("Nhập từ Tiếng Anh: ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 13)); // NOI18N
        jLabel2.setText("Nhập nghĩa Tiếng Việt: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(addWordTarget, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                    .addComponent(addWordExplain))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exportButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addWordTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addWordExplain, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(183, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))))
        );

        deleteFunc.addTab("ADD", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        fixWordTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixWordTargetActionPerformed(evt);
            }
        });
        fixWordTarget.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fixWordTargetKeyPressed(evt);
            }
        });

        fixWordExplainArea.setColumns(20);
        fixWordExplainArea.setRows(5);
        fixWordExplainArea.setEnabled(false);
        jScrollPane1.setViewportView(fixWordExplainArea);

        fixButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huong\\Documents\\NetBeansProjects\\Dictionary\\image\\edit_26px.png")); // NOI18N
        fixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixButtonActionPerformed(evt);
            }
        });

        exportButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huong\\Documents\\NetBeansProjects\\Dictionary\\image\\export_26px.png")); // NOI18N
        exportButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButton1ActionPerformed(evt);
            }
        });

        checkButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huong\\Documents\\NetBeansProjects\\Dictionary\\image\\search.png")); // NOI18N
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 13)); // NOI18N
        jLabel3.setText("Nhập từ Tiếng Anh: ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 13)); // NOI18N
        jLabel4.setText("Nghĩa của từ:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 13)); // NOI18N
        jLabel5.setText("Nhập nghĩa mới của từ:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fixWordTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkButton)
                        .addContainerGap(343, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                                .addComponent(fixWordExplain))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fixButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exportButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(142, 142, 142))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exportButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fixWordTarget)
                            .addComponent(checkButton, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fixWordExplain, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        deleteFunc.addTab("FIX", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        deleteWordTarget.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deleteWordTargetKeyPressed(evt);
            }
        });

        deleteWordExplainArea.setColumns(20);
        deleteWordExplainArea.setRows(5);
        jScrollPane2.setViewportView(deleteWordExplainArea);

        deletebutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huong\\Documents\\NetBeansProjects\\Dictionary\\image\\delete.png")); // NOI18N
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        exportButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huong\\Documents\\NetBeansProjects\\Dictionary\\image\\export_26px.png")); // NOI18N
        exportButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButton2ActionPerformed(evt);
            }
        });

        checkButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huong\\Documents\\NetBeansProjects\\Dictionary\\image\\search.png")); // NOI18N
        checkButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 13)); // NOI18N
        jLabel6.setText("Nhập từ Tiếng Anh:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 13)); // NOI18N
        jLabel7.setText("Nghĩa của từ:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(deleteWordTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exportButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deletebutton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(96, 96, 96))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(deleteWordTarget))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exportButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        deleteFunc.addTab("DELETE", jPanel3);

        homeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huong\\Documents\\NetBeansProjects\\Dictionary\\image\\home.png")); // NOI18N
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        exitButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huong\\Documents\\NetBeansProjects\\Dictionary\\image\\exit.png")); // NOI18N
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        lookUpButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huong\\Documents\\NetBeansProjects\\Dictionary\\image\\search.png")); // NOI18N
        lookUpButton.setText("LOOKUP");
        lookUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lookUpButtonActionPerformed(evt);
            }
        });

        showAllWordButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huong\\Documents\\NetBeansProjects\\Dictionary\\image\\show.png")); // NOI18N
        showAllWordButton.setText("SHOW ALL WORDS");
        showAllWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllWordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lookUpButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showAllWordButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(homeButton)
                    .addComponent(lookUpButton)
                    .addComponent(showAllWordButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButton2ActionPerformed
        // TODO add your handling code here:
        deleteWordExplainArea.setText("");
        dictionaryManagement.dictionaryLookup(dictionary, deleteWordExplainArea, deleteWordTarget.getText());
    }//GEN-LAST:event_checkButton2ActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        // TODO add your handling code here:
        dictionaryManagement.deleteAWord(dictionary, deleteWordTarget.getText());
        JOptionPane.showMessageDialog(rootPane, "Bạn đã xóa từ thành công!");
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void deleteWordTargetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deleteWordTargetKeyPressed
        //        // TODO add your handling code here:
        //        deleteWordExplainArea.setText("");
        //        //dictionaryManagement.deleteAWord(dictionary, deleteWordTarget.getText());
        //        dictionaryManagement.dictionaryLookup(dictionary, fixWordExplainArea, deleteWordTarget.getText());
    }//GEN-LAST:event_deleteWordTargetKeyPressed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        // TODO add your handling code here:
        fixWordExplainArea.setText("");
        dictionaryManagement.dictionaryLookup(dictionary, fixWordExplainArea, fixWordTarget.getText());
    }//GEN-LAST:event_checkButtonActionPerformed

    private void exportButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButton1ActionPerformed
        // TODO add your handling code here:
        dictionaryManagement.dictionaryExportToFile(dictionary);
        JOptionPane.showMessageDialog(rootPane, "Bạn đã xuất ra file thành công!");
    }//GEN-LAST:event_exportButton1ActionPerformed

    private void fixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixButtonActionPerformed
        // TODO add your handling code here:
        dictionaryManagement.fixAWord(dictionary, fixWordTarget.getText(), fixWordExplain.getText());
        JOptionPane.showMessageDialog(rootPane, "Bạn đã sửa từ thành công!");
    }//GEN-LAST:event_fixButtonActionPerformed

    private void fixWordTargetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fixWordTargetKeyPressed
        // TODO add your handling code here:
//        fixWordExplainArea.setText("");
//        dictionaryManagement.dictionaryLookup(dictionary, fixWordExplainArea, fixWordTarget.getText());
    }//GEN-LAST:event_fixWordTargetKeyPressed

    private void fixWordTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixWordTargetActionPerformed
        // TODO add your handling code here:
        //fixWordExplainArea.set
    }//GEN-LAST:event_fixWordTargetActionPerformed

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
        // TODO add your handling code here:
        dictionaryManagement.dictionaryExportToFile(dictionary);
        JOptionPane.showMessageDialog(rootPane, "Bạn đã xuất ra file thành công!");
    }//GEN-LAST:event_exportButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        dictionaryManagement.addAWord(dictionary, addWordTarget.getText(), addWordExplain.getText());
        JOptionPane.showMessageDialog(rootPane, "Bạn đã thêm từ thành công!");
    }//GEN-LAST:event_addButtonActionPerformed

    private void addWordTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWordTargetActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_addWordTargetActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void lookUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lookUpButtonActionPerformed
        // TODO add your handling code here:
        new LookupFun().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lookUpButtonActionPerformed

    private void showAllWordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllWordButtonActionPerformed
        // TODO add your handling code here:
        new ShowAllWords().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_showAllWordButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void exportButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButton2ActionPerformed
        // TODO add your handling code here:
        dictionaryManagement.dictionaryExportToFile(dictionary);
        JOptionPane.showMessageDialog(rootPane, "Bạn đã xuất ra file thành công!");
    }//GEN-LAST:event_exportButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Function.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Function.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Function.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Function.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Function().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addWordExplain;
    private javax.swing.JTextField addWordTarget;
    private javax.swing.JButton checkButton;
    private javax.swing.JButton checkButton2;
    private javax.swing.JTabbedPane deleteFunc;
    private javax.swing.JTextArea deleteWordExplainArea;
    private javax.swing.JTextField deleteWordTarget;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exportButton;
    private javax.swing.JButton exportButton1;
    private javax.swing.JButton exportButton2;
    private javax.swing.JButton fixButton;
    private javax.swing.JTextField fixWordExplain;
    private javax.swing.JTextArea fixWordExplainArea;
    private javax.swing.JTextField fixWordTarget;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lookUpButton;
    private javax.swing.JButton showAllWordButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
