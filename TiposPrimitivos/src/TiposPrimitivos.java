import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do aluno ");
		String nome = teclado.nextLine();
		System.out.println("Digite a nota do aluno: ");
		float nota = teclado.nextFloat();
		
		
		
		System.out.println("Sua nota � " + nota);
		System.out.printf("A nota de %s � %.4f \n", nome ,nota);
		System.out.format("A nota de %s � %.8f \n" , nome ,nota);
	}

}
