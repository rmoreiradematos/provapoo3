public class Generic<S, TipoMoeda>{

  private S nome;
  private TipoMoeda moeda;

  public Generic(S nome, TipoMoeda moeda){
    this.nome  = nome;
    this.moeda = moeda;    
  }

  @Override
  public String toString() {
      return nome + " : " + moeda + "\n";
  }
  

}
