// Preciso que o resultado do meu código traga as informações abaixo
// BMW
// X6
// 2024
// Valor de venda: 137500.0
//Valor: 125.000 + 10% = 137.500

package Dia6;

public class DesafioDia6 {
    public static void main(String[] args) {
        
        Desafio6Car car = new Desafio6Car("BMW", "X6", 2024, 125000);

        System.out.println(car.marca);
        System.out.println(car.modelo);
        System.out.println(car.ano);
        System.out.println("Valor de venda: " + car.valorVenda());
    }
}
