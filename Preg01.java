public class Preg01 {
    public static void main(String[] args) {
        // Definimos las variables a intercambiar
        int a = 5;
        int b = 10;
        
        System.out.println("Valores iniciales:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Intercambiamos los valores utilizando una variable temporal
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("\nValores intercambiados:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
