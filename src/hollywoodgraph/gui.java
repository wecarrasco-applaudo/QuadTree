package hollywoodgraph;
public class gui extends javax.swing.JFrame {
    public gui() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FamiliaPrincipal = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        arbolFamiliar = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        FamiliaPrincipal.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Artistas");
        FamiliaPrincipal.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        FamiliaPrincipal.getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 230, -1));

        arbolFamiliar.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout arbolFamiliarLayout = new javax.swing.GroupLayout(arbolFamiliar);
        arbolFamiliar.setLayout(arbolFamiliarLayout);
        arbolFamiliarLayout.setHorizontalGroup(
            arbolFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );
        arbolFamiliarLayout.setVerticalGroup(
            arbolFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );

        FamiliaPrincipal.getContentPane().add(arbolFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, 520, 410));

        jButton3.setText("Agregar Parentesco");
        FamiliaPrincipal.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, -1, -1));

        jButton4.setText("Ver Arbol");
        FamiliaPrincipal.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 130, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hollywoodgraph/hollywood.jpg"))); // NOI18N
        FamiliaPrincipal.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        jLabel5.setText("jLabel5");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hollywoodgraph/hollywood ancho.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hollywoodgraph/fam5.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 710, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hollywoodgraph/kevin-bacon.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 700, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hollywoodgraph/hollywood.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        FamiliaPrincipal.pack();
        FamiliaPrincipal.setModal(true);
        FamiliaPrincipal.setVisible(true);
        FamiliaPrincipal.setLocationRelativeTo(this);
        
        //llenar combobox
    }//GEN-LAST:event_jButton2MouseClicked
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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gui g = new gui();
                g.setVisible(true);
                g.setLocationRelativeTo(g);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog FamiliaPrincipal;
    private javax.swing.JPanel arbolFamiliar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
