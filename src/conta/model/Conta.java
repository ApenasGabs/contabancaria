package conta.model;

public abstract class Conta {

	private int numero, agencia, tipo;
	private float saldo;
	private String titular;

	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(float valor) {
		if (this.saldo < valor)
			return false;

		this.setSaldo(this.saldo - valor);
		return true;
	}

	public void depositar(float valor) {

		this.setSaldo(this.saldo + valor);
	}

	public void visualizar() {

		String tipoConta = "";

		switch (this.tipo) {
			case 1:
				tipoConta = "Conta Corrente";
				break;
			case 2:
				tipoConta = "Conta Poupança";
				break;
		}
		System.out.println("\n*************************************");
		System.out.println("\nDados da Conta");
		System.out.println("\n*************************************");
		System.out.println("\nNumero da conta: " + this.numero);
		System.out.println("\nAgência da conta: " + this.agencia);
		System.out.println("\nTipo da conta: " + tipoConta);
		System.out.println("\nTitular da conta: " + this.titular);
		System.out.println("\nSaldo da conta: " + this.saldo);
		System.out.println("\n*************************************");
	}

}