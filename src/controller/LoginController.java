/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.PersonalDAO;
import java.awt.Component;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Personal;
import model.Utilidades;
import view.Login;
import view.MenuPrincipal;

/**
 *
 * @author joao victor
 */
public class LoginController implements Utilidades {
    
    private Login view;

    public LoginController(Login view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {
        
        // busca um usuario da view
        
        String email = view.getjTextFieldEmail().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        
        Personal personalAutenticar = new Personal(email,senha);
        
        // verifica se existe no banco de dados
        
        Connection conexao = new Conexao().getConnection();
        PersonalDAO personaldao = new PersonalDAO(conexao);
        
        boolean existe = personaldao.existeNoBancoPorEmailESenha(personalAutenticar);
        
        
        // se existir, direciona para o menu
        
        if (existe){
            MenuPrincipal teladeMenu = new MenuPrincipal();
            teladeMenu.setVisible(true);
            this.view.dispose();
        } else{
            JOptionPane.showMessageDialog(view, "Usuário ou senha Inválidos!");
        }
        
        
    }
    
    public void sairLogin(){
        this.view.dispose();
    }

    @Override
    public void limpaTela(JPanel container) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText(null);
            }
        }
    }
}

    
