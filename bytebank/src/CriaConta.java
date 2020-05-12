
public class CriaConta {

	public static void main(String[] args) {
		 Conta c = new Conta();
	       c.saldo = 200; 
	        System.out.println(c.saldo); 

	        c.saldo += 100;
	        System.out.println(c.saldo);

	        Conta c2 = new Conta();
	        c2.saldo = 50;

	        System.out.println("primeira conta tem " + c.saldo);
	        System.out.println("segunda conta tem " + c2.saldo);

	        System.out.println(c.agencia);
	        System.out.println(c.numero);

	        System.out.println(c2.agencia);

	        c2.agencia = 146;
	        System.out.println("agora a segunda conta está na agencia " + c2.agencia);
	        }
		
		
		

	}


