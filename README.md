# estudo_design_patterns_em_java

Padrão de projeto: "Solução comum para um problema recorrente ao utilizar o paradigma da orientação a objetos".  

Desing Patterns - Categorias  
.Criacionais  
.Estruturais  
.Comportamentais  

-Strategy é implementado através da criação de uma interface comum que representa o algoritmo e suas variações, e em seguida a criação de classes concretas que implementam essa interface, representando cada setratégia específica.

-Chain of Responsibility é implementado através da criação de uma interface comum para os objetos da cadeia e a definição de métodos para processar a solicitação e encamimnhá-la para o próximo objeto. Cada objeto na cadeia possui uma referência para o próximo objeto na sequência.  

-Template Method é implementado através da criação de uma classe abstrata que contém um método principal (template method) que define a sequência de passos do algoritmo. Essa classe também pode conter métodos concretos ou abstratos que são chamado dentro do tempalte method para realizar operações específicas.

-State é implementado utilizando classes e interfaces para representar os diferentes estados e o contexto. O contexto mantém uma referência para o estado atual e delega as chamadas de comportamento para o estado atual. Conforme o estado interno muda, o contexto atualiza sua referência para o novo estado.

-Command Handler é implementado de várias formas, dependendos das necessidades e requisitos do sistema. Geralmente, ele possui um método principal que recebe o comando e realiza as operações adequadas, como executar a lógica de negócio, interagir com o banco de dados ou chamar outros componentes do sistema.

-Observer é implementado com interfaces ou classes abstratas que definem os métodosp ara registro, remoção e notificação de observers. Cada observer implementa essas interfaces ou herda dessas classes abstradas e defise sua própria lógica de atualização.