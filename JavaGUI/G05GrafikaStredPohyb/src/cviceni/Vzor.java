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
import javax.swing.JTextField;

/**
 *
 * @author ag
 */
public class Vzor extends javax.swing.JFrame {
    private int vyska,sirka;
    private Bod stred,levyHorni,levySpodni,pravyHorni,pravySpodni;
    /**
     * Creates new form Tecka
     */
    public Vzor() {
        initComponents();
        sirka = panelPlatno.getWidth();
        vyska = panelPlatno.getHeight();
        stred = new Bod(sirka/2,vyska/2);
        levyHorni = new Bod(0,0);//zmena souradnic
        levySpodni = new Bod(0,0);//zmena souradnic
        pravyHorni = new Bod(0,0);//zmena souradnic
        pravySpodni = new Bod(0,0);//zmena souradnic
        //ncteni stredu do poli x,y
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
        tlacitkoPrekresli = new javax.swing.JButton();
        labelX = new javax.swing.JLabel();
        fieldX = new javax.swing.JTextField();
        labelY = new javax.swing.JLabel();
        fieldY = new javax.swing.JTextField();

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

        tlacitkoPrekresli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tlacitkoPrekresli.setText("Překresli");
        tlacitkoPrekresli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlacitkoPrekresliActionPerformed(evt);
            }
        });

        labelX.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelX.setText("X:");

        fieldX.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fieldX.setText("0");
        fieldX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelY.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelY.setText("Y:");

        fieldY.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fieldY.setText("0");
        fieldY.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelX)
                            .addComponent(labelY))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldY)
                            .addComponent(fieldX)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addComponent(tlacitkoPrekresli)))
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
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelX)
                            .addComponent(fieldX, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelY)
                            .addComponent(fieldY, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(tlacitkoPrekresli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tlacitkoPrekresliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlacitkoPrekresliActionPerformed
        int x = parsovaniX(fieldX);
        stred.setX(x);
        int y = parsovaniY(fieldY);
        stred.setY(y);
        panelPlatno.repaint();
    }//GEN-LAST:event_tlacitkoPrekresliActionPerformed

public void kresli(Graphics gr){
    System.out.println("Kreslím!");
     //graficky kontext (objekt zodpovedny za vykreslovani) Graphics2D (pretypovani)
     Graphics2D g = (Graphics2D)gr;
        //pomocna metoda pro vyhlazeni car a krivek
        Grafika.antialiasing(g);
        //nastaveni tloustky cary tvaru a barvy
        g.setStroke(new BasicStroke(3));
        g.setColor(Color.red);
        //vykresleni car pomoci g.drawLine(x1,y1,x2,y2) k zisku souradnic pouzij metody tridy Bod
        
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
    private javax.swing.JTextField fieldX;
    private javax.swing.JTextField fieldY;
    private javax.swing.JLabel labelX;
    private javax.swing.JLabel labelY;
    private javax.swing.JPanel panelPlatno;
    private javax.swing.JButton tlacitkoPrekresli;
    // End of variables declaration//GEN-END:variables

    private int parsovaniX(JTextField field) {
        //overeni, ze bod lezi na platne
        return 0;
    }

    private int parsovaniY(JTextField field) {
        //overeni, ze bod lezi na platne
        return 0;
    }
    
}
