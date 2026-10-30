
public class EjercicioArreglos {

            public static void main(String[] args) {

                int [] numeros = {3, 8, 1, 9, 4};

                mostrarAlReves(numeros);
                int mayor = buscarMayor(numeros);

                System.out.println("El mayor es: " + mayor);
            }

            public static void mostrarAlReves(int[] numeros) {

                System.out.println("Numeros al reves:");

                for (int i = numeros.length - 1; i >= 0; i--) {
                    System.out.print(numeros[i] + " ");
                }

                System.out.println();
            }

            public static int buscarMayor(int[] numeros) {

                int mayor = numeros[0];

                for (int i = 1; i < numeros.length; i++) {

                    if (numeros[i] > mayor) {
                        mayor = numeros[i];
                    }

                }

                return mayor;
            }

        }


