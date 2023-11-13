/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoVelha;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Rayan
 */
public class JogoVelha extends javax.swing.JFrame {

    //atributo
    private int ultimoJogador = 0; //se valer 1 é o x, se valer 2, é o bolinha
    JButton[][] butoes = new JButton[3][3];//variavel utilizada para armazenar cada butão em uma matriz
    boolean ganhou = false; // verifica se o jogador ganhou
    int novoJogo; // verifica se o jogador quer um novo jogo

    /**
     * Creates new form JogoVelha
     */
    public JogoVelha() {
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

        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new java.awt.GridLayout(3, 3));

        Btn1.setMaximumSize(new java.awt.Dimension(333, 9));
        Btn1.setMinimumSize(new java.awt.Dimension(333, 90));
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn1);

        Btn2.setMaximumSize(new java.awt.Dimension(333, 9));
        Btn2.setMinimumSize(new java.awt.Dimension(333, 90));
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn2);

        Btn3.setMaximumSize(new java.awt.Dimension(333, 9));
        Btn3.setMinimumSize(new java.awt.Dimension(333, 90));
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn3);

        Btn4.setMaximumSize(new java.awt.Dimension(333, 9));
        Btn4.setMinimumSize(new java.awt.Dimension(333, 90));
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn4);

        Btn5.setMaximumSize(new java.awt.Dimension(333, 9));
        Btn5.setMinimumSize(new java.awt.Dimension(333, 90));
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn5);

        Btn6.setMaximumSize(new java.awt.Dimension(333, 9));
        Btn6.setMinimumSize(new java.awt.Dimension(333, 90));
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn6);

        Btn7.setMaximumSize(new java.awt.Dimension(333, 9));
        Btn7.setMinimumSize(new java.awt.Dimension(333, 90));
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn7);

        Btn8.setMaximumSize(new java.awt.Dimension(333, 9));
        Btn8.setMinimumSize(new java.awt.Dimension(333, 90));
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn8);

        Btn9.setMaximumSize(new java.awt.Dimension(333, 9));
        Btn9.setMinimumSize(new java.awt.Dimension(333, 90));
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn9);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        // TODO add your handling code here:
        marcarJogada(Btn4);
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        // TODO add your handling code here:
        marcarJogada(Btn1);
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        // TODO add your handling code here:
        marcarJogada(Btn2);
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        // TODO add your handling code here:
        marcarJogada(Btn3);
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        // TODO add your handling code here:
        marcarJogada(Btn5);
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        // TODO add your handling code here:
        marcarJogada(Btn6);
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        // TODO add your handling code here:
        marcarJogada(Btn7);
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        // TODO add your handling code here:
        marcarJogada(Btn8);
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        // TODO add your handling code here:
        marcarJogada(Btn9);
    }//GEN-LAST:event_Btn9ActionPerformed

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
            java.util.logging.Logger.getLogger(JogoVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    // End of variables declaration//GEN-END:variables

    public void marcarJogada(JButton coringa) {

        if (ultimoJogador == 0 || ultimoJogador == 2) {
            coringa.setText("X");
            ultimoJogador = 1;
        } else if (ultimoJogador == 1) {
            coringa.setText("O");
            ultimoJogador = 2;
        }
        coringa.setEnabled(false);
        confirmacao();
    }

    public void confirmacao() {

        boolean linha = false, coluna = false;
        butoes[0][0] = Btn1;
        butoes[0][1] = Btn2;
        butoes[0][2] = Btn3;
        butoes[1][0] = Btn4;
        butoes[1][1] = Btn5;
        butoes[1][2] = Btn6;
        butoes[2][0] = Btn7;
        butoes[2][1] = Btn8;
        butoes[2][2] = Btn9;

        for (int l = 0; l < 3; l++) {
            int c = 0;
            if (!butoes[l][c].getText().equals("")) {
                if (butoes[l][c].getText().equals(butoes[l][c + 1].getText()) && butoes[l][c].getText().equals(butoes[l][c + 2].getText())) {
                    linha = true;
                    ganhou = true;
                }
            }
        }
        for (int c = 0; c < 3; c++) {
            int l = 0;
            if (!butoes[l][c].getText().equals("")) {
                if (butoes[l][c].getText().equals(butoes[l + 1][c].getText()) && butoes[l][c].getText().equals(butoes[l + 2][c].getText())) {
                    coluna = true;
                    ganhou = true;
                }
            }
        }
        if (coluna != true && linha != true && !butoes[1][1].getText().equals("") ) {
            if (butoes[1][1].getText().equals(butoes[0][0].getText()) & butoes[1][1].getText().equals(butoes[2][2].getText())) {
                ganhou = true;
            } else if (butoes[1][1].getText().equals(butoes[0][2].getText()) & butoes[1][1].getText().equals(butoes[2][0].getText())) {
                ganhou = true;
            }
        }

        if (ganhou == true) {
            JOptionPane.showMessageDialog(this, "o jogador " + ultimoJogador + ", ganhou!");
            this.dispose();
            newGame();
        }
    }

    public void newGame() {
        novoJogo = JOptionPane.showConfirmDialog(this, "Querem jogar novamente? ", "iniciar novo jogo", JOptionPane.YES_NO_OPTION);
        if (novoJogo == 0) {
            JogoVelha jogo = new JogoVelha();
            jogo.setVisible(true);
        }
    }

}
