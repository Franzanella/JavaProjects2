
public class ContaCorrente extends Conta implements Tributavel {

	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean sacar(double valor) {
		double valorASacar = valor + 0.2;
		return super.sacar(valorASacar);
	}
	
	  @Override
      public void depositar(double valor) {
         super.saldo += valor;
      }

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.saldo * 0.01;
	}
	
}
