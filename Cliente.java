import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Cliente {
  
  private int id;
  private String nome;
  private String cpf;

  public Cliente(int id, String nome, String cpf) {
    this.id = id;
    this.nome = nome;
    this.cpf = cpf;
  }

  public static int getId() {
    int id = 0;
    try{
      PreparedStatement stmt = DAO.createConnection().prepareStatement("select id from clientes order by id desc limit 1;");
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
          id = rs.getInt("id");  
        }
    }catch(Exception e){
      System.out.println(e);
    }
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

}
