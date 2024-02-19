package conta;

import conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta1 = new Conta(1, 555, 1, "Gabriel", 321) ;
		conta1.setAgencia(999);	


		if (conta1.sacar(100))
		System.out.println("Saque efetuado com sucesso. O novo saldo é de: " + conta1.getSaldo());
	else
		System.out.println("O saldo é insuficiente!");
	
		conta1.visualizar();
		conta1.depositar(55);
		conta1.visualizar();
	}

}
