/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Personal;
import model.Utilidades3;


/**
 *
 * @author joao victor
 */
public class PersonalDAO implements Utilidades3 {
    
    private final Connection connection;

    public PersonalDAO(Connection connection) {
        this.connection = connection;
    }
      public void insert(Personal personal) throws SQLException{
          
            String sql = "insert into usuario(email,senha) values (?,?); ";
            
            PreparedStatement statement = connection.prepareStatement(sql); 
            statement.setString(1, personal.getEmail());
            statement.setString(2, personal.getSenha());
            statement.execute();
            
        }

      
    public boolean existeNoBancoPorEmailESenha(Personal personal) throws SQLException {
        
        String sql = "select * from usuario where email = ? and senha = ?";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, personal.getEmail());
        statement.setString(2, personal.getSenha());
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        return resultSet.next();
    }

    public List<Personal> getAll() throws SQLException {
            List<Personal> personals = new ArrayList<>();
            String sql = "SELECT * FROM usuario";

            try (PreparedStatement stmt = connection.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Personal personal = new Personal(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("cpf"),
                    rs.getString("email"),
                    rs.getString("celular"),
                    rs.getString("cidade"),
                    rs.getString("uf"),
                    rs.getInt("salario"),
                    rs.getString("funcao"),
                    rs.getString("funcao")
            );
            personals.add(personal);
        }
    }
    return personals;
}
}