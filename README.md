# estudo_design_patterns_em_java

Padr�o de projeto: "Solu��o comum para um problema recorrente ao utilizar o paradigma da orienta��o a objetos".  

Desing Patterns - Categorias  
.Criacionais  
.Estruturais  
.Comportamentais  

-Strategy � implementado atrav�s da cria��o de uma interface comum que representa o algoritmo e suas varia��es, e em seguida a cria��o de classes concretas que implementam essa interface, representando cada setrat�gia espec�fica.

-Chain of Responsibility � implementado atrav�s da cria��o de uma interface comum para os objetos da cadeia e a defini��o de m�todos para processar a solicita��o e encamimnh�-la para o pr�ximo objeto. Cada objeto na cadeia possui uma refer�ncia para o pr�ximo objeto na sequ�ncia.  

-Template Method � implementado atrav�s da cria��o de uma classe abstrata que cont�m um m�todo principal (template method) que define a sequ�ncia de passos do algoritmo. Essa classe tamb�m pode conter m�todos concretos ou abstratos que s�o chamado dentro do tempalte method para realizar opera��es espec�ficas.

-State � implementado utilizando classes e interfaces para representar os diferentes estados e o contexto. O contexto mant�m uma refer�ncia para o estado atual e delega as chamadas de comportamento para o estado atual. Conforme o estado interno muda, o contexto atualiza sua refer�ncia para o novo estado.

-Command Handler � implementado de v�rias formas, dependendos das necessidades e requisitos do sistema. Geralmente, ele possui um m�todo principal que recebe o comando e realiza as opera��es adequadas, como executar a l�gica de neg�cio, interagir com o banco de dados ou chamar outros componentes do sistema.

-Observer � implementado com interfaces ou classes abstratas que definem os m�todosp ara registro, remo��o e notifica��o de observers. Cada observer implementa essas interfaces ou herda dessas classes abstradas e defise sua pr�pria l�gica de atualiza��o.