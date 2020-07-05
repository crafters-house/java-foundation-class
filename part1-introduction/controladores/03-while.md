# Controlador while

Mais um controlador galera, este tem o papel de fazer loops, laços, ou seja, para que nós utilizamos um `while`? Geralmente quando temos que trabalhar com uma coleção de informações ou realizar operações repetidas vezes.

Então vamos ver como esse trem funciona.

## Sintaxe

Primeiramente vamos ver a sintaxe.

```java
while ([condição]) {
    // bloco de código que será repetido
    // enquanto a condição for verdadeira
}
```

Agora que vimos a sintaxe da criança, vamos sacar alguns pontos importantes.

> O Bloco `while` só será executado se a condição for verdadeira, ou seja, se o valor da condição for `false` ele não executará o bloco de código. Outro ponto de **atenção** é com relação a loop infinito, pois, a condição uma hora tem ser determinada para `false` para que o bloco possa ser finalizado.

Vamos ver agora um exemplo de código que imprimirá no console de 0 a 10.

```java
 /**
  * Imprimindo o valor de 0 a 10
  * @author bisso
  */
 class ImprimindoAteDez {

     public static void main(String[] args) {

         int contador = 0;

         while ( contador < 10 ) {

             System.out.print( contador + " ," );

             contador++;

         }

     }

 }
```

