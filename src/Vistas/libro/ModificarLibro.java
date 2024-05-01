package Vistas.libro;
import Logico.ConexionMySQL;
import Logico.MaterialLibro;
import Clases.MaterialLibroClases;
import VistasPrincipales.modificarMaterial;
import java.awt.BorderLayout;
import java.awt.Component;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Laura Pineda
 */
public class ModificarLibro extends javax.swing.JPanel {

    private MaterialLibro MaterialLibro = new MaterialLibro ((Connection) ConexionMySQL.obtenerConexion());
    private MaterialLibroClases MaterialClases = null;
    
    private void limpiarCajas(){
        txtId.setText(null);
        txtTitulo.setText(null);
        txtAutor.setText(null);
        txtPaginas.setText(null);
        txtEditorial.setText(null);
        txtIsbn.setText(null);
        txtPublicacion.setText(null);
        txtUnidades.setText(null);
        
    }
    
    private void cargarCajas(MaterialLibroClases Libro) {

        txtTitulo.setText(Libro.gettitulo());
        txtAutor.setText(Libro.getautor());
        txtPaginas.setText(Integer.toString(Libro.getnumPaginas()));
        txtEditorial.setText(Libro.geteditorial());
        txtIsbn.setText(Libro.getISBN());
        txtPublicacion.setText(Integer.toString(Libro.getyearPubli()));
        txtUnidades.setText(Integer.toString(Libro.getuniDispo()));

    }
    
    private void activar (){
        this.limpiarCajas();
        txtId.setEnabled(true);
        txtTitulo.setEnabled(false);
        txtAutor.setEnabled(false);
        txtPaginas.setEnabled(false);
        txtEditorial.setEnabled(false);
        txtIsbn.setEnabled(false);
        txtPublicacion.setEnabled(false);
        txtUnidades.setEnabled(false);
        
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);

        btnModificar.setEnabled(true);
        
        txtId.requestFocus();
    }
    public ModificarLibro() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPaginas = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPublicacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUnidades = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel9.setFont(new java.awt.Font("Felix Titling", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("MODIFICAR Libro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel9)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Código de identificación:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Titulo:");

        txtTitulo.setBackground(new java.awt.Color(4, 59, 59));

        txtAutor.setBackground(new java.awt.Color(4, 59, 59));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Autor:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Número de páginas:");

        txtPaginas.setBackground(new java.awt.Color(4, 59, 59));

        txtEditorial.setBackground(new java.awt.Color(4, 59, 59));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Editorial:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ISBN:");

        txtIsbn.setBackground(new java.awt.Color(4, 59, 59));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Año de publicación:");

        txtPublicacion.setBackground(new java.awt.Color(4, 59, 59));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Unidades disponibles:");

        txtUnidades.setBackground(new java.awt.Color(4, 59, 59));

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificar.setText("Actualizar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTitulo)
                            .addComponent(txtId)
                            .addComponent(txtAutor)
                            .addComponent(txtPaginas)
                            .addComponent(txtEditorial)
                            .addComponent(txtIsbn)
                            .addComponent(txtPublicacion)
                            .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        txtId.setEnabled(false);

        txtTitulo.setEnabled(true);
        txtAutor.setEnabled(true);
        txtPaginas.setEnabled(true);
        txtEditorial.setEnabled(true);
        txtIsbn.setEnabled(true);
        txtPublicacion.setEnabled(true);
        txtUnidades.setEnabled(true);

        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);

        btnModificar.setEnabled(false);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtTitulo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo titulo no puede estar en blanco.", "Error",
                JOptionPane.ERROR_MESSAGE);
        } else if (txtAutor.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo autor no puede estar en blanco.", "Error",
                JOptionPane.ERROR_MESSAGE);
        } else if (txtPaginas.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Paginas no puede estar en blanco.", "Error",
                JOptionPane.ERROR_MESSAGE);
        } else if (!txtPaginas.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "El campo Paginas solo puede contener numero.",
                "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtEditorial.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Editorial no puede estar en blanco.", "Error",
                JOptionPane.ERROR_MESSAGE);
        } else if (txtIsbn.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo ISBN no puede estar en blanco.", "Error",
                JOptionPane.ERROR_MESSAGE);
        } else if (txtPublicacion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo año no puede estar en blanco.", "Error",
                JOptionPane.ERROR_MESSAGE);
        } else if (!txtPublicacion.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "El campo año de publicacion solo puede contener numero.",
                "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtUnidades.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Unidades no puede estar en blanco.",
                "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!txtUnidades.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "El campo unidades disponibles solo puede contener numero.",
                "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String idInterno = txtId.getText();
            String titulo = txtTitulo.getText();
            String autor = txtAutor.getText();
            int numPaginas = Integer.parseInt(txtPaginas.getText());
            String editorial = txtEditorial.getText();
            String ISBN = txtIsbn.getText();
            int yearPubli = Integer.parseInt(txtPublicacion.getText());
            int uniDispo = Integer.parseInt(txtUnidades.getText());

            MaterialLibroClases materialLibro = new MaterialLibroClases(idInterno, titulo, uniDispo, autor,
                numPaginas, editorial, ISBN, yearPubli);
            
            if (MaterialLibro.ActualizarMaterialLibro(materialLibro)){
               JOptionPane.showMessageDialog(this, "Material actualizado correctamente", "Actualizar Material",
                            JOptionPane.INFORMATION_MESSAGE);
            } else {
                    JOptionPane.showMessageDialog(this, "Error al momento de actualizar", "Actualizar Material",
                            JOptionPane.ERROR_MESSAGE);
                    }
            activar();
            txtId.requestFocus();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.limpiarCajas();
        this.activar();
        txtId.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Object [] opciones = {"Aceptar","Cancelar"};
        Component rootPane = null;
        
        int eleccion = JOptionPane.showOptionDialog(rootPane, "¿Desea cerrar la ventana?",
                "Mensaje de confirmación", JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        
        if (eleccion == JOptionPane.YES_OPTION){
            modificarMaterial modificar = new modificarMaterial();
            JFrame modificarWindow = new JFrame("Modificar");
        modificarWindow.setLayout(new BorderLayout());
        modificarWindow.add(modificar);
        modificarWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        modificarWindow.setVisible(true);
        modificarWindow.setLocationRelativeTo(null);
               
        modificarWindow.pack();
            modificar.setVisible(true);
            this.setVisible(false);
            
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtId.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Codigo no puede estar en blanco.", "Error",
                JOptionPane.ERROR_MESSAGE);
        } else if (!MaterialLibro.localizarMaterialLibro(txtId.getText().trim())) {
            JOptionPane.showMessageDialog(null, "No existe este codigo, resgistrado"
                + "\n Imposible modificar",
                "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            MaterialClases = MaterialLibro.seleccionarMaterialLibro(txtId.getText().trim());
            cargarCajas(MaterialClases);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtPaginas;
    private javax.swing.JTextField txtPublicacion;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}