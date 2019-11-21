package testbd;

import java.sql.*;

public class ConexaoBanco {

    private Connection conexao;
    private String URLBD  = "jdbc:derby://localhost:1527/Cadastro";
    private String usuario = "root";
    private String senha = "123";

    public ConexaoBanco() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conexao = DriverManager.getConnection(URLBD, usuario, senha);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
public static void main (String[]args){
    
}
    public Connection getConexao() {
        return conexao;
    }
 

    
    
    
}