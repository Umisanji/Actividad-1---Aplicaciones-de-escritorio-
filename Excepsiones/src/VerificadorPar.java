public class VerificadorPar {
    public static void main(String[] args) {
        try {
            verificarSiEsPar(10);
            System.out.println("El número 10 es válido.");
            verificarSiEsPar(7);
            System.out.println("Esto no se imprimirá.");
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error detectado: " + e.getMessage());
        }
    }

    public static void verificarSiEsPar(int numero) {
        if (numero % 2 != 0) {
            throw new IllegalArgumentException("El número " + numero + " es impar. ¡Solo se aceptan pares!");
        }
    }
}