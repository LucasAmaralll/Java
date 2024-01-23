// Crie um programa que teste as seguintes variações:

//input = N (int)

// N é igual ao um número impar = Retornar "Impar"
// N é par e está entre 2 e 5 = Retornar "A"
// N é par e está entre 6 e 20 = Retornar "B"
// N é par e está acima de 20 =  Retornar "C"

package Dia7;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner Numero = new Scanner (System.in);
        System.out.print("Digite um número: ");
        int N = Numero.nextInt();

        if (N % 2 != 0) {
            System.out.println("Impar");
        } else if (N % 2 == 0 && N>=2 && N<=5){
            System.out.println("A");
        } else if (N % 2 == 0 && N >= 6 && N <= 20) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}

// Solução do professor:

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Digite um numero: ");
//         int n  = sc.nextInt();

//         if (n % 2 == 1)
//             System.out.println("Impar");
//         else {
//             if (n >= 2 && n <= 5)
//                 System.out.println("A");
//             else if (n >= 6 && n <= 20)
//                 System.out.println("B");
//             else
//                 System.out.println("C");

//         }


//     }
// }