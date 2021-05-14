## ALGORITMOS E ESTRUTURAS DE DADOS II

Tiago Jaconi

## LISTA 1 (U1)

1. Dado um número inteiro positivo n, crie um programa em java para imprimir os n primeiros naturais ímpares. Exemplo: para n=4 a saída deverá ser 1,3,5,7.
Nome do programa: NumerosNaturaisImpares.java
2. Faça um programa em java que leia vários números. Caso o usuário digite -1, o programa para de solicitar os números e imprime a soma de todos os números digitados, sem contar com o -1.
Nome do programa: SomaDeNumeros.java
3. Faça um programa no qual o usuário possa escolher uma das opções:
“1 - Multiplicação de inteiros”, “2 - Divisão de inteiros”, “3 - Adição de inteiros”, “4 - Subtração de inteiros” e “5 – Sair do programa”.
Caso o usuário digite 5, ele poderá entrar com dois números.
O resultado da operação matemática entre eles deverá ser exibido na tela e, logo em seguida, retornar ao menu principal.
Para o caso de divisão por 0, apresentar a devida mensagem de erro para o usuário.
Nome do programa: CalculadoraAritmetica.java
4. Uma loja possui 4 filiais, cada uma com um código de 1 a 4.
Um arquivo contendo todas as vendas feitas durante o dia nas quatro filiais é gerado a partir de uma planilha, sendo que cada linha do arquivo contém o número da filial e o valor de uma venda efetuada, separados por vírgula.
Ex.:
1,189.90
1,45.70
3,29.90
4,55.00
No exemplo acima, a filial 1 fez duas vendas, a primeira totalizando R$ 189,90 e a segunda R$ 45,70. A filial 3 fez uma venda de R$ 29,90 e a 4 também uma de R$ 55,00. Faça um programa que leia este arquivo e informe, ao final, o total e o valor médio das vendas de cada filial.
5. Escreva um programa em java que receba um nome de arquivo e uma sequência de palavras como argumentos na linha de comando, informe se o arquivo existe ou não, caso não exista, crie-o e, por fim, escreva neste arquivo a sequência de palavras passadas como argumentos.
6. Imagine uma lâmpada que possa ter três estados: apagada, acessa e meia-luz. Desenvolva um programa que instancie 3 lâmpadas. A primeira deverá ficar apagada, a segunda deverá ficar acessa e a terceira deverá ficar meia-luz.
Dica: pode-se implementar o “estado” como um atributo String da classe. Na classe haverá três métodos: Acender(), Apagar() e AcenderMeiaLuz().
7. Escreva uma classe em java que simule uma calculadora bem simples. Essa classe deve ter como atributos duas variáveis double e um char. Deve possuir um construtor que recebe como parâmetros dois números e um caractere, correspondente a uma das operações básicas (+,-,*,/). Deve ter um método para calcular a operação desejada e um para imprimir o resultado. O programa deve considerar divisões por zero como sendo erros, e imprimir uma mensagem adequada.

## LISTA 2 (U2)

1. O que é um Tipo Abstrato de Dados (TAD)?
2. Qual a característica fundamental na sua utilização de um TAD?
3. Quais as vantagens de se programar com TADs?
4. Faça a especificação de um sistema de controle de reservas de um clube que aluga quadras poliesportivas usando TAD.
5. Sabe-se que um número complexo é escrito da forma x + iy, onde i2 = −1, sendo x a sua parte real e y a parte imaginaria, ambas representadas por valores reais.
Crie um Tipo Abstrato de Dados (TAD) que represente os números complexos com as seguintes funções:
a) Criar um número complexo;
b) Destruir um número complexo;
c) Soma de dois números complexos;
d) Subtração de dois números complexos;
e) Multiplicação de dois números complexos;
f) Divisão de dois números complexos.
6. Faça um programa em java que leia 10 valores inteiros, armazene-os em um vetor. Crie um outro vetor que terá os números inteiros armazenados em ordem crescente. Após a ordenação, apresente o conteúdo dos dois vetores.
Nome do programa: VetorOrdenado.java
7. Faça um programa em java que leia a dimensão “N” de duas matrizes “N x N” e leia os valores correspondentes a essas 2 matrizes, retornando uma 3ª matriz resultante da soma das 2 matrizes primeiras.
Nome do programa: SomaMatrizes.java
8. Escreva um programa que leia uma sequência com n números reais e imprime a sequência eliminando os elementos repetidos.
9. Modifique os algoritmos de busca apresentados em aula de modo a se tornarem algoritmos de atualização. Se um algoritmo encontrar um elemento i em um vetor tal que chave seja igual a chave do elemento i, mude o valor do registro de i para reg.