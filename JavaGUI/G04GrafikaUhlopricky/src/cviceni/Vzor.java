/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cviceni;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author ag
 */
public class Vzor extends javax.swing.JFrame {
    int sirka,vyska;
    boolean kresli;
    /**
     * Creates new form Tecka
     */
    public Vzor() {
        initComponents();
         kresli = false;
         sirka = panelPlatno.getWidth();
         vyska = panelPlatno.getHeight();
        System.out.println("Šířka: " + sirka);//pomocny vypis
        System.out.println("Výška: " + vyska);//pomocny vypis
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPlatno = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                //moje kreslici metoda
                kresli(g);
            }
        };
        tlacitkoUhlopricky = new javax.swing.JButton();
        tlacitkoSmaz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Uhlopříčky");

        panelPlatno.setBackground(new java.awt.Color(255, 255, 255));
        panelPlatno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPlatno.setPreferredSize(new java.awt.Dimension(280, 250));

        javax.swing.GroupLayout panelPlatnoLayout = new javax.swing.GroupLayout(panelPlatno);
        panelPlatno.setLayout(panelPlatnoLayout);
        panelPlatnoLayout.setHorizontalGroup(
            panelPlatnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        panelPlatnoLayout.setVerticalGroup(
            panelPlatnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        tlacitkoUhlopricky.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tlacitkoUhlopricky.setText("Uhlopříčky");
        tlacitkoUhlopricky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlacitkoUhloprickyActionPerformed(evt);
            }
        });

        tlacitkoSmaz.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tlacitkoSmaz.setText("Smaž");
        tlacitkoSmaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlacitkoSmazActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tlacitkoUhlopricky, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tlacitkoSmaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelPlatno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(panelPlatno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(tlacitkoUhlopricky, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(tlacitkoSmaz, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tlacitkoUhloprickyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlacitkoUhloprickyActionPerformed
       //nastav kresli na true
       
       //volej na objektu panelPlatno metodu repaint()
    }//GEN-LAST:event_tlacitkoUhloprickyActionPerformed

    private void tlacitkoSmazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlacitkoSmazActionPerformed
       //nastav kresli na false
       
       //volej na objektu panelPlatno metodu repaint() 
    }//GEN-LAST:event_tlacitkoSmazActionPerformed

public void kresli(Graphics gr){  
    //kresli jen pokud je promenna kresli  rovna true
    System.out.println("Kreslím!");
     //graficky kontext (objekt zodpovedny za vykreslovani) Graphics2D (pretypovani)
     
        //pomocna metoda pro vyhlazeni car a krivek
        
        //nastaveni tloustky cary tvaru
        
        //nastaveni barvy pro kresleni tvaru
        
        //Uhlopricka1 x = 0, y = 0; x1 = sirka, y1 = vyska
        
        //Uhlopricka2 x = sirka, y = 0; x1 = 0, y1 = vyska
            
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
            java.util.logging.Logger.getLogger(Vzor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vzor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vzor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vzor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vzor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelPlatno;
    private javax.swing.JButton tlacitkoSmaz;
    private javax.swing.JButton tlacitkoUhlopricky;
    // End of variables declaration//GEN-END:variables

}
