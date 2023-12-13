package Dia1;
public class variaveis_referencias {
    public static void main(String[] args) {
        // Armazena idade em anos usando um tipo de dado compacto
        byte minhaIdade = 22;
        
        // Armazena o primeiro nome usando um tipo de dado de referência (String)
        String firstName = "Lucas" + " Do " + "Amaral " + "Faustino ";
        
        // Imprime a idade
        System.out.println(minhaIdade);
        
        // Imprime o primeiro nome em letras minúsculas usando um método da classe String
        System.out.println(firstName.toLowerCase());
    }
    // As variáveis String em Java são por referência, pois se referem a objetos na memória, 
    // permitindo operações e métodos mais complexos, como concatenação e manipulação de strings.
}