/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Catalogos;


import busqueda.frmBuscarProducto;
import busqueda.frmBuscarProveedor;
import configuracion.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author certificacion6
 */
public class frmCatalogoEntrada extends javax.swing.JInternalFrame {
Connection conexion;
     DefaultTableModel model;
    /**
     * Creates new form frmCatalogoEntrada
     */
    public frmCatalogoEntrada() {
        initComponents();
         setClosable(true);
        setMaximizable(true);
        
        inicializaBaseDeDatos();
        
        model = new DefaultTableModel();
        tablaEntrada.setModel(model);
        
        model.addColumn("id_medicamento");
        model.addColumn("medicamento");
        model.addColumn("precio");
        model.addColumn("cantidad");
        model.addColumn("total");
    }
    
    public void inicializaBaseDeDatos(){
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conexion = DriverManager.
                    getConnection("jdbc:mysql://"
                    + "localhost/farmacia","root","");
        }catch(Exception ex){
            ex.printStackTrace();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEntrada = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaEntrada);

        jLabel3.setText("Proveedor:");
        jLabel3.setToolTipText("");

        jLabel4.setText("Cantidad:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar (2).png"))); // NOI18N
        jButton1.setToolTipText("Buscar proveedor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar entrada");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Producto:");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/medicamento.png"))); // NOI18N
        jButton3.setToolTipText("Buscar Producto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar Venta");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel5.setText("Total a pagar:");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon-farm.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sistem.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel1))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAgregar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnGuardar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar)
                    .addComponent(btnAgregar))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
frmBuscarProveedor BuscarProveedor= new frmBuscarProveedor(txtProveedor);
        BuscarProveedor.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     frmBuscarProducto BuscarProducto= new frmBuscarProducto(txtProducto);
        BuscarProducto.setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
try{
            PreparedStatement consulta = conexion.prepareStatement(""
                    + "SELECT * FROM medicamento WHERE status=1 AND id_medicamento=?");
            consulta.setString(1, txtProducto.getText());
            ResultSet rs = consulta.executeQuery();            
            
            rs.next();

            Object[] fila = new Object[5];

            fila[0]=txtProducto.getText();
            fila[1]=rs.getString("nombre");
            fila[2]=rs.getString("precio");
            fila[3]=txtCantidad.getText();
            double precio = Double.parseDouble(rs.getString("precio"));
            int cantidad = Integer.parseInt(txtCantidad.getText());
            double total = precio * cantidad;
            fila[4]=""+total;

            model.addRow(fila);        
            limpiaCampos();
            sumarventa();
        }catch(Exception e){
            e.printStackTrace();
        }                      // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
         PreparedStatement consulta = conexion.prepareStatement(""
                    + "INSERT INTO entrada (fecha_alta, id_usuario, id_proveedor,total) VALUES(NOW(),?,?,?)");
            consulta.setInt(1, config.id_usuario);
            consulta.setString(2, txtProveedor.getText());
            consulta.setString(3, "0");
            consulta.executeUpdate();  
        
            consulta = conexion.prepareStatement("SELECT last_insert_id() as id FROM entrada");
           ResultSet rs = consulta.executeQuery();    
            if (rs.next()){
                int id_entrada= rs.getInt("id");
                for(int i=0;i<tablaEntrada.getRowCount();i++){ 

                    int id_producto= Integer.parseInt(tablaEntrada.getValueAt(i, 0).toString());
                    int cantidad= Integer.parseInt(tablaEntrada.getValueAt(i, 3).toString());
                    double precio= Double.parseDouble(tablaEntrada.getValueAt(i, 2).toString());
                    double total= Double.parseDouble(tablaEntrada.getValueAt(i, 4).toString());

                    consulta=conexion.prepareStatement(""
                            +"INSERT INTO detalle_entrada(id_entrada,id_producto,cantidad,precio,total) VALUES (?,?,?,?,?)" );
                    consulta.setInt(1, id_entrada);
                    consulta.setInt(2, id_producto);
                    consulta.setInt(3, cantidad);
                    consulta.setDouble(4, precio);
                    consulta.setDouble(5, total);
                    consulta.executeUpdate(); 


                    consulta = conexion.prepareStatement("SELECT * FROM bodega WHERE id_medicamento=?");
                    consulta.setInt(1, id_producto);            
                    ResultSet rs2 = consulta.executeQuery();    

                    if (rs2.next()){
                        int cantidad_bodega=rs2.getInt("cantidad");
                        cantidad_bodega = cantidad_bodega + cantidad;                        
                        consulta = conexion.prepareStatement("UPDATE bodega SET cantidad=? WHERE id_medicamento = ?");
                        consulta.setInt(1, cantidad_bodega);
                        consulta.setInt(2, id_producto);    
                        
                        consulta.executeUpdate(); 
                    }else{                        
                        consulta = conexion.prepareStatement("INSERT INTO bodega (id_medicamento, cantidad) VALUES (?,?)");
                        consulta.setInt(1, id_producto);
                        consulta.setInt(2, cantidad);      
                        
                        consulta.executeUpdate(); 
                    }
              
            }
                JOptionPane.showMessageDialog(null, "Se guardo la venta");
          }
        }catch(Exception e){
             e.printStackTrace();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void limpiaCampos(){
        txtProducto.setText("");
        txtCantidad.setText("");
       
    }
    
    public void sumarventa(){
        double suma=0;
        for(int i=0;i<tablaEntrada.getRowCount();i++){
            suma+=Double.parseDouble(tablaEntrada.getValueAt(i, 4).toString());
            
        }
        txtTotal.setText(""+suma);
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
            java.util.logging.Logger.getLogger(frmCatalogoEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCatalogoEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCatalogoEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCatalogoEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCatalogoEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEntrada;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
