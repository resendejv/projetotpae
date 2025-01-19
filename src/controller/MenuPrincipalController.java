/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Agenda;
import view.FrmAlunos;
import view.FuncionariosView;
import view.Login;
import view.MenuPrincipal;

/**
 *
 * @author joao victor
 */
public class MenuPrincipalController {
    
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void entrarAgenda(){
        
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
        
    }
    
    public void sairDoSistema(){
            this.view.dispose();
        Login login = new Login();
        login.setVisible(true);
    }
    
    public void entrarAlunos(){
        
        FrmAlunos alunos = new FrmAlunos();
        alunos.setVisible(true);
        
    }
    
    public void EntrarFuncionarios(){
        FuncionariosView funcionarios = new FuncionariosView();
        funcionarios.setVisible(true);
    }
    
}
