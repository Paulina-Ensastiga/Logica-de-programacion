package LogicaDeProgramacionJava;

import java.util.Scanner;

public class InvertirTexto {
	public static void main(String[] args) {
        // Paso 1: Leer la palabra o frase desde la consola
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra o frase: ");
        String texto = scanner.nextLine();
        scanner.close();

        // Paso 2: Invertir la palabra o frase
        String textoInvertido = invertirTexto(texto);

        // Paso 3: Mostrar el resultado invertido por consola
        System.out.println(textoInvertido);
    }

    // Método para invertir el texto
    public static String invertirTexto(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado.append(texto.charAt(i));
        }
        return resultado.toString();
    }

}
