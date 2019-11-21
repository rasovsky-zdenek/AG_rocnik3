/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cviceni;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;


/**
 *
 * @author ag
 */
public class Vzor extends javax.swing.JFrame implements ActionListener {
    int x,y,sirka,vyska,a,v;
    double s,s0,t;
    Image raketa;
    Timer casovac;
    /**
     * vytvoreni objektu
     */
    public Vzor() {
        initComponents();
        sirka = panelPlatno.getWidth();
        vyska = panelPlatno.getHeight();
        System.out.println("Šířka: " + sirka);//pomocny vypis
        System.out.println("Výška: " + vyska);//pomocny vypis
        
        raketa = new ImageIcon("src/graphics/raketa.png").getImage();
        a = 2;
        naStart();
        casovac = new Timer(20,this);
         
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
        tlacitkoStart = new javax.swing.JButton();
        tlacitkoZastav = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Raketa");

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
            .addGap(0, 348, Short.MAX_VALUE)
        );

        tlacitkoStart.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tlacitkoStart.setText("Start");
        tlacitkoStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlacitkoStartActionPerformed(evt);
            }
        });

        tlacitkoZastav.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tlacitkoZastav.setText("Zastav");
        tlacitkoZastav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlacitkoZastavActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelPlatno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tlacitkoStart, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tlacitkoZastav, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPlatno, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tlacitkoStart, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tlacitkoZastav, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tlacitkoStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlacitkoStartActionPerformed
        casovac.start();
    }//GEN-LAST:event_tlacitkoStartActionPerformed

    private void tlacitkoZastavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlacitkoZastavActionPerformed
        casovac.stop();
    }//GEN-LAST:event_tlacitkoZastavActionPerformed

public void kresli(Graphics gr){
    //System.out.println("Kreslím!");
     //Graphics2D
     Graphics2D g = (Graphics2D)gr;
     
     //jestli je left true, pak nastav posun rakety o hodnotu, kterou vrati metoda getDeltaS
     //zamez, aby raketa nemohla opustit platno
     t += casovac.getDelay()/1000.0;
     s = v*t + 0.5*a*t*t;
     y -= (int)s;
     System.out.println(t);
     g.drawImage(raketa, x, y, null);
     
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
    private javax.swing.JButton tlacitkoStart;
    private javax.swing.JButton tlacitkoZastav;
    // End of variables declaration//GEN-END:variables

    private void naStart() {
        x = sirka/2 - raketa.getWidth(null)/2;
        y = vyska - raketa.getHeight(null)-5;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panelPlatno.repaint();
    }

    
    
}