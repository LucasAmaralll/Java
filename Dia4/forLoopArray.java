package Dia4;

public class forLoopArray {
    public static void main(String[] args) {
        // Inicialização de um array de strings contendo nomes de carros
        String[] cars = {"BMW", "Tesla", "Fiat", "Ferrari"};

        // Loop for para percorrer o array
        // Inicialização: i começa em 0, que é o índice inicial do array
        // Condição: continuar enquanto i for menor que o comprimento do array (cars.length)
        // Incremento: aumentar o valor de i em 1 a cada iteração
        for (int i = 0; i < cars.length; i++) {
            // Imprime o elemento do array na posição i seguido por um espaço
            System.out.print(cars[i] + " ");
        }
        // O loop termina quando i não atende mais à condição (i < cars.length)
    }
}
