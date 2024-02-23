package conta;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {
		ContaPoupanca conta1 = new ContaPoupanca(1, 555, 1, "Gabriel", 321);
		ContaCorrente conta2 = new ContaCorrente(1, 555, "1", "Gabriel", 321, 500);
		conta1.setAgencia(999);
		conta2.setAgencia(666);

		if (conta1.sacar(100))
			System.out.println("Saque efetuado com sucesso. O novo saldo é de: " + conta1.getSaldo());
		else
			System.out.println("O saldo é insuficiente!");

		conta1.visualizar();
		conta1.depositar(55);
		conta1.visualizar();
		conta2.visualizar();
		conta2.depositar(25);
		conta2.visualizar();
	}

}
