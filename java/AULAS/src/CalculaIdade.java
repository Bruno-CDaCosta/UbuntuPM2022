import java.util.Scanner;

public class CalculaIdade {
	
	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			String nome;
			int anoNascimento, idade;
			
			System.out.println("Digite o nome: ");
			nome = ler.next();
			System.out.println("Digite o ano de nascimento: ");
			anoNascimento = ler.nextInt();
			
			idade = 2022- anoNascimento;
			
			System.out.println("Oi "+nome+" sua idade é: "+idade);
			
			
		
	}

}
