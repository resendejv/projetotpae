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
 * Classe responsável por gerenciar métodos que operam personals no banco de dados.
 * Esta classe fornece métodos para cadastrar, listar, e buscar cadastro de personals
 * no banco de dados.
 * 
 * @author joao victor
 */
public class PersonalDAO implements Utilidades3 {
    
    private final Connection connection;

    public PersonalDAO(Connection connection) {
        this.connection = connection;
    }
    
    /**
     * Método para inserir um personal no banco de dados, para que ele consiga fazer login.
     * 
     * @param personal Objeto da classe Personal, utilizando o construtor que apenas
     * necessita do email e senha, para cadastrá-lo.
     * 
     * @throws SQLException 
     */
      public void insert(Personal personal) throws SQLException{
          
            String sql = "insert into usuario(email,senha) values (?,?); ";
            
            PreparedStatement statement = connection.prepareStatement(sql); 
            statement.setString(1, personal.getEmail());
            statement.setString(2, personal.getSenha());
            statement.execute();
            
        }

      /**
       * Método que busca um personal no banco de dados, para que ele consiga fazer
       * login se as informações existirem.
       * 
       * @param personal Objeto da classe Personal, com email e senha.
       * @return Retorna um boolean do banco de dados, que busca as informações dadas
       * nas tabelas, e retorna True se a combinação de login e senha existirem.
       * 
       * @throws SQLException 
       */
    public boolean existeNoBancoPorEmailESenha(Personal personal) throws SQLException {
        
        String sql = "select * from usuario where email = ? and senha = ?";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, personal.getEmail());
        statement.setString(2, personal.getSenha());
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        return resultSet.next();
    }

    /**
    * Método implementado para listar todos personals que estão na tabela, usando a conexão
    * com o Banco de Dados.
    * 
     * @return Lista de objetos Personal, com dados dos personals cadastrados.
     * @throws SQLException 
     */
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