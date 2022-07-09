# Projeto da disciplina Laboratório de Estrutura de Dados - 2021.2 

Este é repositório contém um projeto para ordedanação de dados brutos de registro de senha.  Os seguintes algoritmos de ordenação foram implementados:
 - [X] SelectionSort; 
 - [X] InsertionSort; 
 - [X] MergeSort;
 - [X] QuickSort;
 - [X] QuickSortMedianOfThree;
 - [X] ThreeWayQuickSort;
 - [X] CountingSort;
 - [X] HeapSort.
 
 Para gerar arquivos ordenados, de acordo com os parâmetros escolhidos pelo usuário, os seguintes passos devem ser realizados:
1. Antes de executar os algoritmos para ordenação e escrita dos dados, primeiro execute o método main da classe FormatDate no caminho: src\dataProcessing\FormatDate. Caso o programa principal seja executado seja executado antes, será informado ao usuário da necessidade de execução prévia da classe FormatDate para gerar uma das bases de dados de entrada das ordenações.
2. Para gerar o arquivo que classifica senhas em "Boas" e "Muito Boas", deve-se executar a classe ClassifyPassword no caminho: src\dataProcessing\ClassifyPassword
3. Por fim, para gerar os arquivos ordenados, deve-se executar a classe MainProgram no caminho: src\sorting\MainProgram. Ao executar esta classe um menu de opções será fornecido ao usuário para ordenar o arquivo de acordo com os parâmetros desejados.

**Observação**: Dependendo da IDE escolhida pelo usuário, pode ser necessário atualizar a pasta (*refresh*) do caminho informado para visualizar os arquivos gerados. 