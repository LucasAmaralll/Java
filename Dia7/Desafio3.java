// Crie uma calculadora

//"Digite o num1 op num2 (2*4):"
// Resultados aqui

package Dia7;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {

        double Resultado;

        System.out.println("Bem vindo a calculadora Java");

        Scanner primeiroNumero = new Scanner (System.in);
        System.out.print("Digite o primeiro número: ");
        double Numero1 = primeiroNumero.nextDouble();

        Scanner segundoNumero = new Scanner (System.in);
        System.out.print("Digite o segundo número: ");
        double Numero2 = segundoNumero.nextDouble();

        Scanner operadorCalculadora = new Scanner (System.in);
        System.out.print("Digite o operador desejado (+, -, *, /): ");
        char Operador = operadorCalculadora.next().charAt(0);

        if (Operador == '+') {
            Resultado = Numero1 + Numero2;
            System.out.println(Numero1 + " + " + Numero2 + " = " + Resultado);
        }else if (Operador == '*') {
            Resultado = Numero1 * Numero2;
            System.out.println(Numero1 + " * " + Numero2 + " = " + Resultado);
        }else if (Operador == '-'){
            Resultado = Numero1 - Numero2;
            System.out.println(Numero1 + " - " + Numero2 + "=" + Resultado);
        }else if (Operador == '/'){
            Resultado = Numero1 / Numero2;
            System.out.println(Numero1 + " / " + Numero2 + " = " + Resultado);
        }else {
            System.out.println("N/A");
        }
    }

}

// Solução Professor:

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         System.out.print("Digite o num1 op num2 (2 * 4): ");

//         Scanner s = new Scanner(System.in);
//         double num1 = s.nextDouble();
//         char op = s.next().charAt(0);
//         double num2 = s.nextDouble();

//         if(op == '+')
//             System.out.println((int)num1 + num2);
//         else if(op == '-')
//             System.out.println((int)num1 - num2);
//         else if(op == '*')
//             System.out.println((int)num1 * num2);
//         else if(op == '/')
//             System.out.println(num1 / num2);
//         else
//             System.out.println("Formato invalido!");




//     }
// }
