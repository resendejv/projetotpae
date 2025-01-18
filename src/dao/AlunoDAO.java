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
import model.Aluno;


/**
 *
 * @author joao victor
 */
public class AlunoDAO {
    
    private final Connection connection;

    public AlunoDAO(Connection connection) {
        this.connection = connection;
    }
          public Aluno insert(Aluno aluno) throws SQLException{
          
            String sql = "insert into alunos(id, nome, cpf, email, celular, cidade, uf, plano, mensalidade) values (?,?,?,?,?,?,?,?,?); ";
            
            PreparedStatement statement = connection.prepareStatement(sql); 
            statement.setInt(1, aluno.getId());
            statement.setString(2, aluno.getNome());
            statement.setString(3, aluno.getCpf());
            statement.setString(4, aluno.getEmail());
            statement.setString(5, aluno.getCelular());
            statement.setString(6, aluno.getCidade());
            statement.setString(7, aluno.getUf());
            statement.setString(8, aluno.getPlano());
            statement.setInt(9, aluno.getMensalidade());
            
            statement.execute();
            
            ResultSet resultSet = statement.getGeneratedKeys();
            
            if (resultSet.next()){
                String email = resultSet.getString("email");
                aluno.setEmail(email);
            }
            return aluno;
        }
    
    
    
}
