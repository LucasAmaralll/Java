package Dia1;
// criar uma calculadora básica (soma);
// na tela principal precisa pedir duas informações e retornar o resultado, sendo elas:
// "Digite o primeiro número"
// "Digite o segundo número"
// "A soma e: "

// como eu fiz:

import java.util.Scanner;

public class projeto1 {
    public static void main(String[] args) {
        Scanner primeiroNumero = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int Numero1 = primeiroNumero.nextInt();

        Scanner segundoNumero = new Scanner(System.in);
        System.out.print("Digite o segundo número: ");
        int Numero2 = segundoNumero.nextInt();
        
        System.out.println(Numero1 + Numero2);
    }

}

// solução do professor:

// import java.util.Scanner;

// public class projeto1 {
//     public static void main(String[] args) {
//         Scanner primeiroNumeroScanner = new Scanner(System.in);
//         System.out.print("Digite o primeiro número: ");
//         int primeiroNumero = primeiroNumeroScanner.nextInt();

//         Scanner segundoNumeroScanner = new Scanner(System.in);
//         System.out.print("Digite o segundo número: ");
//         int segundoNumero = segundoNumeroScanner.nextInt();
        
//         int resultado = primeiroNumero + segundoNumero;
//         System.out.println("O resultado é: "+ resultado);
//     }

// }
