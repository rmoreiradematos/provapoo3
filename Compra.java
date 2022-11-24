public class Compra {

  private int id;
  private String data;
  private int quantidade;

  public Compra(int id, String data, int quantidade) {
    this.id = id;
    this.data = data;
    this.quantidade = quantidade;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
  
}
