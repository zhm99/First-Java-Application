/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodavnicafilmovaapplication;

/**
 *
 * @author Korisnik
 */
public class Zanr1 extends javax.swing.JFrame {
MySQL sql;
    /**
     * Creates new form Zanr
     */
    public Zanr1() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idZanra_TF = new javax.swing.JTextField();
        nazivZanra_TF = new javax.swing.JTextField();
        UnesiZanr_B = new javax.swing.JButton();
        ObrisiZanr_B = new javax.swing.JButton();
        NazadZanr_B = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Zanr = new javax.swing.JTable();
        PrikaziZanr_B = new javax.swing.JButton();
        konekcija_IF = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        server_TF = new javax.swing.JTextField();
        korisnickoIme_TF = new javax.swing.JTextField();
        baza_TF = new javax.swing.JTextField();
        Konekcija_B = new javax.swing.JButton();
        lozinka_TF = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("ZANR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("idZanra");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("nazivZanra");

        nazivZanra_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nazivZanra_TFActionPerformed(evt);
            }
        });

        UnesiZanr_B.setText("Unesi Zanr");
        UnesiZanr_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnesiZanr_BActionPerformed(evt);
            }
        });

        ObrisiZanr_B.setText("Obrisi Zanr");
        ObrisiZanr_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObrisiZanr_BActionPerformed(evt);
            }
        });

        NazadZanr_B.setText("Nazad");
        NazadZanr_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NazadZanr_BActionPerformed(evt);
            }
        });

        table_Zanr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_Zanr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table_ZanrKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table_Zanr);

        PrikaziZanr_B.setText("Prikazi Podatke Zanr");
        PrikaziZanr_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrikaziZanr_BActionPerformed(evt);
            }
        });

        konekcija_IF.setVisible(true);
        konekcija_IF.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                konekcija_IFInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        konekcija_IF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                konekcija_IFMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Server:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Korisničko ime:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Lozinka:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Baza podataka:");

        server_TF.setText(" ");

        korisnickoIme_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                korisnickoIme_TFActionPerformed(evt);
            }
        });

        Konekcija_B.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Konekcija_B.setText("Konektuj se");
        Konekcija_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Konekcija_BActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("KONEKCIJA");
        konekcija_IF.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout konekcija_IFLayout = new javax.swing.GroupLayout(konekcija_IF.getContentPane());
        konekcija_IF.getContentPane().setLayout(konekcija_IFLayout);
        konekcija_IFLayout.setHorizontalGroup(
            konekcija_IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(konekcija_IFLayout.createSequentialGroup()
                .addGroup(konekcija_IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(konekcija_IFLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(konekcija_IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(129, 129, 129)
                        .addGroup(konekcija_IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(korisnickoIme_TF)
                            .addComponent(server_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(baza_TF)
                            .addComponent(lozinka_TF)))
                    .addGroup(konekcija_IFLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(konekcija_IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(Konekcija_B))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        konekcija_IFLayout.setVerticalGroup(
            konekcija_IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(konekcija_IFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(31, 31, 31)
                .addGroup(konekcija_IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(server_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(konekcija_IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(korisnickoIme_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(konekcija_IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lozinka_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(konekcija_IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(baza_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(Konekcija_B)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Baza Konekcija");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idZanra_TF)
                                    .addComponent(nazivZanra_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NazadZanr_B, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(UnesiZanr_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ObrisiZanr_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PrikaziZanr_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(konekcija_IF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idZanra_TF)
                        .addComponent(UnesiZanr_B)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(ObrisiZanr_B)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nazivZanra_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(8, 8, 8)
                .addComponent(PrikaziZanr_B)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(konekcija_IF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(NazadZanr_B)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nazivZanra_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nazivZanra_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nazivZanra_TFActionPerformed

    private void NazadZanr_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NazadZanr_BActionPerformed
     this.setVisible(false);
KonekcijaGUI1 s=new KonekcijaGUI1();
s.setVisible(true);
    }//GEN-LAST:event_NazadZanr_BActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     this.konekcija_IF.setEnabled(true);
    this.konekcija_IF.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void korisnickoIme_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_korisnickoIme_TFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_korisnickoIme_TFActionPerformed

    private void Konekcija_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Konekcija_BActionPerformed
        this.sql=new MySQL();
        this.sql.Konekcija(this.server_TF.getText(),this.korisnickoIme_TF.getText(),
            this.lozinka_TF.getText(),this.baza_TF.getText());

    }//GEN-LAST:event_Konekcija_BActionPerformed

    private void konekcija_IFInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_konekcija_IFInternalFrameClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_konekcija_IFInternalFrameClosing

    private void konekcija_IFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_konekcija_IFMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_konekcija_IFMouseExited

    private void UnesiZanr_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnesiZanr_BActionPerformed
     this.sql.UnesiZanr(this.idZanra_TF.getText(), this.nazivZanra_TF.getText());
                
        this.sql.PrikaziPodatkeZanr(table_Zanr);
    }//GEN-LAST:event_UnesiZanr_BActionPerformed

    private void PrikaziZanr_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrikaziZanr_BActionPerformed
    this.sql.PrikaziPodatkeZanr(table_Zanr);
    }//GEN-LAST:event_PrikaziZanr_BActionPerformed

    private void ObrisiZanr_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObrisiZanr_BActionPerformed
      this.sql.ObrisiZanr(String.valueOf(this.table_Zanr.getValueAt
                        (this.table_Zanr.getSelectedRow(), 0)));
        this.sql.PrikaziPodatkeZanr(table_Zanr);
    }//GEN-LAST:event_ObrisiZanr_BActionPerformed

    private void table_ZanrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_ZanrKeyReleased
        if(this.table_Zanr.getSelectedColumn()==1){
         this.sql.AzuriranjeZanr(String.valueOf(this.table_Zanr.getValueAt(this.table_Zanr.getSelectedRow(), 0)),
                                String.valueOf(this.table_Zanr.getValueAt(this.table_Zanr.getSelectedRow(),
                                        this.table_Zanr.getSelectedColumn())));
    }//GEN-LAST:event_table_ZanrKeyReleased
    }
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
            java.util.logging.Logger.getLogger(Zanr1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Zanr1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Zanr1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zanr1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Zanr1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Konekcija_B;
    private javax.swing.JButton NazadZanr_B;
    private javax.swing.JButton ObrisiZanr_B;
    private javax.swing.JButton PrikaziZanr_B;
    private javax.swing.JButton UnesiZanr_B;
    private javax.swing.JTextField baza_TF;
    private javax.swing.JTextField idZanra_TF;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JInternalFrame konekcija_IF;
    private javax.swing.JTextField korisnickoIme_TF;
    private javax.swing.JTextField lozinka_TF;
    private javax.swing.JTextField nazivZanra_TF;
    private javax.swing.JTextField server_TF;
    private javax.swing.JTable table_Zanr;
    // End of variables declaration//GEN-END:variables
}
