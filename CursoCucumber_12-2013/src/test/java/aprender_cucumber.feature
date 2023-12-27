# language: pt
# encoding: UTF-8

Funcionalidade: Aprender Cucumber
	Como um aluno
	Eu quero aprender a utilizar Cucumber
	Para que eu possa automatizar criterios de aceitacao
	
	Cenário: Deve executar especificacao
		Dado que crei o arquivo corretamente
		Quando executa-lo
		Então a especificacao deve finalizar com sucesso
		
	Cenário: Deve incrementar contador
		Dado que o valor do contador é 15
		Quando eu incrementar em 3
		Então o valor do contador será 18