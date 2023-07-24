package LogicaDeProgramacionJava;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNumerosPrimos {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Solicitar al usuario 10 números por consola y almacenarlos en un array
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        scanner.close();

        // Paso 2 y 3: Separar los números primos y no primos en dos arrays diferentes
        int[] primos = obtenerNumerosPrimos(numeros);
        int[] noPrimos = obtenerNumerosNoPrimos(numeros);

        // Paso 4: Combinar los dos arrays, colocando los números primos al inicio y el resto al final
        int[] resultado = new int[numeros.length];
        System.arraycopy(primos, 0, resultado, 0, primos.length);
        System.arraycopy(noPrimos, 0, resultado, primos.length, noPrimos.length);

        // Paso 5: Mostrar por consola el array que contiene los números primos al inicio
        for (int i = 0; i < resultado.length; i++) {
            System.out.println("pos[" + i + "] = " + resultado[i]);
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para obtener los números primos del array
    public static int[] obtenerNumerosPrimos(int[] numeros) {
        int[] primos = new int[numeros.length];
        int count = 0;
        for (int numero : numeros) {
            if (esPrimo(numero)) {
                primos[count++] = numero;
            }
        }
        return Arrays.copyOf(primos, count);
    }

    // Método para obtener los números no primos del array
    public static int[] obtenerNumerosNoPrimos(int[] numeros) {
        int[] noPrimos = new int[numeros.length];
        int count = 0;
        for (int numero : numeros) {
            if (!esPrimo(numero)) {
                noPrimos[count++] = numero;
            }
        }
        return Arrays.copyOf(noPrimos, count);
    }
}
