package Dia4;

public class nestedLoops {
    public static void main(String[] args) {
        // Loop externo com variável de controle i
        for (int i = 0; i < 2; i++) {
            // Loop interno com variável de controle j
            for (int j = 0; j < 2; j++) {
                // Imprime os valores de i e j
                System.out.println(i + " " + j);
            }
        }
    }
}
