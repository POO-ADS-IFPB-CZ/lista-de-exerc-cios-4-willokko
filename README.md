[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/ybM3WQNb)

## Questão 1: Determine se cada uma das seguintes afirmações é verdadeira ou falsa. Se uma instrução for falsa, explique por quê.
### a) Os construtores de superclasse não são herdados por subclasses.

Verdadeiro.

### b) Um relacionamento tem um é implementado via herança. 

Falso. O relacionamento "tem um" não é feito via herança, e sim via composição ou agregação. Herança é usada para o relacionamento "é um". Por exemplo, um carro tem um motor (composição), mas um carro é um veículo (herança).

### c) Quando uma subclasse redefinir um método de superclasse utilizando a mesma assinatura, diz-se que a subclasse sobrecarrega esse método de superclasse.

Falso. O nome correto desse processo é sobrescrita (override), e não sobrecarga. A sobrescrita acontece quando um método da subclasse tem a mesma assinatura do método da superclasse, e então ele redefine o comportamento. Já a sobrecarga (overload) ocorre quando existem métodos com o mesmo nome, mas com parâmetros diferentes (quantidade ou tipos diferentes) dentro da mesma classe ou entre classes.

## Questão 2: Alguns programadores preferem não utilizar acesso protected , porque acreditam que ele quebra o encapsulamento da superclasse. Discuta os méritos relativos de usar acesso protected versus acesso private em superclasses.
O uso de ```protected``` permite que membros sejam acessados por subclasses e classes do mesmo pacote, facilitando reutilização e extensão.
Porém, isso reduz o encapsulamento, pois expõe detalhes internos que poderiam ser alterados, afetando subclasses. Já ```private``` mantém o encapsulamento total, forçando o acesso apenas por meio de métodos públicos ou protegidos (getters/setters), garantindo maior segurança dos dados e menos dependência entre classes.

## Questão 3: Explique como funciona a chamada de construtores em hierarquias de herança. Por que é obrigatório que o construtor da superclasse seja chamado explicitamente ou implicitamente?
Na herança, o construtor da superclasse sempre é chamado antes do construtor da subclasse. Isso garante que os atributos e comportamentos da superclasse sejam inicializados corretamente. Se não for chamado explicitamente com ```super()```, o Java chama o construtor padrão (sem parâmetros) da superclasse automaticamente. É obrigatório porque a subclasse depende da estrutura da superclasse estar pronta antes de adicionar seus próprios comportamentos.
