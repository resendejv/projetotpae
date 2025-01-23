/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Representa um aluno no sistema de academia.
 * 
 * A classe {@code Aluno} estende a classe {@code Usuario}, adicionando
 * atributos específicos para alunos, como plano e mensalidade.
 * 
 * @author joao victor
 */
public class Aluno extends Usuario{
    
    protected String plano;
    protected int mensalidade;

    public Aluno(int id, String nome, String cpf, String email, String celular, String plano, int mensalidade) {
        super(id, nome, cpf, email, celular);
        this.plano = plano;
        this.mensalidade = mensalidade;
    }

    
    public Aluno(int id, String nome, String cpf, String email, String celular, String cidade, String uf, String plano, int mensalidade) {
        super(id, nome, cpf, email, celular, cidade, uf);
        this.plano = plano;
        this.mensalidade = mensalidade;
    }
    
    /**
     * Obtém o plano do aluno.
     * 
     * @return Plano do aluno.
     */
    public String getPlano() {
        return plano;
    }

    /**
     * Define o plano do aluno.
     * 
     * @param plano Plano do aluno.
     */
    public void setPlano(String plano) {
        this.plano = plano;
    }

    /**
     * Obtém o valor da mensalidade do aluno.
     * 
     * @return Valor da mensalidade.
     */
    public int getMensalidade() {
        return mensalidade;
    }

    /**
     * Define a mensalidade do aluno.
     * 
     * @param mensalidade Valor da mensalidade.
     */
    public void setMensalidade(int mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    
}