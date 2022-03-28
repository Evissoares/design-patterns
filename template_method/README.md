Template Method 

Template method é um padrão de projeto comportamental que usando a herança é capaz de mudar o comportamento da superclasse sobrescrevendo e implementando os seus métodos. 

A utilização deste design pattern permite que dado um modelo preestabelecido e um conjunto de métodos definidos em ordem específica, uma subclasse que herda estes comportamentos podem alterar a saída destes métodos sem modificar a ordem que eles serão executados. 

 

Um exemplo de uso é a criação de pizzas, onde existe um passo a passo padrão para a criação de todas as pizzas, alterando apenas a composição, tamanho e borda de cada uma. 

Figura 01 – Diagrama de classe 
![alt text](assets/template-method.png)

 

A pizza contém um método público prepararPizza que executa a sequência de produção de uma pizza, que são:  categoriaPizza, definirPrimeiroSabor, definirSegundoSabor, definirTerceiroSabor, definirBorda, assarPizza, respectivamente. 

 

Esta é a sequência padrão deste modelo que cria pizzas, porém esta classe é abstrata e não pode existir um objeto de Pizza, então o operador new será usado com uma das suas subclasses que implementam (ou não) os métodos responsáveis por criar a pizza. 

A classe concreta PizzaPequena sobrescreve os métodos categoriaPizza e definirPrimeiroSabor, mas não implementa os outros. Isso é permitido pois alguns dos métodos da classe Pizza são abstratos e obrigatoriamente devem ser sobrescritos pelas classes filhas, alterando o comportamento da classe Pizza, já os demais métodos são chamados de hook methods. 

 

Hook methods ou métodos gancho são métodos não abstratos e não privados que servem para modificar o comportamento da classe pai somente se fizer sentido para a necessidade que a subclasse se propõe a atender. 

Toda pizza tem pelo menos um sabor, então é correto definir que ao menos um método seja abstrato, obrigando a implementação pela classe filha, considerando que é um sistema de pizzaria e toda pizza sai pronta para consumo, toda pizza é assada independente do sabor, sendo assim, é pertinente que o método assar seja privado na classe Pizza garantindo que este sempre seja executado sem possibilidade de modificação. Já os hook methods deste exemplo permitem que a pizza tenha um, dois ou três sabores e tenha ou não borda, variando conforme o tamanho da pizza. 

 

O método prepararPizza é o que dá nome ao design pattern, pois é este método que, quando chamado pela superclasse, fará a sequência de execução prevista do algoritmo mudando seu comportamento de acordo com a subclasse que tenha sido instanciada. 