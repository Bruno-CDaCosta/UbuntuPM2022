programa
{
	
	funcao inicio()
	{
		cadeia matricula [4] = {"MAT-001","MAT-002","MAT-003","MAT-004"}
		cadeia aluno [4] = {"Paulo","Maria","Carla","Marcos"}
		inteiro anoNascimento [4] = {2000,2002,1999,2004}
		caracter genero [4] = {'M','F','F','M'}
		inteiro nota[4]
		cadeia auxMatri

		para(inteiro i=0;i<4;i++)
		{
			escreva(" Matricula: ", matricula[i], " Nome: ", aluno[i], "\n")
			escreva("Digite a nota: ")
			leia(nota[i])
			
		}
		escreva("BOLETIM\n")
			
		para (inteiro x=0;x<4;x++)
		{
			escreva("Matricula: ",matricula[x]," Nome: ",aluno[x], " Idade: ", (2022-anoNascimento[x]), " Nota: ", nota[x]," ")
			se (nota[x]<=5)
			{
					se(genero[x] == 'M' ou genero[x] == 'm')
					{
						escreva(" Reprovado\n")
					}
					senao 
					{
						escreva(" Reprovada\n")		
					}
			}
			senao
			{
					se(genero[x] == 'F' ou genero[x] == 'f')
					{
									escreva("Aprovada\n")	
					}
					senao
					{
									escreva("Aprovado\n")	
					}
				

			}
		}
		escreva("Digite sua matricula: ")
		leia(auxMatri)
			
		para(inteiro i=0;i<4;i++)
		{
			se(auxMatri==matricula[i]){
				escreva ("Sua matricula é: ", matricula[i], "\nNome: ",aluno[i], "\nIdade: ",(2022-anoNascimento[i]),"\nNota: ",nota[i], " ")
			se (nota[i]<=5)
			{
					se(genero[i] == 'M' ou genero[i] == 'm')
					{
						escreva(" Reprovado\n")
					}
					senao 
					{
						escreva(" Reprovada\n")		
					}
			}
			senao
			{
					se(genero[i] == 'F' ou genero[i] == 'f')
					{
									escreva("Aprovada\n")	
					}
					senao
					{
									escreva("Aprovado\n")	
					}
				

			}
			}
		}
	
	}
}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1224; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */