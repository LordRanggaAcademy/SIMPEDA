/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ASUS
 */
public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    public AdminPage() {
        initComponents();
    }
    private static DefaultTableModel modelKtp = new DefaultTableModel();
    private static DefaultTableModel modelLaporan = new DefaultTableModel();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Default = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ktpPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ktpCekTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        validasKtpiButton = new javax.swing.JButton();
        tolakKtpButton = new javax.swing.JButton();
        nikValidasiKtpField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        laporanPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableValidasiLaporan = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        validasiLaporaniButton = new javax.swing.JButton();
        tolakLaporanButton = new javax.swing.JButton();
        nikValidasiLaporanField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(120, 104, 230));

        jPanel2.setBackground(new java.awt.Color(184, 181, 255));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LORD RANGGA ACADEMY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("KTP");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LAPORAN");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Log Out");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.CardLayout());

        Default.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Poppins ExtraBold", 1, 18)); // NOI18N
        jLabel11.setText("PORTAL VALIDASI DATA PENGAJUAN KTP DAN LAPORAN");

        jLabel12.setFont(new java.awt.Font("Poppins ExtraBold", 1, 18)); // NOI18N
        jLabel12.setText("HALLO, ADMIN!");

        jLabel13.setFont(new java.awt.Font("Poppins ExtraBold", 1, 18)); // NOI18N
        jLabel13.setText("SELAMAT DATANG DI");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(327, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(410, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DefaultLayout = new javax.swing.GroupLayout(Default);
        Default.setLayout(DefaultLayout);
        DefaultLayout.setHorizontalGroup(
            DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DefaultLayout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel7)
                .addContainerGap(1027, Short.MAX_VALUE))
            .addGroup(DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DefaultLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        DefaultLayout.setVerticalGroup(
            DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DefaultLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel7)
                .addContainerGap(535, Short.MAX_VALUE))
            .addGroup(DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DefaultLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel3.add(Default, "card4");

        ktpPanel.setBackground(new java.awt.Color(255, 255, 255));

        ktpCekTable.setModel(modelKtp);
        setupTableKtp();
        ktpCekTable.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                ktpCekTableComponentAdded(evt);
            }
        });
        ktpCekTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ktpCekTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(ktpCekTable);

        validasKtpiButton.setText("Validasi");
        validasKtpiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validasKtpiButtonActionPerformed(evt);
            }
        });

        tolakKtpButton.setText("Tolak");
        tolakKtpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tolakKtpButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins ExtraBold", 1, 18)); // NOI18N
        jLabel4.setText("NIK :");

        jLabel10.setFont(new java.awt.Font("Poppins ExtraBold", 1, 18)); // NOI18N
        jLabel10.setText("VALIDASI BERKAS KTP");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nikValidasiKtpField, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(validasKtpiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(tolakKtpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel10)))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nikValidasiKtpField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validasKtpiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tolakKtpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Poppins ExtraBold", 1, 18)); // NOI18N
        jLabel9.setText("DATA KTP");

        javax.swing.GroupLayout ktpPanelLayout = new javax.swing.GroupLayout(ktpPanel);
        ktpPanel.setLayout(ktpPanelLayout);
        ktpPanelLayout.setHorizontalGroup(
            ktpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ktpPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(512, 512, 512))
            .addGroup(ktpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ktpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ktpPanelLayout.setVerticalGroup(
            ktpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ktpPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(ktpPanel, "card2");

        laporanPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Poppins ExtraBold", 1, 18)); // NOI18N
        jLabel5.setText("DATA LAPORAN");

        tableValidasiLaporan.setModel(modelLaporan);
        setupTableLaporan();
        jScrollPane2.setViewportView(tableValidasiLaporan);

        validasiLaporaniButton.setText("Validasi");
        validasiLaporaniButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validasiLaporaniButtonActionPerformed(evt);
            }
        });

        tolakLaporanButton.setText("Tolak");
        tolakLaporanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tolakLaporanButtonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Poppins ExtraBold", 1, 18)); // NOI18N
        jLabel14.setText("NIK :");

        jLabel15.setFont(new java.awt.Font("Poppins ExtraBold", 1, 18)); // NOI18N
        jLabel15.setText("VALIDASI BERKAS LAPORAN");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(validasiLaporaniButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(tolakLaporanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nikValidasiLaporanField, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(303, 303, 303))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(416, 416, 416)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nikValidasiLaporanField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validasiLaporaniButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tolakLaporanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout laporanPanelLayout = new javax.swing.GroupLayout(laporanPanel);
        laporanPanel.setLayout(laporanPanelLayout);
        laporanPanelLayout.setHorizontalGroup(
            laporanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laporanPanelLayout.createSequentialGroup()
                .addGroup(laporanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(laporanPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(laporanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(laporanPanelLayout.createSequentialGroup()
                        .addGap(489, 489, 489)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        laporanPanelLayout.setVerticalGroup(
            laporanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laporanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(laporanPanel, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        Login main = new Login();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        ktpPanel.setVisible(true);
        Default.setVisible(false);
        laporanPanel.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        laporanPanel.setVisible(true);
        Default.setVisible(false);
        ktpPanel.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void validasKtpiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validasKtpiButtonActionPerformed
        // TODO add your handling code here:
        String nikKtpValidasi = nikValidasiKtpField.getText();

        if (nikKtpValidasi.equals("")){
            JOptionPane.showMessageDialog(null, "Tolong Masukan NIK!", "Gagal!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simpeda", "root", "sinheul24");
                java.sql.Statement stmt = con.createStatement();

                // Inserting data in database
                String q1 = "update pengajuan_ktp set status_validasi = \"Divalidasi\" where nik = '" + nikKtpValidasi + "'";
                int x;
                x = stmt.executeUpdate(q1);
                if (x > 0)
                    JOptionPane.showMessageDialog(null, "Data Berhasil Divalidasi!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException | ClassNotFoundException | SQLException exception) {
                System.out.println(exception);
            }
        }
    }//GEN-LAST:event_validasKtpiButtonActionPerformed

    private void tolakKtpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tolakKtpButtonActionPerformed
        // TODO add your handling code here:
        String nikKtpTolak = nikValidasiKtpField.getText();

        if (nikKtpTolak.equals("")){
            JOptionPane.showMessageDialog(null, "Tolong Masukan NIK!", "Gagal!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simpeda", "root", "sinheul24");
                java.sql.Statement stmt = con.createStatement();

                // Inserting data in database
                String q1 = "update pengajuan_ktp set status_validasi = \"Ditolak\" where nik = '" + nikKtpTolak + "'";
                int x;
                x = stmt.executeUpdate(q1);
                if (x > 0)
                    JOptionPane.showMessageDialog(null, "Data Berhasil Ditolak!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException | ClassNotFoundException | SQLException exception) {
                System.out.println(exception);
            }
        }
        
    }//GEN-LAST:event_tolakKtpButtonActionPerformed

    private void ktpCekTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ktpCekTableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ktpCekTableAncestorAdded

    private void ktpCekTableComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_ktpCekTableComponentAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ktpCekTableComponentAdded

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setExtendedState(AdminPage.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void tolakLaporanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tolakLaporanButtonActionPerformed
        String nikLaporanTolak = nikValidasiLaporanField.getText();

        if (nikLaporanTolak.equals("")){
            JOptionPane.showMessageDialog(null, "Tolong Masukan NIK!", "Gagal!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simpeda", "root", "sinheul24");
                java.sql.Statement stmt = con.createStatement();

                // Inserting data in database
                String q1 = "update pengajuan_laporan set status_validasi = \"Ditolak\" where nik = '" + nikLaporanTolak + "'";
                int x;
                x = stmt.executeUpdate(q1);
                if (x > 0)
                JOptionPane.showMessageDialog(null, "Data Berhasil Ditolak!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException | ClassNotFoundException | SQLException exception) {
                System.out.println(exception);
            }
        }
    }//GEN-LAST:event_tolakLaporanButtonActionPerformed

    private void validasiLaporaniButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validasiLaporaniButtonActionPerformed
        String nikLaporanValidasi = nikValidasiLaporanField.getText();

        if (nikLaporanValidasi.equals("")){
            JOptionPane.showMessageDialog(null, "Tolong Masukan NIK!", "Gagal!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simpeda", "root", "sinheul24");
                java.sql.Statement stmt = con.createStatement();

                // Inserting data in database
                String q1 = "update pengajuan_laporan set status_validasi = \"Divalidasi\" where nik = '" + nikLaporanValidasi + "'";
                int x;
                x = stmt.executeUpdate(q1);
                if (x > 0)
                JOptionPane.showMessageDialog(null, "Data Berhasil Divalidasi!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException | ClassNotFoundException | SQLException exception) {
                System.out.println(exception);
            }
        }
    }//GEN-LAST:event_validasiLaporaniButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }
    
    private static void setupTableKtp(){
        modelKtp.addColumn("NIK");
        modelKtp.addColumn("Nama");
        modelKtp.addColumn("Alamat");
        modelKtp.addColumn("RT/RW");
        modelKtp.addColumn("Desa");
        modelKtp.addColumn("Kecamatan");
        modelKtp.addColumn("kabupaten");
        modelKtp.addColumn("Kewarganegaraan");
        modelKtp.addColumn("TTL");
        modelKtp.addColumn("Pekerjaan");
        modelKtp.addColumn("Status");
        modelKtp.addColumn("JK");
        modelKtp.addColumn("No Telefon");
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simpeda", "root", "sinheul24");
            java.sql.Statement stmt = con.createStatement();
            // SELECT query
            String q1 = "select nik, nama, alamat, rt_rw, desa, kecamatan, kabupaten, warga, tempat_tanggal_lahir, pekerjaan, status, jenis_kelamin, no_telp from pengajuan_ktp where status_validasi = \"Belum Divalidasi\"";
            ResultSet rs;
            rs = stmt.executeQuery(q1);
            
            while(rs.next()){
                Object[] row={
                        rs.getString("nik"),
                        rs.getString("nama"),
                        rs.getString("alamat"),
                        rs.getString("rt_rw"),
                        rs.getString("desa"),
                        rs.getString("kecamatan"),
                        rs.getString("kabupaten"),
                        rs.getString("warga"),
                        rs.getString("tempat_tanggal_lahir"),
                        rs.getString("pekerjaan"),
                        rs.getString("status"),
                        rs.getString("jenis_kelamin"),
                        rs.getString("no_telp")
                };
                modelKtp.addRow(row);
            };
        }catch (HeadlessException | ClassNotFoundException | SQLException exception) {
                System.out.println(exception);
        }
    }
    
    private static void setupTableLaporan(){
        modelLaporan.addColumn("NIK");
        modelLaporan.addColumn("Nama");
        modelLaporan.addColumn("RT");
        modelLaporan.addColumn("RW");
        modelLaporan.addColumn("Jenis Kelamin");
        modelLaporan.addColumn("No Telpon");
        modelLaporan.addColumn("Kategori Laporan");
        modelLaporan.addColumn("Tanggal Laporan");
        modelLaporan.addColumn("Isi Laporan");
        
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simpeda", "root", "sinheul24");
            java.sql.Statement stmt = con.createStatement();
            // SELECT query
            String q1 = "select nik, nama, rt, rw, jenis_kelamin, nomer_telefon, kategori_laporan, tanggal_laporan, isi_laporan from pengajuan_laporan where status_validasi = \"Belum Divalidasi\"";
            ResultSet rs;
            rs = stmt.executeQuery(q1);
            
            while(rs.next()){
                Object[] row={
                        rs.getString("nik"),
                        rs.getString("nama"),
                        rs.getString("rt"),
                        rs.getString("rw"),
                        rs.getString("jenis_kelamin"),
                        rs.getString("nomer_telefon"),
                        rs.getString("kategori_laporan"),
                        rs.getString("tanggal_laporan"),
                        rs.getString("isi_laporan")
                };
                modelLaporan.addRow(row);
            };
        }catch (HeadlessException | ClassNotFoundException | SQLException exception) {
                System.out.println(exception);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Default;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable ktpCekTable;
    private javax.swing.JPanel ktpPanel;
    private javax.swing.JPanel laporanPanel;
    private javax.swing.JTextField nikValidasiKtpField;
    private javax.swing.JTextField nikValidasiLaporanField;
    private javax.swing.JTable tableValidasiLaporan;
    private javax.swing.JButton tolakKtpButton;
    private javax.swing.JButton tolakLaporanButton;
    private javax.swing.JButton validasKtpiButton;
    private javax.swing.JButton validasiLaporaniButton;
    // End of variables declaration//GEN-END:variables
}
