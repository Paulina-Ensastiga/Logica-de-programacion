package LogicaDeProgramacionJava;

import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
	public static void main(String[] args) {
        // Crear el diccionario Español-Inglés
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("hola", "hello");
        diccionario.put("adiós", "goodbye");
        diccionario.put("gracias", "thank you");
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("comer", "eat");
        diccionario.put("beber", "drink");
        diccionario.put("bueno", "good");
        diccionario.put("malo", "bad");
        diccionario.put("libro", "book");
        diccionario.put("computadora", "computer");
        diccionario.put("amigo", "friend");
        diccionario.put("padre", "father");
        diccionario.put("madre", "mother");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("cielo", "sky");

        // Escoger al azar 5 palabras en español del diccionario
        String[] palabrasEspañol = diccionario.keySet().toArray(new String[0]);
        String[] palabrasAleatorias = obtenerPalabrasAleatorias(palabrasEspañol, 5);

        // Pedir al usuario que ingrese las traducciones al inglés
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        Scanner scanner = new Scanner(System.in);
        for (String palabraEspañol : palabrasAleatorias) {
            System.out.print("Traducción de '" + palabraEspañol + "' al inglés: ");
            String respuestaUsuario = scanner.nextLine().trim().toLowerCase();
            String traduccionCorrecta = diccionario.get(palabraEspañol).toLowerCase();
            if (respuestaUsuario.equals(traduccionCorrecta)) {
                respuestasCorrectas++;
            } else {
                respuestasIncorrectas++;
            }
        }

        // Mostrar resultados
        System.out.println("\nResultado:");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }

    // Método para obtener palabras aleatorias del diccionario
    private static String[] obtenerPalabrasAleatorias(String[] palabras, int cantidad) {
        int totalPalabras = palabras.length;
        if (cantidad > totalPalabras) {
            cantidad = totalPalabras;
        }

        String[] palabrasAleatorias = new String[cantidad];
        boolean[] palabrasSeleccionadas = new boolean[totalPalabras];

        int palabrasSeleccionadasCount = 0;
        while (palabrasSeleccionadasCount < cantidad) {
            int indiceAleatorio = (int) (Math.random() * totalPalabras);
            if (!palabrasSeleccionadas[indiceAleatorio]) {
                palabrasAleatorias[palabrasSeleccionadasCount] = palabras[indiceAleatorio];
                palabrasSeleccionadas[indiceAleatorio] = true;
                palabrasSeleccionadasCount++;
            }
        }

        return palabrasAleatorias;
    }

}
