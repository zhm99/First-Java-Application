package prodavnicafilmovaapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
 */
public class KonekcijaGUI1 extends javax.swing.JFrame {

    MySQL sql;
    Connection konekcija=null;
    /**
     * Creates new form KonekcijaGUI
     */
    public KonekcijaGUI1() {
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

        konekcija_IF = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        server_TF = new javax.swing.JTextField();
        korisnickoIme_TF = new javax.swing.JTextField();
        baza_TF = new javax.swing.JTextField();
        Konekcija_B = new javax.swing.JButton();
        lozinka_TF = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        idFilma_TF = new javax.swing.JTextField();
        nazivFilma_TF = new javax.swing.JTextField();
        kolicina_TF = new javax.swing.JTextField();
        cijena_TF = new javax.swing.JTextField();
        idZanra_TF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        idDobavljaca_TF = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        SelectDobavljac = new javax.swing.JButton();
        Zanr = new javax.swing.JButton();
        Exit_B = new javax.swing.JButton();
        PrikaziPodatke_B = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Insert_B = new javax.swing.JButton();
        Update_B = new javax.swing.JButton();
        Delete_B = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Server:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Korisničko ime:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Lozinka:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Baza podataka:");

        server_TF.setText(" ");

        korisnickoIme_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                korisnickoIme_TFActionPerformed(evt);
            }
        });

        Konekcija_B.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Konekcija_B.setText("Konektuj se");
        Konekcija_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Konekcija_BActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(72, 72, 72)
                        .addGroup(konekcija_IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(korisnickoIme_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(server_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lozinka_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(baza_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(konekcija_IFLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(konekcija_IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(Konekcija_B))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        konekcija_IFLayout.setVerticalGroup(
            konekcija_IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(konekcija_IFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(31, 31, 31)
                .addGroup(konekcija_IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(server_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(konekcija_IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(korisnickoIme_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(konekcija_IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lozinka_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(konekcija_IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(baza_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(Konekcija_B)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("FILM");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("idFilma:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("nazivFilma:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("kolicina:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("cijena:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("idZanra:");

        idFilma_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFilma_TFActionPerformed(evt);
            }
        });

        nazivFilma_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nazivFilma_TFActionPerformed(evt);
            }
        });

        kolicina_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolicina_TFActionPerformed(evt);
            }
        });

        idZanra_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idZanra_TFActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("idDobavljaca");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idFilma_TF)
                            .addComponent(nazivFilma_TF)
                            .addComponent(kolicina_TF)
                            .addComponent(cijena_TF)
                            .addComponent(idZanra_TF)
                            .addComponent(idDobavljaca_TF)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 97, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(177, 177, 177))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(idFilma_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(nazivFilma_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(kolicina_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cijena_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(idZanra_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idDobavljaca_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setText("Dobavljac");
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setText("Racun");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        SelectDobavljac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SelectDobavljac.setText("Select (Ispis filmova po dobavljacima i zanrovima)");
        SelectDobavljac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectDobavljacActionPerformed(evt);
            }
        });

        Zanr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Zanr.setText("Zanr");
        Zanr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZanrActionPerformed(evt);
            }
        });

        Exit_B.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Exit_B.setText("Exit");
        Exit_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_BActionPerformed(evt);
            }
        });

        PrikaziPodatke_B.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PrikaziPodatke_B.setText("Prikazi Podatke");
        PrikaziPodatke_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrikaziPodatke_BActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jTable3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable3KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable3);

        Insert_B.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Insert_B.setText("Insert");
        Insert_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_BActionPerformed(evt);
            }
        });

        Update_B.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Update_B.setText("Update");
        Update_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_BActionPerformed(evt);
            }
        });

        Delete_B.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Delete_B.setText("Delete");
        Delete_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_BActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Konekcija_BazaPodataka");
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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(konekcija_IF))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(PrikaziPodatke_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(62, 62, 62)
                        .addComponent(Zanr, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Delete_B, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Insert_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Update_B, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SelectDobavljac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Exit_B, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)))))
                .addGap(0, 46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(PrikaziPodatke_B)
                                .addComponent(Zanr))
                            .addComponent(jButton11))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SelectDobavljac)
                            .addComponent(Insert_B))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton12)
                            .addComponent(Update_B))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Exit_B)
                            .addComponent(Delete_B)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(konekcija_IF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void korisnickoIme_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_korisnickoIme_TFActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_korisnickoIme_TFActionPerformed

    private void Konekcija_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Konekcija_BActionPerformed
        this.sql=new MySQL();
        this.sql.Konekcija(this.server_TF.getText(),this.korisnickoIme_TF.getText(),
            this.lozinka_TF.getText(),this.baza_TF.getText());
       
    }//GEN-LAST:event_Konekcija_BActionPerformed

    private void nazivFilma_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nazivFilma_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nazivFilma_TFActionPerformed

    private void kolicina_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolicina_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolicina_TFActionPerformed

    private void idZanra_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idZanra_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idZanra_TFActionPerformed

    private void Insert_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_BActionPerformed
        this.sql.Insert(this.idFilma_TF.getText(), this.nazivFilma_TF.getText(),
                this.kolicina_TF.getText(), this.cijena_TF.getText(), this.idZanra_TF.getText(), this.idDobavljaca_TF.getText());
        this.sql.PrikaziPodatke(jTable3);
    }//GEN-LAST:event_Insert_BActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
       
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    this.konekcija_IF.setEnabled(true);
    this.konekcija_IF.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void konekcija_IFInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_konekcija_IFInternalFrameClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_konekcija_IFInternalFrameClosing

    private void konekcija_IFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_konekcija_IFMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_konekcija_IFMouseExited

    private void Delete_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_BActionPerformed
      
        this.sql.Delete(String.valueOf(this.jTable3.getValueAt
                        (this.jTable3.getSelectedRow(), 0)));
        this.sql.PrikaziPodatke(jTable3);
        
    }//GEN-LAST:event_Delete_BActionPerformed

    private void idFilma_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFilma_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFilma_TFActionPerformed

    private void ZanrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZanrActionPerformed
