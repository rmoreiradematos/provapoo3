import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args){
    
    // try{

      // PreparedStatement stmt = DAO.createConnection().prepareStatement("select * from clientes");
      // ResultSet rs = stmt.executeQuery();
      // while(rs.next()){
      //   Cliente cliente = new Cliente(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"));
        
      // }
    // }catch(Exception e){
    //   System.out.println(e);
    // }
    Scanner scanner = new Scanner(System.in);
    int opcao = 0;

    do {
        System.out.println("Digite a operação do menu: ");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Listar Clientes");
        System.out.println("3 - Cadastrar Sabor");
        System.out.println("4 - Listar Sabores");
        System.out.println("5 - Cadastrar Comanda");
        System.out.println("6 - Listar Comandas");
        System.out.println("7 - Quantidade Pizzas por Tamanho");

        try {
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarCliente(scanner);
                    break;
                case 2:
                    listarClientes();
                    break;
                case 3:
                    cadastrarProduto(scanner);
                    break;
                case 4:
                    // listarProduto();
                    break;
                case 5:
                    // excluirProduto(scanner);
                    break;
                
                default:
                    System.out.println("Opção inválida!");
            }
        } catch (Exception e) {
            opcao = 9;
        }

    } while (opcao != 0);
    scanner.close();
  }

  public static void cadastrarCliente(Scanner sc){

    System.out.println("Digite o nome do cliente: ");
    String nome = sc.next();
    System.out.println("Digite o CPF do cliente: ");
    String cpf = sc.next();
    Cliente cliente = new Cliente(Cliente.getId(),nome, cpf);
    try{
      Connection conexao = DAO.createConnection();
      Conexao.cadastrarCliente(conexao, cliente);
    }catch(Exception e){
      System.out.println(e);
    }
  }
  
  public static void listarClientes(){
    try{
      Connection conexao = DAO.createConnection();
      Conexao.imprimirClientes(conexao);
    }catch(Exception e){
      System.out.println(e);
    }
  }

  public static void cadastrarProduto(Scanner sc){
    System.out.println("Digite o tipo do produto: [Tijolo][Tubo][Cabo]");
    System.out.println("Digite o nome do produto: ");
    String nome = sc.next();
    System.out.println("Digite o valor do produto: ");
    double valor = sc.nextDouble();
    Produto produto = new Produto(Produto.getId(),nome, valor);
    try{
      Connection conexao = DAO.createConnection();
      Conexao.cadastrarProduto(conexao, produto);
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
