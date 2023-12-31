package Design;

import DAO.CrudAkun;
import Pesantren.Akun;
import Validasi.ValidasiInputan;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

public class FormSignUp extends javax.swing.JFrame {

    CrudAkun crudl = new CrudAkun();
    Akun akun = new Akun();
    ValidasiInputan vld = new ValidasiInputan();

    public FormSignUp() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        teksUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        teksPass = new javax.swing.JPasswordField();
        buttonMata = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        buttonSignUp = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        ValidasiTeksUser = new javax.swing.JLabel();
        ValidasiTeksPass = new javax.swing.JLabel();
        buttonKembali = new javax.swing.JLabel();
        buttonMinimize = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 155, 76));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/images (1).png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/user.png"))); // NOI18N

        teksUser.setBackground(new java.awt.Color(250, 250, 250));
        teksUser.setForeground(new java.awt.Color(0, 0, 0));
        teksUser.setText("Masukan Username");
        teksUser.setBorder(null);
        teksUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                teksUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                teksUserFocusLost(evt);
            }
        });
        teksUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                teksUserKeyReleased(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/padlock.png"))); // NOI18N

        teksPass.setBackground(new java.awt.Color(250, 250, 250));
        teksPass.setForeground(new java.awt.Color(0, 0, 0));
        teksPass.setText("Masukan Password");
        teksPass.setBorder(null);
        teksPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                teksPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                teksPassFocusLost(evt);
            }
        });
        teksPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                teksPassKeyReleased(evt);
            }
        });

        buttonMata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/eye.png"))); // NOI18N
        buttonMata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMataMouseClicked(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));

        buttonSignUp.setBackground(new java.awt.Color(0, 155, 76));
        buttonSignUp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSignUp.setForeground(new java.awt.Color(255, 255, 255));
        buttonSignUp.setText("DAFTAR");
        buttonSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonSignUpMouseExited(evt);
            }
        });
        buttonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignUpActionPerformed(evt);
            }
        });

        buttonReset.setBackground(new java.awt.Color(255, 0, 51));
        buttonReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonReset.setForeground(new java.awt.Color(250, 250, 250));
        buttonReset.setText("RESET");
        buttonReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonReset.setMaximumSize(new java.awt.Dimension(84, 26));
        buttonReset.setMinimumSize(new java.awt.Dimension(84, 26));
        buttonReset.setPreferredSize(new java.awt.Dimension(84, 26));
        buttonReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonResetMouseExited(evt);
            }
        });
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        ValidasiTeksUser.setForeground(new java.awt.Color(255, 0, 0));

        ValidasiTeksPass.setForeground(new java.awt.Color(255, 0, 0));

        buttonKembali.setForeground(new java.awt.Color(0, 0, 0));
        buttonKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/back (1).png"))); // NOI18N
        buttonKembali.setText("KEMBALI");
        buttonKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonKembaliMouseClicked(evt);
            }
        });

        buttonMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/minimize (1).png"))); // NOI18N
        buttonMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMinimizeMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/close.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(buttonMinimize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ValidasiTeksUser)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator3)
                                    .addComponent(teksUser)
                                    .addComponent(jSeparator1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(buttonSignUp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(teksPass, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonMata, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(ValidasiTeksPass))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(buttonKembali)
                        .addGap(14, 14, 14))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(teksUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ValidasiTeksUser)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teksPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonMata, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ValidasiTeksPass)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(buttonKembali)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addContainerGap(85, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void teksUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teksUserFocusGained
        if (teksUser.getText().equals("Masukan Username")) {
            teksUser.setText("");
        }
    }//GEN-LAST:event_teksUserFocusGained

    private void teksUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teksUserFocusLost
        if (teksUser.getText().equals("")) {
            teksUser.setText("Masukan Username");
        }
    }//GEN-LAST:event_teksUserFocusLost

    private void teksPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teksPassFocusGained
        if (teksPass.getText().equals("Masukan Password")) {
            teksPass.setText("");
        }
    }//GEN-LAST:event_teksPassFocusGained

    private void teksPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teksPassFocusLost
        if (teksPass.getText().equals("")) {
            teksPass.setText("Masukan Password");
        }
    }//GEN-LAST:event_teksPassFocusLost
    boolean cek = true;
    private void buttonMataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMataMouseClicked
        if (cek) {
            teksPass.setEchoChar((char) 0);
            ImageIcon icon = new ImageIcon("C:/Users/user/OneDrive/Documents/Bahasa Fundamental/JAVA/ProjekJava - Ahmad Faisal Hidayat/src/gambar/hidden.png");
            buttonMata.setIcon(icon);
            cek = false;
        } else {
            teksPass.setEchoChar('\u002a');
            ImageIcon icon = new ImageIcon("C:\\Users\\user\\OneDrive\\Documents\\Bahasa Fundamental\\JAVA\\ProjekJava - Ahmad Faisal Hidayat\\src\\gambar\\eye.png");
            buttonMata.setIcon(icon);
            cek = true;
        }
    }//GEN-LAST:event_buttonMataMouseClicked

    private void buttonSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSignUpMouseEntered
        buttonSignUp.setForeground(Color.black);
    }//GEN-LAST:event_buttonSignUpMouseEntered

    private void buttonSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSignUpMouseExited
        buttonSignUp.setForeground(Color.white);
    }//GEN-LAST:event_buttonSignUpMouseExited

    private void buttonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignUpActionPerformed
        if (teksUser.getText().equals("Masukan Username") || teksPass.getText().equals("Masukan Password")) {
            JOptionPane.showMessageDialog(this, "Masukan Data Dengan Benar", "", JOptionPane.WARNING_MESSAGE);
        } else {
            akun.setUsername(teksUser.getText());
            akun.setPassword(teksPass.getText());

            if (crudl.validasiAkun(akun) == 0) {
                if (crudl.tambahAkun(akun) == 1 && vld.cekUsername(teksUser.getText()) == 0 && vld.cekPassword(teksPass.getText()) == 0) {
                    JOptionPane.showMessageDialog(this, "Akun Berhasil Ditambahkan", "", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    FormLogin login = new FormLogin();
                    login.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Akun Gagal Ditambahkan", "", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Username Sudah Digunakan", "", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonSignUpActionPerformed

    private void buttonResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonResetMouseEntered
        buttonReset.setForeground(Color.black);
    }//GEN-LAST:event_buttonResetMouseEntered

    private void buttonResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonResetMouseExited
        buttonReset.setForeground(Color.white);
    }//GEN-LAST:event_buttonResetMouseExited

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        teksUser.setText("Masukan Username");
        teksPass.setText("Masukan Password");
    }//GEN-LAST:event_buttonResetActionPerformed

    private void teksUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teksUserKeyReleased
        if (teksUser.getText().length() < 6) {
            ValidasiTeksUser.setText("Minimal 6 Karakter");
        } else if (teksUser.getText().length() > 30) {
            ValidasiTeksUser.setText("Minimal 30 Karakter");
        } else {
            ValidasiTeksUser.setText("");
        }

        if (vld.cekUsername(teksUser.getText()) != 0) {
            ValidasiTeksUser.setText("Masukan Data Dengan Benar");
        }
    }//GEN-LAST:event_teksUserKeyReleased

    private void teksPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teksPassKeyReleased
        if (teksPass.getText().length() < 6) {
            ValidasiTeksPass.setText("Minimal 6 Karakter");
        } else if (teksPass.getText().length() > 25) {
            ValidasiTeksPass.setText("Maksimal 25 Karakter");
        } else {
            ValidasiTeksPass.setText("");
        }

        if (vld.cekPassword(teksPass.getText()) != 0) {
            ValidasiTeksPass.setText("Masukan Data Dengan Benar");
        }
    }//GEN-LAST:event_teksPassKeyReleased

    private void buttonKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonKembaliMouseClicked
        this.dispose();
        new FormLogin().setVisible(true);
    }//GEN-LAST:event_buttonKembaliMouseClicked

    private void buttonMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinimizeMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_buttonMinimizeMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        int jawab = JOptionPane.showOptionDialog(this,
                "Anda Ingin Keluar",
                "KELUAR",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (jawab == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(FormSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ValidasiTeksPass;
    private javax.swing.JLabel ValidasiTeksUser;
    private javax.swing.JLabel buttonKembali;
    private javax.swing.JLabel buttonMata;
    private javax.swing.JLabel buttonMinimize;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField teksPass;
    private javax.swing.JTextField teksUser;
    // End of variables declaration//GEN-END:variables
}
