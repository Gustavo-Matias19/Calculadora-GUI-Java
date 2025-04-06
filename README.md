# Calculadora-GUI-Java

![image](https://github.com/user-attachments/assets/42f62252-5a04-475b-b8f8-8ef3f8e04bc7)
VISÃO GERAL
Calculadora desenvolvida em Java utilizando arquitetura MVC (Model-View-Controller) com interface gráfica Swing. Implementa as quatro operações matemáticas básicas seguindo princípios de programação orientada a objetos.

ESTRUTURA DO PROJETO
PASTA MODEL (LÓGICA MATEMÁTICA)
Contém as classes que implementam as operações:

OperacaoMatematica.java (classe abstrata)

Soma.java

Subtracao.java

Multiplicacao.java

Divisao.java

PASTA VIEW (INTERFACE)
Janela.java (JFrame principal com todos os componentes gráficos)

PASTA CONTROL (INTERMEDIÁRIO)
Controle.java (faz a comunicação entre View e Model)

COMO COMPILAR E EXECUTAR
Clone o repositório:
git clone https://github.com/Gustavo-Matias19/Calculadora-GUI-Java.git

Importe o projeto na sua IDE Java preferida

Execute a classe Main:
src/com/mycompany/Main.java

FUNCIONALIDADES IMPLEMENTADAS
Operações básicas: adição, subtração, multiplicação e divisão

Limpar display (botão C)

Entrada de números de 0 a 9

Exibição do resultado no campo de texto

PRINCÍPIOS OO APLICADOS
HERANÇA: Todas as operações herdam da classe abstrata OperacaoMatematica

POLIMORFISMO: Cada operação implementa seu próprio método calcular()

ENCAPSULAMENTO: Atributos privados com métodos públicos de acesso


