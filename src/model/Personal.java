/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Representa um personal no sistema de academia.
 * 
 * A classe {@code Personal} estende a classe {@code Usuario}, adicionando
 * atributos específicos para personals, como salário, função e senha.
 * 
 * @author joao victor
 */
public class Personal extends Usuario {
    
    protected int salario;
    protected String funcao;
    protected String senha;

    public Personal(int id, String nome, String cpf, String email, String celular, String cidade, String uf, int salario, String funcao, String senha) {
        super(id, nome, cpf, email, celular, cidade, uf);
        this.salario = salario;
        this.funcao = funcao;
        this.senha = senha;
    }

    public Personal(int id, String nome, String cpf, String email, String celular, int salario, String senha) {
        super(id, nome, cpf, email, celular);
        this.salario = salario;
        this.senha = senha;
    }

    public Personal(int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }   

    public Personal(String email, String senha) {
        super(email);
        this.senha = senha;
    }
    
    
    /**
     * Obtém o salário do funcionário.
     * 
     * @return Salário do funcionário.
     */
    public int getSalario() {
        return salario;
    }

    /**
     * Define o salário do funcionário.
     * 
     * @param salario Salário do funcionário.
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }

    /**
     * Obtém a função do funcionário.
     * 
     * @return Função do funcionário.
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * Define a função do funcionário.
     * 
     * @param funcao Função do funcionário.
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * Obtém a senha do funcionário.
     * 
     * @return Senha do funcionário.
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define a senha do funcionário.
     * 
     * @param senha Senha do funcionário.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
    
    
}
