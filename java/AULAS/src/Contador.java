import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int contador=0,numeroEscolhido=0,total=0;
		
		System.out.println("Digite um número: ");
		numeroEscolhido = ler.nextInt();
		
		do {
			contador++;
			System.out.print(contador);
			if(contador<numeroEscolhido)
			{
				System.out.print(" + ");
				
			}
			total+=contador;
			}while(contador<numeroEscolhido);
			System.out.print(" = "+total);
	}

}
