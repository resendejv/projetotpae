/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.PersonalDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Personal;
import model.Utilidades2;
import view.Cadastro;
import view.FuncionariosView;

/**
 * Classe responsável por gerenciar a janela de funcionários.
 * 
 * @author joao victor
 */
public class FuncionariosController implements Utilidades2 {
    
    public FuncionariosView view;

    public FuncionariosController(FuncionariosView view) {
        this.view = view;
    }
    
    /**
     * Método implementado que permite carregar a tabela de funcionários existentes
     * no banco de dados.
     * 
     */
        @Override
        public void carregarTabela() {
            try {
        Connection conexao = new Conexao().getConnection();
        PersonalDAO personaldao = new PersonalDAO(conexao);
        List<Personal> personals = personaldao.getAll();

        DefaultTableModel modelo = (DefaultTableModel) view.getTabelaPersonal().getModel();
        modelo.setRowCount(0); /** Limpa a tabela */

        for (Personal personal : personals) {
            modelo.addRow(new Object[]{
                verificarZero(personal.getId()), // Verifica se ID é 0
                verificarNulo(personal.getNome()),
                verificarNulo(personal.getCpf()),
                verificarNulo(personal.getEmail()),
                verificarNulo(personal.getCelular()),
                verificarNulo(personal.getFuncao()),
                verificarZero(personal.getSalario()), // Verifica se o Salario é 0
                verificarNulo(personal.getCidade()),
                verificarNulo(personal.getUf()),
            });
        }

    } catch (SQLException ex) {
        Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    // Método auxiliar para verificar campos de texto nulos ou vazios
    private String verificarNulo(String valor) {
        return (valor == null || valor.trim().isEmpty()) ? "-" : valor;
}

    // Método auxiliar para verificar se um valor inteiro é 0
    private String verificarZero(int valor) {
        return valor == 0 ? "-" : String.valueOf(valor);
   
}

    @Override
    public void salvarTabela() {
        //Método não utilizado na Janela de Funcionarios
    }
}