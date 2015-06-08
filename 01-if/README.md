# Controlador *If*

Olá, quando estamos desenvolvendo sistemas precisamos criar algoritimos que representam o
modelo de negócio seja de um cliente ou de um produto ou processo, bom para isso nós precisamos
trabalhar com condições, políticas, etc...

Para isso nós veremos o processo mais basico de tratamento como a instrução **`if`**
que é basicamente segue a seguinte sintaxe:

```java
if (condição) {
   //instrução1 condicionada;
   //instrução2 condicionada;
}
```

Este controlador necessita receber uma condição verdadeira (**true**) para que possa ser avaliada.

Esta condição pode ser passada por uma variável *boolean* ou qualquer Operador condicional como:

|Operador Condicional|Descrição|
|--|
|== |igual a|
|!= |diferente|
|>  |maior|
|>= |maior igual|
|>  |menor |
|<= |menor igual|

Segue um exemplo de código com o controlador if e outros operadores como +,* e +=

```java


/**
 * Devemos pagar hora extra para o funcionario que trabalhou mais
 * que 160h no mes.
 *
 */
class FolhaPagamento {

    public static void main(String[] args) {

        String nomeFuncionario = "Joao ";

        double valorHora = 35.00;

        double salarioAReceber = 0.0;

        double taxaExtra = 0.75;

        int horasNomais = 160;

        float horasTrabalhadas = 220;

        if ( horasTrabalhadas > horasNomais ) {

            double totalHorasExtras =  horasTrabalhadas - horasNomais;

            double valorExtra =  ( totalHorasExtras *  valorHora  ) ;

            double valorExtraAPagar =  valorExtra *  taxaExtra;

            salarioAReceber = ( horasNomais *  valorHora ) + valorExtraAPagar;

            System.out.println ("Caraca ele vai ganhar uma grana extra de " + valorExtraAPagar);

        } else {

            salarioAReceber =  horasNomais *  valorHora ;
        }




    }

}
```

É comum utilizarmos **operadores lógicos** como ( OR **`||`** e AND **`&&`** ) , eles também produzem um valor *boolean*
