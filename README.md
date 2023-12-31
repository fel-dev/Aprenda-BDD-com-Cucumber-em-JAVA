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
**NOTA** Ver [#erro-de-import](#erro-de-import) para mais detalhes

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
    - as dependencias, vão para "Maven Dependencies" dentro do projeto no Eclipse (PS ele pode puxar mais dependencias, mas não precisa se preocupar com isso)
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
**NOTA²** A versão do JUnit não pode ser maior que a versão do Cucumber, se não dá erro na hora de executar o teste.

## Runner do JUnit

Vou criar um `Runner` para o JUnit e a partir de então minhas execuções vai se dar a partir dele.

No mesmo diretório onde está as `Classes` com os `passos` e nossa `Espcificação` (arquivo `.feature`), vou pedir para o Eclipse criar uma nova `Classe`:

1. (default package) > Clica com BDM > New > Class
2. Nome: `Runner` > Finish

E tudo que vou fazer nela definir novos runners com o cucumber

```java
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber; // <-- repare que o import é do cucumber.junit

@RunWith(Cucumber.class)
public class Runner {

}
```

# erro-de-import

Vai dar erro [Esse erro só dá se a versão do JUnit for maior que a versão do Cucumber] porque o Eclipse não sabe onde está o `Cucumber.class`, ao importar o `Cucumber` com `Ctrl + Shift + O`

> Solve¹: Já identifiquei o problema e já corrigir, só estava utilizando a versão do cucumber menor que a versão do junit, 

Solved²: então a solução é essa, colcar substituir [as dependecias] lá no file `xml` do `pom`

Segue o arquivo pom criado durante o curso...

```xml
    <project xmlns="http://maven.apache.org/POM/4.0.0"
    	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    	<modelVersion>4.0.0</modelVersion>
    	<groupId>br.ce.wcaquino</groupId>
    	<artifactId>exercicios-curso-cucumber</artifactId>
    	<version>0.0.1-SNAPSHOT</version>
     
    	<dependencies>
    		<dependency>
    			<groupId>info.cukes</groupId>
    			<artifactId>cucumber-java</artifactId>
    			<version>1.2.5</version>
    		</dependency>
    		<dependency>
    			<groupId>info.cukes</groupId>
    			<artifactId>cucumber-junit</artifactId>
    			<version>1.2.5</version>
    			<scope>test</scope>
    		</dependency>
    		<dependency>
    			<groupId>org.seleniumhq.selenium</groupId>
    			<artifactId>selenium-java</artifactId>
    			<version>3.11.0</version>
    		</dependency>
    		<dependency>
    			<groupId>commons-io</groupId>
    			<artifactId>commons-io</artifactId>
    			<version>2.6</version>
    		</dependency>
    	</dependencies>
    </project>
```

##