
public class EjercicioArreglos {

    public static void main(String[] args) {

        int[] numeros = ingresarNumeros();
        mostrarReves(numeros);
        int mayor = obtenerMayor(numeros);
        System.out.println("El mayor es: " + mayor);
            }

    public static int[] ingresarNumeros() {
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Entrada.leerEntero("Numero " + (i + 1) + ": ");
        }
        return numeros;
    }

    public static void mostrarReves(int[] numeros) {
        System.out.print("Al reves: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    public static int obtenerMayor(int[] numeros) {
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }
}