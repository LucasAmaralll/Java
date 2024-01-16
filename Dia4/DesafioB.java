// imprimir a palavra "hello world" com espaços entre as letras"

package Dia4;

public class DesafioB {
    public static void main(String[] args) {
        String palavra = "Hello World";
        
        for (int j = 0; j < palavra.length(); j++) {
            System.out.print(palavra.charAt(j) + " ");
        }
    }
}

// a solução do professor foi igual a minha