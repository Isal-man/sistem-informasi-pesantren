package Design;

import DAO.CrudPengajar;
import Pesantren.Pengajar;
import Validasi.ValidasiInputan;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PanelDataPengajar extends javax.swing.JPanel {

    ValidasiInputan vld = new ValidasiInputan();
    Pengajar p = new Pengajar();
    CrudPengajar crudp = new CrudPengajar();

    public PanelDataPengajar() {
        initComponents();
        tablePengajar();

        buttonEdit.setEnabled(false);
        buttonHapus.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        teksID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        teksNama = new javax.swing.JTextField();
        cekValidasiNama = new javax.swing.JLabel();
        validasiTeksNama = new javax.swing.JLabel();
        teksNoHp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cekValidasiNoHp = new javax.swing.JLabel();
        validasiTeksNoHp = new javax.swing.JLabel();
        teksJK = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        teksStatus = new javax.swing.JComboBox<>();
        buttonTambah = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        teksSearch = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JLabel();
        buttonFilter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePengajar = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        teksID.setBackground(new java.awt.Color(255, 255, 255));
        teksID.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        teksID.setForeground(new java.awt.Color(0, 0, 0));
        teksID.setText("AUTO INCREMENT");
        teksID.setEnabled(false);
        jPanel1.add(teksID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 450, 30));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        teksNama.setBackground(new java.awt.Color(255, 255, 255));
        teksNama.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        teksNama.setForeground(new java.awt.Color(0, 0, 0));
        teksNama.setText("Masukan Nama...");
        teksNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                teksNamaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                teksNamaFocusLost(evt);
            }
        });
        teksNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                teksNamaKeyReleased(evt);
            }
        });
        jPanel1.add(teksNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 450, 30));

        cekValidasiNama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/true (1).png"))); // NOI18N
        jPanel1.add(cekValidasiNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, -1, 30));

        validasiTeksNama.setFont(new java.awt.Font("Gill Sans MT", 1, 10)); // NOI18N
        validasiTeksNama.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(validasiTeksNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 450, 10));

        teksNoHp.setBackground(new java.awt.Color(255, 255, 255));
        teksNoHp.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        teksNoHp.setForeground(new java.awt.Color(0, 0, 0));
        teksNoHp.setText("Masukan No.HP...");
        teksNoHp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                teksNoHpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                teksNoHpFocusLost(evt);
            }
        });
        teksNoHp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                teksNoHpKeyReleased(evt);
            }
        });
        jPanel1.add(teksNoHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 450, 30));

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("No. HP");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        cekValidasiNoHp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/true (1).png"))); // NOI18N
        jPanel1.add(cekValidasiNoHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, -1, 30));

        validasiTeksNoHp.setFont(new java.awt.Font("Gill Sans MT", 1, 10)); // NOI18N
        validasiTeksNoHp.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(validasiTeksNoHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 300, 10));

        teksJK.setBackground(new java.awt.Color(255, 255, 255));
        teksJK.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        teksJK.setForeground(new java.awt.Color(0, 0, 0));
        teksJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LAKI-LAKI", "PEREMPUAN" }));
        jPanel1.add(teksJK, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 300, 30));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Jenis Kelamin");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Status");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));

        teksStatus.setBackground(new java.awt.Color(255, 255, 255));
        teksStatus.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        teksStatus.setForeground(new java.awt.Color(0, 0, 0));
        teksStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USTADZ", "USTADZAH", "ASUS" }));
        jPanel1.add(teksStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 300, 30));

        buttonTambah.setBackground(new java.awt.Color(51, 255, 0));
        buttonTambah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonTambah.setForeground(new java.awt.Color(255, 255, 255));
        buttonTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/add (1).png"))); // NOI18N
        buttonTambah.setText("TAMBAH");
        buttonTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonTambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonTambahMouseExited(evt);
            }
        });
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });
        jPanel1.add(buttonTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 40));

        buttonEdit.setBackground(new java.awt.Color(0, 255, 204));
        buttonEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonEdit.setForeground(new java.awt.Color(255, 255, 255));
        buttonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/edit (1).png"))); // NOI18N
        buttonEdit.setText("EDIT");
        buttonEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonEditMouseExited(evt);
            }
        });
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });
        jPanel1.add(buttonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, 40));

        buttonHapus.setBackground(new java.awt.Color(255, 0, 0));
        buttonHapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonHapus.setForeground(new java.awt.Color(255, 255, 255));
        buttonHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delete (1).png"))); // NOI18N
        buttonHapus.setText("HAPUS");
        buttonHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonHapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonHapusMouseExited(evt);
            }
        });
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });
        jPanel1.add(buttonHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, 40));

        buttonReset.setBackground(new java.awt.Color(102, 102, 102));
        buttonReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonReset.setForeground(new java.awt.Color(255, 255, 255));
        buttonReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/reset (1).png"))); // NOI18N
        buttonReset.setText("RESET");
        buttonReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(buttonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, 40));

        teksSearch.setBackground(new java.awt.Color(255, 255, 255));
        teksSearch.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        teksSearch.setForeground(new java.awt.Color(0, 0, 0));
        teksSearch.setText("Search...");
        teksSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                teksSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                teksSearchFocusLost(evt);
            }
        });
        jPanel1.add(teksSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 260, 30));

        buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/search (1).png"))); // NOI18N
        buttonSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSearchMouseClicked(evt);
            }
        });
        jPanel1.add(buttonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, -1, 50));

        buttonFilter.setBackground(new java.awt.Color(153, 153, 153));
        buttonFilter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonFilter.setForeground(new java.awt.Color(255, 255, 255));
        buttonFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/FILTER (1).png"))); // NOI18N
        buttonFilter.setText("FILTER");
        buttonFilter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonFilterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonFilterMouseExited(evt);
            }
        });
        buttonFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFilterActionPerformed(evt);
            }
        });
        jPanel1.add(buttonFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, -1, 40));

        tablePengajar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablePengajar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePengajarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePengajar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 910, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void tablePengajar() {
        tablePengajar.setModel(crudp.tampilPengajar());
    }

    private void teksNamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teksNamaFocusGained
        if (teksNama.getText().equals("Masukan Nama...")) {
            teksNama.setText("");
        }
    }//GEN-LAST:event_teksNamaFocusGained

    private void teksNamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teksNamaFocusLost
        if (teksNama.getText().equals("")) {
            teksNama.setText("Masukan Nama...");
            validasiTeksNama.setText("");
            ImageIcon icon = new ImageIcon("C:/Users/user/OneDrive/Documents/Bahasa Fundamental/JAVA/ProjekJava - Ahmad Faisal Hidayat/src/gambar/true (1).png");
            cekValidasiNama.setIcon(icon);
        }
    }//GEN-LAST:event_teksNamaFocusLost

    private void teksNamaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teksNamaKeyReleased
        if (!teksNama.getText().contains(" ")) {
            validasiTeksNama.setText("Nama Minimal Terdiri Dari 2 Kata");
            ImageIcon icon = new ImageIcon("C:/Users/user/OneDrive/Documents/Bahasa Fundamental/JAVA/ProjekJava - Ahmad Faisal Hidayat/src/gambar/false (1).png");
            cekValidasiNama.setIcon(icon);
        } else if (teksNama.getText().length() > 60) {
            validasiTeksNama.setText("Maksimal 60 Karakter");
            ImageIcon icon = new ImageIcon("C:/Users/user/OneDrive/Documents/Bahasa Fundamental/JAVA/ProjekJava - Ahmad Faisal Hidayat/src/gambar/false (1).png");
            cekValidasiNama.setIcon(icon);
        } else if (teksNama.getText().length() < 10) {
            validasiTeksNama.setText("Minimal 10 Karakter");
            ImageIcon icon = new ImageIcon("C:/Users/user/OneDrive/Documents/Bahasa Fundamental/JAVA/ProjekJava - Ahmad Faisal Hidayat/src/gambar/false (1).png");
            cekValidasiNama.setIcon(icon);
        } else {
            validasiTeksNama.setText("");
            ImageIcon icon = new ImageIcon("C:/Users/user/OneDrive/Documents/Bahasa Fundamental/JAVA/ProjekJava - Ahmad Faisal Hidayat/src/gambar/true (1).png");
            cekValidasiNama.setIcon(icon);
        }

        if (vld.cekNama(teksNama.getText()) != 0) {
            validasiTeksNama.setText("Masukan Data Dengan Benar");
        }
    }//GEN-LAST:event_teksNamaKeyReleased

    private void teksNoHpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teksNoHpFocusGained
        if (teksNoHp.getText().equals("Masukan No.HP...")) {
            teksNoHp.setText("");
        }
    }//GEN-LAST:event_teksNoHpFocusGained

    private void teksNoHpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teksNoHpFocusLost
        if (teksNoHp.getText().isEmpty()) {
            teksNoHp.setText("Masukan No.HP...");
            validasiTeksNoHp.setText("");
            ImageIcon icon = new ImageIcon("C:/Users/user/OneDrive/Documents/Bahasa Fundamental/JAVA/ProjekJava - Ahmad Faisal Hidayat/src/gambar/true (1).png");
            cekValidasiNoHp.setIcon(icon);
        }
    }//GEN-LAST:event_teksNoHpFocusLost

    private void teksNoHpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teksNoHpKeyReleased
        if (teksNoHp.getText().length() < 11) {
            validasiTeksNoHp.setText("Minimal 11 Karakter");
            ImageIcon icon = new ImageIcon("C:/Users/user/OneDrive/Documents/Bahasa Fundamental/JAVA/ProjekJava - Ahmad Faisal Hidayat/src/gambar/false (1).png");
            cekValidasiNoHp.setIcon(icon);
        } else if (teksNoHp.getText().length() > 13) {
            validasiTeksNoHp.setText("Maksimal 13 Karakter");
            ImageIcon icon = new ImageIcon("C:/Users/user/OneDrive/Documents/Bahasa Fundamental/JAVA/ProjekJava - Ahmad Faisal Hidayat/src/gambar/false (1).png");
            cekValidasiNoHp.setIcon(icon);
        } else {
            validasiTeksNoHp.setText("");
            ImageIcon icon = new ImageIcon("C:/Users/user/OneDrive/Documents/Bahasa Fundamental/JAVA/ProjekJava - Ahmad Faisal Hidayat/src/gambar/true (1).png");
            cekValidasiNoHp.setIcon(icon);
        }

        if (vld.cekNoHp(teksNoHp.getText()) != 0 && teksNoHp.getText().length() > 0) {
            validasiTeksNoHp.setText("Masukan Data Dengan Benar");
            ImageIcon icon = new ImageIcon("C:/Users/user/OneDrive/Documents/Bahasa Fundamental/JAVA/ProjekJava - Ahmad Faisal Hidayat/src/gambar/false (1).png");
            cekValidasiNoHp.setIcon(icon);
        }
    }//GEN-LAST:event_teksNoHpKeyReleased

    private void buttonTambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTambahMouseEntered
        buttonTambah.setForeground(Color.BLACK);
    }//GEN-LAST:event_buttonTambahMouseEntered

    private void buttonTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTambahMouseExited
        buttonTambah.setForeground(Color.white);
    }//GEN-LAST:event_buttonTambahMouseExited

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        int jawab = JOptionPane.showOptionDialog(this,
                "Anda Ingin Menambahkan Data Pengajar?",
                "Tambah Pengajar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (jawab == JOptionPane.YES_OPTION) {
            if (teksNama.getText().equals("Masukan Nama...") || teksNoHp.getText().equals("Masukan No.HP...")) {
                JOptionPane.showMessageDialog(this, "Masukan Data Dengan Benar", "", JOptionPane.WARNING_MESSAGE);
            } else {

                p.setNama(teksNama.getText().toUpperCase());
                p.setNohp(teksNoHp.getText());
                p.setJk((String) teksJK.getSelectedItem());
                p.setStatus((String) teksStatus.getSelectedItem());

                if (crudp.validasiPengajar(p) == 0) {
                    if (crudp.tambahPengajar(p) == 1 && vld.cekNama(teksNama.getText()) == 0 && vld.cekNoHp(teksNoHp.getText()) == 0) {
                        JOptionPane.showMessageDialog(this, "Data Pengajar Berhasil Ditambahkan", "", JOptionPane.INFORMATION_MESSAGE);
                        tablePengajar();
                    } else {
                        JOptionPane.showMessageDialog(this, "Data Pengajar Gagal Ditambahkan", "", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Nama Sudah Terdaftar", "", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditMouseEntered
        if (buttonEdit.isEnabled()) {
            buttonEdit.setForeground(Color.black);
        }
    }//GEN-LAST:event_buttonEditMouseEntered

    private void buttonEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditMouseExited
        if (buttonEdit.isEnabled()) {
            buttonEdit.setForeground(Color.white);
        }
    }//GEN-LAST:event_buttonEditMouseExited

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        int jawab = JOptionPane.showOptionDialog(this,
                "Anda Ingin Mengedit Data Pengajar?",
                "Edit Pengajar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (jawab == JOptionPane.YES_OPTION) {
            if (teksNama.getText().equals("Masukan Nama...") || teksNoHp.getText().equals("Masukan No.HP...")) {
                JOptionPane.showMessageDialog(this, "Masukan Data Dengan Benar", "", JOptionPane.WARNING_MESSAGE);
            } else {

                p.setId(Integer.parseInt(teksID.getText()));
                p.setNama(teksNama.getText().toUpperCase());
                p.setNohp(teksNoHp.getText());
                p.setJk((String) teksJK.getSelectedItem());
                p.setStatus((String) teksStatus.getSelectedItem());

                if (crudp.editPengajar(p) == 1 && vld.cekNama(teksNama.getText()) == 0 && vld.cekNoHp(teksNoHp.getText()) == 0) {
                    JOptionPane.showMessageDialog(this, "Data Pengajar Berhasil Diedit", "", JOptionPane.INFORMATION_MESSAGE);
                    tablePengajar();
                } else {
                    JOptionPane.showMessageDialog(this, "Data Pengajar Gagal Diedit", "", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonHapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHapusMouseEntered
        if (buttonHapus.isEnabled()) {
            buttonHapus.setForeground(Color.black);
        }
    }//GEN-LAST:event_buttonHapusMouseEntered

    private void buttonHapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHapusMouseExited
        if (buttonHapus.isEnabled()) {
            buttonHapus.setForeground(Color.white);
        }
    }//GEN-LAST:event_buttonHapusMouseExited

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        int jawab = JOptionPane.showOptionDialog(this,
                "Anda Ingin Menghapus Data Pengajar?",
                "Hapus Pengajar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (jawab == JOptionPane.YES_OPTION) {
            if (teksID.getText().equals("AUTO INCREMENT")) {
                System.out.println("ID Tidak Ditemukan");
            } else {
                p.setId(Integer.parseInt(teksID.getText()));
                if (crudp.hapusPengajar(p) == 1) {
                    tablePengajar();
                    JOptionPane.showMessageDialog(this, "Data Pengajar Berhasil Dihapus", "", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Data Pengajar Gagal Dihapus", "", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonResetMouseEntered
        buttonReset.setForeground(Color.black);
    }//GEN-LAST:event_buttonResetMouseEntered

    private void buttonResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonResetMouseExited
        buttonReset.setForeground(Color.white);
    }//GEN-LAST:event_buttonResetMouseExited

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed

        buttonTambah.setEnabled(true);
        buttonEdit.setEnabled(false);
        buttonHapus.setEnabled(false);

        teksID.setText("AUTO INCREMENT");
        teksNama.setText("Masukan Nama...");
        teksNoHp.setText("Masukan No.HP...");
        teksJK.setSelectedIndex(0);
        teksStatus.setSelectedIndex(0);
        teksSearch.setText("Search...");
        tablePengajar();

    }//GEN-LAST:event_buttonResetActionPerformed

    private void teksSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teksSearchFocusGained
        if (teksSearch.getText().equals("Search...")) {
            teksSearch.setText("");
        }
    }//GEN-LAST:event_teksSearchFocusGained

    private void teksSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teksSearchFocusLost
        if (teksSearch.getText().isEmpty()) {
            teksSearch.setText("Search...");
        }
    }//GEN-LAST:event_teksSearchFocusLost

    private void buttonSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSearchMouseClicked
        String by = teksSearch.getText();
        tablePengajar.setModel(crudp.cariPengajar(by));
    }//GEN-LAST:event_buttonSearchMouseClicked

    private void buttonFilterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFilterMouseEntered
        buttonFilter.setForeground(Color.black);
    }//GEN-LAST:event_buttonFilterMouseEntered

    private void buttonFilterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFilterMouseExited
        buttonFilter.setForeground(Color.white);
    }//GEN-LAST:event_buttonFilterMouseExited

    private void buttonFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFilterActionPerformed
        Component source = (Component) evt.getSource();
        Object urut = JOptionPane.showInputDialog(source,
                "Pilih Salah Satu",
                "Urut Berdasarkan?", JOptionPane.QUESTION_MESSAGE,
                null, new String[]{"ID", "NAMA"}, "ID");
        Object order = JOptionPane.showInputDialog(source,
                "Pilih Salah Satu",
                "Order By", JOptionPane.QUESTION_MESSAGE,
                null, new String[]{"ASC", "DESC"}, "ASC");
        tablePengajar.setModel(crudp.filterPengajar((String) urut, (String) order));
    }//GEN-LAST:event_buttonFilterActionPerformed

    private void tablePengajarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePengajarMouseClicked
        buttonEdit.setEnabled(true);
        buttonHapus.setEnabled(true);
        buttonTambah.setEnabled(false);

        int baris = tablePengajar.getSelectedRow();
        teksID.setText(tablePengajar.getModel().getValueAt(baris, 0).toString());
        teksNama.setText(tablePengajar.getModel().getValueAt(baris, 1).toString());
        teksNoHp.setText(tablePengajar.getModel().getValueAt(baris, 2).toString());
        if (tablePengajar.getModel().getValueAt(baris, 3).toString().equalsIgnoreCase("laki-laki")) {
            teksJK.setSelectedIndex(0);
        } else {
            teksJK.setSelectedIndex(1);
        }
        
        
        if (tablePengajar.getModel().getValueAt(baris, 4).toString().equalsIgnoreCase("ustadz")) {
            teksStatus.setSelectedIndex(0);
        } else if (tablePengajar.getModel().getValueAt(baris, 4).toString().equalsIgnoreCase("ustadzah")) {
            teksStatus.setSelectedIndex(1);
        } else {
            teksStatus.setSelectedIndex(2);
        }
    }//GEN-LAST:event_tablePengajarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonFilter;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonReset;
    private javax.swing.JLabel buttonSearch;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JLabel cekValidasiNama;
    private javax.swing.JLabel cekValidasiNoHp;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePengajar;
    private javax.swing.JTextField teksID;
    private javax.swing.JComboBox<String> teksJK;
    private javax.swing.JTextField teksNama;
    private javax.swing.JTextField teksNoHp;
    private javax.swing.JTextField teksSearch;
    private javax.swing.JComboBox<String> teksStatus;
    private javax.swing.JLabel validasiTeksNama;
    private javax.swing.JLabel validasiTeksNoHp;
    // End of variables declaration//GEN-END:variables
}
