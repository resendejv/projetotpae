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
import model.Aluno;
import model.Utilidades3;

/**
 * Classe responsável por gerenciar métodos que operam alunos no banco de dados.
 * Esta classe fornece métodos para cadastrar, listar, editar e remover alunos.
 * 
 * @author joao victor
 */
public class AlunoDAO implements Utilidades3{
    
    private final Connection connection;

    public AlunoDAO(Connection connection) {
        this.connection = connection;
    }

    /**
     * Método para adicionar um novo aluno na tabela de alunos
     * 
     * @param aluno Objeto da classe Aluno, contendo todas informações do aluno
     * a ser cadastrado.
     * 
     * @throws SQLException 
     */
          public void insert(Aluno aluno) throws SQLException{
          
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
        }
    
          /**
           * Método implementado para listar todos alunos que estão na tabela, usando a conexão
           * com o Banco de Dados.
           * 
           * @return lista de objetos Alunos, contendo todas informações dos alunos cadastrados.
           * @throws SQLException 
           */
        public List<Aluno> getAll() throws SQLException {
            List<Aluno> alunos = new ArrayList<>();
            String sql = "SELECT * FROM alunos";

            try (PreparedStatement stmt = connection.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Aluno aluno = new Aluno(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("cpf"),
                    rs.getString("email"),
                    rs.getString("celular"),
                    rs.getString("cidade"),
                    rs.getString("uf"),
                    rs.getString("plano"),
                    rs.getInt("mensalidade")
            );
            alunos.add(aluno);
        }
    }

    return alunos;
}

        /**
         * Método responsável por editar informações de um aluno no Banco de Dados.
         * 
         * @param aluno Objeto da classe Aluno com as informações do aluno a serem editadas.
         * 
         * @throws SQLException 
         */
        public void update(Aluno aluno) throws SQLException {
    String sql = "UPDATE alunos SET nome = ?, cpf = ?, email = ?, celular = ?, cidade = ?, uf = ?, plano = ?, mensalidade = ? WHERE id = ?" ;
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setString(1, aluno.getNome());
        stmt.setString(2, aluno.getCpf());
        stmt.setString(3, aluno.getEmail());
        stmt.setString(4, aluno.getCelular());
        stmt.setString(5, aluno.getCidade());
        stmt.setString(6, aluno.getUf());
        stmt.setString(7, aluno.getPlano());
        stmt.setInt(8, aluno.getMensalidade());
        stmt.setInt(9, aluno.getId());
        stmt.executeUpdate();
    }
}
        
        /**
         * Método que exclui um aluno da tabela.
         * 
         * @param id Matrícula do Aluno a ser excluido, o que garante que ele
         * esteja realmente cadastrado.
         * 
         * @throws SQLException 
         */
        public void delete(int id) throws SQLException {
            String sql = "DELETE FROM alunos WHERE id = ?";
                try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
    }
}
 
}
