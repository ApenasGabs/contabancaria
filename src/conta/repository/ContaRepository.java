package conta.repository;

public interface ContaRepository {
	public void depositar(float valor);
	public void  visualizar();
	public boolean sacar(float valor);

}
