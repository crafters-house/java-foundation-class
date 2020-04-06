# Controlador switch

Galera _"Javistica"_ vamos ver como funciona o controlador `switch`. Esse carinha funciona como se fosse um `if` porém ao invés de avaliar uma condição `boolean` ele avalia o valor da variável.

Então vamos ver como esse trem funciona.

Primeiramente vamos ver a sintaxe.

```java
switch (<variavel>) {

  case <valor>:
    //operação avaliada
    break; // <-- instrução de resumo;

  case <outro valor>:
      //operação avaliada
      break; // <-- instrução de resumo;

  [ default ]:
      //caso nao ache nenhuma dos valores
      //anterios este bloco será acionado
      break; // <-- instrução de resumo;

}
```

Bom agora que vimos a sintaxe básica, vamos observar alguns _**"bizus"**_.

> * O Comando de resumo `break` é necessário, pois, o `switch` faz a avaliação do valor somente uma vez, então se este comando não estiver presente o java executará os outros blocos sem qualquer avaliação.

Vamos ver como aplicar o `switch` utilizando o cenário bem simple no qual temos que identificar qual tipo de conta devemos apresentar o saldo.

```java
/**
 * Um cliente pediu para o Gerente do Banco informar
 * o saldo de suas contas :
 *   Conta Corrente - 'C' : (2000)
 *   Conta Poupanca - 'P' : (1500.45)
 *   Conta CDB      - 'I' : (500.78)
 *   Conta Fundo de Acoes - 'F' : (6500.81)
 *
 */
class SaldoContasBancarias {

    public static void main (String[] args) {

        char tipoConta = 'I';
        double saldoContaCorrente = 2000.0;
        double saldoContaPopanca  = 1500.45;
        double saldoContaCDP = 500.78;
        double saldoFundoAcoes = 6500.81;

        switch(tipoConta) {

            case 'P':
                System.out.println ("Saldo da Conta Poupança é de : " + saldoContaPopanca);
                break;

            case 'I':
                System.out.println ("Saldo do CDB é de : " + saldoContaCDP);
                break;

            case 'C':
                System.out.println ("Saldo da Conta Corrente é de : " + saldoContaCorrente);
                break;
            case 'F'  
                System.out.println ("Saldo do Fundo de Ações é de : " + saldoFundoAcoes);
                break;
        }



    }

}
```

Simplão né!, alguns detalhes sobre o `switch` ele suporta os tipos primitivos numéricos \( `byte` , `short` , `int` \) o primitivo `char` e `String` \(adicionado no java 8\), outro tipo também suportado é o `enum`, o último nós ainda não vimos mas não esquenta cabeça com ele que veremos mais tarde blz!!!

