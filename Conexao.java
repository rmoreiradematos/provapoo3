import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conexao {
    public static void main(String[] args) {
        try{
            Connection conexao = DAO.createConnection();
            // Cliente Cliente = new Cliente("joao.neves", "João das Neves", "123");

            /* INSERT Usuário */
            /*PreparedStatement stmt = conexao.prepareStatement(
                "INSERT INTO Cliente (user_name, name, password) VALUES (?, ?, ?);"
            );
            stmt.setString(1, Cliente.getUserName());
            stmt.setString(2, Cliente.getName());
            stmt.setString(3, Cliente.getPassword());
            stmt.execute();*/

            /* SELECT ALL USERS */
            //imprimirClientes(conexao);

            /* DELETE id = 2 */
            // PreparedStatement stmt = conexao.prepareStatement(
            //     "DELETE FROM Cliente WHERE id = ?;"
            // );
            // stmt.setInt(1, 2);
            // stmt.execute();
            // imprimirClientes(conexao);

            // /* UPDATE id = 1 */
            // stmt = conexao.prepareStatement(
            //     "UPDATE Cliente SET user_name = ?, name = ?, password = ? WHERE id = ?;"
            // );
            // stmt.setString(1, "maria.dores");
            // stmt.setString(2, "Maria das Dores");
            // stmt.setString(3, "123457");
            // stmt.setInt(4, 1);
            // stmt.execute();
            // imprimirClientes(conexao);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public static void imprimirClientes(Connection conexao) throws Exception {
        ResultSet rs = conexao.createStatement().executeQuery(
            "SELECT * FROM clientes;"
        );
        while(rs.next()){
            Cliente Cliente2 = new Cliente(
                rs.getInt("id"), 
                rs.getString("nome"),
                rs.getString("cpf")
            );
            System.out.println("id: " + Cliente2.getId() + " Nome:  " + Cliente2.getNome() + " CPF: " + Cliente2.getCpf());
            System.out.println("===================================");
        }
    }

    public static void cadastrarCliente(Connection conexao, Cliente Cliente) throws Exception {
        PreparedStatement stmt = conexao.prepareStatement(
            "INSERT INTO clientes (nome, cpf) VALUES (?, ?);"
        );
        stmt.setString(1, Cliente.getNome());
        stmt.setString(2, Cliente.getCpf());
        stmt.execute();
    }
}
