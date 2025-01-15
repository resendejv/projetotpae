/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Personal;
import view.Cadastro;


/**
 *
 * @author joao victor
 */
public class PersonalDAO {
    
    private final Connection connection;

    public PersonalDAO(Connection connection) {
        this.connection = connection;
    }
      public void insert(Personal usuario) throws SQLException{
          
            String sql = "insert into usuario(email,senha) values ('"+usuario.getEmail()+"','"+usuario.getSenha()+"');";
            PreparedStatement statement = connection.prepareStatement(sql); 
            statement.execute();
            
        }

    public boolean existeNoBancoPorEmailESenha(Personal personal) throws SQLException {
        
        String sql = "select * from usuario where email = '"+personal.getEmail()+"' and senha = '"+personal.getSenha()+"'";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        return resultSet.next();
    }

    
}
