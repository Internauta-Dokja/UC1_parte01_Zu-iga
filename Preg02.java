import java.util.Scanner;

public class Preg02 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el valor de n
        System.out.print("Ingresa el valor de n: ");
        int n = scanner.nextInt();

        // Cerrar el objeto Scanner después de usarlo
        scanner.close();

        // Variable para almacenar la suma
        int suma = 0;

        // Iterar desde 1 hasta n y acumular la suma
        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        // Imprimir el resultado
        System.out.println("La suma de los " + n + " primeros números naturales es: " + suma);
    }
}
