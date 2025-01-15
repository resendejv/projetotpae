/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author joao victor
 */
public class Conexao {
    
    public Connection getConnection() throws SQLException{
        // cria novo objeto conexao
        // utiliza um driver de conexão do proprio java
        
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto", "postgres", "postgres");
    }
    
}
