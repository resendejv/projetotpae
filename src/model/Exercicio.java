/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author joao victor
 */
public class Exercicio {
    
    private int id;
    private String descricao;
    private String musculo;

    public Exercicio(int id, String descricao, String musculo) {
        this.id = id;
        this.descricao = descricao;
        this.musculo = musculo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMusculo() {
        return musculo;
    }

    public void setMusculo(String musculo) {
        this.musculo = musculo;
    }
    
    
    
}
