# estudo_solid

S	ingle Responsibility Principle  
O	pen Closed Principle  
L	iskov Substitution Principle  
I	nterface Segregation Principle  
D	ependency Inversion Principle  

Princípios de Orientação a Objetos

.Coesão (União harmônica entre uma coisa e outra)
    Classes não coesas tendem a crescer infinitamente, o que as tornam difíceis de manter.
    
.Encapsulamento (Incluir ou proteger alguma coisa em uma cápsula)
    Classes não encapsuladas permitem vioção de regras de negócio, além de aumentarem o acoplamento.
    
.Acoplamento (Ação de acoplar. Agrupamento aos pares)
    Classes acopladas causam fragilidade no código da aplicação, o que dificulta sua manutenção.


1º Tarefa  
&emsp; Refatorar o método de reajuste de salário, pois não é uma tarefa da classe "Funcionario". Vamos alterar esse método para uma classe service que vai cuidar dessa regra de negócio de fazer o reajuste no salário.
&emsp; Fazendo essa primeira tarefa, buscamos a coesão,e aplicamos o primeiro principio do SOLID(Letra S, Singles Responsibility Principle).  
&emsp; "Just Because You Can, Doesn't Mean You Should", ou seja, não é por que poderiamos ter todo o código dentro de uma classe, que deveriamos realmente ter.  
&emsp; "Uma classe deveria ter apenas um único motivo para mudar" --Robert (Uncle Bob) Martin.  
	
2º Tarefa  
&emsp; Adicionar uma nova validação para o reajuste de salário, relacionada com o tempo. Um funcionário não pode receber mais de um reajuste com um intervalo menor que 6 meses. Agora o código tem duas validações. Temos que separar essas validações em duas services diferentes e chamar elas através de uma interface, caso contrario, se todas as validacoes forem ficar na mesma classe, ela crescerá demais.  
&emsp; Fazendo essa segunda tarefa, tornamos a classe mais extensivel, e é esse o conceito por traz so segundo principio do solid (Letra O, Open Closed Principle)
&emsp; Ao invés de todo novo código ser colocado na mesma classe, nos separamos as validações em classes diferentes, e utilizamos interface e polimorfismo, para tornar a clsse um pouco mais extensivel.  
&emsp; "Entidades de software (classes, módulos, funções, etc) devem estar abertas para extensão, porém, fechadas para modificação" --Bertrand Meyer  

3º Tarefa  
&emsp; Adicionar funcionalidade para promover um funcionário caso ele bata a meta. Manter a coesão da classes, crindo uma nova service para trabalhar com essa promoção, e chamando os métodos de cada classe responsável por realizar cada ação.  

3.1º Tarefa  
&emsp; Adicionar uma classe de terceirizado. Entrentanto, ao fazer isso, um problema vai aparecer. Podemos tentar fazer o terceirizado herdar a classe funcionario, mas esse método vai fazer com que a classe terceirizado herde algumas informações extras. Uma melhor opção seria utilizar a composição, ou seja, pegar os atributos que são em comum entre essas duas classes, e criar uma terceira classe, que vai ter esses atributos, e declarar esses atributos no código de cada classe.

&emsp; Completando essa tarefa, aplicamos o terceiro conceito de SOLID(Letra L, Liskov Substitution Principle). A ideia é que quando usamos herança, devemos tomar cuidado. Uma classe pode ser parecido com outra classe, e acabamos usando herança para reaproveitar o código, mas isso pode gerar algum efeito colateral indesejado.

&emsp; "Se q(x) é uma propriedade demonstrável dos objetos x de tipo T, então q(y) deve ser verdadeiro para objetos y de tipo S, onde S é um subtipo de T." --Barbara Liskov

4º Tarefa  
&emsp; Fazendo a implementação da interface, também acabamos usando outro principio do SOLID (Letra D, Dependency Inversion Principle).  
&emsp; "Would you solder a lamp directly to the electrical wiring in a wall?"  
&emsp; "Abstrações não devem depender de implementações. Implementações devem depender de abstrações." --Robert(Uncle Bob) Martin  

5º Tarefa  
&emsp; Nessa tarefa, não terá nenhuma implementação no código. Mas o que o último principio (Letra I, Interface Segregation Principle), que ficou faltando, diz que às vezes iremos implementar uma interface que não faz sentido, pois as vezes, a classe não precisa de todos os métodos daquela interface. Para resolver esse problema, podemos pegar esse método que não é utilizado pela classe, e criar uma nova interface, e essa interface nova, iria extender a outra interface que possui os outros métodos, dessa forma cada classe vai ter os métodos necessários para o funcionamento.  
&emsp; "Uma classe não deveria ser forçada a depender de métodos que não utilizará". --Robert(Uncle Bob) Martin  