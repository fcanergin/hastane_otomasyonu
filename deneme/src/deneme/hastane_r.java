/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Monster
 */
public class hastane_r extends javax.swing.JFrame {

    /**
     * Creates new form hastane_r
     */
    public hastane_r() {
        initComponents();
        initComponents2();
        this.setLocationRelativeTo(null);
    }
    public void hastane_r(int randId) {
       initComponents();
       initComponents2();
       ResultSet rs = db.TabloCek("SELECT * FROM tblrandevular where ID="+randId);
        try {
            rs.next();
            System.out.println("girdi");
            System.out.println(rs.getString("RANDTAR").substring(0,4)+rs.getString("RANDTAR").substring(5, 7)+rs.getString("RANDTAR").substring(8,10));
            text_Tarih.setText(rs.getString("RANDTAR").substring(0,4)+"/"+rs.getString("RANDTAR").substring(5,7)+"/"+rs.getString("RANDTAR").substring(8,10));
            System.out.println("2");
            CBsaat.setSelectedItem(rs.getString("SAAT"));
        } catch (SQLException ex) {
            Logger.getLogger(hastane_r.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel6 = new javax.swing.JLabel();
        CBil = new javax.swing.JComboBox<>();
        CBilce = new javax.swing.JComboBox<>();
        CBhastane = new javax.swing.JComboBox<>();
        CBbolum = new javax.swing.JComboBox<>();
        CBsaat = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        RandevuButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CBDoktor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        text_Tarih = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel6.setText("SAAT");

        CBil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBilActionPerformed(evt);
            }
        });

        CBilce.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ümraniye", "Bağcılar" }));
        CBilce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBilceActionPerformed(evt);
            }
        });

        CBhastane.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBhastane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBhastaneActionPerformed(evt);
            }
        });

        CBbolum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBbolum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBbolumActionPerformed(evt);
            }
        });

        CBsaat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "13:00", "13:30", "14:00", "15:00", "16:00" }));
        CBsaat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBsaatActionPerformed(evt);
            }
        });

        jLabel1.setText("İL");

        RandevuButton.setText("Randevuyu Al");
        RandevuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandevuButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("İLÇE");

        CBDoktor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBDoktor.setToolTipText("");

        jLabel3.setText("HASTANE");

        jLabel7.setText("DOKTOR");

        jLabel4.setText("BÖLÜM");

        try {
            text_Tarih.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("TARİH");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deneme/hospital (1).png"))); // NOI18N

        jButton2.setText("Geri");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(text_Tarih)
                    .addComponent(CBDoktor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBsaat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RandevuButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                .addGap(41, 41, 41)
                .addComponent(jLabel9)
                .addGap(126, 126, 126))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBilce, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBhastane, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBbolum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CBil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBilce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CBhastane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBbolum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBDoktor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_Tarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CBsaat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RandevuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel9))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
