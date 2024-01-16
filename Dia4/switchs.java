package Dia4;

import java.util.Scanner;

public class switchs {
    public static void main(String[] args) {
        // Solicitar e coletar o nome do produto
        System.out.print("Digite o nome do produto (Banana, Manga, Abacate): ");
        Scanner scanner = new Scanner(System.in);
        
        // Ler a linha de entrada, remover espaços extras e converter para minúsculas
        String nomeProduto = scanner.nextLine().trim().toLowerCase();

        // Utilizar switch para comparar o nome do produto e retornar o valor correspondente
        switch (nomeProduto) {
            case "banana":
                System.out.println("R$ 9,50");
                break;
            case "manga":
                System.out.println("R$ 12,80");
                break;
            case "abacate":
                System.out.println("R$ 16,10");
                break;
            default:
                // Caso o nome do produto não seja reconhecido
                System.out.println("Produto não reconhecido");
        }
    }
}
