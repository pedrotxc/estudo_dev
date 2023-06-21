# estudo_solid

S	ingle Responsibility Principle  
O	pen Closed Principle  
L	iskov Substitution Principle  
I	nterface Segregation Principle  
D	ependency Inversion Principle  

Princ�pios de Orienta��o a Objetos

.Coes�o (Uni�o harm�nica entre uma coisa e outra)
    Classes n�o coesas tendem a crescer infinitamente, o que as tornam dif�ceis de manter.
    
.Encapsulamento (Incluir ou proteger alguma coisa em uma c�psula)
    Classes n�o encapsuladas permitem vio��o de regras de neg�cio, al�m de aumentarem o acoplamento.
    
.Acoplamento (A��o de acoplar. Agrupamento aos pares)
    Classes acopladas causam fragilidade no c�digo da aplica��o, o que dificulta sua manuten��o.


1� Tarefa  
&emsp; Refatorar o m�todo de reajuste de sal�rio, pois n�o � uma tarefa da classe "Funcionario". Vamos alterar esse m�todo para uma classe service que vai cuidar dessa regra de neg�cio de fazer o reajuste no sal�rio.
&emsp; Fazendo essa primeira tarefa, buscamos a coes�o,e aplicamos o primeiro principio do SOLID(Letra S, Singles Responsibility Principle).  
&emsp; "Just Because You Can, Doesn't Mean You Should", ou seja, n�o � por que poderiamos ter todo o c�digo dentro de uma classe, que deveriamos realmente ter.  
&emsp; "Uma classe deveria ter apenas um �nico motivo para mudar" --Robert (Uncle Bob) Martin.  
	
2� Tarefa  
&emsp; Adicionar uma nova valida��o para o reajuste de sal�rio, relacionada com o tempo. Um funcion�rio n�o pode receber mais de um reajuste com um intervalo menor que 6 meses. Agora o c�digo tem duas valida��es. Temos que separar essas valida��es em duas services diferentes e chamar elas atrav�s de uma interface, caso contrario, se todas as validacoes forem ficar na mesma classe, ela crescer� demais.  
&emsp; Fazendo essa segunda tarefa, tornamos a classe mais extensivel, e � esse o conceito por traz so segundo principio do solid (Letra O, Open Closed Principle)
&emsp; Ao inv�s de todo novo c�digo ser colocado na mesma classe, nos separamos as valida��es em classes diferentes, e utilizamos interface e polimorfismo, para tornar a clsse um pouco mais extensivel.  
&emsp; "Entidades de software (classes, m�dulos, fun��es, etc) devem estar abertas para extens�o, por�m, fechadas para modifica��o" --Bertrand Meyer  

3� Tarefa  
&emsp; Adicionar funcionalidade para promover um funcion�rio caso ele bata a meta. Manter a coes�o da classes, crindo uma nova service para trabalhar com essa promo��o, e chamando os m�todos de cada classe respons�vel por realizar cada a��o.  

3.1� Tarefa  
&emsp; Adicionar uma classe de terceirizado. Entrentanto, ao fazer isso, um problema vai aparecer. Podemos tentar fazer o terceirizado herdar a classe funcionario, mas esse m�todo vai fazer com que a classe terceirizado herde algumas informa��es extras. Uma melhor op��o seria utilizar a composi��o, ou seja, pegar os atributos que s�o em comum entre essas duas classes, e criar uma terceira classe, que vai ter esses atributos, e declarar esses atributos no c�digo de cada classe.

&emsp; Completando essa tarefa, aplicamos o terceiro conceito de SOLID(Letra L, Liskov Substitution Principle). A ideia � que quando usamos heran�a, devemos tomar cuidado. Uma classe pode ser parecido com outra classe, e acabamos usando heran�a para reaproveitar o c�digo, mas isso pode gerar algum efeito colateral indesejado.

&emsp; "Se q(x) � uma propriedade demonstr�vel dos objetos x de tipo T, ent�o q(y) deve ser verdadeiro para objetos y de tipo S, onde S � um subtipo de T." --Barbara Liskov

4� Tarefa  
&emsp; Fazendo a implementa��o da interface, tamb�m acabamos usando outro principio do SOLID (Letra D, Dependency Inversion Principle).  
&emsp; "Would you solder a lamp directly to the electrical wiring in a wall?"  
&emsp; "Abstra��es n�o devem depender de implementa��es. Implementa��es devem depender de abstra��es." --Robert(Uncle Bob) Martin  

5� Tarefa  
&emsp; Nessa tarefa, n�o ter� nenhuma implementa��o no c�digo. Mas o que o �ltimo principio (Letra I, Interface Segregation Principle), que ficou faltando, diz que �s vezes iremos implementar uma interface que n�o faz sentido, pois as vezes, a classe n�o precisa de todos os m�todos daquela interface. Para resolver esse problema, podemos pegar esse m�todo que n�o � utilizado pela classe, e criar uma nova interface, e essa interface nova, iria extender a outra interface que possui os outros m�todos, dessa forma cada classe vai ter os m�todos necess�rios para o funcionamento.  
&emsp; "Uma classe n�o deveria ser for�ada a depender de m�todos que n�o utilizar�". --Robert(Uncle Bob) Martin  