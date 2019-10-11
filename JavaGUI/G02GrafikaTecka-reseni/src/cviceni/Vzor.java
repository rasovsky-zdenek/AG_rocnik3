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
import tvary.Bod;

/**
 *
 * @author ag
 */
public class Vzor extends javax.swing.JFrame {
    private Bod bod;
    private Bod stred;
    /**
     * Creates new form Tecka
     */
    public Vzor() {
        initComponents();
        System.out.println("Šířka: " + panelPlatno.getWidth());//pomocny vypis
        System.out.println("Výška: " + panelPlatno.getHeight());//pomocny vypis
        //vytvor objekt s nazvem stred tridy Bod (souradnice budou stred platna
        stred = new Bod(panelPlatno.getWidth()/2,panelPlatno.getHeight()/2);
        //nastaveni bodu na stre pomoci metody bodNaStred
        bod = new Bod(0,0); //musim mit bod vytvoreny
        bodNaStred(); //volani metody, ktera umisti bod na stred a zapise hodnoty do textField
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
        panelPlatno.repaint();
    }//GEN-LAST:event_tlacitkoPrekresliActionPerformed

public void kresli(Graphics gr){
    System.out.println("Kreslím!");
     //graficky kontext (objekt zodpovedny za vykreslovani) Graphics2D (pretypovani)
     Graphics2D g = (Graphics2D) gr;
        //nastaveni tloustky cary tvaru
        g.setStroke(new BasicStroke(5));//nastaveni tloustky cary (bodu na 5)
        //nastaveni barvy pro kresleni tvaru
        //****dopln metodu pro barvu bodu****
        g.setColor(Color.red);
        //ziskej souradnice, kde se ma bod vykreslit (vytvor metodu, ktera souradnice ziska a overi, jestli jsou na platne)
        getCoordinates();
        //vykresleni tvaru pomoci metod drawXXXXXX napr drawLine(x1,y1,x2y2); pozij pro souradnice metody setX a setY objektu bod
        g.drawLine(bod.getX(), bod.getY(), bod.getX(), bod.getY());
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

    private void getCoordinates() {
       int x,y;
       x = Integer.parseInt(fieldX.getText()); //chybi osetreni chybneho zadani
       y = Integer.parseInt(fieldY.getText());
       
       if((x < 0 || x > panelPlatno.getWidth()) || (y < 0 || y > panelPlatno.getHeight())){
           bodNaStred();
       }
       else{
          //nastaveni souradnic na nove hodnoty zadane utivatelem
           bod.setX(x);
           bod.setY(y); 
       }
       
    }
    
    private void bodNaStred(){
        //nastaveni souradnice bodu na stred
           bod.setX(stred.getX());
           bod.setY(stred.getY());
           
        //hodnoty v polich fieldX a fieldY nastaveny na stred
           fieldX.setText(String.valueOf(stred.getX()));
           fieldY.setText(String.valueOf(stred.getY()));   
    }

}
