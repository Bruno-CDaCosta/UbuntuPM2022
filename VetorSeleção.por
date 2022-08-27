programa
{
	
	funcao inicio()
	{
		 cadeia selecoes [4] = {"Brasil","Espanha","Uruguai","Argentina"}
		 inteiro pontos [4] 
		 caracter totalPontos = ' '
		 cadeia auxSelecao = " "


		 para (inteiro r=1;r<4;r++){
			escreva("Rodada: ",r,"\n")
		 
		 
		para (inteiro i=0;i<4;i++){
			escreva(selecoes[i],"\n")
			escreva("Ganhou, Empatou ou Perdeu [G/E/P] ")
			leia(totalPontos)
			se (totalPontos == 'G' ou totalPontos== 'g')
			{
			pontos[i] = pontos[i] +3
			}senao se (totalPontos == 'E' ou totalPontos== 'e'){
				pontos[i] = pontos[i] +1
			}senao se (totalPontos == 'P' ou totalPontos =='p'){
				pontos[i] = pontos[i] +0
			}
			
		}}
			limpa()
		
		para (inteiro i=0;i<4;i++){
			escreva(selecoes[i], " ", pontos[i]," Pontos \n")
		}
		limpa()
		escreva("Digite o nome da Seleção: ")
		leia(auxSelecao)
		para(inteiro i=0;i<4;i++)
			se(auxSelecao==selecoes[i]){
				escreva("Sua seleção é o ", selecoes[i], " Pontos ", pontos[i])
			}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 953; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */