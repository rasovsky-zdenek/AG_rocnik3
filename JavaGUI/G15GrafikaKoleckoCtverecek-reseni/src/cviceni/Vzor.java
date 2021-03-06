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
    //ukazatel na barvu Color color
    private boolean kolecko, ctverecek;
    /**
     * Creates new form Tecka
     */
    public Vzor() {
        initComponents();
        
        System.out.println("Šířka: " + panelPlatno.getWidth());//pomocny vypis
        System.out.println("Výška: " + panelPlatno.getHeight());//pomocny vypis
        panelPlatno.requestFocus();
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
        tlacitkoKolecko = new javax.swing.JButton();
        tlacitkoCtverecek = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kreslení");

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

        tlacitkoKolecko.setBackground(new java.awt.Color(204, 204, 204));
        tlacitkoKolecko.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tlacitkoKolecko.setText("Kolečko");
        tlacitkoKolecko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlacitkoKoleckoActionPerformed(evt);
            }
        });

        tlacitkoCtverecek.setBackground(new java.awt.Color(204, 204, 204));
        tlacitkoCtverecek.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tlacitkoCtverecek.setText("Čtverček");
        tlacitkoCtverecek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlacitkoCtverecekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tlacitkoCtverecek, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(tlacitkoKolecko, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(82, 82, 82)
                        .addComponent(tlacitkoKolecko, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(tlacitkoCtverecek, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tlacitkoKoleckoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlacitkoKoleckoActionPerformed
        //Zisk barvy tlacitka a prirazeni do promenne color
        kolecko = true;
        ctverecek = false;
        panelPlatno.repaint();
    }//GEN-LAST:event_tlacitkoKoleckoActionPerformed

    private void tlacitkoCtverecekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlacitkoCtverecekActionPerformed
        ctverecek = true;
        kolecko = false;
        panelPlatno.repaint();
    }//GEN-LAST:event_tlacitkoCtverecekActionPerformed

public void kresli(Graphics gr){
    System.out.println("Kreslím!");
     //graficky kontext (objekt zodpovedny za vykreslovani) Graphics2D (pretypovani)
      Graphics2D g = (Graphics2D)gr;
        //pomocna metoda pro vyhlazeni car a krivek
        Grafika.antialiasing(g);
        //nastaveni tloustky cary tvaru
        g.setStroke(new BasicStroke(10)); 
        
        //vykresleni kruhu drawOval(40,25,200,200) (levyhornirohX,levyhornirohY,delka,vyska)
        if(kolecko) g.drawOval(40,25,200,200);
        
        if(ctverecek) g.drawRect(40,25,200,200);
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
    private javax.swing.JButton tlacitkoCtverecek;
    private javax.swing.JButton tlacitkoKolecko;
    // End of variables declaration//GEN-END:variables

}
