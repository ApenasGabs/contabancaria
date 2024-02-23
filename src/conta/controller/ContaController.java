package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

  private ArrayList<Conta> listaDeContas = new ArrayList<Conta>();
  int numero = 0;

  @Override
  public void procurarPorNumero(int numero) {
    var conta = buscarNaCollection(numero);

    if (conta != null)
      conta.visualizar();
    else
      System.out.println("\nA Conta numero: " + numero + " nao foi encontrada!");
  }

  @Override
  public void listarTodas() {
    for (var conta : listaDeContas) {
      conta.visualizar();
    }
  }

  public void cadastrar(Conta conta) {
    listaDeContas.add(conta);
    System.out.println("\nA Conta número: " + conta.getNumero() + " foi criada com sucesso!");
  }

  @Override
  public void atualizar(Conta conta) {
    var buscaConta = buscarNaCollection(conta.getNumero());

    if (buscaConta != null) {
      listaDeContas.set(listaDeContas.indexOf(buscaConta), conta);
      System.out.println("\nA Conta numero: " + conta.getNumero() + " foi atualizada com sucesso!");
    } else
      System.out.println("\nA Conta numero: " + conta.getNumero() + " não foi encontrada!");
  }

  @Override
  public void deletar(int numero) {
    var conta = buscarNaCollection(numero);

    if (conta != null) {
      if (listaDeContas.remove(conta) == true)
        System.out.println("\nA Conta numero: " + numero + " foi deletada com sucesso!");
    } else
      System.out.println("\nA Conta numero: " + numero + " não foi encontrada!");
  }

  @Override
  public void sacar(int numero, float valor) {

  }

  @Override
  public void depositar(int numero, float valor) {

  }

  @Override
  public void transferir(int numeroOrigem, int numeroDestino, float valor) {

  }

  public int gerarNumero() {
    return ++numero;
  }

  public Conta buscarNaCollection(int numero) {
    for (var conta : listaDeContas) {
      if (conta.getNumero() == numero) {
        return conta;
      }
    }

    return null;
  }

}
