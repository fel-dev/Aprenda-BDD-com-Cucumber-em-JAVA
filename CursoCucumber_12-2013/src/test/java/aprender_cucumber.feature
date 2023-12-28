# language: pt
# encoding: UTF-8

Funcionalidade: Aprender Cucumber
	Como um aluno
	Eu quero aprender a utilizar Cucumber
	Para que eu possa automatizar critérios de aceitação
	
	Cenário: Deve executar especificação
		Dado que criei o arquivo corretamente
		Quando executa-lo
		Então a especificação deve finalizar com sucesso
		
	Cenário: Deve incrementar contador
		Dado que o valor do contador é 15
		Quando eu incrementar em 3
		Então o valor do contador será 18
		
	Cenário: Deve incrementar contador
		Dado que o valor do contador é 123
		Quando eu incrementar em 35
		Então o valor do contador será 158
		
	Cenário: Deve calcular atraso no prazo de entrega
		Dado que o prazo é dia 28/12/2023
		Quando a entrega atrasar em 2 dias
		Então a entrega será efetuada em 30/12/2023

	Cenário: Deve calcular atraso no prazo de entrega da China
		Dado que o prazo é dia 05/05/2018
		Quando a entrega atrasar em 2 mês
		Então a entrega será efetuada em 05/07/2018
		
	Cenário: Deve criar steps genéricos para estes passos
	    Dado que o ticket é AF345
	    Dado que o valor da passagem é R$ 230,45
	    Dado que o nome do passageiro é "Fulano da Silva"
	    Dado que o telefone do passageiro é 9999-9999
	    Quando criar os steps
	    Então o teste vai funcionar