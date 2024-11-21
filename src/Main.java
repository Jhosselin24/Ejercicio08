import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese la velocidad inicial (m/s): ");
            double velocidadInicial = scanner.nextDouble();

            System.out.println("Ingrese el primer ángulo (°): ");
            double angulo1 = scanner.nextDouble();

            System.out.println("Ingrese el segundo ángulo (°): ");
            double angulo2 = scanner.nextDouble();

            Proyectil proyectil1 = new Proyectil(velocidadInicial, angulo1);
            Proyectil proyectil2 = new Proyectil(velocidadInicial, angulo2);

            double alcance1 = proyectil1.calcularAlcance();
            double alcance2 = proyectil2.calcularAlcance();

            System.out.println("\nResultados:");
            System.out.printf("%s tiene un alcance de: %.2f metros%n", proyectil1, alcance1);
            System.out.printf("%s tiene un alcance de: %.2f metros%n", proyectil2, alcance2);

            double tiempoVuelo1 = proyectil1.calcularTiempoVuelo();
            double tiempoVuelo2 = proyectil1.calcularTiempoVuelo();

            System.out.printf("El tiempo de vuelo del proyectil con ángulo %.2f° es: %.2f segundos%n", angulo1, tiempoVuelo1);
            System.out.printf("El tiempo de vuelo del proyectil con ángulo %.2f° es: %.2f segundos%n", angulo2, tiempoVuelo2);
        } catch (NumberFormatException e) {
            System.err.println("Error: Por favor, ingrese un número válido.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }

}

