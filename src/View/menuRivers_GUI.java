package View;

import Controller.dataBase;
import Controller.dbRivers;
import java.util.ArrayList;
import javax.swing.JLabel;

public class menuRivers_GUI extends javax.swing.JFrame {

    public static ArrayList<dbRivers> rivers = new ArrayList<>();
    
    /**
     * Creates new form MenuBeaches
     */
    public menuRivers_GUI() {
        // Inicializa a lista de praias
        dataBase.Rivers();
        rivers = dataBase.rivers;
        
        initComponents();
        loading();
    }
    
    public void loading() {
        if (!rivers.isEmpty()) {
            nameriver1_txt.setText(rivers.get(0).getName());
            contaminantesriver1_txt.setText(rivers.get(0).getContaminants());
            phriver1_txt.setText(String.valueOf(rivers.get(0).pH));
            
            nameriver2_txt.setText(rivers.get(1).getName());
            contaminantesriver2_txt.setText(rivers.get(1).getContaminants());
            phriver2_txt.setText(String.valueOf(rivers.get(1).pH));
            
            nameriver3_txt.setText(rivers.get(2).getName());
            contaminantesriver3_txt.setText(rivers.get(2).getContaminants());
            phriver3_txt.setText(String.valueOf(rivers.get(2).pH));
        } else {
            nameriver1_txt.setText("No data available");
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        contaminantesriver1_txt = new javax.swing.JLabel();
        phriver1_txt = new javax.swing.JLabel();
        nameriver1_txt = new javax.swing.JLabel();
        phriver2_txt = new javax.swing.JLabel();
        contaminantesriver2_txt = new javax.swing.JLabel();
        nameriver2_txt = new javax.swing.JLabel();
        nameriver3_txt = new javax.swing.JLabel();
        contaminantesriver3_txt = new javax.swing.JLabel();
        phriver3_txt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("PH");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 20, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 40, 10));

        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 40, 10));

        jLabel4.setText("Presença de contaminantes");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 140, 20));

        contaminantesriver1_txt.setText("null");
        getContentPane().add(contaminantesriver1_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 190, 70));

        phriver1_txt.setText("null");
        getContentPane().add(phriver1_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 50, 60));

        nameriver1_txt.setText("null");
        getContentPane().add(nameriver1_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 44, 100, 60));

        phriver2_txt.setText("null");
        getContentPane().add(phriver2_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 50, 60));

        contaminantesriver2_txt.setText("null");
        getContentPane().add(contaminantesriver2_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 130, 80));

        nameriver2_txt.setText("null");
        getContentPane().add(nameriver2_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 60));

        nameriver3_txt.setText("null");
        getContentPane().add(nameriver3_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 60));

        contaminantesriver3_txt.setText("null");
        getContentPane().add(contaminantesriver3_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 130, 80));

        phriver3_txt.setText("null");
        getContentPane().add(phriver3_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 50, 60));

        jButton1.setText("Back to menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 130, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bar.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new menuSelection_GUI().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(menuRivers_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuRivers_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuRivers_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuRivers_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuRivers_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contaminantesriver1_txt;
    private javax.swing.JLabel contaminantesriver2_txt;
    private javax.swing.JLabel contaminantesriver3_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JLabel nameriver1_txt;
    private javax.swing.JLabel nameriver2_txt;
    private javax.swing.JLabel nameriver3_txt;
    private javax.swing.JLabel phriver1_txt;
    private javax.swing.JLabel phriver2_txt;
    private javax.swing.JLabel phriver3_txt;
    // End of variables declaration//GEN-END:variables
}
