/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
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
    
    
    
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
    
    
}
