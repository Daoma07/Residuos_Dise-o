/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import dominio.Residuo;
import dominio.Usuario;
import fachada.INegocio;
import factory.FabricaFormularios;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class FrmSolicitudesTraslados extends javax.swing.JFrame {

    private INegocio negocio;
    private FabricaFormularios fabrica;
    private List<Residuo> residuosSeleccionados;
    private List<Residuo> listaResiduos;
    private Usuario usuario;

    /**
     * Creates new form FrmSolicitudesTraslados
     */
    public FrmSolicitudesTraslados(INegocio negocio, Usuario usuario) {
        initComponents();
        fabrica = new FabricaFormularios();
        this.negocio = negocio;
        this.usuario = usuario;
        residuosSeleccionados = new ArrayList<>();
        listaResiduos = negocio.consultarResiduos();
        this.llenarTablaResiduos();
    }

    /**
<<<<<<< HEAD
=======
     * Metodo que llena la tabla tblQuimicosDisponibles, conforme al residuo
     * sleeccionado.
     */
    public void llenarTablaResiduoQuimicos(Residuo residuo) {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblQuimicosDisponibles.getModel();
        // Limpia tabla anterior
        modeloTabla.setRowCount(0);
        residuo.getQuimicos().forEach(quimico -> {
            Object[] fila = {
                quimico.getNombre()
            };
            modeloTabla.addRow(fila);
        });
    }

    /**
>>>>>>> f0f06ff40cbecfb08a3337d7d410fd00adb66e27
     * Metodo que llena la tabla tblSolicitudesTraslado con los residuos
     * almacenados.
     */
    public void llenarTablaResiduos() {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblSolicitudesTraslado.getModel();
        // Limpia tabla anterior
        modeloTabla.setRowCount(0);
        listaResiduos.forEach(residuo -> {
            Object[] fila = {
                residuo.getId(),
                residuo.getCodigo(),
<<<<<<< HEAD
                residuo.getNombre()
            };
=======
                residuo.getNombre(),};
>>>>>>> f0f06ff40cbecfb08a3337d7d410fd00adb66e27
            modeloTabla.addRow(fila);
        });
    }

    /**
     * Metodo que llena la tabla tblSeleccionSolicitudes conforme a los residuos
     * seleccionados.
     */
    public void llenarTablaResiduosSeleccionados() {
        List<Residuo> listaResiduos = residuosSeleccionados;
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblSeleccionSolicitudes.getModel();
        //Limpia tabla anterior
        modeloTabla.setRowCount(0);
        listaResiduos.forEach(residuo -> {
            Object[] fila = {
                residuo.getId(),
                residuo.getCodigo(),
                residuo.getNombre()
            };
            modeloTabla.addRow(fila);

        });
    }

    /**
<<<<<<< HEAD
     * Metodo que llena la tabla tblQuimicosDisponibles, conforme al residuo
     * sleeccionado.
     */
    public void llenarTablaResiduoQuimicos() {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblQuimicosDisponibles.getModel();
        // Limpia tabla anterior
        modeloTabla.setRowCount(0);
        int row = this.tblSolicitudesTraslado.getSelectedRow();
        String id = (String) tblSolicitudesTraslado.getValueAt(row, 0);
        Residuo residuoSeleccionado = negocio.buscarResiduo(id);
        System.out.println("Residuo" + residuoSeleccionado.getNombre());
        residuoSeleccionado.getQuimicos().forEach(quimico -> {
            Object[] fila = {
                quimico.getNombre()
            };
            modeloTabla.addRow(fila);
        });

    }

    /**
     * Metodo que
     *
     */
    public void seleccionarResiduo() {

//        this.residuosSeleccionados.add(residuoSeleccionado);
//        this.listaResiduos.remove(residuoSeleccionado);
//
//        this.llenarTablaResiduosSeleccionado();
//        this.llenarTablaResiduos();
    }

=======
     * Metodo que
     *
     */
    public void seleccionarResiduo() {
//        int fila = this.tblSolicitudesTraslado.getSelectedRow();
//        int id = (int)tblSolicitudesTraslado.getValueAt(fila, 0);
//        llenarTablaResiduoQuimicos(residuo);
//        Residuo residuoSeleccionado = new Residuo();
//
//        this.quimicosSeleccionados.add(quimicoSeleccionado);
//
//        this.listaQuimicos.remove(quimicoSeleccionado);
//
//        this.llenarTablaQuimicoSeleccionado();
//        this.llenarTablaQuimico();

    }

>>>>>>> f0f06ff40cbecfb08a3337d7d410fd00adb66e27
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSolicitudesTraslado = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSeleccionSolicitudes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxUnidades = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSolicitar = new javax.swing.JButton();
        btnSalir = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblQuimicosDisponibles = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblQuimicosSeleccionados = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSeleccionarResiduo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Solicitudes Traslados");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("Solicitudes de Traslados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 20, -1, -1));

        tblSolicitudesTraslado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSolicitudesTraslado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 153, 565, 160));

        tblSeleccionSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo", "Nombre", "Tratamiento", "Cantidad", "Unidad Medida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSeleccionSolicitudes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 394, 565, 199));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Residuos Disponibles");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 105, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Residuos Seleccionados");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 338, -1, -1));

        cbxUnidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LITRO", "KILOGRAMO" }));
        getContentPane().add(cbxUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 617, -1, -1));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 618, 101, -1));

        jLabel4.setText("Ingrese la Cantidad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 622, -1, -1));

        btnSolicitar.setText("Solicitar");
        getContentPane().add(btnSolicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 661, -1, -1));

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1153, 20, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 614, 181, -1));

        jLabel5.setText("Ingrese Fecha:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 622, -1, -1));

        tblQuimicosDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblQuimicosDisponibles);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(872, 153, 147, 160));

        tblQuimicosSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblQuimicosSeleccionados);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(872, 394, 147, 199));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Quimicos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(896, 105, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Quimicos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(901, 364, -1, -1));

        btnSeleccionarResiduo.setText("Seleccionar");
        btnSeleccionarResiduo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarResiduoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionarResiduo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSeleccionarResiduoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarResiduoActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.tblSolicitudesTraslado.getModel();
        int fila = tblSolicitudesTraslado.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "Selecciona un campo de la tabla porfavor", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            System.out.println("HOLA");
            ObjectId id = (ObjectId)tblSolicitudesTraslado.getValueAt(fila,0);
            System.out.println("ID: "+id.toString());
            Residuo residuo = negocio.buscarResiduo(id.toString());
            residuosSeleccionados.add(residuo);
            listaResiduos.remove(residuo);
            llenarTablaResiduos();
            llenarTablaResiduosSeleccionados();
        }
    }//GEN-LAST:event_btnSeleccionarResiduoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSalir;
    private javax.swing.JButton btnSeleccionarResiduo;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JComboBox<String> cbxUnidades;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblQuimicosDisponibles;
    private javax.swing.JTable tblQuimicosSeleccionados;
    private javax.swing.JTable tblSeleccionSolicitudes;
    private javax.swing.JTable tblSolicitudesTraslado;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
