import java.util.Scanner;

public class SegundoPrograma {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		//VARIAVEIS
		int anoNascimento, idade ;
		char zona = 'L';
		double salario = 0.00;
		boolean milionario = false;
		String nome = "Bruno Correia da Costa";
		
		System.out.println("Qual a sua data de nascimento: ");
		anoNascimento = leia.nextInt();
		
		System.out.println(nome);
		System.out.println(zona);
		System.out.println(anoNascimento);
		System.out.println(salario);
		System.out.println(milionario);
		System.out.println(nome.toUpperCase()+", "+zona+", "+" "+anoNascimento+", "+salario+", "+milionario);
		
		idade = 2022-anoNascimento;
		System.out.println("Sua idade é: "+idade);
	}

}
