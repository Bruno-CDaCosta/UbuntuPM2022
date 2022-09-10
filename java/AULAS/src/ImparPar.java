import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
			num = ler.nextInt();
			
		if (num < 0) 
		{
			System.out.println("Você digitou "+num+" esse número é negativo!!!");			
		}	
		else if (num == 0)
		{
			System.out.println("Você digitou "+num+" e zero é negativo!!!!");
		}
				
		else if(num % 2 == 1) 
		{
			System.out.println("Você digitou "+num+" que é um número impar!!!");
		}
		else if (num % 2 == 0) 
		{
			System.out.println("Você digitou "+num+" que é um número par!!!");
		}
		else if (num < 0) {
			System.out.println("Você digitou "+num+" esse número é negativo!!!");
		}
		
	}

}
