package OperadoresEEstruturaCondicional;

import java.util.Scanner;

public class VerificaMaiorIdadeTernario {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite sua idade: ");
    int idade = teclado.nextInt();

/* 
    if (idade >= 18) {
      System.out.println("Com a idade " + idade + " você tem maioridade.");
    } else {
      System.out.println("menor de idade.");
    }
*/
    String mensagem = (idade >= 18) ? "Com a idade " + idade + " voce tem maioridade." : "com a idade " + idade + " 19não tem maioridade."; 

    System.out.println(mensagem);
    
    teclado.close();

  }
}
