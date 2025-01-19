/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.AlunoDAO;
import dao.Conexao;
import dao.PersonalDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Personal;
import model.Utilidades;
import view.Cadastro;
import view.FrmAlunos;

/**
 *
 * @author joao victor
 */
public class AlunosController {
    
    public FrmAlunos view;
    private Aluno alunoAdd;

    public AlunosController(FrmAlunos view) {
        this.view = view;
    }
    
    public void salvarAluno(){
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
}