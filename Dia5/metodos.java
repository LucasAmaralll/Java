// Define um pacote chamado Dia5
package Dia5;

// Define uma classe chamada 'metodos'
public class metodos {

    // Método principal (ponto de entrada para o programa)
    public static void main(String[] args) {
        // Chama o método 'productList' com argumentos específicos
        productList("Laranja", 12.20);
        productList("Banana", 17.50);
    }

    // Método 'productList' que imprime informações sobre um produto
    public static void productList(String productName, Double productValue) {
        // Imprime o nome do produto e seu valor
        System.out.println(productName + " - " + productValue);
    }
}
