/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.AgendaController;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joao victor
 */
public class Agenda extends javax.swing.JFrame {
    DefaultTableModel treino;
    
    private final AgendaController controller;
 
    
    
    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        controller = new AgendaController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCelular = new javax.swing.JTextField();
        BotaoSalvarTreino = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTreino = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jBoxTreino = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeladetreinos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabelFundo1 = new javax.swing.JLabel();
        jLabelFundo2 = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Data:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel1.add(jData, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 100, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nome:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel1.add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 230, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Celular:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel1.add(jCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 140, -1));

        BotaoSalvarTreino.setBackground(new java.awt.Color(51, 102, 0));
        BotaoSalvarTreino.setText("SALVAR");
        BotaoSalvarTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarTreinoActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoSalvarTreino, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Exercicios");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jTreino.setColumns(20);
        jTreino.setRows(5);
        jScrollPane2.setViewportView(jTreino);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, 160));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Treino:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jBoxTreino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peito + Triceps", "Costas + Biceps", "Perna", "Ombro", "Superiores Completo", "Inferiores Completo" }));
        jPanel1.add(jBoxTreino, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 110, -1));

        jTabbedPane1.addTab("Dados do Aluno", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabeladetreinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Treino", "Exercicios", "Data", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabeladetreinos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 630, 290));

        jTabbedPane1.addTab("Treinos Agendados", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 650, 350));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Agendamento");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jLabelFundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/output-onlinepngtools.png"))); // NOI18N
        getContentPane().add(jLabelFundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jLabelFundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/output-onlinepngtools.png"))); // NOI18N
        getContentPane().add(jLabelFundo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/background.jpeg"))); // NOI18N
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSalvarTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarTreinoActionPerformed

        treino = (DefaultTableModel)tabeladetreinos.getModel();
        
        treino.addRow(new Object[]{
            jNome.getText(),
            jBoxTreino.getSelectedItem(),
            jTreino.getText(),
            jData.getText(),
            jCelular.getText(),
        });
        controller.limpaTela(jPanel1);
    }//GEN-LAST:event_BotaoSalvarTreinoActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSalvarTreino;
    private javax.swing.JComboBox<String> jBoxTreino;
    private javax.swing.JTextField jCelular;
    private javax.swing.JTextField jData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelFundo1;
    private javax.swing.JLabel jLabelFundo2;
    private javax.swing.JTextField jNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTreino;
    private javax.swing.JTable tabeladetreinos;
    // End of variables declaration//GEN-END:variables
}
