package conta.model;

public class Conta {
  private int numero, agencia, tipo;
  private float  saldo;
  private String  titular;
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
public float getSaldo() {
	return saldo;
}
public void setSaldo(float saldo) {
	this.saldo = saldo;
}
public String getTitular() {
	return titular;
}
public void setTitular(String titular) {
	this.titular = titular;
}
}