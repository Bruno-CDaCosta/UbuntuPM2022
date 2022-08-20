programa
{
	
	funcao inicio()
	{
		inteiro num=0
		real contadorNum =0.0, total=0.0, media = 0.0
		

		escreva ("Digite um numero: ")
		leia(num)

		enquanto (num >0)
		{
			total = total + num
			contadorNum++		
			escreva ("Digite um numero: ")
			leia(num)
				
		}

		media = total/contadorNum
		escreva("\nA soma total é:" , total)
		escreva("\nA media é ", media)
		escreva("\nQuantide de numeros lidos: ", contadorNum) 

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */