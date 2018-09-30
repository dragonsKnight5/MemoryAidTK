/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import com.github.cliftonlabs.json_simple.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//import javax.swing.JFileChooser;
/**
 *
 * @author james
 */
public class main extends javax.swing.JFrame 
{
    ArrayList<JsonObject> questionList = null;

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        languageButtonGroup = new javax.swing.ButtonGroup();
        questionStyleButtonGroup = new javax.swing.ButtonGroup();
        englishRadioButton = new javax.swing.JRadioButton();
        koreanRadioButton = new javax.swing.JRadioButton();
        textRadioButton = new javax.swing.JRadioButton();
        spokenRadioButton = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        questionBothRadioButton = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        commandsButton = new javax.swing.JButton();
        actionsButton = new javax.swing.JButton();
        stancesButton = new javax.swing.JButton();
        numbersButton = new javax.swing.JButton();
        handButton = new javax.swing.JButton();
        kickingButton = new javax.swing.JButton();
        blockingButton = new javax.swing.JButton();
        bodyButton = new javax.swing.JButton();
        generalButton = new javax.swing.JButton();
        everythingButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        exitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        languageButtonGroup.add(englishRadioButton);
        englishRadioButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        englishRadioButton.setText("English");
        englishRadioButton.setEnabled(false);

        languageButtonGroup.add(koreanRadioButton);
        koreanRadioButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        koreanRadioButton.setSelected(true);
        koreanRadioButton.setText("Korean");

        questionStyleButtonGroup.add(textRadioButton);
        textRadioButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        textRadioButton.setSelected(true);
        textRadioButton.setText("Text");

        questionStyleButtonGroup.add(spokenRadioButton);
        spokenRadioButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        spokenRadioButton.setText("Spoken");
        spokenRadioButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                spokenRadioButtonActionPerformed(evt);
            }
        });

        languageButtonGroup.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jRadioButton5.setText("Both");
        jRadioButton5.setEnabled(false);

        questionStyleButtonGroup.add(questionBothRadioButton);
        questionBothRadioButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        questionBothRadioButton.setText("Both");
        questionBothRadioButton.setEnabled(false);

        jButton1.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jButton1.setText("Random Form Selector");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator2.setToolTipText("");

        commandsButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        commandsButton.setText("Commands");
        commandsButton.setEnabled(false);
        commandsButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                commandsButtonActionPerformed(evt);
            }
        });

        actionsButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        actionsButton.setText("Actions");
        actionsButton.setEnabled(false);
        actionsButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                actionsButtonActionPerformed(evt);
            }
        });

        stancesButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        stancesButton.setText("Stances");
        stancesButton.setEnabled(false);

        numbersButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        numbersButton.setText("Numbers");
        numbersButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                numbersButtonActionPerformed(evt);
            }
        });

        handButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        handButton.setText("Hand Techniques");
        handButton.setEnabled(false);

        kickingButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        kickingButton.setText("Kicking Techniques");
        kickingButton.setEnabled(false);

        blockingButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        blockingButton.setText("Blocking Techniques");
        blockingButton.setEnabled(false);

        bodyButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        bodyButton.setText("Body Parts");
        bodyButton.setEnabled(false);

        generalButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        generalButton.setText("General");
        generalButton.setEnabled(false);

        everythingButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        everythingButton.setText("Everything");
        everythingButton.setEnabled(false);

        jSeparator3.setToolTipText("");

        exitButton.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Question Language");

        jSeparator4.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(actionsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(englishRadioButton)
                                    .addComponent(textRadioButton))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spokenRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(questionBothRadioButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(koreanRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton5))))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(commandsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stancesButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numbersButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(handButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kickingButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(blockingButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bodyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(generalButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(everythingButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(englishRadioButton)
                    .addComponent(koreanRadioButton)
                    .addComponent(jRadioButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textRadioButton)
                    .addComponent(spokenRadioButton)
                    .addComponent(questionBothRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(commandsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stancesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numbersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(handButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kickingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blockingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generalButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(everythingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openQuestionScreen (ArrayList<JsonObject> questions)
    {
        if (textRadioButton.isSelected())
        {
            questionText textQuestion = new questionText(this, questions);
        }
        else if (spokenRadioButton.isSelected())
        {
            questionSpoken spokenQuestion = new questionSpoken(this, questions);
        }
        else 
        {
            questionBoth bothQuestions = new questionBoth(this);
        }
    }
    
    private String getSeperator ()
    {
        return System.getProperty("file.separator");
    }
    
    private void load (String set)
    {
        try
        {
            //File inFile = new File(System.getProperty());
            ObjectInputStream objectFile = new ObjectInputStream (new FileInputStream("Questions" + getSeperator() + set));
            questionList = (ArrayList<JsonObject>)objectFile.readObject();
            objectFile.close();
            System.out.println("Question ListSize: " + questionList.size());
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
    
    private void loadList(String set)
    {
        File filePath = null;

        if (set.contains("Commands"))
        {
            if (englishRadioButton.isSelected())
            {
                load("English-Commands.dat");
            }
            else
            {
                load("Phoenetic-Korean-Commands.dat");
            }

        }
        else if (set.contains("Actions"))
        {
            if (englishRadioButton.isSelected())
            {
                load("English-Actions.dat");
            }
            else
            {
                load("Phoenetic-Korean-Actions.dat");
            }
        }
        else if (set.contains("Stances"))
        {
            if (englishRadioButton.isSelected())
            {
                load("English-Stances.dat");
            }
            else
            {
                load("Phoenetic-Korean-Stances.dat");
            }
        }
        else if (set.contains("Numbers"))
        {
            if (englishRadioButton.isSelected())
            {
                load("English-Numbers.dat");
            }
            else
            {
                load("Phoenetic-Korean-Numbers.dat");
            }
        }
        else if (set.contains("Blocking"))
        {
            if (englishRadioButton.isSelected())
            {
                load("English-Blocking.dat");
            }
            else
            {
                load("Phoenetic-Korean-Blocking.dat");
            }
        }
        else if (set.contains("Hand"))
        {
            if (englishRadioButton.isSelected())
            {
                load("English-Hand.dat");
            }
            else
            {
                load("Phoenetic-Korean-Hand.dat");
            }
        }
        else if (set.contains("Kicking"))
        {
            if (englishRadioButton.isSelected())
            {
                load("English-Kicking.dat");
            }
            else
            {
                load("Phoenetic-Korean-Kicking.dat");
            }
        }
        else if (set.contains("Body"))
        {
            if (englishRadioButton.isSelected())
            {
                load("English-Body.dat");
            }
            else
            {
                load("Phoenetic-Korean-Body.dat");
            }
        }
        else if (set.contains("General"))
        {
            if (englishRadioButton.isSelected())
            {
                load("English-General.dat");
            }
            else
            {
                load("Phoenetic-Korean-General.dat");
            }
        }
    }
    
    private void spokenRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spokenRadioButtonActionPerformed
        
    }//GEN-LAST:event_spokenRadioButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        formSelector randForm = new formSelector(this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void actionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionsButtonActionPerformed
        loadList("Action");
        openQuestionScreen(questionList);
    }//GEN-LAST:event_actionsButtonActionPerformed

    private void numbersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numbersButtonActionPerformed
        loadList("Numbers");
        openQuestionScreen(questionList);
        /**
        if (englishRadioButton.isSelected() && textRadioButton.isSelected())
        {
            openQuestionScreen(questionList);
        }
        else if (koreanRadioButton.isSelected() && textRadioButton.isSelected())
        {
            // To be completed
        }
        else if (englishRadioButton.isSelected() && spokenRadioButton.isSelected())
        {
            openQuestion
        }
        else
        {
            // To be completed
        }**/
    }//GEN-LAST:event_numbersButtonActionPerformed

    private void commandsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commandsButtonActionPerformed
        loadList("Commands");
        openQuestionScreen(questionList);
    }//GEN-LAST:event_commandsButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionsButton;
    private javax.swing.JButton blockingButton;
    private javax.swing.JButton bodyButton;
    private javax.swing.JButton commandsButton;
    private javax.swing.JRadioButton englishRadioButton;
    private javax.swing.JButton everythingButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton generalButton;
    private javax.swing.JButton handButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton kickingButton;
    private javax.swing.JRadioButton koreanRadioButton;
    private javax.swing.ButtonGroup languageButtonGroup;
    private javax.swing.JButton numbersButton;
    private javax.swing.JRadioButton questionBothRadioButton;
    private javax.swing.ButtonGroup questionStyleButtonGroup;
    private javax.swing.JRadioButton spokenRadioButton;
    private javax.swing.JButton stancesButton;
    private javax.swing.JRadioButton textRadioButton;
    // End of variables declaration//GEN-END:variables
}
