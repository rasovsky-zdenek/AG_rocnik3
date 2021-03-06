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
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author ag
 */
public class Vzor extends javax.swing.JFrame implements ActionListener{
    int sirka,vyska,index,i;
    Image[] cisla;
    Random nahoda;
    Timer casovac;
    
    /**
     * Creates new form Tecka
     */
    public Vzor() {
        initComponents();
         sirka = panelPlatno.getWidth();
         vyska = panelPlatno.getHeight();
        System.out.println("Šířka: " + sirka);//pomocny vypis
        System.out.println("Výška: " + vyska);//pomocny vypis
        //Image im = new ImageIcon("").getImage();
        
        cisla = new Image[]{ 
                    new ImageIcon("src/img/1.png").getImage(),
                    new ImageIcon("src/img/2.png").getImage(),
                    new ImageIcon("src/img/3.png").getImage(),
                    new ImageIcon("src/img/4.png").getImage(),
                    new ImageIcon("src/img/5.png").getImage(),
                    new ImageIcon("src/img/6.png").getImage()
                };
        nahoda = new Random();
        casovac = new Timer(500,this);
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
        tlacitkoHod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kreslení");

        panelPlatno.setBackground(new java.awt.Color(255, 255, 255));
        panelPlatno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPlatno.setPreferredSize(new java.awt.Dimension(280, 250));

        javax.swing.GroupLayout panelPlatnoLayout = new javax.swing.GroupLayout(panelPlatno);
        panelPlatno.setLayout(panelPlatnoLayout);
        panelPlatnoLayout.setHorizontalGroup(
            panelPlatnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        panelPlatnoLayout.setVerticalGroup(
            panelPlatnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        tlacitkoHod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tlacitkoHod.setText("Hoď");
        tlacitkoHod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlacitkoHodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelPlatno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(tlacitkoHod, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPlatno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tlacitkoHod)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tlacitkoHodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlacitkoHodActionPerformed
        tlacitkoHod.setEnabled(false);
        casovac.start();
    }//GEN-LAST:event_tlacitkoHodActionPerformed

public void kresli(Graphics gr){  
    //kresli jen pokud je promenna kresli  rovna true
    System.out.println("Kreslím!");
     //graficky kontext (objekt zodpovedny za vykreslovani) Graphics2D (pretypovani)
        Graphics2D g = (Graphics2D)gr;
        //pomocna metoda pro vyhlazeni car a krivek
        Grafika.antialiasing(g);
        //nastaveni tloustky cary tvaru
        g.setStroke(new BasicStroke(1));
        //nastaveni barvy pro kresleni tvaru
        g.setColor(Color.red);
        
        index = generuj();
        g.drawImage(cisla[index], 0, 0, null);
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
    private javax.swing.JButton tlacitkoHod;
    // End of variables declaration//GEN-END:variables

    private int generuj() {
        return nahoda.nextInt(6);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        i++;
        if(i==5){
            casovac.stop();
            i = 0;
            tlacitkoHod.setEnabled(true);
        }
        panelPlatno.repaint();
    }

    

}
