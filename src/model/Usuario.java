/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Representa um usuário no sistema de academia.
 * 
 * A classe {@code Usuario} encapsula informações relacionadas a um usuário.
 * 
 * @author joao victor
 */
abstract public class Usuario {
    
    /** Identificador do usuario */
    protected int id;
    
    /** Nome do usuario */
    protected String nome;
    
    /** CPF do usuario */
    protected String cpf;
    
    /** Email do usuario */
    protected String email;
    
    /** Celular do usuario */
    protected String celular;
    
    /** Cidade do usuario */
    protected String cidade;
    
    /** Unidade Federativa (UF) do usuario */
    protected String uf;

    public Usuario(int id, String nome, String cpf, String email, String celular, String cidade, String uf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Usuario(int id, String nome, String cpf, String email, String celular) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
    }

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Usuario(String email) {
        this.email = email;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    
}
