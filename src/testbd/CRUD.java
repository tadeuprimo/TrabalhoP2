package testbd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CRUD {

    ConexaoBanco con = new ConexaoBanco();

    //create
    public boolean cadastrarMovimento(int ID,String DECOLAGEM,String POUSO,String TIPO,int DESEMBARQUE,int EMBARQUE,int CARGA,String COMANDANTE,int ANAC) {
        try {
            PreparedStatement comando = con.getConexao().prepareStatement("INSERT INTO ROOT.CADASTRO" + "(ID, DECOLAGEM,POUSO,TIPO, DESEMBARQUE, EMBARQUE,CARGA, COMANDANTE, ANAC) VALUES (?,?,?,?,?,?,?,?,?)");
            comando.setInt(1, ID);
            comando.setString(2, DECOLAGEM);
            comando.setString(3, POUSO);
            comando.setString(4, TIPO);
            comando.setInt(5, DESEMBARQUE);
            comando.setInt(6, EMBARQUE);
            comando.setInt(7, CARGA);
            comando.setString(8, COMANDANTE);
            comando.setInt(9, ANAC);

            return comando.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public ResultSet carregarMovimento() {
        ResultSet dados = null;
        try {
            PreparedStatement comando = con.getConexao().prepareStatement("SELECT * FROM ROOT.CADASTRO");
            dados = comando.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dados;
    }

    
    public boolean atualizarMovimento(int ID,String DECOLAGEM,String POUSO,String TIPO,int DESEMBARQUE,int EMBARQUE,int CARGA,String COMANDANTE,int ANAC) {
        try {
            {
                PreparedStatement comando = con.getConexao().prepareStatement("UPDATE Cadastro SET nivel =  ?,nome =  ?,sobrenome =  ? " + "  WHERE id =  ?");
                comando.setInt(1, nivel);
                comando.setString(2, nome);
                comando.setString(3, sobrenome);
                comando.setInt(4, id);
                return comando.execute();
            }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        } 
        
    public boolean excluirMovimento(int ID,String DECOLAGEM,String POUSO,String TIPO,int DESEMBARQUE,int EMBARQUE,int CARGA,String COMANDANTE,int ANAC) {
        try {
            PreparedStatement comando = con.getConexao().prepareStatement("DELETE FROM pessoa " + "WHEREid =  ?");
            comando.setInt(1, id);
            return comando.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    void cadastrarMovimento(int parseInt, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void excluirMovimento(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void atualizarMovimento(int parseInt, int parseInt0, String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void cadastrarMovimento(int parseInt, int parseInt0, String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
