package OperadoresEEstruturaCondicional;

import java.util.Scanner;

public class verificaGenero {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      System.out.println("Informe seu Gênero: M - masculino, F - feminino ou T - Transgênero");
      char gender = teclado.nextLine().toUpperCase().charAt(0);

      String mensagem;
      switch (gender){
        case 'M' -> mensagem = "M - masculino";
        case 'F' -> mensagem = "F - feminino";
        case 'T' -> mensagem = "T - Transgênero";
        default -> mensagem = "Valor inválido!";
      }

      System.out.println(mensagem);

      teclado.close();

    }
}
