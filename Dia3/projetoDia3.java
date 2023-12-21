// Digite um numero:
// Ler a quantidade de digitos que eu digito
// Tem que contar até 5, se passar de 5 precisa por 5 ou mais digítos 


package Dia3;

import java.util.Scanner;

public class projetoDia3 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numeroDigitado = numero.nextInt();

        if (numeroDigitado <9 && numeroDigitado >=1){
            System.out.println("Este numero tem 1 digito");
        }
        else if (numeroDigitado <100 & numeroDigitado >=10){
            System.out.println("Este numero tem 2 digitos");
        }
        else if (numeroDigitado <1000 & numeroDigitado >=100){
            System.out.println("Este numero tem 3 digitos");
        }
        else if (numeroDigitado <10000 && numeroDigitado >= 1000) {
            System.out.println("Este numero tem 4 digitos");
        }
        else if (numeroDigitado <100000 && numeroDigitado >= 10000) {
            System.out.println("Este numero tem 5 ou mais digitos");
        } 
    }
}


