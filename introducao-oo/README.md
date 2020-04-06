# Capítulo 2 - Venha para o lado Orientado Objetos da Força

Agora você irá entrar no universo da orientação a objetos, _"sacará"_ como é este tão falado Mundo de Objetos!

Mas antes observe o seu **Celular** quais são as suas **características**? Provavelmente você irá identificar parte dos itens abaixo.

* Tamanho
* Cor
* Peso
* Marca
* Modelo
* Fabricante
* Visor
* Processador
* Memoria
* Sistema Operacional

Se você o desmontasse, possivelmente achará mais coisas como varios micro controladores, sensores e outros componentes eletronicos né. Esses componentes eletronicos são caracteristicas dos componentes no próprio **Celular**.

Então seu Celular não é uma única peça, na verdade ele é composto de varios outros componentes, que cada um deles também são compostos de varios outros e que todos possuem um conjunto de **caracteristicas e comportamentos**.

Agora olhe ao seu redor e pense na Televisão, Computador, aparelho de som, Batedeira e qualquer outro objeto que da nossa vida, todos possuem **caracteristicas e comportamentos** né !.

Orientação a Objetos nada mais é que uma forma de representar estas coisas em software, que em _**Java**_ nós representamos através de uma **Classe** ou um conjunto delas.

Bom, como vimos, podemos representar o mundo real através de software \(usando a Orientação a Objetos\) e para representar o Celular podemos criar uma classe também chamada de Celular.

```java
class Celular {

}
```

### Como representamos as suas caracteristicas?

Para representar as caracteristicas de uma classe você deve declarar variáveis no corpo da **classe**, estas também são chamadas de variáveis de instância ou atributos de instância, conforme o exemplo abaixo.

```java
/**
 * Classe responsável por representar o aparelho de Celular
 * @author: ercarval
 */
class Celular {

    int numeroNucleosPorcessador;

    String marca;

    String fabricante;

}
```

Agora que você já viu como é fácil criar uma **Classe**, vamos fazer uma classe de Teste para ver como é a sua utlização.

```java
class TesteCelular {

    public static void main(String[] args) {

        Celular motorolaX2G = new Celular();
        motorolaX2G.numeroNucleosPorcessador = 4;
        motorolaX2G.marca = "Moto X 2G";
        motorolaX2G.fabricante = "Motorola";

        Celular iphone5s = new Celular();
        iphone5s.numeroNucleosPorcessador = 4;  // ps não sei se eh mesmo
        iphone5s.marca = "iPhone";
        iphone5s.fabricante = "Apple";

    }
}
```

## Pontos de Atenção

> Para utilizar uma classe, é necessário\*\* criar uma _**instância**_ utilizando a seguinte sintaxe.
>
> ```java
>    <TipoClasse> <nomeVariável> = new <TipoClasse> ();
> ```
>
> Por isso que para utilizar a classe **Celular** foi necessário criar uma `instancia`, ou seja, um objeto **Celular** que possuirá todas as caracteristicas determinadas pela classe, observe o exemplo de criação de instância abaixo.
>
> ```java
> Celular motorolaX2G = new Celular();
> ```
>
> Toda vez que você encontrar um trecho de código com a palavra reservada `new <TipoClasse>()`, no caso representado pelo `new Celular()`, significará que uma instância daquela classe será criada na Memória _**Heap**_ do Java, conforme imagem abaixo.

![Objeto na Heap](../.gitbook/assets/newtipo-heap.png)

