package conta;

import java.util.Scanner;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {
	public static void main(String[] args) {
		boolean condicaoQueAindaNaoPenseiEmComoFazer = true;
		do {
			exibirMenuPrincipal();
			String opcao = lerOpcaoUsuario();

			switch (opcao) {
				case "1" -> criarConta();
				case "2" -> listarTodasAsContas();
				case "3" -> buscarContaPorNumero();
				case "4" -> atualizarDadosConta();
				case "5" -> apagarConta();
				case "6" -> realizarSaque();
				case "7" -> realizarDeposito();
				case "8" -> realizarTransferencia();
				case "9" -> sairDoPrograma();
				default -> mostrarOpcaoInvalida();
			}
		}while (condicaoQueAindaNaoPenseiEmComoFazer);
	}

	private static String lerOpcaoUsuario() {
		return "";
	}

	private static void criarConta() {

	}

	private static void listarTodasAsContas() {

	}

	private static void buscarContaPorNumero() {

	}

	private static void atualizarDadosConta() {

	}

	private static void apagarConta() {

	}

	private static void realizarSaque() {

	}

	private static void realizarDeposito() {

	}

	private static void realizarTransferencia() {
	}

	private static void mostrarOpcaoInvalida() {
	}

	private static void exibirMenuPrincipal() {
	}

	private static void sairDoPrograma() {
	}
}
