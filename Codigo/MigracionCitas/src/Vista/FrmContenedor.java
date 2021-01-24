package Vista;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class FrmContenedor extends javax.swing.JFrame {
    private FrmBanco Ventana1;

    public FrmContenedor() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        JMenuBar = new javax.swing.JMenuBar();
        JMenuGenerarCita = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMenuSalirSistema = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programar Cita Migración");
        setResizable(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        JMenuGenerarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/gtk-new.png"))); // NOI18N
        JMenuGenerarCita.setText("Generar Cita");
        JMenuGenerarCita.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JMenuGenerarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GenerarCita(evt);
            }
        });

        jMenuItem1.setText("Banco");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        JMenuGenerarCita.add(jMenuItem1);

        JMenuBar.add(JMenuGenerarCita);

        JMenuSalirSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/application-exit.png"))); // NOI18N
        JMenuSalirSistema.setText("Salir del sistema");
        JMenuSalirSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JMenuSalirSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SalirSistema(evt);
            }
        });
        JMenuBar.add(JMenuSalirSistema);

        setJMenuBar(JMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GenerarCita(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerarCita

    }//GEN-LAST:event_GenerarCita

    private void SalirSistema(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirSistema
        System.exit(0);
    }//GEN-LAST:event_SalirSistema

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
          Ventana1=new FrmBanco();
        jDesktopPane1.add (Ventana1);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {

        /*Por: Diego Vásquez
        Utilización de Libreria FlatLaF para Interfaz Gráfica de Usuario*/
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Error Interfaz Gráfica", "Error", JOptionPane.ERROR_MESSAGE);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new FrmContenedor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JMenu JMenuGenerarCita;
    private javax.swing.JMenu JMenuSalirSistema;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