this.setVisible(false);
Zanr1 s=new Zanr1();
s.setVisible(true);
    }//GEN-LAST:event_ZanrActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       this.setVisible(false);
Dobavljac1 s=new Dobavljac1();
s.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
     this.setVisible(false);
Racun1 s=new Racun1();
s.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void SelectDobavljacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectDobavljacActionPerformed
     this.setVisible(false); 
     IspisFilmovaPoDobavljacimaZanru s=new IspisFilmovaPoDobavljacimaZanru();
     s.setVisible(true);
    }//GEN-LAST:event_SelectDobavljacActionPerformed

    private void Exit_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_BActionPerformed
      System.exit(0);
    }//GEN-LAST:event_Exit_BActionPerformed
      
    private void PrikaziPodatke_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrikaziPodatke_BActionPerformed
      this.sql.PrikaziPodatke(jTable3);
    }//GEN-LAST:event_PrikaziPodatke_BActionPerformed

    private void jTable3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable3KeyReleased
    
    }//GEN-LAST:event_jTable3KeyReleased

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
      idFilma_TF.setText(String.valueOf(jTable3.getModel().getValueAt(jTable3.getSelectedRow(),0)));
     nazivFilma_TF.setText(String.valueOf(jTable3.getModel().getValueAt(jTable3.getSelectedRow(),1)));
     kolicina_TF.setText(String.valueOf(jTable3.getModel().getValueAt(jTable3.getSelectedRow(),2)));
     cijena_TF.setText(String.valueOf(jTable3.getModel().getValueAt(jTable3.getSelectedRow(),3)));
     idZanra_TF.setText(String.valueOf(jTable3.getModel().getValueAt(jTable3.getSelectedRow(),4)));
      idDobavljaca_TF.setText(String.valueOf(jTable3.getModel().getValueAt(jTable3.getSelectedRow(),5)));
    }//GEN-LAST:event_jTable3MouseClicked

    private void Update_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_BActionPerformed
     jTable3.getModel().setValueAt(idFilma_TF.getText(), jTable3.getSelectedRow(), 0);
        jTable3.getModel().setValueAt(nazivFilma_TF.getText(), jTable3.getSelectedRow(), 1);
        jTable3.getModel().setValueAt(kolicina_TF.getText(), jTable3.getSelectedRow(), 2);
        jTable3.getModel().setValueAt(cijena_TF.getText(), jTable3.getSelectedRow(), 3);
        jTable3.getModel().setValueAt(idZanra_TF.getText(), jTable3.getSelectedRow(), 4);
        jTable3.getModel().setValueAt(idDobavljaca_TF.getText(), jTable3.getSelectedRow(), 5);
        
          try {
            int row = jTable3.getSelectedRow();
            String tableclick =(jTable3.getModel().getValueAt(row, 0).toString());
            String value1=idFilma_TF.getText();
            String value2=nazivFilma_TF.getText();
            String value4=kolicina_TF.getText();
            String value3=cijena_TF.getText();
            String value5=idZanra_TF.getText();
            String value6=idDobavljaca_TF.getText();
            
            String query ="update film set idFilma='"+value1+"', nazivFilma='"+value2+"',kolicina='"+value4+"',cijena='"+value3+"',idZanra='"+value5+"', idDobavljaca='"+value6+"' where idFilma='"+tableclick+"'";
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/prodavnicafilmova";
            konekcija = DriverManager.getConnection(url, "root", "zere");
            Statement stmt = konekcija.createStatement();
            int r = stmt.executeUpdate(query);
            if(r==1){
                JOptionPane.showMessageDialog(null, "Podatak izmijenjen!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Greska!");
            }
            
            
        } catch (Exception e) {
            
    }//GEN-LAST:event_Update_BActionPerformed
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
            java.util.logging.Logger.getLogger(KonekcijaGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonekcijaGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonekcijaGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonekcijaGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonekcijaGUI1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete_B;
    private javax.swing.JButton Exit_B;
    private javax.swing.JButton Insert_B;
    private javax.swing.JButton Konekcija_B;
    private javax.swing.JButton PrikaziPodatke_B;
    private javax.swing.JButton SelectDobavljac;
    private javax.swing.JButton Update_B;
    private javax.swing.JButton Zanr;
    private javax.swing.JTextField baza_TF;
    private javax.swing.JTextField cijena_TF;
    private javax.swing.JTextField idDobavljaca_TF;
    private javax.swing.JTextField idFilma_TF;
    private javax.swing.JTextField idZanra_TF;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField kolicina_TF;
    private javax.swing.JInternalFrame konekcija_IF;
    private javax.swing.JTextField korisnickoIme_TF;
    private javax.swing.JTextField lozinka_TF;
    private javax.swing.JTextField nazivFilma_TF;
    private javax.swing.JTextField server_TF;
    // End of variables declaration//GEN-END:variables
}