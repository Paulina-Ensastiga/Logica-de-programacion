package LogicaDeProgramacionJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DiccionarioEspañolIngles {
	public static void main(String[] args) {
        // Paso 1: Crear un diccionario Español-Inglés utilizando un objeto HashMap
        Map<String, String> diccionario = new HashMap<>();

        // Paso 2: Agregar al menos 20 palabras con su respectiva traducción al diccionario
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("mesa", "table");
        diccionario.put("libro", "book");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("arbol", "tree");
        diccionario.put("rojo", "red");
        diccionario.put("azul", "blue");
        diccionario.put("verde", "green");
        diccionario.put("amarillo", "yellow");
        diccionario.put("cielo", "sky");
        diccionario.put("playa", "beach");
        diccionario.put("mar", "sea");
        diccionario.put("montaña", "mountain");
        diccionario.put("agua", "water");
        diccionario.put("fuego", "fire");

        Scanner scanner = new Scanner(System.in);

        // Paso 3: Solicitar al usuario una palabra en español
        System.out.print("Ingresa una palabra en español: ");
        String palabraEspañol = scanner.nextLine().toLowerCase();

        scanner.close();

        // Paso 4: Buscar la palabra ingresada en el diccionario y obtener su traducción en inglés
        String traduccionIngles = diccionario.get(palabraEspañol);

        // Paso 5: Mostrar por consola la traducción obtenida o un mensaje indicando que la palabra no se encuentra en el diccionario
        if (traduccionIngles != null) {
            System.out.println(traduccionIngles);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }
    }

}
