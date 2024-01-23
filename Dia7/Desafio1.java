//Criar três int, onde o usuário vai digitar trÊs valores aleatórios e você tem que printar eles em tela

package Dia7;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner primeiroNumero = new Scanner (System.in);
        System.out.print("Digite o primeiro número: ");
        int Numero1 = primeiroNumero.nextInt();

        Scanner segundoNumero = new Scanner(System.in);
        System.out.print("Digite o segundo número: ");
        int Numero2 = segundoNumero.nextInt();

        Scanner terceiroNumero = new Scanner (System.in);
        System.out.print("Digite o terceiro número: ");
        int Numero3 = terceiroNumero.nextInt();

        System.out.println("Os números digitados foram: " + Numero1 + ", " + Numero2 + ", " + Numero3);

    }
}

// Solução do professor:

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a  = sc.nextInt();
//         int b  = sc.nextInt();
//         int c = sc.nextInt();

//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);


//     }
// }