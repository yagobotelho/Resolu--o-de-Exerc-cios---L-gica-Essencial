package OperadoresEEstruturaCondicional;

import java.util.Scanner;

public class VerificaNumeroPositivo {
  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      System.out.println("Digite um número inteiro: ");
      int numero = teclado.nextInt();

      teclado.close();

      if (numero >= 0 ) {
        System.out.println("este número " + numero + " é positivo.");
      } else{
        System.out.println("número inserido é negativo.");
      }
  }
}
