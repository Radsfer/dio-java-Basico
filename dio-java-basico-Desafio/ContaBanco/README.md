# Desafio DIO Trilha Java Basico

O Desafio consiste em criar uma aplicação que leia os dados digitados pelo usuário via terminal.

## Construção do programa

### Packeges

Foi necessário o uso dos packages de Scanner e Locale para o funcionamento coerente do programa.

### Argumentos

Em seguida na main foi feita a chamada do objeto Scanner e foi feita sua tradução para Inglês US assim evitando a confusão quanto ao uso de "." ou "," na declaração de um número decimal (no caso o saldo) assim sendo o usuário teria que digitar tal número utilizando o ponto final.

Em seguida foram declaradas as variáveis de acordo com o solicitado em documentação do desafio.

E por fim foi feita a chamada do metodo de impressão para guiar o usuário a respeito do conteúdo que deveria utilizar.

Sendo que para o objeto no caso "scanner" criado foram utilizados os metodos "nextLine()" para uma linha de string digitada no terminal para que reconheça mesmo com o espaço digitado no meio sendo para a variável nome, em seguida "next()" para uma string simples que é o caso da agencia, depois "nextInt()" para numero que é inteiro e "nextDouble()" para saldo que é um double. Sendo que depois de nome, todos os "nextLine()" utilizados foram para garantir que o "\n" não cause erros na hora da passagem de dados para o usuário.

### Funcionamento

O programa funciona de forma simples como requisitado na documentação do desafio, servindo apenas para receber dados via terminal de um usuário e retorna-los em uma frase ao final que contem todos os dados.

Até o momento do presente commit (01/05/24) o código funciona perfeitamente.
