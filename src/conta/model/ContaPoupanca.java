package conta.model;

import java.util.Date;

public class ContaPoupanca extends Conta {
	private Date aniversario;

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo);
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario() {
		this.aniversario = new Date();
	}

	@Override
  public void visualizar(){
    super.visualizar();
    System.out.println("Sua conta foi criada em : " + aniversario);
		System.out.println("\n*************************************");

  }
}
