package Dia1;
public class variaveis_primitivas {
    public static void main(String[] args) {
        // Armazena idade em anos usando um tipo de dado compacto
        byte minhaIdade = 22;
        
        // Armazena salário mensal em números inteiros
        int salarioMensal = 50_000;
        
        // Armazena idade em milissegundos usando um tipo de dado longo
        long idadeMilisegundos = 788400000000L; // Especifico que é um long com o L no final, senão o Java entende como int
        
        // Armazena altura em metros usando um tipo de ponto flutuante
        double altura = 1.73;
        
        // Armazena a inicial de um nome usando um caractere Unicode
        char initial = 'L';
        
        // Armazena se a pessoa é maior de idade ou não
        boolean eMaiorDeIdade = true;
        
        // Imprime a idade
        System.out.println(minhaIdade); // Meu statement
        
        // Imprime o salário mensal
        System.out.println(salarioMensal);
    }
}
