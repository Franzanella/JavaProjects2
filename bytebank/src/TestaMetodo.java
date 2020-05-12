
public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.depositar(50);
		System.out.println(conta.saldo);
		
		
		boolean conseguiuRetirar = conta.sacar(10);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta conta2 = new Conta();
		conta2.depositar(1000);
		boolean sucessoTransferencia = conta2.transfere(300, conta);
		if(sucessoTransferencia) {
			System.out.println("Transferencia feita com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		
		
		System.out.println(conta2.saldo);
		System.out.println(conta.saldo);
		
		conta.titular = "Paulo Silveira";
		System.out.println(conta.titular);

	}

}
