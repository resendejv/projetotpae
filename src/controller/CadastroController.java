/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.PersonalDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Personal;
import view.Cadastro;

/**
 *
 * @author joao victor
 */
public class CadastroController {
    
    private Cadastro view;

    public CadastroController(Cadastro view) {
        this.view = view;
    }
    
    public void salvaPersonal(){
        
        String email = view.getjTextFieldEmail().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        
        Personal usuarioAdd = new Personal(email, senha);

        try {
            Connection conexao = new Conexao().getConnection();
            PersonalDAO personaldao = new PersonalDAO(conexao);
            personaldao.insert(usuarioAdd);
            
            JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
            
            // dentro do TRY ele fecha a conexao sozinho
        
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
