programa
{
	
	funcao inicio()
	{
		inteiro maiorIdade = 0
		cadeia nomeMaiorIdade = ""
		cadeia alunos [4]
		inteiro idade [4]

		alunos[0] = "Bruno Costa"
		alunos[1] = "Bruno Almeida"
		alunos[2] = "Iris Adrielle"
		alunos[3] = "Rharussy Leticia"

		idade[0] = 28
		idade[1] = 17
		idade[2] = 21
		idade[3] = 20

		para(inteiro i=0;i<4;i++){
			escreva(alunos[i], " Idade ",idade[i])
			escreva("\n")

			se ( idade[i] > maiorIdade){
				maiorIdade= idade[i]
				nomeMaiorIdade = alunos[i]

				
				
				 
			}
		} escreva(maiorIdade," ",nomeMaiorIdade)

		
			}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 546; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */