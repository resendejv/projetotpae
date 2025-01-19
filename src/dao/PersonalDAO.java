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
import model.Personal;


/**
 *
 * @author joao victor
 */
public class PersonalDAO {
    
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
      
      public void update(Personal personal) throws SQLException{
          String sql = "update into usuario set email = ? and senha ? where email = ?";
            
          PreparedStatement statement = connection.prepareStatement(sql); 
          statement.setString(1, personal.getEmail());
          statement.setString(2, personal.getSenha());
          statement.execute();
      }
      
      
      public void delete(Personal personal) throws SQLException{
          String sql = "delete from usuario where email = ?";
          PreparedStatement statement = connection.prepareStatement(sql);
          
          statement.setString(1, personal.getEmail());
          statement.execute();
      }
      
      public ArrayList<Personal> selectAll() throws SQLException{
        String sql = "select * from usuario";
        PreparedStatement statement = connection.prepareStatement(sql);
          
          
        return pesquisa(statement);
      }

    private ArrayList<Personal> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Personal> personals = new ArrayList<Personal>();
          
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        
        while(resultSet.next()){
            String email = resultSet.getString("email");
            String senha = resultSet.getString("senha");
            
            Personal personalComDadosDoBanco = new Personal(email, senha);
            personals.add(personalComDadosDoBanco);
        }
        
        return personals;
    }

      public Personal selectPorEmail(Personal personal) throws SQLException{
        String sql = "select * from usuario where email = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, personal.getEmail());
        
        return pesquisa(statement).get(0);
        
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

    
}
