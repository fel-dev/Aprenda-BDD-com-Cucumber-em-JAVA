# Aprenda BDD com Cucumber em JAVA

Automatize critérios de aceitação tanto a nível unitário quanto em testes funcionais de aplicações Web, com Selenium.

## O que você aprenderá

- Criar um projeto de testes com Cucumber do zero
- Criar e rodar especificações executáveis
- Integrar seus cenários com testes Web através do Selenium
- Gerar relatórios com o resumo da execução dos testes

## Requisitos

Você deve ter um conhecimento básico de JAVA.

Para seguir este tutorial, você precisará instalar o Java JDK e o Eclipse IDE for Java Developers.

Além disso, será necessário instalar o plugin do Cucumber no Eclipse Marketplace. Você pode fazer isso seguindo os passos abaixo:

1. Abra o Eclipse IDE.
2. Vá para o menu "Help" e selecione "Eclipse Marketplace".
3. Na caixa de pesquisa, digite "Cucumber" e pressione Enter.
4. Localize o plugin "Cucumber Eclipse Plugin" e clique em "Go to Marketplace".
5. Clique no botão "Install" para iniciar a instalação.
6. Siga as instruções na tela para concluir a instalação.
7. Reinicie o Eclipse após a instalação do plugin.

Após instalar o plugin do Cucumber, você estará pronto para começar a utilizar o BDD com Cucumber em Java no Eclipse.

antes de fechar o project, colcar isso no `pom.xml`
<!-- https://mvnrepository.com/artifact/info.cukes/cucumber-java -->

```xml
<dependencies>
    <dependency>
        <groupId>info.cukes</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>1.2.5</version>
    </dependency>
</dependencies>
```

## Público-alvo

- Testadores que estão cansados de ver os casos de testes ficarem desatualizados
- Desenvolvedores cansados de tanta documentação

## Instrutor

### Francisco Wagner Costa Aquino

Analista de Testes

#### Formação e Experiência

Wagner Costa possui graduação em Ciências da Computação, Mestrado na área de previsão de séries temporais com Redes Neurais, ambas pela Universidade Estadual do Ceará (UECE). Trabalha com JAVA e testes há mais de 10 anos e com Javascript há mais de 3 anos.

#### Trabalhos atuais

- Integrante da equipe de suporte à automação de testes na DATAPREV
- Professor de Testes automatizados e Testes Funcionais em duas especializações em Fortaleza (Universidade 7 de Setembro - Uni7), uma focada em desenvolvimento ágil e a outra em Testes de Software
- Dá aulas presenciais há mais de 8 anos e na área de aulas à distância há 2 anos.

fonte https://www.udemy.com/course/cucumber-java/learn/lecture/9923368#overview

# 8. Integrando com JUnit

### Colar o código xml do JUnit no `pom.xml`

1. buscar por "cucumber" no [MVN Repository](https://mvnrepository.com/search?q=cucumber)
2. [Cucumber JVM: JUnit](https://mvnrepository.com/artifact/info.cukes/cucumber-junit)
3. Usar versão [1.2.5](https://mvnrepository.com/artifact/info.cukes/cucumber-junit/1.2.5)
4. Copiar o código xml do JUnit e colar no `pom.xml` dentro da tag `<dependencies>`
    - mas dentro de um novo container `<dependency>` (os nomes são parecidos, cuidar para não confundir)
    - no final, usando o Eclipse, dá um `Ctrl + Shift + F` para formatar o código e não esquece de salvar o arquivo

```xml
<!-- https://mvnrepository.com/artifact/info.cukes/cucumber-junit -->
<dependency>
    <groupId>info.cukes</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>1.2.6</version>
    <type>pom</type>
    <scope>test</scope>
</dependency>
```
**NOTA** Na vídeo aula, o professor usou a versão 1.2.5. Mas já vi que costuma dar erro na hora de executar o teste com essas configuração dele pois é meio legado... Em regra geral, tenta o 1.2.5 primeiro, se der erro, tenta a última versão.

