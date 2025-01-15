/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joao victor
 */
public class Ficha {
    
    private int id;
    private Aluno aluno;
    private Exercicio exercicio;
    private Date data;
    private String observacao;

    public Ficha(int id, Aluno aluno, Exercicio exercicio, String data) {
        this.id = id;
        this.aluno = aluno;
        this.exercicio = exercicio;
        try {
            this.data = new SimpleDateFormat("dd/mm/aaaa HH:MM").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Ficha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Exercicio getExercicio() {
        return exercicio;
    }

    public void setExercicio(Exercicio exercicio) {
        this.exercicio = exercicio;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    
}
