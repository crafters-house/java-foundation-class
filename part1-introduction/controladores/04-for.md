# Controlador for

Galera chegou a hora de vermos o controlador `for` para mim é o mais versátil de todos, pois, possui a capacidade de realizar três operações dentro de um único comando.

Vamos ver como é a sua **Sintaxe**

## Sintaxe

```java
for ([inicialização];[condição];[incremento]) {
    // bloco de código que será repetido
    // enquanto a condição for verdadeira
}
```

## Exemplo

```java
for (int i = 0;i < 10; i++) {
    System.out.print (i + ", ");
}
```

O resultado produzido pelo trecho acima é igual ao do controlador `while` como voces podem ver no console abaixo.

```text
/home/user: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
```

Como voces podem ver ele tem tudo que o `while` tem porém tudo em um único comando. **Qual é o seu fluxo ?**

Inicialização &gt; Condição &gt; Operações / Comandos &gt; incremento &gt; Condição &gt; Operações / Comandos &gt; incremento &gt; assim ... consecutivamente.

* Inicialização Este bloco é executado somente uma única vez, geralmente nós o utilizamos para declarar a variável de incremento
* Condição Este bloco espera um resultado booleano, ou seja, ele espera um valor `true` ou `false`
* Incremento Este será executado logo após dos comandos, ou seja, o código entre chave\*\*

