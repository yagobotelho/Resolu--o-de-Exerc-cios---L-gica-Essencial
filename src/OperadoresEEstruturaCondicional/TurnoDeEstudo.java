package OperadoresEEstruturaCondicional;

import java.util.Scanner;

public class TurnoDeEstudo {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      System.out.println("*********************************");
      System.out.println("informe seu turno de estudos: ");
      System.out.println("M: matutino, V: vespertino ou N: noturno");

      char turno = teclado.nextLine().toUpperCase().charAt(0);

      String mensagem = ""; 
      if (turno == 'M') {
          mensagem = "Bom dia!";
      } else if (turno == 'V') {
          mensagem = "Boa tarde!";
      } else if (turno == 'N') {
          mensagem = "Boa noite!";
      } else {
         mensagem = "valor inserido é inválido";
      }
      
      System.out.println(mensagem);

      System.out.println("*********************************");
      teclado.close();
    }
}