database db = new database();
    private void RandevuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandevuButtonActionPerformed
        ResultSet rs;
        String sorgu = "INSERT INTO `hastane`.`tblrandevular` ( `KULLANICIID`, `DOKTORID`, `RANDTAR`, `SAAT`) VALUES ("+anaEkran.kulId+","+(CBDoktor.getSelectedIndex()+1)+",'"+text_Tarih.getText()+"','"+CBsaat.getSelectedItem().toString()+"');";
        System.out.println(sorgu);
        db.Kaydet(sorgu);
    }//GEN-LAST:event_RandevuButtonActionPerformed

    private void CBilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBilActionPerformed
        // Herhangibir il seçildiğinde ilçe Combobox'u temizleniyor,
        // seçilen ile göre ilçeler tekrar listeleniyor.
        CBilce.removeAllItems();
                ResultSet rs = db.TabloCek("SELECT COUNT(*) SAYI FROM hastane.tblilceler where ILID="+(CBil.getSelectedIndex()+1));
                try {
                    rs.next();
        int uzunluk = rs.getInt("SAYI");
        rs = db.TabloCek("SELECT ILCEADI FROM hastane.tblilceler where ILID="+(CBil.getSelectedIndex()+1));
                    System.out.println("SELECT ILCEADI FROM hastane.tblilceler where ILID="+(CBil.getSelectedIndex()+1));
            for(int i=0;i<uzunluk;i++)
            {
            if(rs.next())
            CBilce.addItem(rs.getString("ILCEADI"));
            }
            } catch (SQLException ex) {
            Logger.getLogger(hastane_r.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CBilActionPerformed

    private void CBilceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBilceActionPerformed
        // TODO add your handling code here:
         CBhastane.removeAllItems();
         String sorgu="SELECT COUNT(*) SAYI FROM hastane.tblhastahane where ILCEID="+(CBil.getSelectedIndex()+(CBilce.getSelectedIndex()+1+ CBil.getSelectedIndex()*2));
         System.out.println(sorgu);      
         ResultSet rs = db.TabloCek(sorgu);
                try {
                    rs.next();
        int uzunluk = rs.getInt("SAYI");
        rs = db.TabloCek("SELECT HASTAHANEADI FROM hastane.tblhastahane where  ILCEID="+(CBil.getSelectedIndex()+(CBilce.getSelectedIndex()+1+ CBil.getSelectedIndex()*2)));
             for(int i=0;i<uzunluk;i++)
            {
            if(rs.next())
            CBhastane.addItem(rs.getString("HASTAHANEADI"));
            }
            } catch (SQLException ex) {
            Logger.getLogger(hastane_r.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CBilceActionPerformed

    private void CBhastaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBhastaneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBhastaneActionPerformed

    private void CBbolumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBbolumActionPerformed
            CBDoktor.removeAllItems();
                ResultSet rs = db.TabloCek("SELECT COUNT(*) SAYI FROM hastane.tbldoktor where HASTAHANEID="+(CBhastane.getSelectedIndex()+1)+" AND BOLUMID="+(CBbolum.getSelectedIndex()+1));
                try {
                    rs.next();
        int uzunluk = rs.getInt("SAYI");
        rs = db.TabloCek("SELECT AD,SOYAD FROM hastane.tbldoktor where HASTAHANEID="+(CBhastane.getSelectedIndex()+1)+" AND BOLUMID="+(CBbolum.getSelectedIndex()+1));
             for(int i=0;i<uzunluk;i++)
            {
            if(rs.next())
            CBDoktor.addItem(rs.getString("AD")+" "+rs.getString("SOYAD"));
            }
            } catch (SQLException ex) {
            Logger.getLogger(hastane_r.class.getName()).log(Level.SEVERE, null, ex);
        // TODO add your handling code here:
            }
    }//GEN-LAST:event_CBbolumActionPerformed

    private void CBsaatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBsaatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBsaatActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                giris girise_gider=new giris();
                this.setVisible(false);
                girise_gider.setVisible(true);                    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public void initComponents2(){
        
        CBil.removeAllItems();
        ResultSet rs = db.TabloCek("SELECT COUNT(*) SAYI FROM hastane.tbliller");
                try {
                    rs.next();
        int uzunluk = rs.getInt("SAYI");
        rs = db.TabloCek("SELECT ILADI FROM hastane.tbliller");
            for(int i=0;i<uzunluk;i++)
            {
            if(rs.next())
            CBil.addItem(rs.getString("ILADI"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(hastane_r.class.getName()).log(Level.SEVERE, null, ex);
        }
                CBbolum.removeAllItems();
        rs = db.TabloCek("SELECT COUNT(*) SAYI FROM hastane.tblbolumler");
                try {
                    rs.next();
        int uzunluk = rs.getInt("SAYI");
        rs = db.TabloCek("SELECT BolumAdi FROM hastane.tblbolumler");
            for(int i=0;i<uzunluk;i++)
            {
            if(rs.next())
            CBbolum.addItem(rs.getString("BolumAdi"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(hastane_r.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(hastane_r.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hastane_r.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hastane_r.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hastane_r.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hastane_r().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBDoktor;
    private javax.swing.JComboBox<String> CBbolum;
    private javax.swing.JComboBox<String> CBhastane;
    private javax.swing.JComboBox<String> CBil;
    private javax.swing.JComboBox<String> CBilce;
    private javax.swing.JComboBox<String> CBsaat;
    private javax.swing.JButton RandevuButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField text_Tarih;
    // End of variables declaration//GEN-END:variables
}
