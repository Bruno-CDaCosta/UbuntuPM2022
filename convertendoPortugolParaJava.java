package primeiroProjeto;

import java.util.Scanner;

public class convertendoPortugolParaJava {
	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		String matricula[]= {"MAT-001","MAT-002","MAT-003","MAT-004"};
		String aluno[]= {"Bruno","Iris","Leticia","Gabriel"};
		int anoNascimento[]= {1992,2000,2002,1999};
		char genero[]= {'M','F','F','M'};
		int[] nota = new int [5];
		String auxMatri;
		
		for(int i=0;i<4;i++) 
		{
			System.out.printf("Matricula-> %s  Nome->%s \n",matricula[i],aluno[i]);
			System.out.println("Digite a nota: ");
			nota[i]= leia.nextInt();
		}
		System.out.println("BOLETIM");
		
		for(int i=0;i<4;i++) 
		{
			System.out.printf("Matricula-> %s Nome->%s Idade-> %d Nota->%d ",matricula[i],aluno[i],(2022-anoNascimento[i]),nota[i]);
			if(nota[i]<=5) 
			{
				if(genero[i] == 'M' || genero[i] == 'm') 
				{
					System.out.println("Reprovado");
				}
				else 
				{
					System.out.println("Reprovada");
				}
			}
			else 
			{
				if(genero[i] == 'F' || genero[i] == 'f') 
				{
					System.out.println("Aprovada");
				}else 
				{
					System.out.println("Aprovado");
				}
			}
		}
			System.out.println("Qual é a sua matricula: ");
			auxMatri=leia.next();
			
			
			for(int i=0;i<4;i++) 
			{
				if(auxMatri==matricula[i]){
					System.out.printf("Matricula-> %s Nome->%s Idade-> %d Nota->%d ",matricula[i],aluno[i],(2022-anoNascimento[i]),nota[i]);
				if (nota[i]<=5) 
				{
					if(genero[i] == 'M' || genero[i] == 'm') 
					{
						System.out.println("Reprovado");
					}
					else 
					{
						System.out.println("Reprovada");
					}
				}
				else 
				{
					if(genero[i] == 'F' || genero[i] == 'f') 
					{
						System.out.println("Aprovada");
					}
					else 
					{
						System.out.println("Aprovado");
					}
				
				}
				}
			}
	}
}
