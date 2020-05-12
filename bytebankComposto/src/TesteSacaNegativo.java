
public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta conta0 = new Conta();
		conta0.depositar(100);
		System.out.println(conta0.sacar(101));
		
		
		conta0.sacar(101);
		
		System.out.println(conta0.getSaldo());
		
		conta0.numero = -1377;
		
	}

}
