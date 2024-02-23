package conta.model;

public class ContaCorrente extends Conta  {
  private int limite;

  public ContaCorrente(int numero, int agencia, String tipo, String titular, float saldo, int limite) {
    super(numero, agencia, agencia, titular, saldo);
    this.limite = limite;
  }

  public int getLimite() {
    return this.limite;
  }

  public void setLimite(int limite) {
    this.limite = limite;
  }

  @Override
  public boolean sacar(float valor) {
      if(this.getSaldo() + this.getLimite() < valor){
        System.out.println("\nSaldo insuficiente");
        return false;
      }
    this.setSaldo(this.getSaldo() - valor);
    System.out.println("\nSaque efetuado");
      return true;
  }

  @Override
  public void visualizar(){
    super.visualizar();
    System.out.println("Seu limite atual e de: " + limite);
		System.out.println("\n*************************************");

  }
}
