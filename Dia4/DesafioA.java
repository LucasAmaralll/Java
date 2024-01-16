// Imprima na tela os números de 0 a 100, somente os pares

package Dia4;

public class DesafioA {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}


// Solução professor

// public class DesafioA {
//     public static void main(String[] args) {
//         for (int i = 0; i<=100; i++)
//             if ( i % 2 == 0) {
//                System.out.print (i + " ");
//              }
//      }

