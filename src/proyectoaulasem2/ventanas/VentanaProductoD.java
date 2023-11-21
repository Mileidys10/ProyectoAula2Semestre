/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proyectoaulasem2.ventanas;

import java.io.IOException;
import javax.swing.JOptionPane;
import proyectoaulasem2.bd.AlmacenamientoP;
import proyectoaulasem2.datos.Producto;

/**
 *
 * @author Usuario
 */
public class VentanaProductoD extends javax.swing.JDialog {

    /**
     * Creates new form VentanaProductoD
     */
    public VentanaProductoD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        botonMod = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        txtNombreP = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaulasem2/ventanas/iconos/dairy-products.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 76, 240, 230));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gestion de productos ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 17, 257, -1));

        botonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaulasem2/ventanas/iconos/search.png"))); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 315, 135, -1));

        botonMod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaulasem2/ventanas/iconos/modify.png"))); // NOI18N
        botonMod.setText("Modificar");
        botonMod.setEnabled(false);
        botonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModActionPerformed(evt);
            }
        });
        getContentPane().add(botonMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 373, 135, -1));

        jPanel1.setBackground(new java.awt.Color(69, 69, 69));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        txtCodigo.setEditable(false);
        txtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodigoMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Codigo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Precio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(txtNombreP, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        botonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaulasem2/ventanas/iconos/Save.png"))); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 315, -1, -1));

        botonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaulasem2/ventanas/iconos/Delete.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.setEnabled(false);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 373, 121, -1));

        jPanel2.setBackground(new java.awt.Color(39, 39, 39));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        try {
            String Codigo = JOptionPane.showInputDialog("Ingrese el codigo del producto para buscar");

            Producto.ProductosBD = AlmacenamientoP.retornar();

            if (Producto.ProductosBD.containsKey(Codigo)){
                Producto prod = Producto.ProductosBD.get(Codigo);
                txtNombreP.setText(prod.name);
                txtPrecio.setText(prod.precio+"");
                txtCodigo.setText(Codigo);
                
                botonMod.setEnabled(true);
                botonEliminar.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(this, "El producto no existe ");

            }       } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());

            }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModActionPerformed

        try {
            String Codigo = JOptionPane.showInputDialog("Ingrese el codigo del producto");
            Producto.ProductosBD = AlmacenamientoP.retornar();

            String nameP = txtNombreP.getText();
            String pre = txtPrecio.getText();

            if (Codigo.isEmpty() || nameP.isEmpty() || pre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos");
                return;
            }

            double precio = Double.parseDouble(pre);

            if (!Producto.ProductosBD.containsKey(Codigo)) {
                JOptionPane.showMessageDialog(this, "El producto con código " + Codigo + " no existe");
                return;
            } else {
                Producto prod = new Producto();
                prod.codigo = Codigo;
                prod.name = nameP;
                prod.precio = precio;

                Producto.ProductosBD.put(Codigo, prod);

                AlmacenamientoP.guardar(Producto.ProductosBD);
                JOptionPane.showMessageDialog(this, "Cambios guardados con éxito");
                LimpiarCampos();
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error al convertir el precio a número: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }

    }//GEN-LAST:event_botonModActionPerformed

    private void txtCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoMouseClicked
        int totalClick = evt.getClickCount();
        if(totalClick >= 2){
            txtCodigo.setEditable(true);
        }
    }//GEN-LAST:event_txtCodigoMouseClicked

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        String Codigo = txtCodigo.getText();
        String nameP = txtNombreP.getText();
        String pre = txtPrecio.getText();
        double precio = Double.parseDouble(pre);
        if(Producto.ProductosBD.containsKey(Codigo)){
            JOptionPane.showMessageDialog(this, "El producto con codigo "+Codigo+" Ya existe");
            return;

        }
        Producto prod = new Producto();
        prod.codigo=Codigo;
        prod.name=nameP;
        prod.precio=precio;

        Producto.ProductosBD.put(Codigo, prod);

        int total = Producto.ProductosBD.size();

        try {
            AlmacenamientoP.guardar(Producto.ProductosBD);
            JOptionPane.showMessageDialog(this , "Producto guardado con exito\n total: "+total);
            LimpiarCampos();
        } catch (IOException error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }

    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed

        if (txtCodigo.getText() == null || txtCodigo.getText().isEmpty()) {
            String msj = "Para eliminar, primero tiene que ingresar el código del producto";
            JOptionPane.showMessageDialog(this, msj);
            LimpiarCampos();
            return;
        }

        int opc = JOptionPane.showConfirmDialog(this, "¿Seguro que desea Eliminar el producto?", "CONFIRMAR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (opc == JOptionPane.YES_OPTION) {
            Producto.ProductosBD.remove(txtCodigo.getText());
            try {
                AlmacenamientoP.guardar(Producto.ProductosBD);
                JOptionPane.showMessageDialog(this, "Producto eliminado con éxito");
                LimpiarCampos();
            } catch (IOException error) {
                JOptionPane.showMessageDialog(this, error.getMessage());
            }
        }

    }//GEN-LAST:event_botonEliminarActionPerformed
public void LimpiarCampos(){
        txtCodigo.setText("");
        txtNombreP.setText("");
        txtPrecio.setText("");
        
       
    
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
            java.util.logging.Logger.getLogger(VentanaProductoD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProductoD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProductoD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProductoD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaProductoD dialog = new VentanaProductoD(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
