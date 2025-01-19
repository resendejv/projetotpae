/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.AlunosController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.Utilidades;

/**
 *
 * @author joao victor
 */
public class FrmAlunos extends javax.swing.JFrame {

    private final AlunosController controller;

    /**
     * Creates new form FrmAlunos
     */
    public FrmAlunos() {
        initComponents();
        controller = new AlunosController(this);
        controller.carregarTabelaAlunos();
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
        jPainelDados = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbuf = new javax.swing.JComboBox<>();
        jTextCPF = new javax.swing.JTextField();
        jTextNome = new javax.swing.JTextField();
        jTextCidade = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextMensalidade = new javax.swing.JTextField();
        jTextCelular = new javax.swing.JTextField();
        jTextPlano = new javax.swing.JTextField();
        BotaoSalvarAluno = new javax.swing.JButton();
        BotaoEditarAluno = new javax.swing.JButton();
        BotaoExcluirAluno = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAlunos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabelFundo2 = new javax.swing.JLabel();
        jLabelFundo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPainelDados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mensalidade:");
        jPainelDados.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        jPainelDados.add(jID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 70, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("ID:");
        jPainelDados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nome:");
        jPainelDados.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("CPF:");
        jPainelDados.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("E-mail:");
        jPainelDados.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Celular:");
        jPainelDados.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Cidade:");
        jPainelDados.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("UF:");
        jPainelDados.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Plano:");
        jPainelDados.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        cbuf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbuf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jPainelDados.add(cbuf, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, 40));
        jPainelDados.add(jTextCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 160, -1));
        jPainelDados.add(jTextNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 230, -1));
        jPainelDados.add(jTextCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 150, -1));
        jPainelDados.add(jTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 230, -1));
        jPainelDados.add(jTextMensalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 150, -1));
        jPainelDados.add(jTextCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 150, -1));
        jPainelDados.add(jTextPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 150, -1));

        BotaoSalvarAluno.setBackground(new java.awt.Color(51, 102, 0));
        BotaoSalvarAluno.setText("SALVAR");
        BotaoSalvarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarAlunoActionPerformed(evt);
            }
        });
        jPainelDados.add(BotaoSalvarAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        BotaoEditarAluno.setBackground(new java.awt.Color(0, 0, 102));
        BotaoEditarAluno.setText("EDITAR");
        BotaoEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEditarAlunoActionPerformed(evt);
            }
        });
        jPainelDados.add(BotaoEditarAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, -1));

        BotaoExcluirAluno.setBackground(new java.awt.Color(153, 0, 0));
        BotaoExcluirAluno.setText("DELETAR");
        BotaoExcluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirAlunoActionPerformed(evt);
            }
        });
        jPainelDados.add(BotaoExcluirAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, -1));

        jTabbedPane1.addTab("Dados Pessoais", jPainelDados);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "CPF", "E-mail", "Celular", "Cidade", "UF", "Plano", "Mensalidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAlunos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, 340));

        jTabbedPane1.addTab("Alunos Cadastrados", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 660, 390));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Alunos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jLabelFundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/output-onlinepngtools.png"))); // NOI18N
        getContentPane().add(jLabelFundo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabelFundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/output-onlinepngtools.png"))); // NOI18N
        getContentPane().add(jLabelFundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/background.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void tabelaAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAlunosMouseClicked
        // Pega os dados
        jTabbedPane1.setSelectedIndex(0);

        jID.setText(tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 0).toString());
        jTextNome.setText(tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 1).toString());
        jTextCPF.setText(tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 2).toString());
        jTextEmail.setText(tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 3).toString());
        jTextCelular.setText(tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 4).toString());
        jTextCidade.setText(tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 5).toString());
        cbuf.setSelectedItem(tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 6).toString());
        jTextPlano.setText(tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 7).toString());
        jTextMensalidade.setText(tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 8).toString());
    }//GEN-LAST:event_tabelaAlunosMouseClicked

    
    private void BotaoSalvarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarAlunoActionPerformed
        controller.salvarAluno();
        new Utilidades().limpaTela(jPainelDados);
        controller.carregarTabelaAlunos();
        
    }//GEN-LAST:event_BotaoSalvarAlunoActionPerformed

    private void BotaoEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditarAlunoActionPerformed
        controller.editarAluno();
        new Utilidades().limpaTela(jPainelDados);
        controller.carregarTabelaAlunos();
    }//GEN-LAST:event_BotaoEditarAlunoActionPerformed

    private void BotaoExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirAlunoActionPerformed
        controller.deletarAluno();
        new Utilidades().limpaTela(jPainelDados);
        controller.carregarTabelaAlunos();
    }//GEN-LAST:event_BotaoExcluirAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEditarAluno;
    private javax.swing.JButton BotaoExcluirAluno;
    private javax.swing.JButton BotaoSalvarAluno;
    private javax.swing.JComboBox<String> cbuf;
    private javax.swing.JTextField jID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFundo1;
    private javax.swing.JLabel jLabelFundo2;
    private javax.swing.JPanel jPainelDados;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextCPF;
    private javax.swing.JTextField jTextCelular;
    private javax.swing.JTextField jTextCidade;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextMensalidade;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextPlano;
    private javax.swing.JTable tabelaAlunos;
    // End of variables declaration//GEN-END:variables

    
    
    private static class Alunos {

        public Alunos() {
        }
    }

    public JComboBox<String> getCbuf() {
        return cbuf;
    }

    public void setCbuf(JComboBox<String> cbuf) {
        this.cbuf = cbuf;
    }

    public JTextField getjID() {
        return jID;
    }

    public void setjID(JTextField jID) {
        this.jID = jID;
    }

    public JTextField getjTextCPF() {
        return jTextCPF;
    }

    public void setjTextCPF(JTextField jTextCPF) {
        this.jTextCPF = jTextCPF;
    }

    public JTextField getjTextCelular() {
        return jTextCelular;
    }

    public void setjTextCelular(JTextField jTextCelular) {
        this.jTextCelular = jTextCelular;
    }

    public JTextField getjTextCidade() {
        return jTextCidade;
    }

    public void setjTextCidade(JTextField jTextCidade) {
        this.jTextCidade = jTextCidade;
    }

    public JTextField getjTextEmail() {
        return jTextEmail;
    }

    public void setjTextEmail(JTextField jTextEmail) {
        this.jTextEmail = jTextEmail;
    }

    public JTextField getjTextMensalidade() {
        return jTextMensalidade;
    }

    public void setjTextMensalidade(JTextField jTextMensalidade) {
        this.jTextMensalidade = jTextMensalidade;
    }

    public JTextField getjTextNome() {
        return jTextNome;
    }

    public void setjTextNome(JTextField jTextNome) {
        this.jTextNome = jTextNome;
    }

    public JTextField getjTextPlano() {
        return jTextPlano;
    }

    public void setjTextPlano(JTextField jTextPlano) {
        this.jTextPlano = jTextPlano;
    }

    public JTable getTabelaAlunos() {
        return tabelaAlunos;
    }

    public void setTabelaAlunos(JTable tabelaAlunos) {
        this.tabelaAlunos = tabelaAlunos;
    }
    
    
}
