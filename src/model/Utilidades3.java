/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.sql.SQLException;

/**
 * Interface que instancia um método de listar uma tabela de objetos.
 * 
 * @author joao victor
 * @param <T> Algum "tipo", a letra T é genérica
 */
public interface Utilidades3<T> {
    
    /**
     * Método que lista uma tabela de objetos, que podem ser alunos ou funcionários.
     * 
     * @return ArrayList de objetos a serem listados.
     * @throws SQLException 
     */
    List<T> getAll() throws SQLException;
    
}
