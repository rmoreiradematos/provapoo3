abstract class Produto{
  protected int id;
  protected String nome;
  protected String preco;

public int getId(){
  return id;
}

public void setId(int id){
  this.id = id;
}

public String getNome(){
  return nome;
}

public void setNome(String nome){
  this.nome = nome;
}

public String getPreco(){
  return preco;
}

public void setPreco(String preco){
  this.preco = preco;
}

@Override
public String toString() {
    return "Id: " + this.id + "\n"+
           "Nome: " + this.nome + "\n"+
           "Preço: " + this.preco + "\n";
}


}