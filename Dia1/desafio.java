package Dia1;
// Com o código do arquivo projeto1.java, quero somar 10.1 + 10.2, tem que ter o resultado 20.3

// minha solução, professor resolveu da mesma maneira

import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner primeiroNumero = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double Numero1 = primeiroNumero.nextDouble();

        Scanner segundoNumero = new Scanner(System.in);
        System.out.print("Digite o segundo número: ");
        double Numero2 = segundoNumero.nextDouble();

        double resultado = Numero1 + Numero2;
        System.out.println("O resultado é: " + resultado);
    }

}
