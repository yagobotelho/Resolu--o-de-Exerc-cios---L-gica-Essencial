package TiposDeDadosEVariaveis;

import java.util.Scanner;

public class ConversaoCentimetosMetros {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      System.out.println("Informe o valor em centímetros ");
      double valorCentimetros = teclado.nextDouble();

      double valorMetro = valorCentimetros / 100;
      teclado.close();
      System.out.println("O valor " + valorCentimetros + "cm em metros é: " + valorMetro + " metro(s).");

    }
}
