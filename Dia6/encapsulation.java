// Declaração do pacote ao qual a classe pertence
package Dia6;

// Definição da classe "encapsulation"
public class encapsulation {
    
    // Método main, que é o ponto de entrada do programa
    public static void main(String[] args) {
        
        // Criação de uma instância da classe "Car" com valores específicos
        Car car = new Car("BMW", "X6", 2024);

        // Impressão das informações do carro utilizando os métodos getter
        System.out.println("Marca: " + car.getMarca());
        System.out.println("Modelo: " + car.getModelo());
        System.out.println("Ano: " + car.getAno());
    }
}
