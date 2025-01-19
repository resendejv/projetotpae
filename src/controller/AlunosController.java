/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.AlunoDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Aluno;
import view.Cadastro;
import view.FrmAlunos;

/**
 *
 * @author joao victor
 */
public class AlunosController {
    
    public FrmAlunos view;

    public AlunosController(FrmAlunos view) {
        this.view = view;
        
    }
    
    
    public void salvarAluno(){
        
        // Verifica se os campos obrigatórios estão preenchidos
        if (view.getjID().getText().isEmpty() || 
            view.getjTextNome().getText().isEmpty() || 
            view.getjTextCPF().getText().isEmpty() || 
            view.getjTextEmail().getText().isEmpty() || 
            view.getjTextCelular().getText().isEmpty() || 
            view.getjTextCidade().getText().isEmpty() || 
            view.getCbuf().getSelectedItem() == null || 
            view.getjTextPlano().getText().isEmpty() || 
            view.getjTextMensalidade().getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Erro ao cadastrar aluno", JOptionPane.ERROR_MESSAGE);
            return; // Sai do método se algum campo estiver vazio
        }
        
        int id = Integer.parseInt(view.getjID().getText());
        String nome = view.getjTextNome().getText();
        String cpf = view.getjTextCPF().getText();
        String email = view.getjTextEmail().getText();
        String celular = view.getjTextCelular().getText();
        String cidade = view.getjTextCidade().getText();
        String uf = (String) view.getCbuf().getSelectedItem();
        String plano = view.getjTextPlano().getText();
        int mensalidade = Integer.parseInt(view.getjTextMensalidade().getText());
        
        
        Aluno alunoAdd = new Aluno(id, nome, cpf, email, celular, cidade, uf, plano, mensalidade);

        try {
            Connection conexao = new Conexao().getConnection();
            AlunoDAO alunodao = new AlunoDAO(conexao);
            alunodao.insert(alunoAdd);
            
            JOptionPane.showMessageDialog(null, "Aluno salvo com sucesso!");
            
            // dentro do TRY ele fecha a conexao sozinho
        
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
            
        }  
    }
    
    public void carregarTabelaAlunos() {
    try {
        Connection conexao = new Conexao().getConnection();
        AlunoDAO alunodao = new AlunoDAO(conexao);
        List<Aluno> alunos = alunodao.getAll();

        DefaultTableModel modelo = (DefaultTableModel) view.getTabelaAlunos().getModel();
        modelo.setRowCount(0); // Limpa a tabela

        for (Aluno aluno : alunos) {
            modelo.addRow(new Object[]{
                aluno.getId(),
                aluno.getNome(),
                aluno.getCpf(),
                aluno.getEmail(),
                aluno.getCelular(),
                aluno.getCidade(),
                aluno.getUf(),
                aluno.getPlano(),
                aluno.getMensalidade()
            });
        }

    } catch (SQLException ex) {
        Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    public void editarAluno() {

        // Verifica se os campos obrigatórios estão preenchidos
        if (view.getjID().getText().isEmpty() || 
            view.getjTextNome().getText().isEmpty() || 
            view.getjTextCPF().getText().isEmpty() || 
            view.getjTextEmail().getText().isEmpty() || 
            view.getjTextCelular().getText().isEmpty() || 
            view.getjTextCidade().getText().isEmpty() || 
            view.getCbuf().getSelectedItem() == null || 
            view.getjTextPlano().getText().isEmpty() || 
            view.getjTextMensalidade().getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Erro ao cadastrar aluno", JOptionPane.ERROR_MESSAGE);
            return; // Sai do método se algum campo estiver vazio
        }
        
    // Atualizando com os dados da interface
    int id = Integer.parseInt(view.getjID().getText());
    String nome = view.getjTextNome().getText();
    String cpf = view.getjTextCPF().getText();
    String email = view.getjTextEmail().getText();
    String celular = view.getjTextCelular().getText();
    String cidade = view.getjTextCidade().getText();
    String uf = (String) view.getCbuf().getSelectedItem();
    String plano = view.getjTextPlano().getText();
    int mensalidade = Integer.parseInt(view.getjTextMensalidade().getText());

    Aluno alunoEditado = new Aluno(id, nome, cpf, email, celular, cidade, uf, plano, mensalidade);

    try {
        Connection conexao = new Conexao().getConnection();
        AlunoDAO alunodao = new AlunoDAO(conexao);
        alunodao.update(alunoEditado);

        JOptionPane.showMessageDialog(null, "Aluno atualizado com sucesso!");
        carregarTabelaAlunos(); // Atualiza a tabela após a edição

    } catch (SQLException ex) {
        Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Erro ao atualizar o aluno.");
    }
}
    
    public void deletarAluno() {
    int selectedRow = view.getTabelaAlunos().getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Selecione um aluno para deletar.");
        return;
    }

    int id = (int) view.getTabelaAlunos().getValueAt(selectedRow, 0); // ID está na primeira coluna

    try {
        Connection conexao = new Conexao().getConnection();
        AlunoDAO alunodao = new AlunoDAO(conexao);
        alunodao.delete(id);

        JOptionPane.showMessageDialog(null, "Aluno deletado com sucesso!");
        carregarTabelaAlunos(); // Atualiza a tabela após a exclusão

    } catch (SQLException ex) {
        Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Erro ao deletar o aluno.");
    }
}

    
    
    
}