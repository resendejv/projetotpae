/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *Classe responsável por estabelecer conexão direta
 * com o banco de dados.
 *  
 * @author joao victor
 */

public class Conexao {
    
    /**
     * Obtém a conexão com o banco de dados PostgreSQL localizado no
     * endereço "jdbc:postgresql://localhost:5432/projeto", utilizando
     * as credenciais dadas ("postgres", "postgres").
     * 
     * 
     * @return Uma instância de {@link Connection} conectada ao banco de dados.
     * @throws SQLException Erro caso a conexão não seja estabelecida.
     */
    
    public Connection getConnection() throws SQLException{
        // cria novo objeto conexao
        // utiliza um driver de conexão do proprio java
        
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto", "postgres", "postgres");
    }
    
}
