package hollywoodgraph;

import Clases.*;
import EDU.oswego.cs.dl.util.concurrent.*;
import edu.uci.ics.jung.algorithms.blockmodel.*;
import edu.uci.ics.jung.algorithms.cluster.*;
import edu.uci.ics.jung.algorithms.shortestpath.DijkstraShortestPath;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;

import java.util.Random;
import javax.swing.JOptionPane;
public class gui extends javax.swing.JFrame {

    public gui() {
        initComponents();
        llenarArtistas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FamiliaPrincipal = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        cbArtistasParentesco = new javax.swing.JComboBox();
        arbolFamiliar = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addParentesco = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        cbParentescoArtistaOrigen = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cbParentescoType = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cbParentescoArtistaDestino = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        FamiliaPrincipal.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Artistas");
        FamiliaPrincipal.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        FamiliaPrincipal.getContentPane().add(cbArtistasParentesco, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 230, -1));

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
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        FamiliaPrincipal.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, -1, -1));

        jButton4.setText("Ver Arbol");
        FamiliaPrincipal.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 130, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hollywoodgraph/hollywood.jpg"))); // NOI18N
        FamiliaPrincipal.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        jLabel5.setText("jLabel5");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hollywoodgraph/hollywood ancho.jpg"))); // NOI18N

        addParentesco.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Artista:");
        addParentesco.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        addParentesco.getContentPane().add(cbParentescoArtistaOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 140, -1));

        jLabel8.setText("Parentesco:");
        addParentesco.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        cbParentescoType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Matrimonio", "Noviazgo", "Familia", "Amistad" }));
        addParentesco.getContentPane().add(cbParentescoType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 140, -1));

        jLabel9.setText("Artista");
        addParentesco.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        addParentesco.getContentPane().add(cbParentescoArtistaDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 140, -1));

        jButton5.setText("OK");
        addParentesco.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hollywoodgraph/hollywood ancho.jpg"))); // NOI18N
        addParentesco.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        //llenar combobox
        cbArtistasParentesco.removeAllItems();
        //Collection<Artista> a = grafo.getVertices();
        for (int i = 0; i < grafo.getVertexCount(); i++) {
            cbArtistasParentesco.addItem(g.getArtistas().get(i));
        }

        FamiliaPrincipal.pack();
        FamiliaPrincipal.setModal(true);
        FamiliaPrincipal.setLocationRelativeTo(null);
        FamiliaPrincipal.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        cbParentescoArtistaDestino.removeAllItems();
        cbParentescoArtistaOrigen.removeAllItems();
        for (int i = 0; i < grafo.getVertexCount(); i++) {
            cbParentescoArtistaDestino.addItem(g.getArtistas().get(i));
            cbParentescoArtistaOrigen.addItem(g.getArtistas().get(i));
        }
        
        addParentesco.pack();
        addParentesco.setModal(true);
        addParentesco.setLocationRelativeTo(null);
        addParentesco.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked
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
                g.setLocationRelativeTo(null);
            }
        });
    }

    public void llenarArtistas() {
        String[] texto;
        String aux = "";
        String[] nacionalidad = {"hondureña", "estadounidense", "mexicano", "ingles", "domincano", "español"};
        String[] estudio = {"Columbia", "Paramount", "Pixar", "DreamWorks", "Universal", "THX", "20th Century Fox", "Lucasfilm", "Metro-Goldwyn-Mayer", "Warner Bros.", "Walt Disney Pictures "};
        /*try{
            File file = new File("src/hollywoodgraph/.txt");
            System.out.println(file.getAbsolutePath());
            if (file != null) {
                FileReader archivos = new FileReader(file);
                BufferedReader lee = new BufferedReader(archivos);
                while ((aux = lee.readLine()) != null) {
                    texto = aux.split("#");
                    peliculas.add(new Pelicula(Integer.parseInt(texto[0]), texto[1].substring(0, texto[1].length()-6), Integer.parseInt(texto[1].substring(texto[1].length()-5, texto[1].length()-1)), estudio[0+r.nextInt(11)]));
                }
            }
        }catch(Exception e){
            
        }*/
        aux = "";
        try {
            File file = new File("src/hollywoodgraph/actors.txt");
            System.out.println(file.getAbsolutePath());
            if (file != null) {
                System.out.println("entra");
                FileReader archivos = new FileReader(file);
                BufferedReader lee = new BufferedReader(archivos);
                while ((aux = lee.readLine()) != null) {
                    texto = aux.split("#");
                    System.out.println(texto[0]+" "+texto[1]+" ,");
                    String na = nacionalidad[0 + r.nextInt(5)];
                    
                    int edad = 22 + r.nextInt(70);
                    if (!texto[1].contentEquals("Kevin Bacon")) {
                        g.addArtista(new Artista(texto[1], edad, na));
                        grafo.addVertex(new Artista(texto[1], edad, na));
                    }
                    
                }
                lee.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Archivo No Encontrado!");
        }
        System.out.println("Cantidad de Artistas: " + g.getCantidadArtistas());
        
        //Peliculas
        
        //g.setArtistas(artistas);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog FamiliaPrincipal;
    private javax.swing.JDialog addParentesco;
    private javax.swing.JPanel arbolFamiliar;
    private javax.swing.JComboBox cbArtistasParentesco;
    private javax.swing.JComboBox cbParentescoArtistaDestino;
    private javax.swing.JComboBox cbParentescoArtistaOrigen;
    private javax.swing.JComboBox cbParentescoType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
    ArrayList<Artista> artistas = new ArrayList<>();
    ArrayList<Pelicula> peliculas = new ArrayList<>();
    Random r = new Random();
    Grafo g = new Grafo();
    DirectedSparseGraph <Artista, Parentesco> grafo = new DirectedSparseGraph<Artista, Parentesco>();
}
