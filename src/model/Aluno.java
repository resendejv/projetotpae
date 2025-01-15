/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
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

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public int getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(int mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    
}
