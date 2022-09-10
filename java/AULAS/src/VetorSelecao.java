import java.util.Scanner;

public class VetorSelecao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String selecao[] = {"Brasil","Alemanha","Uruguai","Portugal"};
		int pontos [] = new int [4];
		char totalPontos = ' ';
		String auxSelecao = " ";
		
		for (int x=1; x<=3; x++) 
		{
			System.out.print("Rodada: "+x+" ");
		
		for(int t=0; t<4; t++) 
		{
			System.out.print(selecao[t]);
			System.out.println(" Ganhou, Empatou ou Perdeu [G/E/P] ");
			totalPontos = ler.next().toUpperCase().charAt(0);
			if(totalPontos == 'G') 
			{
				pontos[t] +=3;
			}
			else if(totalPontos == 'E')
			{
				pontos[t] +=1;
			}
			else if(totalPontos == 'P') 
			{
				pontos[t] +=0;

			}else
				System.out.println("Você digitou alguma coisa invalida!!!!");
			
		}
		}
		for(int i=0 ; i<4 ; i++) 
		{
			
			System.out.println(selecao[i]+" "+pontos[i]);
		}
		
		System.out.println("Digite o nome da Seleção: ");
		auxSelecao = ler.next();
		for(int i=0 ; i<4 ; i++) 
			if(auxSelecao.equals(selecao[i])) 
			{
				System.out.println("Sua seleção é o "+selecao[i]+" pontos "+pontos[i]);
			}
		}
		
	}


