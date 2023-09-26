/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManejoDeInscripciones extends javax.swing.JInternalFrame {

    private AlumnoData alumData = new AlumnoData();
    private InscripcionData inscData = new InscripcionData();
    private Alumno alumno = null;
    private Inscripcion inscripcion = null;

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public ManejoDeInscripciones() {
        initComponents();
        cargarTabla();
        cargarCombo();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jrbMateriasInscriptas = new javax.swing.JRadioButton();
        jrbMateriasNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbAnularInscripcion = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione un alumno:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("MANEJO DE INSCRIPCIONES");

        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Listado de Materias");

        jrbMateriasInscriptas.setBackground(new java.awt.Color(204, 204, 204));
        jrbMateriasInscriptas.setForeground(new java.awt.Color(0, 0, 0));
        jrbMateriasInscriptas.setText("Materias inscriptas");
        jrbMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriasInscriptasActionPerformed(evt);
            }
        });

        jrbMateriasNoInscriptas.setBackground(new java.awt.Color(204, 204, 204));
        jrbMateriasNoInscriptas.setForeground(new java.awt.Color(0, 0, 0));
        jrbMateriasNoInscriptas.setText("Materias no inscriptas");
        jrbMateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriasNoInscriptasActionPerformed(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTabla);

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnularInscripcion.setText("Anular Inscripcion");
        jbAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularInscripcionActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(89, 89, 89))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbInscribir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAnularInscripcion)
                .addGap(82, 82, 82)
                .addComponent(jbSalir)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jrbMateriasInscriptas)
                .addGap(33, 33, 33)
                .addComponent(jrbMateriasNoInscriptas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMateriasInscriptas)
                    .addComponent(jrbMateriasNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnularInscripcion)
                    .addComponent(jbSalir))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriasInscriptasActionPerformed

        if (jrbMateriasInscriptas.isSelected()) {
            jbAnularInscripcion.setEnabled(true);
            jbInscribir.setEnabled(false);
            alumno = (Alumno) jcbAlumnos.getSelectedItem();
            jrbMateriasNoInscriptas.setSelected(false);
            modelo.setRowCount(0);
            for (Materia materia : inscData.materiasCursadas(alumno.getIdAlumno())) {
                modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
            }
        } else {
            jrbMateriasInscriptas.setSelected(true);
        }

    }//GEN-LAST:event_jrbMateriasInscriptasActionPerformed

    private void jrbMateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriasNoInscriptasActionPerformed
        if (jrbMateriasNoInscriptas.isSelected()) {
            jbAnularInscripcion.setEnabled(false);
            jbInscribir.setEnabled(true);
            alumno = (Alumno) jcbAlumnos.getSelectedItem();
            jrbMateriasInscriptas.setSelected(false);
            modelo.setRowCount(0);
            for (Materia materia : inscData.materiasNOCursadas(alumno.getIdAlumno())) {
                modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
            }
        } else {
            jrbMateriasNoInscriptas.setSelected(true);
        }
    }//GEN-LAST:event_jrbMateriasNoInscriptasActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed

        if (jrbMateriasInscriptas.isSelected()) {
            alumno = (Alumno) jcbAlumnos.getSelectedItem();
            modelo.setRowCount(0);
            for (Materia materia : inscData.materiasCursadas(alumno.getIdAlumno())) {
                modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
            }
        } else if (jrbMateriasNoInscriptas.isSelected()) {
            alumno = (Alumno) jcbAlumnos.getSelectedItem();
            modelo.setRowCount(0);
            for (Materia materia : inscData.materiasNOCursadas(alumno.getIdAlumno())) {
                modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
            }

        }
    }//GEN-LAST:event_jcbAlumnosActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        try {
            ArrayList<Materia> materias = inscData.materiasNOCursadas(alumno.getIdAlumno());
            int fila = jtTabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(this, "ERROR: Seleccione una fila.");
            } else {
                for (int i = 0; i <= fila; i++) {
                    if (i == fila) {
                        Materia materiaSelecionada = materias.get(i);
                        inscripcion = new Inscripcion(0, alumno, materiaSelecionada);
                        inscData.guardarInscripcion(inscripcion);

                        modelo.setRowCount(0);
                        for (Materia materia : inscData.materiasNOCursadas(alumno.getIdAlumno())) {
                            modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
                        }
                    }
                }
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "ERROR: Seleccione materias cursadas o no cursadas.");
        }
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularInscripcionActionPerformed
        try {

            ArrayList<Materia> materias = inscData.materiasCursadas(alumno.getIdAlumno());
            int fila = jtTabla.getSelectedRow();

            if (fila == -1) {
                JOptionPane.showMessageDialog(this, "ERROR: Seleccione una fila.");
            } else {
                for (int i = 0; i <= fila; i++) {
                    if (i == fila) {
                        Materia materiaSelecionada = materias.get(i);
                        inscripcion = new Inscripcion(0, alumno, materiaSelecionada);
                        inscData.borrarInscripcionMateriaAlumno(alumno.getIdAlumno(), materiaSelecionada.getIdMateria());

                        modelo.setRowCount(0);
                        for (Materia materia : inscData.materiasCursadas(alumno.getIdAlumno())) {
                            modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
                        }
                    }
                }
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "ERROR: Seleccione materias cursadas o no cursadas.");
        }

    }//GEN-LAST:event_jbAnularInscripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnularInscripcion;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JRadioButton jrbMateriasInscriptas;
    private javax.swing.JRadioButton jrbMateriasNoInscriptas;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jtTabla.setModel(modelo);
    }

    private void cargarCombo() {

        for (Alumno alum : alumData.listarAlumnos()) {
            jcbAlumnos.addItem(alum);
        }

    }
}
