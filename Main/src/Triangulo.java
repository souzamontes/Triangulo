import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o comprimento do lado 1:");
        double lado1 = scanner.nextDouble();

        System.out.println("Informe o comprimento do lado 2:");
        double lado2 = scanner.nextDouble();

        System.out.println("Informe o comprimento do lado 3:");
        double lado3 = scanner.nextDouble();

        if (isTriangulo(lado1, lado2, lado3)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os comprimentos dos lados não formam um triângulo.");
        }

        scanner.close();
    }

    public static boolean isTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }
}
